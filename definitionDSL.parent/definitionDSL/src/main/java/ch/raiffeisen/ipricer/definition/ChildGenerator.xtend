package ch.raiffeisen.ipricer.definition

import org.eclipse.emf.ecore.resource.Resource
import ch.raiffeisen.ipricer.definition.definitionDSL.*;

class ChildGenerator {

    def String generateChildClass(Resource definition, String packagePrefix, String methodName){
        val dataSection = definition.allContents.toIterable.filter(Data).get(0)

        '''package «packagePrefix»;

            import «packagePrefix».process.Processor;
            import ch.raiffeisen.ipricer.methods.common.model.RchChild;
            import com.csksoftware.ipricer.Child;
            import com.csksoftware.ipricer.IPricer;

            public class «methodName»Child extends Child<«methodName»Method, «methodName»Parent, «methodName»Child> implements RchChild<«methodName»Method, «methodName»Parent, «methodName»Child> {


                public «methodName»Child(«methodName»Parent p) {
                    super(p);

                    try {
                        initialize(p);
                    } catch (Throwable t) {
                        IPricer.LogError("Error during Method «methodName»Child initialization", t);
                        throw t;
                    }
                }

                private void initialize(«methodName»Parent p) {
                    //Initializiations
                    «FOR feld:dataSection.fieldDefinitions»
                        «feld.generateInitializationChild(methodName)»
                    «ENDFOR»
                }

                @Override
                public void onDelete(«methodName»Method m, «methodName»Parent p, int paramInt) {
                    Processor.getInstance().processDelete(this);
                }

                @Override
                public void onUpdate(«methodName»Method m, «methodName»Parent p) {
                    Processor.getInstance().processUpdate(this);
                }

                @Override
                public void onMove(«methodName»Method method, «methodName»Parent parent, int var3, int var4) {
                }

                @Override
                public void onDone(«methodName»Method method, «methodName»Parent parent) {
                }

                @Override
                public «methodName»Method getMethod() {
                    return method();
                }

                @Override
                public String getChildId() {
                    return getId();
                }

                @Override
                public «methodName»Parent getParent() {
                    return parent();
                }

                // Deklaratrionen mit getter und setter (setter für Result)
                «FOR f: dataSection.fieldDefinitions»
                    «f.generateDeclarationChild(methodName)»
                «ENDFOR»
            }


        '''
    }


    def String generateInitializationChild(FieldDefinition field, String methdoName){
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
            case FIELD_TYPE::DOUBLE_FIELD : javaType = 'Zahl'
            case FIELD_TYPE::INTEGER_FIELD : javaType = 'Integer'
            case FIELD_TYPE::PRICE_FIELD : javaType = 'Zahl'
            case FIELD_TYPE::ZAHL_FIELD : javaType = 'Zahl'
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


    def String generateDeclarationChild(FieldDefinition field, String methodName){
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