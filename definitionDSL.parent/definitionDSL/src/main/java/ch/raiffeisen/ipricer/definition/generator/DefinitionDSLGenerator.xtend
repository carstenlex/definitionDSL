/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
/*
 * generated by Xtext 2.10.0
 */
package ch.raiffeisen.ipricer.definition.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext


import ch.raiffeisen.ipricer.definition.definitionDSL.*;
import ch.raiffeisen.ipricer.definition.definitionDSL.Definition
import ch.raiffeisen.ipricer.definition.MethodGenerator
import ch.raiffeisen.ipricer.definition.ChildGenerator
import ch.raiffeisen.ipricer.definition.ParentGenerator

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DefinitionDSLGenerator extends AbstractGenerator {

	val targetPackage = "ch.raiffeisen.ipricer.methods."

	extension MethodGenerator methodGenerator = new MethodGenerator()
	extension ParentGenerator parentGenerator = new ParentGenerator()
	extension ChildGenerator childGenerator = new ChildGenerator()

	override void doGenerate(Resource definition, IFileSystemAccess2 fsa, IGeneratorContext context) {
		/*
            Dateien generieren:
            package: ch.raiffeisen.ipricer.methods.METHODNAME
            METHODNAMEMethod.java
            METHODNAMEParent.java
            METHODNAMEChild.java

            subdirectory "process"
            java-Files: Calculator, Processor, Contributor
        */
		val prefix =targetPackage + definition.getDefinitionName.toLowerCase
		val prefixFile = '/'+(prefix + '.').replaceAll('\\.','/');


		fsa.generateFile( prefixFile + definition.getDefinitionName+ 'Method.java',definition.generateMethodClass(prefix, definition.getDefinitionName))
		fsa.generateFile( prefixFile + definition.getDefinitionName+ 'Child.java',definition.generateChildClass(prefix, definition.getDefinitionName))
		fsa.generateFile( prefixFile + definition.getDefinitionName+ 'Parent.java',definition.generateParentClass(prefix, definition.getDefinitionName))

		//TODO hier mit FileExists erst mal checken, ob die schon da sind
		fsa.generateFile( prefixFile + '/process/Calculator.java',createCalculator(prefix))
		fsa.generateFile( prefixFile + '/process/Contributor.java',createContributor(prefix))
		fsa.generateFile( prefixFile + '/process/Processor.java',createProcessor(prefix, definition.getDefinitionName))


	}







	def String getDefinitionName(Resource resource){
		resource.getContents.filter(typeof(Definition)).map[methodName].get(0)
	}

	def String createCalculator(String prefix){
		'''
            package �prefix�.process;

            public final class Calculator {

                private Calculator() {
                    // singleton
                }

                private static class SingletonHolder {
                    static final Calculator instance = new Calculator();
                }

                public static Calculator getInstance() {
                    return SingletonHolder.instance;
                }
            }
        '''
	}

	def String createContributor(String prefix){
		'''
            package �prefix�.process;


            public final class Contributor {

                private Contributor() {
                    // singleton
                }

                private static class SingletonHolder {
                    static final Contributor instance = new Contributor();
                }

                public static Contributor getInstance() {
                    return Contributor.SingletonHolder.instance;
                }
            }
        '''
	}

	def String createProcessor(String prefix, String methodName){
		'''
            package �prefix�.process;

            import �prefix�.�methodName�Child;
            import �prefix�.�methodName�Method;
            import �prefix�.�methodName�Parent;
            import ch.raiffeisen.ipricer.methods.common.model.BaseProcessor;
            import com.csksoftware.ipricer.RawParam;

            public final class Processor extends BaseProcessor<�methodName�Method, �methodName�Parent, �methodName�Child> {

                private Processor() {
                    // singleton
                }

                private static class SingletonHolder {
                    static final Processor instance = new Processor();
                }

                public static Processor getInstance() {
                    return SingletonHolder.instance;
                }

                @Override
                protected void processMethodUpdate(�methodName�Method method, String paramString, RawParam<�methodName�Method, �methodName�Parent, �methodName�Child> methodParam) {
                    // no method parameters defined
                }

                @Override
                protected void processParentUpdate(�methodName�Parent p, boolean enforceRedistribution) {

                }

                @Override
                protected void processChildUpdate(�methodName�Child c, boolean enforceRedistribution) {

                }

                @Override
                protected void processParentDelete(�methodName�Parent parent) {
                    //
                }

                @Override
                protected void processChildDelete(�methodName�Child child) {
                    processUpdate(child);
                }
            }

        '''
	}
}
