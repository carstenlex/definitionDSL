package ch.raiffeisen.ipricer.definition

import org.eclipse.emf.ecore.resource.Resource
import ch.raiffeisen.ipricer.definition.definitionDSL.*;


class MethodGenerator {



    def String generateMethodClass(Resource definition, String packagePrefix, String methodName){
        val dataSection = definition.allContents.toIterable.filter(Data).get(0)
        val definitionSection = definition.allContents.toIterable.filter(Definition).get(0)
        ''' package ch.raiffeisen.ipricer.methods.«methodName.toLowerCase»;

            import ch.raiffeisen.ipricer.methods.common.Constants;
            import ch.raiffeisen.ipricer.methods.common.model.RchMethod;
            import com.csksoftware.ipricer.*;

            public class «methodName»Method extends Method<«methodName»Method, «methodName»Parent, «methodName»Child> implements RchMethod<«methodName»Method, «methodName»Parent, «methodName»Child> {
                private static final String METHOD_NAME = "«methodName»";
                private static final String METHOD_VERSION = "1.0.0";
                private static final String METHOD_DESCRIPTION = "«definitionSection.guiLabelMethod»";



                public «methodName»Method() {
                    super(METHOD_NAME, METHOD_VERSION, METHOD_DESCRIPTION, "", "");

                    try {
                        initialize();
                    } catch (Throwable t) {
                        IPricer.LogError("Error during method «methodName» initialization", t);
                        throw t;
                    }
                }

                private void initialize() {
                    setMerging(1);

                    methodChainAdmin = new RawParam<>(this, "«methodName».B.IP", "ADF_SRC_10_ID");
                    adminIn = new StringParamLiteral(this, new ParentParamField("ADMIN", "PM_ADMIN"));
                    traderIn = new StringParamLiteral(this, new ParentParamField("TRADER", "PM_TRADER"));
                    adminOut = new StringResultLiteral(this, new ParentParamField("ADMIN", "ADF_SRC_10_ID"), Constants.ADF_ACT_DT, Constants.ADF_ACT_TM);
                    traderOut = new StringResultLiteral(this, new ParentParamField("TRADER", "ADF_SRC_ID"), Constants.ADF_ACT_DT, Constants.ADF_ACT_TM);

                    «FOR feld:dataSection.fieldDefinitions»
                        «feld.generateInitialization(methodName)»
                    «ENDFOR»
                }


                @Override
                public String getName() {
                    return METHOD_NAME;
                }

                @Override
                public «methodName»Parent create(String name) {
                    return new «methodName»Parent(this);
                }

                @Override
                public void onUpdate(String paramString, int paramInt, RawParam<«methodName»Method, «methodName»Parent, «methodName»Child> paramRawParam) {
                    super.onUpdate(paramString, paramInt, paramRawParam);
                }

                @Override
                public Iterable<«methodName»Parent> getParents() {
                    return parents();
                }

                private RawParam<«methodName»Method, «methodName»Parent, «methodName»Child> methodChainAdmin;
                public RawParam<«methodName»Method, «methodName»Parent, «methodName»Child> getMethodChainAdmin() {
                    return methodChainAdmin;
                }

                private StringParamLiteral adminIn;
                private StringParamLiteral traderIn;
                private StringResultLiteral adminOut;
                private StringResultLiteral traderOut;

                @Override
                public StringParamLiteral getAdminIn() {
                    return adminIn;
                }

                @Override
                public StringParamLiteral getTraderIn() {
                    return traderIn;
                }

                @Override
                public StringResultLiteral getAdminOut() {
                    return adminOut;
                }

                @Override
                public StringResultLiteral getTraderOut() {
                    return traderOut;
                }

                //Felddefintionen
                «FOR feld:dataSection.fieldDefinitions»
                    «feld.generateDeclaration(methodName)»
                «ENDFOR»

            }
        '''
    }





    def String generateInitialization(FieldDefinition field, String methdoName){
        // U ParentParamField
        // G ParentMutableField
        // R ParentResultField

        // D ChildParamField
        // P ChildMutableField
        // S ChildResultField


        var javaType= ''
        var fieldObject = ''
        var literalType = ''
        switch field.fieldType {
            case FIELD_TYPE::STRING_FIELD : javaType = 'String'
            case FIELD_TYPE::DATE_FIELD : javaType = 'Date'
            case FIELD_TYPE::TIME_FIELD : javaType = 'Time'
            case FIELD_TYPE::DOUBLE_FIELD : javaType = 'Double'
            case FIELD_TYPE::INTEGER_FIELD : javaType = 'Integer'
            case FIELD_TYPE::PRICE_FIELD : javaType = 'Double'
            default: javaType = 'String'
        }

        switch field.recordClass {
            case RECORDCLASS::CHILD_READ_ONLY : {
                fieldObject = 'ChildParamField'
                literalType = 'ParamLiteral'
            }
            case RECORDCLASS::PARENT_READ_ONLY : {
                fieldObject = 'ParentParamField'
                literalType = 'ParamLiteral'
            }
            case RECORDCLASS::CHILD_READ_WRITE : {
                fieldObject = 'ChildMutableField'
                literalType = 'ResultLiteral'
            }
            case RECORDCLASS::PARENT_READ_WRITE : {
                fieldObject = 'ParentMutableField'
                literalType = 'ResultLiteral'
            }
            case RECORDCLASS::CHILD_READ_REFERENCE :{
                fieldObject = 'ChildResultField'
                literalType = 'ResultLiteral'
            }
            case RECORDCLASS::PARENT_READ_REFERENCE : {
                fieldObject = 'ParentResultField'
                literalType = 'ResultLiteral'
            }
            case RECORDCLASS::METHOD_READ_ONLY : {
                return '''«field.id.toLowerCase» =  new RawParam<>(this,"«methdoName».B.IP","«field.fieldName»");'''
            }
        }

        if (literalType.equals('ResultLiteral')) {
            return   '''«field.id.toLowerCase» = new «javaType»«literalType»(this, new «fieldObject»("«field.name»","«field.fieldName»"),Constants.ADF_ACT_DT, Constants.ADF_ACT_TM);'''
        }else{
            return   '''«field.id.toLowerCase» = new «javaType»«literalType»(this, new «fieldObject»("«field.name»","«field.fieldName»"));'''
        }
    }

    def String generateDeclaration(FieldDefinition field, String methodName){
        // U und D wird xxParamLiteral, xxParamReference, xxResultReference (Allerdings ist das nicht nur durch die Definition zu lösen - hier fehlt uns eine Information -> naming conventions?
        // B wird RawParam
        // P und G wird xxResultLiteral, xxParamLiteral, xxParamReference, xxResultReference (siehe U/D - Problematik)

        var javaType = ''
        var literalType = ''
        switch field.fieldType {
            case FIELD_TYPE::STRING_FIELD : javaType = 'String'
            case FIELD_TYPE::DATE_FIELD : javaType = 'Date'
            case FIELD_TYPE::TIME_FIELD : javaType = 'Time'
            case FIELD_TYPE::DOUBLE_FIELD : javaType = 'Double'
            case FIELD_TYPE::INTEGER_FIELD : javaType = 'Integer'
            case FIELD_TYPE::PRICE_FIELD : javaType = 'Double'
            default: javaType = 'String'
        }

        switch field.recordClass {
            case RECORDCLASS::CHILD_READ_ONLY : literalType = 'ParamLiteral'
            case RECORDCLASS::PARENT_READ_ONLY : literalType = 'ParamLiteral'
            case RECORDCLASS::CHILD_READ_WRITE : literalType = 'ResultLiteral'
            case RECORDCLASS::PARENT_READ_WRITE : literalType = 'ResultLiteral'
            default : literalType = 'ParamLiteral'
        }

        //Spezialfall RawParam
        if (field.recordClass == RECORDCLASS::METHOD_READ_ONLY) {
            return '''
            private RawParam<«methodName»Method, ?, ?> «field.id.toLowerCase»;
            public RawParam<«methodName»Method, ?, ?> get«field.id.toLowerCase.toFirstUpper»() {return «field.id.toLowerCase»; }

            '''
        }else{
            return '''
            private «javaType»«literalType» «field.id.toLowerCase»;
            public «javaType»«literalType» get«field.id.toLowerCase.toFirstUpper»() { return «field.id.toLowerCase»;}

             '''
        }

    }
}