package ch.raiffeisen.ipricer.definition

import org.eclipse.emf.ecore.resource.Resource
import ch.raiffeisen.ipricer.definition.definitionDSL.*;

class ChildGenerator {

    def String generateChildClass(Resource definition, String packagePrefix, String methodName){

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
            }


        '''
    }

}