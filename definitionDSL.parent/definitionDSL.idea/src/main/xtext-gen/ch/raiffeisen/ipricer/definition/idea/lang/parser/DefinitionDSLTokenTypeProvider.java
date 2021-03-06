/*
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.idea.lang.parser;

import ch.raiffeisen.ipricer.definition.idea.lang.DefinitionDSLLanguage;
import ch.raiffeisen.ipricer.definition.idea.parser.antlr.internal.PsiInternalDefinitionDSLParser;
import com.google.inject.Singleton;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.runtime.Token;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;

@Singleton
public class DefinitionDSLTokenTypeProvider implements TokenTypeProvider {

	private static final String[] TOKEN_NAMES = new PsiInternalDefinitionDSLParser(null).getTokenNames();

	private static final IElementType[] tokenTypes = new IElementType[TOKEN_NAMES.length];
	
	static {
		for (int i = 0; i < TOKEN_NAMES.length; i++) {
			tokenTypes[i] = new IndexedElementType(TOKEN_NAMES[i], i, DefinitionDSLLanguage.INSTANCE);
		}
	}

	private static final TokenSet WHITESPACE_TOKENS = TokenSet.create(tokenTypes[PsiInternalDefinitionDSLParser.RULE_WS]);
	private static final TokenSet COMMENT_TOKENS = TokenSet.create(tokenTypes[PsiInternalDefinitionDSLParser.RULE_SL_COMMENT], tokenTypes[PsiInternalDefinitionDSLParser.RULE_ML_COMMENT]);
	private static final TokenSet STRING_TOKENS = TokenSet.create(tokenTypes[PsiInternalDefinitionDSLParser.RULE_STRING]);

	@Override
    public int getAntlrType(IElementType iElementType) {
        return (iElementType instanceof IndexedElementType) ? ((IndexedElementType) iElementType).getLocalIndex() : Token.INVALID_TOKEN_TYPE;
    }
    
    @Override
    public IElementType getIElementType(int antlrType) {
    	return tokenTypes[antlrType];
    }

	@Override
	public TokenSet getWhitespaceTokens() {
		return WHITESPACE_TOKENS;
	}

	@Override
	public TokenSet getCommentTokens() {
		return COMMENT_TOKENS;
	}

	@Override
	public TokenSet getStringLiteralTokens() {
		return STRING_TOKENS;
	}

}
