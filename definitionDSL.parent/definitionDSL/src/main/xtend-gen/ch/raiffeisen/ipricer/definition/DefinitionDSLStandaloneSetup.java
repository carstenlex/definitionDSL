/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition;

import ch.raiffeisen.ipricer.definition.DefinitionDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DefinitionDSLStandaloneSetup extends DefinitionDSLStandaloneSetupGenerated {
  public static void doSetup() {
    DefinitionDSLStandaloneSetup _definitionDSLStandaloneSetup = new DefinitionDSLStandaloneSetup();
    _definitionDSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
