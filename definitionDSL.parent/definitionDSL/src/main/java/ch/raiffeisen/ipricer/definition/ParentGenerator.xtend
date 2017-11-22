package ch.raiffeisen.ipricer.definition

import org.eclipse.emf.ecore.resource.Resource
import ch.raiffeisen.ipricer.definition.definitionDSL.*;

class ParentGenerator {

    def String generateParentClass(Resource definition, String packagePrefix, String methodName){
        val dataSection = definition.allContents.toIterable.filter(Data).get(0)

        '''package «packagePrefix» ;

            import «packagePrefix».process.Processor;
            import ch.raiffeisen.ipricer.methods.common.model.ChangeAwareParameter;
            import ch.raiffeisen.ipricer.methods.common.model.RchParent;
            import com.csksoftware.ipricer.*;

            public class «methodName»Parent extends Parent<«methodName»Method, «methodName»Parent, «methodName»Child> implements RchParent<«methodName»Method, «methodName»Parent, «methodName»Child> {



                public «methodName»Parent(final «methodName»Method m) {
                    super(m);

                    try {
                        initialize(m);
                    } catch (Throwable t) {
                        IPricer.LogError("Error during method «methodName»Parent initialization", t);
                        throw t;
                    }
                }

                private void initialize(«methodName»Method m) {
                    //Initializiations
                    adminIn = new StringParam(this, m.getAdminIn());
                    traderIn = new StringParam(this, m.getTraderIn());

                    adminOut = new StringResult(this, m.getAdminOut());
                    traderOut = new StringResult(this, m.getTraderOut());

                     «FOR feld:dataSection.fieldDefinitions»
                        «feld.generateInitializationParent(methodName)»
                    «ENDFOR»
                }

                @Override
                public void onRecalc(«methodName»Method m) {
                    onUpdate(m);
                }

                @Override
                public void onUpdate(«methodName»Method m) {
                    Processor.getInstance().processUpdate(this);
                }

                @Override
                public void onDelete(«methodName»Method m) {
                }

                @Override
                public void onChildDeleted(«methodName»Method method) {
                    Processor.getInstance().processUpdate(this);
                }

                @Override
                public void onDone(«methodName»Method method) {
                }

                @Override
                public «methodName»Child create(String name) {
                    return new «methodName»Child(this);
                }

                @Override
                public «methodName»Method getMethod() {
                    return method();
                }

                @Override
                public String getParentId() {
                    return getId();
                }

                @Override
                public Chain<«methodName»Child> getChildren() {
                    return children();
                }

                @Override
                public StringParam getAdminIn() {
                    return adminIn;
                }

                @Override
                public StringParam getTraderIn() {
                    return traderIn;
                }

                @Override
                public void setAdminOut(String admin) {
                    this.adminOut.set(admin);
                }

                @Override
                public void setTraderOut(String trader) {
                    this.traderOut.set(trader);
                }

                //Deklarationen und getter und setter für die Result-Felder
                private StringParam adminIn;
                private StringParam traderIn;

                private StringResult adminOut;
                private StringResult traderOut;

                «FOR f: dataSection.fieldDefinitions»
                    «f.generateDeclarationParent(methodName)»
                «ENDFOR»
              }
             '''
    }




    def String generateInitializationParent(FieldDefinition field, String methdoName){
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
                literalType = 'Param'
                return   '''«field.id.toLowerCase» = new «javaType»«literalType»(this, m.get«field.id.toLowerCase.toFirstUpper»() );'''
            }
            case RECORDCLASS::PARENT_READ_WRITE : {
                literalType = 'Result'
                return   '''«field.id.toLowerCase» = new «javaType»«literalType»(this, m.get«field.id.toLowerCase.toFirstUpper»() );'''
            }

            case RECORDCLASS::PARENT_READ_REFERENCE : {
                literalType = 'Result'
                return   '''«field.id.toLowerCase» = new «javaType»«literalType»(this, m.get«field.id.toLowerCase.toFirstUpper»() );'''
            }

            default: ''''''

        }


    }



    def String generateDeclarationParent(FieldDefinition field, String methodName){
        var javaType = ''
        var literalType = ''
        switch field.fieldType {
            case FIELD_TYPE::STRING_FIELD : javaType = 'String'
            case FIELD_TYPE::DATE_FIELD : javaType = 'Date'
            case FIELD_TYPE::TIME_FIELD : javaType = 'Time'
            case FIELD_TYPE::DOUBLE_FIELD : javaType = 'Zahl'
            case FIELD_TYPE::INTEGER_FIELD : javaType = 'Integer'
            case FIELD_TYPE::PRICE_FIELD : javaType = 'Zahl'
            case FIELD_TYPE::ZAHL_FIELD : javaType = 'Zahl'
            default: javaType = 'String'
        }

        switch field.recordClass {
            case RECORDCLASS::CHILD_READ_ONLY : literalType = 'Param'
            case RECORDCLASS::PARENT_READ_ONLY : literalType = 'Param'
            case RECORDCLASS::CHILD_READ_WRITE : literalType = 'Result'
            case RECORDCLASS::PARENT_READ_WRITE : literalType = 'Result'
            default : literalType = 'Param'
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