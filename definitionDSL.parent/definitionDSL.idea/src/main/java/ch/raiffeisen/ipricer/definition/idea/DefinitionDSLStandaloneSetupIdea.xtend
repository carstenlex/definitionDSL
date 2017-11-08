/*
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.idea

import ch.raiffeisen.ipricer.definition.DefinitionDSLRuntimeModule
import ch.raiffeisen.ipricer.definition.DefinitionDSLStandaloneSetupGenerated
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

class DefinitionDSLStandaloneSetupIdea extends DefinitionDSLStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new DefinitionDSLRuntimeModule()
		val ideaModule = new DefinitionDSLIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
