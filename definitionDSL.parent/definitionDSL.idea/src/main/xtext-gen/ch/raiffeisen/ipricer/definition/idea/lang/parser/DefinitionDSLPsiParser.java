/*
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.idea.lang.parser;

import ch.raiffeisen.ipricer.definition.idea.lang.DefinitionDSLElementTypeProvider;
import ch.raiffeisen.ipricer.definition.idea.parser.antlr.internal.PsiInternalDefinitionDSLParser;
import ch.raiffeisen.ipricer.definition.services.DefinitionDSLGrammarAccess;
import com.google.inject.Inject;
import com.intellij.lang.PsiBuilder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.parser.AbstractXtextPsiParser;

public class DefinitionDSLPsiParser extends AbstractXtextPsiParser {

	private static final Set<String> INITIAL_HIDDEN_TOKENS = new HashSet<String>(Arrays.asList("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT"));

	@Inject 
	private DefinitionDSLGrammarAccess grammarAccess;

	@Inject 
	private DefinitionDSLElementTypeProvider elementTypeProvider;

	@Override
	protected AbstractPsiAntlrParser createParser(PsiBuilder builder, TokenStream tokenStream) {
		return new PsiInternalDefinitionDSLParser(builder, tokenStream, elementTypeProvider, grammarAccess);
	}

	@Override
	protected Set<String> getInitialHiddenTokens() {
		return INITIAL_HIDDEN_TOKENS;
	}
}
