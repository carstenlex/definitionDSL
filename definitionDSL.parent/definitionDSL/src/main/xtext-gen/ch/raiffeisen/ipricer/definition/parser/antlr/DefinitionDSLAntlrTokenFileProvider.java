/*
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DefinitionDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ch/raiffeisen/ipricer/definition/parser/antlr/internal/InternalDefinitionDSL.tokens");
	}
}