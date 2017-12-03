package ch.raiffeisen.ipricer.definition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ch.raiffeisen.ipricer.definition.services.DefinitionDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDefinitionDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_DEF_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Definition'", "'{'", "'}'", "'Data'", "'Init'", "'TypeMask'", "'UnderlyingMask'", "'UnderlyingList'", "'OptionList'", "'OptionListLabel'", "'OptionMask'", "'AddColumn'", "'-width'", "'-title'", "'-row'", "'-col'", "'-sep'", "'InitField'", "':'", "'-valproc'", "'-strict'", "'-range'", "'[list'", "']'", "'-contrib'", "'StringField'", "'TimeField'", "'IntegerField'", "'PriceField'", "'DoubleField'", "'ZahlField'", "'DateField'", "'radmin'", "'none'", "'rtrader'", "'supervisor'", "'B'", "'U'", "'G'", "'R'", "'D'", "'P'", "'S'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_DEF_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDefinitionDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDefinitionDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDefinitionDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDefinitionDSL.g"; }



     	private DefinitionDSLGrammarAccess grammarAccess;

        public InternalDefinitionDSLParser(TokenStream input, DefinitionDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Definition";
       	}

       	@Override
       	protected DefinitionDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDefinition"
    // InternalDefinitionDSL.g:65:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalDefinitionDSL.g:65:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalDefinitionDSL.g:66:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalDefinitionDSL.g:72:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) ( (lv_typeMaskSection_8_0= ruleTypeMaskSection ) ) ( (lv_underlyingListSection_9_0= ruleUnderlyingListSection ) ) ( (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection ) ) ( (lv_optionListSection_11_0= ruleOptionListSection ) ) ( (lv_optionListLabelSection_12_0= ruleOptionListLabelSection ) ) ( (lv_optionMaskSection_13_0= ruleOptionMaskSection ) ) otherlv_14= '}' ( ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) ) )* ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methodName_1_0=null;
        Token lv_guiLabelMethod_2_0=null;
        Token lv_guiLabelParent_3_0=null;
        Token lv_guiLabelChild_4_0=null;
        Token otherlv_5=null;
        Token otherlv_14=null;
        Token lv_eventuellTclProcedures_15_1=null;
        Token lv_eventuellTclProcedures_15_2=null;
        EObject lv_data_6_0 = null;

        EObject lv_initSection_7_0 = null;

        EObject lv_typeMaskSection_8_0 = null;

        EObject lv_underlyingListSection_9_0 = null;

        EObject lv_underlyingMaskSection_10_0 = null;

        EObject lv_optionListSection_11_0 = null;

        AntlrDatatypeRuleToken lv_optionListLabelSection_12_0 = null;

        EObject lv_optionMaskSection_13_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:78:2: ( (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) ( (lv_typeMaskSection_8_0= ruleTypeMaskSection ) ) ( (lv_underlyingListSection_9_0= ruleUnderlyingListSection ) ) ( (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection ) ) ( (lv_optionListSection_11_0= ruleOptionListSection ) ) ( (lv_optionListLabelSection_12_0= ruleOptionListLabelSection ) ) ( (lv_optionMaskSection_13_0= ruleOptionMaskSection ) ) otherlv_14= '}' ( ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) ) )* ) )
            // InternalDefinitionDSL.g:79:2: (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) ( (lv_typeMaskSection_8_0= ruleTypeMaskSection ) ) ( (lv_underlyingListSection_9_0= ruleUnderlyingListSection ) ) ( (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection ) ) ( (lv_optionListSection_11_0= ruleOptionListSection ) ) ( (lv_optionListLabelSection_12_0= ruleOptionListLabelSection ) ) ( (lv_optionMaskSection_13_0= ruleOptionMaskSection ) ) otherlv_14= '}' ( ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) ) )* )
            {
            // InternalDefinitionDSL.g:79:2: (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) ( (lv_typeMaskSection_8_0= ruleTypeMaskSection ) ) ( (lv_underlyingListSection_9_0= ruleUnderlyingListSection ) ) ( (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection ) ) ( (lv_optionListSection_11_0= ruleOptionListSection ) ) ( (lv_optionListLabelSection_12_0= ruleOptionListLabelSection ) ) ( (lv_optionMaskSection_13_0= ruleOptionMaskSection ) ) otherlv_14= '}' ( ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) ) )* )
            // InternalDefinitionDSL.g:80:3: otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) ( (lv_typeMaskSection_8_0= ruleTypeMaskSection ) ) ( (lv_underlyingListSection_9_0= ruleUnderlyingListSection ) ) ( (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection ) ) ( (lv_optionListSection_11_0= ruleOptionListSection ) ) ( (lv_optionListLabelSection_12_0= ruleOptionListLabelSection ) ) ( (lv_optionMaskSection_13_0= ruleOptionMaskSection ) ) otherlv_14= '}' ( ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefinitionKeyword_0());
            		
            // InternalDefinitionDSL.g:84:3: ( (lv_methodName_1_0= RULE_ID ) )
            // InternalDefinitionDSL.g:85:4: (lv_methodName_1_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:85:4: (lv_methodName_1_0= RULE_ID )
            // InternalDefinitionDSL.g:86:5: lv_methodName_1_0= RULE_ID
            {
            lv_methodName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_methodName_1_0, grammarAccess.getDefinitionAccess().getMethodNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"methodName",
            						lv_methodName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDefinitionDSL.g:102:3: ( (lv_guiLabelMethod_2_0= RULE_STRING ) )
            // InternalDefinitionDSL.g:103:4: (lv_guiLabelMethod_2_0= RULE_STRING )
            {
            // InternalDefinitionDSL.g:103:4: (lv_guiLabelMethod_2_0= RULE_STRING )
            // InternalDefinitionDSL.g:104:5: lv_guiLabelMethod_2_0= RULE_STRING
            {
            lv_guiLabelMethod_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_guiLabelMethod_2_0, grammarAccess.getDefinitionAccess().getGuiLabelMethodSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"guiLabelMethod",
            						lv_guiLabelMethod_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDefinitionDSL.g:120:3: ( (lv_guiLabelParent_3_0= RULE_STRING ) )
            // InternalDefinitionDSL.g:121:4: (lv_guiLabelParent_3_0= RULE_STRING )
            {
            // InternalDefinitionDSL.g:121:4: (lv_guiLabelParent_3_0= RULE_STRING )
            // InternalDefinitionDSL.g:122:5: lv_guiLabelParent_3_0= RULE_STRING
            {
            lv_guiLabelParent_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_guiLabelParent_3_0, grammarAccess.getDefinitionAccess().getGuiLabelParentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"guiLabelParent",
            						lv_guiLabelParent_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDefinitionDSL.g:138:3: ( (lv_guiLabelChild_4_0= RULE_STRING ) )
            // InternalDefinitionDSL.g:139:4: (lv_guiLabelChild_4_0= RULE_STRING )
            {
            // InternalDefinitionDSL.g:139:4: (lv_guiLabelChild_4_0= RULE_STRING )
            // InternalDefinitionDSL.g:140:5: lv_guiLabelChild_4_0= RULE_STRING
            {
            lv_guiLabelChild_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_guiLabelChild_4_0, grammarAccess.getDefinitionAccess().getGuiLabelChildSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"guiLabelChild",
            						lv_guiLabelChild_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDefinitionDSL.g:160:3: ( (lv_data_6_0= ruleData ) )
            // InternalDefinitionDSL.g:161:4: (lv_data_6_0= ruleData )
            {
            // InternalDefinitionDSL.g:161:4: (lv_data_6_0= ruleData )
            // InternalDefinitionDSL.g:162:5: lv_data_6_0= ruleData
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getDataDataParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_data_6_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_6_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:179:3: ( (lv_initSection_7_0= ruleInitSection ) )
            // InternalDefinitionDSL.g:180:4: (lv_initSection_7_0= ruleInitSection )
            {
            // InternalDefinitionDSL.g:180:4: (lv_initSection_7_0= ruleInitSection )
            // InternalDefinitionDSL.g:181:5: lv_initSection_7_0= ruleInitSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getInitSectionInitSectionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_initSection_7_0=ruleInitSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"initSection",
            						lv_initSection_7_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.InitSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:198:3: ( (lv_typeMaskSection_8_0= ruleTypeMaskSection ) )
            // InternalDefinitionDSL.g:199:4: (lv_typeMaskSection_8_0= ruleTypeMaskSection )
            {
            // InternalDefinitionDSL.g:199:4: (lv_typeMaskSection_8_0= ruleTypeMaskSection )
            // InternalDefinitionDSL.g:200:5: lv_typeMaskSection_8_0= ruleTypeMaskSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getTypeMaskSectionTypeMaskSectionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_typeMaskSection_8_0=ruleTypeMaskSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"typeMaskSection",
            						lv_typeMaskSection_8_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.TypeMaskSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:217:3: ( (lv_underlyingListSection_9_0= ruleUnderlyingListSection ) )
            // InternalDefinitionDSL.g:218:4: (lv_underlyingListSection_9_0= ruleUnderlyingListSection )
            {
            // InternalDefinitionDSL.g:218:4: (lv_underlyingListSection_9_0= ruleUnderlyingListSection )
            // InternalDefinitionDSL.g:219:5: lv_underlyingListSection_9_0= ruleUnderlyingListSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getUnderlyingListSectionUnderlyingListSectionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_underlyingListSection_9_0=ruleUnderlyingListSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"underlyingListSection",
            						lv_underlyingListSection_9_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.UnderlyingListSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:236:3: ( (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection ) )
            // InternalDefinitionDSL.g:237:4: (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection )
            {
            // InternalDefinitionDSL.g:237:4: (lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection )
            // InternalDefinitionDSL.g:238:5: lv_underlyingMaskSection_10_0= ruleUnderlyingMaskSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getUnderlyingMaskSectionUnderlyingMaskSectionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_underlyingMaskSection_10_0=ruleUnderlyingMaskSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"underlyingMaskSection",
            						lv_underlyingMaskSection_10_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.UnderlyingMaskSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:255:3: ( (lv_optionListSection_11_0= ruleOptionListSection ) )
            // InternalDefinitionDSL.g:256:4: (lv_optionListSection_11_0= ruleOptionListSection )
            {
            // InternalDefinitionDSL.g:256:4: (lv_optionListSection_11_0= ruleOptionListSection )
            // InternalDefinitionDSL.g:257:5: lv_optionListSection_11_0= ruleOptionListSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getOptionListSectionOptionListSectionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_optionListSection_11_0=ruleOptionListSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"optionListSection",
            						lv_optionListSection_11_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.OptionListSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:274:3: ( (lv_optionListLabelSection_12_0= ruleOptionListLabelSection ) )
            // InternalDefinitionDSL.g:275:4: (lv_optionListLabelSection_12_0= ruleOptionListLabelSection )
            {
            // InternalDefinitionDSL.g:275:4: (lv_optionListLabelSection_12_0= ruleOptionListLabelSection )
            // InternalDefinitionDSL.g:276:5: lv_optionListLabelSection_12_0= ruleOptionListLabelSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getOptionListLabelSectionOptionListLabelSectionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_13);
            lv_optionListLabelSection_12_0=ruleOptionListLabelSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"optionListLabelSection",
            						lv_optionListLabelSection_12_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.OptionListLabelSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:293:3: ( (lv_optionMaskSection_13_0= ruleOptionMaskSection ) )
            // InternalDefinitionDSL.g:294:4: (lv_optionMaskSection_13_0= ruleOptionMaskSection )
            {
            // InternalDefinitionDSL.g:294:4: (lv_optionMaskSection_13_0= ruleOptionMaskSection )
            // InternalDefinitionDSL.g:295:5: lv_optionMaskSection_13_0= ruleOptionMaskSection
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getOptionMaskSectionOptionMaskSectionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_14);
            lv_optionMaskSection_13_0=ruleOptionMaskSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"optionMaskSection",
            						lv_optionMaskSection_13_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.OptionMaskSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalDefinitionDSL.g:316:3: ( ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_ANY_OTHER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDefinitionDSL.g:317:4: ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) )
            	    {
            	    // InternalDefinitionDSL.g:317:4: ( (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER ) )
            	    // InternalDefinitionDSL.g:318:5: (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER )
            	    {
            	    // InternalDefinitionDSL.g:318:5: (lv_eventuellTclProcedures_15_1= RULE_ID | lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_ID) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==RULE_ANY_OTHER) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDefinitionDSL.g:319:6: lv_eventuellTclProcedures_15_1= RULE_ID
            	            {
            	            lv_eventuellTclProcedures_15_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            	            						newLeafNode(lv_eventuellTclProcedures_15_1, grammarAccess.getDefinitionAccess().getEventuellTclProceduresIDTerminalRuleCall_15_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getDefinitionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"eventuellTclProcedures",
            	            							lv_eventuellTclProcedures_15_1,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDefinitionDSL.g:334:6: lv_eventuellTclProcedures_15_2= RULE_ANY_OTHER
            	            {
            	            lv_eventuellTclProcedures_15_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_15); 

            	            						newLeafNode(lv_eventuellTclProcedures_15_2, grammarAccess.getDefinitionAccess().getEventuellTclProceduresANY_OTHERTerminalRuleCall_15_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getDefinitionRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"eventuellTclProcedures",
            	            							lv_eventuellTclProcedures_15_2,
            	            							"org.eclipse.xtext.common.Terminals.ANY_OTHER");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleData"
    // InternalDefinitionDSL.g:355:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalDefinitionDSL.g:355:45: (iv_ruleData= ruleData EOF )
            // InternalDefinitionDSL.g:356:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalDefinitionDSL.g:362:1: ruleData returns [EObject current=null] : (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_fieldDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:368:2: ( (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:369:2: (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:369:2: (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' )
            // InternalDefinitionDSL.g:370:3: otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:378:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DEF_COMMENT) ) {
                    alt3=1;
                }
                else if ( ((LA3_0>=37 && LA3_0<=43)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDefinitionDSL.g:379:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_17); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getDataAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:384:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )
            	    {
            	    // InternalDefinitionDSL.g:384:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )
            	    // InternalDefinitionDSL.g:385:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
            	    {
            	    // InternalDefinitionDSL.g:385:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
            	    // InternalDefinitionDSL.g:386:6: lv_fieldDefinitions_3_0= ruleFieldDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getDataAccess().getFieldDefinitionsFieldDefinitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_fieldDefinitions_3_0=ruleFieldDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fieldDefinitions",
            	    							lv_fieldDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.FieldDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleInitSection"
    // InternalDefinitionDSL.g:412:1: entryRuleInitSection returns [EObject current=null] : iv_ruleInitSection= ruleInitSection EOF ;
    public final EObject entryRuleInitSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSection = null;


        try {
            // InternalDefinitionDSL.g:412:52: (iv_ruleInitSection= ruleInitSection EOF )
            // InternalDefinitionDSL.g:413:2: iv_ruleInitSection= ruleInitSection EOF
            {
             newCompositeNode(grammarAccess.getInitSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitSection=ruleInitSection();

            state._fsp--;

             current =iv_ruleInitSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitSection"


    // $ANTLR start "ruleInitSection"
    // InternalDefinitionDSL.g:419:1: ruleInitSection returns [EObject current=null] : (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_initDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:425:2: ( (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:426:2: (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:426:2: (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' )
            // InternalDefinitionDSL.g:427:3: otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitSectionAccess().getInitKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInitSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:435:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DEF_COMMENT) ) {
                    alt4=1;
                }
                else if ( (LA4_0==29) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDefinitionDSL.g:436:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_18); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getInitSectionAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:441:4: ( (lv_initDefinitions_3_0= ruleInitDefinition ) )
            	    {
            	    // InternalDefinitionDSL.g:441:4: ( (lv_initDefinitions_3_0= ruleInitDefinition ) )
            	    // InternalDefinitionDSL.g:442:5: (lv_initDefinitions_3_0= ruleInitDefinition )
            	    {
            	    // InternalDefinitionDSL.g:442:5: (lv_initDefinitions_3_0= ruleInitDefinition )
            	    // InternalDefinitionDSL.g:443:6: lv_initDefinitions_3_0= ruleInitDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getInitSectionAccess().getInitDefinitionsInitDefinitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_initDefinitions_3_0=ruleInitDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"initDefinitions",
            	    							lv_initDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.InitDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInitSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitSection"


    // $ANTLR start "entryRuleTypeMaskSection"
    // InternalDefinitionDSL.g:469:1: entryRuleTypeMaskSection returns [EObject current=null] : iv_ruleTypeMaskSection= ruleTypeMaskSection EOF ;
    public final EObject entryRuleTypeMaskSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMaskSection = null;


        try {
            // InternalDefinitionDSL.g:469:56: (iv_ruleTypeMaskSection= ruleTypeMaskSection EOF )
            // InternalDefinitionDSL.g:470:2: iv_ruleTypeMaskSection= ruleTypeMaskSection EOF
            {
             newCompositeNode(grammarAccess.getTypeMaskSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeMaskSection=ruleTypeMaskSection();

            state._fsp--;

             current =iv_ruleTypeMaskSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeMaskSection"


    // $ANTLR start "ruleTypeMaskSection"
    // InternalDefinitionDSL.g:476:1: ruleTypeMaskSection returns [EObject current=null] : (otherlv_0= 'TypeMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )+ otherlv_4= '}' ) ;
    public final EObject ruleTypeMaskSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_typeMaskDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:482:2: ( (otherlv_0= 'TypeMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )+ otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:483:2: (otherlv_0= 'TypeMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )+ otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:483:2: (otherlv_0= 'TypeMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )+ otherlv_4= '}' )
            // InternalDefinitionDSL.g:484:3: otherlv_0= 'TypeMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeMaskSectionAccess().getTypeMaskKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeMaskSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:492:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_DEF_COMMENT) ) {
                    alt5=1;
                }
                else if ( (LA5_0==23) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDefinitionDSL.g:493:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_20); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getTypeMaskSectionAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:498:4: ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) )
            	    {
            	    // InternalDefinitionDSL.g:498:4: ( (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition ) )
            	    // InternalDefinitionDSL.g:499:5: (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition )
            	    {
            	    // InternalDefinitionDSL.g:499:5: (lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition )
            	    // InternalDefinitionDSL.g:500:6: lv_typeMaskDefinitions_3_0= ruleTypeMaskDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getTypeMaskSectionAccess().getTypeMaskDefinitionsTypeMaskDefinitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_typeMaskDefinitions_3_0=ruleTypeMaskDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeMaskSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typeMaskDefinitions",
            	    							lv_typeMaskDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.TypeMaskDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeMaskSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeMaskSection"


    // $ANTLR start "entryRuleUnderlyingMaskSection"
    // InternalDefinitionDSL.g:526:1: entryRuleUnderlyingMaskSection returns [EObject current=null] : iv_ruleUnderlyingMaskSection= ruleUnderlyingMaskSection EOF ;
    public final EObject entryRuleUnderlyingMaskSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnderlyingMaskSection = null;


        try {
            // InternalDefinitionDSL.g:526:62: (iv_ruleUnderlyingMaskSection= ruleUnderlyingMaskSection EOF )
            // InternalDefinitionDSL.g:527:2: iv_ruleUnderlyingMaskSection= ruleUnderlyingMaskSection EOF
            {
             newCompositeNode(grammarAccess.getUnderlyingMaskSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnderlyingMaskSection=ruleUnderlyingMaskSection();

            state._fsp--;

             current =iv_ruleUnderlyingMaskSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnderlyingMaskSection"


    // $ANTLR start "ruleUnderlyingMaskSection"
    // InternalDefinitionDSL.g:533:1: ruleUnderlyingMaskSection returns [EObject current=null] : (otherlv_0= 'UnderlyingMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleUnderlyingMaskSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_underlyingMaskDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:539:2: ( (otherlv_0= 'UnderlyingMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:540:2: (otherlv_0= 'UnderlyingMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:540:2: (otherlv_0= 'UnderlyingMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' )
            // InternalDefinitionDSL.g:541:3: otherlv_0= 'UnderlyingMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUnderlyingMaskSectionAccess().getUnderlyingMaskKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getUnderlyingMaskSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:549:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DEF_COMMENT) ) {
                    alt6=1;
                }
                else if ( (LA6_0==23) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDefinitionDSL.g:550:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_20); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getUnderlyingMaskSectionAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:555:4: ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) )
            	    {
            	    // InternalDefinitionDSL.g:555:4: ( (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition ) )
            	    // InternalDefinitionDSL.g:556:5: (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition )
            	    {
            	    // InternalDefinitionDSL.g:556:5: (lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition )
            	    // InternalDefinitionDSL.g:557:6: lv_underlyingMaskDefinitions_3_0= ruleTypeMaskDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getUnderlyingMaskSectionAccess().getUnderlyingMaskDefinitionsTypeMaskDefinitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_underlyingMaskDefinitions_3_0=ruleTypeMaskDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnderlyingMaskSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"underlyingMaskDefinitions",
            	    							lv_underlyingMaskDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.TypeMaskDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUnderlyingMaskSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnderlyingMaskSection"


    // $ANTLR start "entryRuleUnderlyingListSection"
    // InternalDefinitionDSL.g:583:1: entryRuleUnderlyingListSection returns [EObject current=null] : iv_ruleUnderlyingListSection= ruleUnderlyingListSection EOF ;
    public final EObject entryRuleUnderlyingListSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnderlyingListSection = null;


        try {
            // InternalDefinitionDSL.g:583:62: (iv_ruleUnderlyingListSection= ruleUnderlyingListSection EOF )
            // InternalDefinitionDSL.g:584:2: iv_ruleUnderlyingListSection= ruleUnderlyingListSection EOF
            {
             newCompositeNode(grammarAccess.getUnderlyingListSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnderlyingListSection=ruleUnderlyingListSection();

            state._fsp--;

             current =iv_ruleUnderlyingListSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnderlyingListSection"


    // $ANTLR start "ruleUnderlyingListSection"
    // InternalDefinitionDSL.g:590:1: ruleUnderlyingListSection returns [EObject current=null] : (otherlv_0= 'UnderlyingList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleUnderlyingListSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_underlyingListDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:596:2: ( (otherlv_0= 'UnderlyingList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:597:2: (otherlv_0= 'UnderlyingList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:597:2: (otherlv_0= 'UnderlyingList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' )
            // InternalDefinitionDSL.g:598:3: otherlv_0= 'UnderlyingList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUnderlyingListSectionAccess().getUnderlyingListKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getUnderlyingListSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:606:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DEF_COMMENT) ) {
                    alt7=1;
                }
                else if ( (LA7_0==23) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDefinitionDSL.g:607:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_20); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getUnderlyingListSectionAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:612:4: ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) )
            	    {
            	    // InternalDefinitionDSL.g:612:4: ( (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion ) )
            	    // InternalDefinitionDSL.g:613:5: (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion )
            	    {
            	    // InternalDefinitionDSL.g:613:5: (lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion )
            	    // InternalDefinitionDSL.g:614:6: lv_underlyingListDefinitions_3_0= ruleUnderlyingListDefintion
            	    {

            	    						newCompositeNode(grammarAccess.getUnderlyingListSectionAccess().getUnderlyingListDefinitionsUnderlyingListDefintionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_underlyingListDefinitions_3_0=ruleUnderlyingListDefintion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnderlyingListSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"underlyingListDefinitions",
            	    							lv_underlyingListDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.UnderlyingListDefintion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUnderlyingListSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnderlyingListSection"


    // $ANTLR start "entryRuleOptionListSection"
    // InternalDefinitionDSL.g:640:1: entryRuleOptionListSection returns [EObject current=null] : iv_ruleOptionListSection= ruleOptionListSection EOF ;
    public final EObject entryRuleOptionListSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionListSection = null;


        try {
            // InternalDefinitionDSL.g:640:58: (iv_ruleOptionListSection= ruleOptionListSection EOF )
            // InternalDefinitionDSL.g:641:2: iv_ruleOptionListSection= ruleOptionListSection EOF
            {
             newCompositeNode(grammarAccess.getOptionListSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionListSection=ruleOptionListSection();

            state._fsp--;

             current =iv_ruleOptionListSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionListSection"


    // $ANTLR start "ruleOptionListSection"
    // InternalDefinitionDSL.g:647:1: ruleOptionListSection returns [EObject current=null] : (otherlv_0= 'OptionList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleOptionListSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_optionListDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:653:2: ( (otherlv_0= 'OptionList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:654:2: (otherlv_0= 'OptionList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:654:2: (otherlv_0= 'OptionList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}' )
            // InternalDefinitionDSL.g:655:3: otherlv_0= 'OptionList' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionListSectionAccess().getOptionListKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionListSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:663:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DEF_COMMENT) ) {
                    alt8=1;
                }
                else if ( (LA8_0==23) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDefinitionDSL.g:664:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_20); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getOptionListSectionAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:669:4: ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) )
            	    {
            	    // InternalDefinitionDSL.g:669:4: ( (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion ) )
            	    // InternalDefinitionDSL.g:670:5: (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion )
            	    {
            	    // InternalDefinitionDSL.g:670:5: (lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion )
            	    // InternalDefinitionDSL.g:671:6: lv_optionListDefinitions_3_0= ruleUnderlyingListDefintion
            	    {

            	    						newCompositeNode(grammarAccess.getOptionListSectionAccess().getOptionListDefinitionsUnderlyingListDefintionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_optionListDefinitions_3_0=ruleUnderlyingListDefintion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOptionListSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"optionListDefinitions",
            	    							lv_optionListDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.UnderlyingListDefintion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOptionListSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionListSection"


    // $ANTLR start "entryRuleOptionListLabelSection"
    // InternalDefinitionDSL.g:697:1: entryRuleOptionListLabelSection returns [String current=null] : iv_ruleOptionListLabelSection= ruleOptionListLabelSection EOF ;
    public final String entryRuleOptionListLabelSection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptionListLabelSection = null;


        try {
            // InternalDefinitionDSL.g:697:62: (iv_ruleOptionListLabelSection= ruleOptionListLabelSection EOF )
            // InternalDefinitionDSL.g:698:2: iv_ruleOptionListLabelSection= ruleOptionListLabelSection EOF
            {
             newCompositeNode(grammarAccess.getOptionListLabelSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionListLabelSection=ruleOptionListLabelSection();

            state._fsp--;

             current =iv_ruleOptionListLabelSection.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionListLabelSection"


    // $ANTLR start "ruleOptionListLabelSection"
    // InternalDefinitionDSL.g:704:1: ruleOptionListLabelSection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OptionListLabel' kw= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleOptionListLabelSection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DEF_COMMENT_2=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:710:2: ( (kw= 'OptionListLabel' kw= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT )* kw= '}' ) )
            // InternalDefinitionDSL.g:711:2: (kw= 'OptionListLabel' kw= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT )* kw= '}' )
            {
            // InternalDefinitionDSL.g:711:2: (kw= 'OptionListLabel' kw= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT )* kw= '}' )
            // InternalDefinitionDSL.g:712:3: kw= 'OptionListLabel' kw= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT )* kw= '}'
            {
            kw=(Token)match(input,21,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOptionListLabelSectionAccess().getOptionListLabelKeyword_0());
            		
            kw=(Token)match(input,13,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOptionListLabelSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:722:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DEF_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDefinitionDSL.g:723:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_21); 

            	    				current.merge(this_DEF_COMMENT_2);
            	    			

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getOptionListLabelSectionAccess().getDEF_COMMENTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            kw=(Token)match(input,14,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOptionListLabelSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionListLabelSection"


    // $ANTLR start "entryRuleOptionMaskSection"
    // InternalDefinitionDSL.g:740:1: entryRuleOptionMaskSection returns [EObject current=null] : iv_ruleOptionMaskSection= ruleOptionMaskSection EOF ;
    public final EObject entryRuleOptionMaskSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionMaskSection = null;


        try {
            // InternalDefinitionDSL.g:740:58: (iv_ruleOptionMaskSection= ruleOptionMaskSection EOF )
            // InternalDefinitionDSL.g:741:2: iv_ruleOptionMaskSection= ruleOptionMaskSection EOF
            {
             newCompositeNode(grammarAccess.getOptionMaskSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionMaskSection=ruleOptionMaskSection();

            state._fsp--;

             current =iv_ruleOptionMaskSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionMaskSection"


    // $ANTLR start "ruleOptionMaskSection"
    // InternalDefinitionDSL.g:747:1: ruleOptionMaskSection returns [EObject current=null] : (otherlv_0= 'OptionMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleOptionMaskSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        EObject lv_optionMaskDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:753:2: ( (otherlv_0= 'OptionMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' ) )
            // InternalDefinitionDSL.g:754:2: (otherlv_0= 'OptionMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' )
            {
            // InternalDefinitionDSL.g:754:2: (otherlv_0= 'OptionMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}' )
            // InternalDefinitionDSL.g:755:3: otherlv_0= 'OptionMask' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionMaskSectionAccess().getOptionMaskKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionMaskSectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDefinitionDSL.g:763:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DEF_COMMENT) ) {
                    alt10=1;
                }
                else if ( (LA10_0==23) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDefinitionDSL.g:764:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_20); 

            	    				newLeafNode(this_DEF_COMMENT_2, grammarAccess.getOptionMaskSectionAccess().getDEF_COMMENTTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDefinitionDSL.g:769:4: ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) )
            	    {
            	    // InternalDefinitionDSL.g:769:4: ( (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition ) )
            	    // InternalDefinitionDSL.g:770:5: (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition )
            	    {
            	    // InternalDefinitionDSL.g:770:5: (lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition )
            	    // InternalDefinitionDSL.g:771:6: lv_optionMaskDefinitions_3_0= ruleTypeMaskDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getOptionMaskSectionAccess().getOptionMaskDefinitionsTypeMaskDefinitionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_optionMaskDefinitions_3_0=ruleTypeMaskDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOptionMaskSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"optionMaskDefinitions",
            	    							lv_optionMaskDefinitions_3_0,
            	    							"ch.raiffeisen.ipricer.definition.DefinitionDSL.TypeMaskDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOptionMaskSectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionMaskSection"


    // $ANTLR start "entryRuleUnderlyingListDefintion"
    // InternalDefinitionDSL.g:797:1: entryRuleUnderlyingListDefintion returns [EObject current=null] : iv_ruleUnderlyingListDefintion= ruleUnderlyingListDefintion EOF ;
    public final EObject entryRuleUnderlyingListDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnderlyingListDefintion = null;


        try {
            // InternalDefinitionDSL.g:797:64: (iv_ruleUnderlyingListDefintion= ruleUnderlyingListDefintion EOF )
            // InternalDefinitionDSL.g:798:2: iv_ruleUnderlyingListDefintion= ruleUnderlyingListDefintion EOF
            {
             newCompositeNode(grammarAccess.getUnderlyingListDefintionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnderlyingListDefintion=ruleUnderlyingListDefintion();

            state._fsp--;

             current =iv_ruleUnderlyingListDefintion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnderlyingListDefintion"


    // $ANTLR start "ruleUnderlyingListDefintion"
    // InternalDefinitionDSL.g:804:1: ruleUnderlyingListDefintion returns [EObject current=null] : (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-width' ( (lv_width_3_0= RULE_INT ) ) (otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleUnderlyingListDefintion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:810:2: ( (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-width' ( (lv_width_3_0= RULE_INT ) ) (otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) ) )* ) )
            // InternalDefinitionDSL.g:811:2: (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-width' ( (lv_width_3_0= RULE_INT ) ) (otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) ) )* )
            {
            // InternalDefinitionDSL.g:811:2: (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-width' ( (lv_width_3_0= RULE_INT ) ) (otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) ) )* )
            // InternalDefinitionDSL.g:812:3: otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-width' ( (lv_width_3_0= RULE_INT ) ) (otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnderlyingListDefintionAccess().getAddColumnKeyword_0());
            		
            // InternalDefinitionDSL.g:816:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalDefinitionDSL.g:817:4: (lv_id_1_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:817:4: (lv_id_1_0= RULE_ID )
            // InternalDefinitionDSL.g:818:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getUnderlyingListDefintionAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnderlyingListDefintionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getUnderlyingListDefintionAccess().getWidthKeyword_2());
            		
            // InternalDefinitionDSL.g:838:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalDefinitionDSL.g:839:4: (lv_width_3_0= RULE_INT )
            {
            // InternalDefinitionDSL.g:839:4: (lv_width_3_0= RULE_INT )
            // InternalDefinitionDSL.g:840:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_width_3_0, grammarAccess.getUnderlyingListDefintionAccess().getWidthINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnderlyingListDefintionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDefinitionDSL.g:856:3: (otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDefinitionDSL.g:857:4: otherlv_4= '-title' ( (lv_title_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getUnderlyingListDefintionAccess().getTitleKeyword_4_0());
            	    			
            	    // InternalDefinitionDSL.g:861:4: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalDefinitionDSL.g:862:5: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalDefinitionDSL.g:862:5: (lv_title_5_0= RULE_STRING )
            	    // InternalDefinitionDSL.g:863:6: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            	    						newLeafNode(lv_title_5_0, grammarAccess.getUnderlyingListDefintionAccess().getTitleSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUnderlyingListDefintionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"title",
            	    							lv_title_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnderlyingListDefintion"


    // $ANTLR start "entryRuleTypeMaskDefinition"
    // InternalDefinitionDSL.g:884:1: entryRuleTypeMaskDefinition returns [EObject current=null] : iv_ruleTypeMaskDefinition= ruleTypeMaskDefinition EOF ;
    public final EObject entryRuleTypeMaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMaskDefinition = null;


        try {
            // InternalDefinitionDSL.g:884:59: (iv_ruleTypeMaskDefinition= ruleTypeMaskDefinition EOF )
            // InternalDefinitionDSL.g:885:2: iv_ruleTypeMaskDefinition= ruleTypeMaskDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeMaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeMaskDefinition=ruleTypeMaskDefinition();

            state._fsp--;

             current =iv_ruleTypeMaskDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeMaskDefinition"


    // $ANTLR start "ruleTypeMaskDefinition"
    // InternalDefinitionDSL.g:891:1: ruleTypeMaskDefinition returns [EObject current=null] : (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-row' ( (lv_row_3_0= RULE_INT ) ) otherlv_4= '-col' ( (lv_col_5_0= RULE_INT ) ) ( (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) ) | ( (lv_separator_8_0= '-sep' ) ) ) ) ;
    public final EObject ruleTypeMaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_row_3_0=null;
        Token otherlv_4=null;
        Token lv_col_5_0=null;
        Token otherlv_6=null;
        Token lv_width_7_0=null;
        Token lv_separator_8_0=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:897:2: ( (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-row' ( (lv_row_3_0= RULE_INT ) ) otherlv_4= '-col' ( (lv_col_5_0= RULE_INT ) ) ( (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) ) | ( (lv_separator_8_0= '-sep' ) ) ) ) )
            // InternalDefinitionDSL.g:898:2: (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-row' ( (lv_row_3_0= RULE_INT ) ) otherlv_4= '-col' ( (lv_col_5_0= RULE_INT ) ) ( (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) ) | ( (lv_separator_8_0= '-sep' ) ) ) )
            {
            // InternalDefinitionDSL.g:898:2: (otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-row' ( (lv_row_3_0= RULE_INT ) ) otherlv_4= '-col' ( (lv_col_5_0= RULE_INT ) ) ( (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) ) | ( (lv_separator_8_0= '-sep' ) ) ) )
            // InternalDefinitionDSL.g:899:3: otherlv_0= 'AddColumn' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '-row' ( (lv_row_3_0= RULE_INT ) ) otherlv_4= '-col' ( (lv_col_5_0= RULE_INT ) ) ( (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) ) | ( (lv_separator_8_0= '-sep' ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeMaskDefinitionAccess().getAddColumnKeyword_0());
            		
            // InternalDefinitionDSL.g:903:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalDefinitionDSL.g:904:4: (lv_id_1_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:904:4: (lv_id_1_0= RULE_ID )
            // InternalDefinitionDSL.g:905:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_1_0, grammarAccess.getTypeMaskDefinitionAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeMaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeMaskDefinitionAccess().getRowKeyword_2());
            		
            // InternalDefinitionDSL.g:925:3: ( (lv_row_3_0= RULE_INT ) )
            // InternalDefinitionDSL.g:926:4: (lv_row_3_0= RULE_INT )
            {
            // InternalDefinitionDSL.g:926:4: (lv_row_3_0= RULE_INT )
            // InternalDefinitionDSL.g:927:5: lv_row_3_0= RULE_INT
            {
            lv_row_3_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_row_3_0, grammarAccess.getTypeMaskDefinitionAccess().getRowINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeMaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"row",
            						lv_row_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeMaskDefinitionAccess().getColKeyword_4());
            		
            // InternalDefinitionDSL.g:947:3: ( (lv_col_5_0= RULE_INT ) )
            // InternalDefinitionDSL.g:948:4: (lv_col_5_0= RULE_INT )
            {
            // InternalDefinitionDSL.g:948:4: (lv_col_5_0= RULE_INT )
            // InternalDefinitionDSL.g:949:5: lv_col_5_0= RULE_INT
            {
            lv_col_5_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_col_5_0, grammarAccess.getTypeMaskDefinitionAccess().getColINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeMaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"col",
            						lv_col_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDefinitionDSL.g:965:3: ( (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) ) | ( (lv_separator_8_0= '-sep' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDefinitionDSL.g:966:4: (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) )
                    {
                    // InternalDefinitionDSL.g:966:4: (otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) ) )
                    // InternalDefinitionDSL.g:967:5: otherlv_6= '-width' ( (lv_width_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_23); 

                    					newLeafNode(otherlv_6, grammarAccess.getTypeMaskDefinitionAccess().getWidthKeyword_6_0_0());
                    				
                    // InternalDefinitionDSL.g:971:5: ( (lv_width_7_0= RULE_INT ) )
                    // InternalDefinitionDSL.g:972:6: (lv_width_7_0= RULE_INT )
                    {
                    // InternalDefinitionDSL.g:972:6: (lv_width_7_0= RULE_INT )
                    // InternalDefinitionDSL.g:973:7: lv_width_7_0= RULE_INT
                    {
                    lv_width_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_width_7_0, grammarAccess.getTypeMaskDefinitionAccess().getWidthINTTerminalRuleCall_6_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTypeMaskDefinitionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"width",
                    								lv_width_7_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDefinitionDSL.g:991:4: ( (lv_separator_8_0= '-sep' ) )
                    {
                    // InternalDefinitionDSL.g:991:4: ( (lv_separator_8_0= '-sep' ) )
                    // InternalDefinitionDSL.g:992:5: (lv_separator_8_0= '-sep' )
                    {
                    // InternalDefinitionDSL.g:992:5: (lv_separator_8_0= '-sep' )
                    // InternalDefinitionDSL.g:993:6: lv_separator_8_0= '-sep'
                    {
                    lv_separator_8_0=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_separator_8_0, grammarAccess.getTypeMaskDefinitionAccess().getSeparatorSepKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeMaskDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "separator", lv_separator_8_0, "-sep");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeMaskDefinition"


    // $ANTLR start "entryRuleInitDefinition"
    // InternalDefinitionDSL.g:1010:1: entryRuleInitDefinition returns [EObject current=null] : iv_ruleInitDefinition= ruleInitDefinition EOF ;
    public final EObject entryRuleInitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitDefinition = null;


        try {
            // InternalDefinitionDSL.g:1010:55: (iv_ruleInitDefinition= ruleInitDefinition EOF )
            // InternalDefinitionDSL.g:1011:2: iv_ruleInitDefinition= ruleInitDefinition EOF
            {
             newCompositeNode(grammarAccess.getInitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitDefinition=ruleInitDefinition();

            state._fsp--;

             current =iv_ruleInitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitDefinition"


    // $ANTLR start "ruleInitDefinition"
    // InternalDefinitionDSL.g:1017:1: ruleInitDefinition returns [EObject current=null] : (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_initValue_2_0=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1023:2: ( (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) ) )
            // InternalDefinitionDSL.g:1024:2: (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) )
            {
            // InternalDefinitionDSL.g:1024:2: (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) )
            // InternalDefinitionDSL.g:1025:3: otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitDefinitionAccess().getInitFieldKeyword_0());
            		
            // InternalDefinitionDSL.g:1029:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalDefinitionDSL.g:1030:4: (lv_id_1_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:1030:4: (lv_id_1_0= RULE_ID )
            // InternalDefinitionDSL.g:1031:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getInitDefinitionAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDefinitionDSL.g:1047:3: ( (lv_initValue_2_0= RULE_STRING ) )
            // InternalDefinitionDSL.g:1048:4: (lv_initValue_2_0= RULE_STRING )
            {
            // InternalDefinitionDSL.g:1048:4: (lv_initValue_2_0= RULE_STRING )
            // InternalDefinitionDSL.g:1049:5: lv_initValue_2_0= RULE_STRING
            {
            lv_initValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_initValue_2_0, grammarAccess.getInitDefinitionAccess().getInitValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initValue",
            						lv_initValue_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitDefinition"


    // $ANTLR start "entryRuleFieldDefinition"
    // InternalDefinitionDSL.g:1069:1: entryRuleFieldDefinition returns [EObject current=null] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final EObject entryRuleFieldDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDefinition = null;


        try {
            // InternalDefinitionDSL.g:1069:56: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // InternalDefinitionDSL.g:1070:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
            {
             newCompositeNode(grammarAccess.getFieldDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDefinition=ruleFieldDefinition();

            state._fsp--;

             current =iv_ruleFieldDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDefinition"


    // $ANTLR start "ruleFieldDefinition"
    // InternalDefinitionDSL.g:1076:1: ruleFieldDefinition returns [EObject current=null] : ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* ) ;
    public final EObject ruleFieldDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token lv_fieldName_6_0=null;
        Token lv_length_7_0=null;
        Enumerator lv_fieldType_0_0 = null;

        Enumerator lv_access_3_0 = null;

        Enumerator lv_recordClass_4_0 = null;

        EObject lv_options_8_0 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:1082:2: ( ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* ) )
            // InternalDefinitionDSL.g:1083:2: ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* )
            {
            // InternalDefinitionDSL.g:1083:2: ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* )
            // InternalDefinitionDSL.g:1084:3: ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )*
            {
            // InternalDefinitionDSL.g:1084:3: ( (lv_fieldType_0_0= ruleFIELD_TYPE ) )
            // InternalDefinitionDSL.g:1085:4: (lv_fieldType_0_0= ruleFIELD_TYPE )
            {
            // InternalDefinitionDSL.g:1085:4: (lv_fieldType_0_0= ruleFIELD_TYPE )
            // InternalDefinitionDSL.g:1086:5: lv_fieldType_0_0= ruleFIELD_TYPE
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getFieldTypeFIELD_TYPEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_fieldType_0_0=ruleFIELD_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"fieldType",
            						lv_fieldType_0_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.FIELD_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:1103:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalDefinitionDSL.g:1104:4: (lv_id_1_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:1104:4: (lv_id_1_0= RULE_ID )
            // InternalDefinitionDSL.g:1105:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getFieldDefinitionAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDefinitionDSL.g:1121:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalDefinitionDSL.g:1122:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalDefinitionDSL.g:1122:4: (lv_name_2_0= RULE_STRING )
            // InternalDefinitionDSL.g:1123:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDefinitionDSL.g:1139:3: ( (lv_access_3_0= ruleROLE ) )
            // InternalDefinitionDSL.g:1140:4: (lv_access_3_0= ruleROLE )
            {
            // InternalDefinitionDSL.g:1140:4: (lv_access_3_0= ruleROLE )
            // InternalDefinitionDSL.g:1141:5: lv_access_3_0= ruleROLE
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getAccessROLEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_access_3_0=ruleROLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"access",
            						lv_access_3_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.ROLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDefinitionDSL.g:1158:3: ( (lv_recordClass_4_0= ruleRECORDCLASS ) )
            // InternalDefinitionDSL.g:1159:4: (lv_recordClass_4_0= ruleRECORDCLASS )
            {
            // InternalDefinitionDSL.g:1159:4: (lv_recordClass_4_0= ruleRECORDCLASS )
            // InternalDefinitionDSL.g:1160:5: lv_recordClass_4_0= ruleRECORDCLASS
            {

            					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getRecordClassRECORDCLASSEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_recordClass_4_0=ruleRECORDCLASS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            					}
            					set(
            						current,
            						"recordClass",
            						lv_recordClass_4_0,
            						"ch.raiffeisen.ipricer.definition.DefinitionDSL.RECORDCLASS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldDefinitionAccess().getColonKeyword_5());
            		
            // InternalDefinitionDSL.g:1181:3: ( (lv_fieldName_6_0= RULE_ID ) )
            // InternalDefinitionDSL.g:1182:4: (lv_fieldName_6_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:1182:4: (lv_fieldName_6_0= RULE_ID )
            // InternalDefinitionDSL.g:1183:5: lv_fieldName_6_0= RULE_ID
            {
            lv_fieldName_6_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_fieldName_6_0, grammarAccess.getFieldDefinitionAccess().getFieldNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldName",
            						lv_fieldName_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDefinitionDSL.g:1199:3: ( (lv_length_7_0= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDefinitionDSL.g:1200:4: (lv_length_7_0= RULE_INT )
                    {
                    // InternalDefinitionDSL.g:1200:4: (lv_length_7_0= RULE_INT )
                    // InternalDefinitionDSL.g:1201:5: lv_length_7_0= RULE_INT
                    {
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    					newLeafNode(lv_length_7_0, grammarAccess.getFieldDefinitionAccess().getLengthINTTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldDefinitionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"length",
                    						lv_length_7_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalDefinitionDSL.g:1217:3: ( (lv_options_8_0= ruleOption ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=33)||LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDefinitionDSL.g:1218:4: (lv_options_8_0= ruleOption )
            	    {
            	    // InternalDefinitionDSL.g:1218:4: (lv_options_8_0= ruleOption )
            	    // InternalDefinitionDSL.g:1219:5: lv_options_8_0= ruleOption
            	    {

            	    					newCompositeNode(grammarAccess.getFieldDefinitionAccess().getOptionsOptionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_options_8_0=ruleOption();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_8_0,
            	    						"ch.raiffeisen.ipricer.definition.DefinitionDSL.Option");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDefinition"


    // $ANTLR start "entryRuleOption"
    // InternalDefinitionDSL.g:1240:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDefinitionDSL.g:1240:47: (iv_ruleOption= ruleOption EOF )
            // InternalDefinitionDSL.g:1241:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalDefinitionDSL.g:1247:1: ruleOption returns [EObject current=null] : (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_OptionValproc_0 = null;

        EObject this_OptionStrict_1 = null;

        EObject this_OptionRange_2 = null;

        EObject this_OptionContrib_3 = null;



        	enterRule();

        try {
            // InternalDefinitionDSL.g:1253:2: ( (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib ) )
            // InternalDefinitionDSL.g:1254:2: (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib )
            {
            // InternalDefinitionDSL.g:1254:2: (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDefinitionDSL.g:1255:3: this_OptionValproc_0= ruleOptionValproc
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getOptionValprocParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionValproc_0=ruleOptionValproc();

                    state._fsp--;


                    			current = this_OptionValproc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDefinitionDSL.g:1264:3: this_OptionStrict_1= ruleOptionStrict
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getOptionStrictParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionStrict_1=ruleOptionStrict();

                    state._fsp--;


                    			current = this_OptionStrict_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDefinitionDSL.g:1273:3: this_OptionRange_2= ruleOptionRange
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getOptionRangeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionRange_2=ruleOptionRange();

                    state._fsp--;


                    			current = this_OptionRange_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDefinitionDSL.g:1282:3: this_OptionContrib_3= ruleOptionContrib
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getOptionContribParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionContrib_3=ruleOptionContrib();

                    state._fsp--;


                    			current = this_OptionContrib_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleOptionValproc"
    // InternalDefinitionDSL.g:1294:1: entryRuleOptionValproc returns [EObject current=null] : iv_ruleOptionValproc= ruleOptionValproc EOF ;
    public final EObject entryRuleOptionValproc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionValproc = null;


        try {
            // InternalDefinitionDSL.g:1294:54: (iv_ruleOptionValproc= ruleOptionValproc EOF )
            // InternalDefinitionDSL.g:1295:2: iv_ruleOptionValproc= ruleOptionValproc EOF
            {
             newCompositeNode(grammarAccess.getOptionValprocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionValproc=ruleOptionValproc();

            state._fsp--;

             current =iv_ruleOptionValproc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionValproc"


    // $ANTLR start "ruleOptionValproc"
    // InternalDefinitionDSL.g:1301:1: ruleOptionValproc returns [EObject current=null] : ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOptionValproc() throws RecognitionException {
        EObject current = null;

        Token lv_valproc_0_0=null;
        Token lv_tclProc_1_0=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1307:2: ( ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) ) )
            // InternalDefinitionDSL.g:1308:2: ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) )
            {
            // InternalDefinitionDSL.g:1308:2: ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) )
            // InternalDefinitionDSL.g:1309:3: ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) )
            {
            // InternalDefinitionDSL.g:1309:3: ( (lv_valproc_0_0= '-valproc' ) )
            // InternalDefinitionDSL.g:1310:4: (lv_valproc_0_0= '-valproc' )
            {
            // InternalDefinitionDSL.g:1310:4: (lv_valproc_0_0= '-valproc' )
            // InternalDefinitionDSL.g:1311:5: lv_valproc_0_0= '-valproc'
            {
            lv_valproc_0_0=(Token)match(input,31,FOLLOW_3); 

            					newLeafNode(lv_valproc_0_0, grammarAccess.getOptionValprocAccess().getValprocValprocKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionValprocRule());
            					}
            					setWithLastConsumed(current, "valproc", lv_valproc_0_0, "-valproc");
            				

            }


            }

            // InternalDefinitionDSL.g:1323:3: ( (lv_tclProc_1_0= RULE_ID ) )
            // InternalDefinitionDSL.g:1324:4: (lv_tclProc_1_0= RULE_ID )
            {
            // InternalDefinitionDSL.g:1324:4: (lv_tclProc_1_0= RULE_ID )
            // InternalDefinitionDSL.g:1325:5: lv_tclProc_1_0= RULE_ID
            {
            lv_tclProc_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_tclProc_1_0, grammarAccess.getOptionValprocAccess().getTclProcIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionValprocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tclProc",
            						lv_tclProc_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionValproc"


    // $ANTLR start "entryRuleOptionStrict"
    // InternalDefinitionDSL.g:1345:1: entryRuleOptionStrict returns [EObject current=null] : iv_ruleOptionStrict= ruleOptionStrict EOF ;
    public final EObject entryRuleOptionStrict() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionStrict = null;


        try {
            // InternalDefinitionDSL.g:1345:53: (iv_ruleOptionStrict= ruleOptionStrict EOF )
            // InternalDefinitionDSL.g:1346:2: iv_ruleOptionStrict= ruleOptionStrict EOF
            {
             newCompositeNode(grammarAccess.getOptionStrictRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionStrict=ruleOptionStrict();

            state._fsp--;

             current =iv_ruleOptionStrict; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionStrict"


    // $ANTLR start "ruleOptionStrict"
    // InternalDefinitionDSL.g:1352:1: ruleOptionStrict returns [EObject current=null] : ( (lv_strict_0_0= '-strict' ) ) ;
    public final EObject ruleOptionStrict() throws RecognitionException {
        EObject current = null;

        Token lv_strict_0_0=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1358:2: ( ( (lv_strict_0_0= '-strict' ) ) )
            // InternalDefinitionDSL.g:1359:2: ( (lv_strict_0_0= '-strict' ) )
            {
            // InternalDefinitionDSL.g:1359:2: ( (lv_strict_0_0= '-strict' ) )
            // InternalDefinitionDSL.g:1360:3: (lv_strict_0_0= '-strict' )
            {
            // InternalDefinitionDSL.g:1360:3: (lv_strict_0_0= '-strict' )
            // InternalDefinitionDSL.g:1361:4: lv_strict_0_0= '-strict'
            {
            lv_strict_0_0=(Token)match(input,32,FOLLOW_2); 

            				newLeafNode(lv_strict_0_0, grammarAccess.getOptionStrictAccess().getStrictStrictKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOptionStrictRule());
            				}
            				setWithLastConsumed(current, "strict", true, "-strict");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionStrict"


    // $ANTLR start "entryRuleOptionRange"
    // InternalDefinitionDSL.g:1376:1: entryRuleOptionRange returns [EObject current=null] : iv_ruleOptionRange= ruleOptionRange EOF ;
    public final EObject entryRuleOptionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionRange = null;


        try {
            // InternalDefinitionDSL.g:1376:52: (iv_ruleOptionRange= ruleOptionRange EOF )
            // InternalDefinitionDSL.g:1377:2: iv_ruleOptionRange= ruleOptionRange EOF
            {
             newCompositeNode(grammarAccess.getOptionRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionRange=ruleOptionRange();

            state._fsp--;

             current =iv_ruleOptionRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionRange"


    // $ANTLR start "ruleOptionRange"
    // InternalDefinitionDSL.g:1383:1: ruleOptionRange returns [EObject current=null] : (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleOptionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1389:2: ( (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalDefinitionDSL.g:1390:2: (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalDefinitionDSL.g:1390:2: (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalDefinitionDSL.g:1391:3: otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionRangeAccess().getRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionRangeAccess().getListKeyword_1());
            		
            // InternalDefinitionDSL.g:1399:3: ( (lv_min_2_0= RULE_INT ) )
            // InternalDefinitionDSL.g:1400:4: (lv_min_2_0= RULE_INT )
            {
            // InternalDefinitionDSL.g:1400:4: (lv_min_2_0= RULE_INT )
            // InternalDefinitionDSL.g:1401:5: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_min_2_0, grammarAccess.getOptionRangeAccess().getMinINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDefinitionDSL.g:1417:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalDefinitionDSL.g:1418:4: (lv_max_3_0= RULE_INT )
            {
            // InternalDefinitionDSL.g:1418:4: (lv_max_3_0= RULE_INT )
            // InternalDefinitionDSL.g:1419:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_max_3_0, grammarAccess.getOptionRangeAccess().getMaxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOptionRangeAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionRange"


    // $ANTLR start "entryRuleOptionContrib"
    // InternalDefinitionDSL.g:1443:1: entryRuleOptionContrib returns [EObject current=null] : iv_ruleOptionContrib= ruleOptionContrib EOF ;
    public final EObject entryRuleOptionContrib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionContrib = null;


        try {
            // InternalDefinitionDSL.g:1443:54: (iv_ruleOptionContrib= ruleOptionContrib EOF )
            // InternalDefinitionDSL.g:1444:2: iv_ruleOptionContrib= ruleOptionContrib EOF
            {
             newCompositeNode(grammarAccess.getOptionContribRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionContrib=ruleOptionContrib();

            state._fsp--;

             current =iv_ruleOptionContrib; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionContrib"


    // $ANTLR start "ruleOptionContrib"
    // InternalDefinitionDSL.g:1450:1: ruleOptionContrib returns [EObject current=null] : ( (lv_contrib_0_0= '-contrib' ) ) ;
    public final EObject ruleOptionContrib() throws RecognitionException {
        EObject current = null;

        Token lv_contrib_0_0=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1456:2: ( ( (lv_contrib_0_0= '-contrib' ) ) )
            // InternalDefinitionDSL.g:1457:2: ( (lv_contrib_0_0= '-contrib' ) )
            {
            // InternalDefinitionDSL.g:1457:2: ( (lv_contrib_0_0= '-contrib' ) )
            // InternalDefinitionDSL.g:1458:3: (lv_contrib_0_0= '-contrib' )
            {
            // InternalDefinitionDSL.g:1458:3: (lv_contrib_0_0= '-contrib' )
            // InternalDefinitionDSL.g:1459:4: lv_contrib_0_0= '-contrib'
            {
            lv_contrib_0_0=(Token)match(input,36,FOLLOW_2); 

            				newLeafNode(lv_contrib_0_0, grammarAccess.getOptionContribAccess().getContribContribKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOptionContribRule());
            				}
            				setWithLastConsumed(current, "contrib", true, "-contrib");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionContrib"


    // $ANTLR start "ruleFIELD_TYPE"
    // InternalDefinitionDSL.g:1474:1: ruleFIELD_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'ZahlField' ) | (enumLiteral_6= 'DateField' ) ) ;
    public final Enumerator ruleFIELD_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1480:2: ( ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'ZahlField' ) | (enumLiteral_6= 'DateField' ) ) )
            // InternalDefinitionDSL.g:1481:2: ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'ZahlField' ) | (enumLiteral_6= 'DateField' ) )
            {
            // InternalDefinitionDSL.g:1481:2: ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'ZahlField' ) | (enumLiteral_6= 'DateField' ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            case 40:
                {
                alt16=4;
                }
                break;
            case 41:
                {
                alt16=5;
                }
                break;
            case 42:
                {
                alt16=6;
                }
                break;
            case 43:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDefinitionDSL.g:1482:3: (enumLiteral_0= 'StringField' )
                    {
                    // InternalDefinitionDSL.g:1482:3: (enumLiteral_0= 'StringField' )
                    // InternalDefinitionDSL.g:1483:4: enumLiteral_0= 'StringField'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getSTRING_FIELDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFIELD_TYPEAccess().getSTRING_FIELDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefinitionDSL.g:1490:3: (enumLiteral_1= 'TimeField' )
                    {
                    // InternalDefinitionDSL.g:1490:3: (enumLiteral_1= 'TimeField' )
                    // InternalDefinitionDSL.g:1491:4: enumLiteral_1= 'TimeField'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getTIME_FIELDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFIELD_TYPEAccess().getTIME_FIELDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDefinitionDSL.g:1498:3: (enumLiteral_2= 'IntegerField' )
                    {
                    // InternalDefinitionDSL.g:1498:3: (enumLiteral_2= 'IntegerField' )
                    // InternalDefinitionDSL.g:1499:4: enumLiteral_2= 'IntegerField'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getINTEGER_FIELDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFIELD_TYPEAccess().getINTEGER_FIELDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDefinitionDSL.g:1506:3: (enumLiteral_3= 'PriceField' )
                    {
                    // InternalDefinitionDSL.g:1506:3: (enumLiteral_3= 'PriceField' )
                    // InternalDefinitionDSL.g:1507:4: enumLiteral_3= 'PriceField'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getPRICE_FIELDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFIELD_TYPEAccess().getPRICE_FIELDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDefinitionDSL.g:1514:3: (enumLiteral_4= 'DoubleField' )
                    {
                    // InternalDefinitionDSL.g:1514:3: (enumLiteral_4= 'DoubleField' )
                    // InternalDefinitionDSL.g:1515:4: enumLiteral_4= 'DoubleField'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getDOUBLE_FIELDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFIELD_TYPEAccess().getDOUBLE_FIELDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDefinitionDSL.g:1522:3: (enumLiteral_5= 'ZahlField' )
                    {
                    // InternalDefinitionDSL.g:1522:3: (enumLiteral_5= 'ZahlField' )
                    // InternalDefinitionDSL.g:1523:4: enumLiteral_5= 'ZahlField'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getZAHL_FIELDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFIELD_TYPEAccess().getZAHL_FIELDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDefinitionDSL.g:1530:3: (enumLiteral_6= 'DateField' )
                    {
                    // InternalDefinitionDSL.g:1530:3: (enumLiteral_6= 'DateField' )
                    // InternalDefinitionDSL.g:1531:4: enumLiteral_6= 'DateField'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFIELD_TYPEAccess().getDATE_FIELDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFIELD_TYPEAccess().getDATE_FIELDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFIELD_TYPE"


    // $ANTLR start "ruleROLE"
    // InternalDefinitionDSL.g:1541:1: ruleROLE returns [Enumerator current=null] : ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) ) ;
    public final Enumerator ruleROLE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1547:2: ( ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) ) )
            // InternalDefinitionDSL.g:1548:2: ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) )
            {
            // InternalDefinitionDSL.g:1548:2: ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt17=1;
                }
                break;
            case 45:
                {
                alt17=2;
                }
                break;
            case 46:
                {
                alt17=3;
                }
                break;
            case 47:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDefinitionDSL.g:1549:3: (enumLiteral_0= 'radmin' )
                    {
                    // InternalDefinitionDSL.g:1549:3: (enumLiteral_0= 'radmin' )
                    // InternalDefinitionDSL.g:1550:4: enumLiteral_0= 'radmin'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getROLEAccess().getRADMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getROLEAccess().getRADMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefinitionDSL.g:1557:3: (enumLiteral_1= 'none' )
                    {
                    // InternalDefinitionDSL.g:1557:3: (enumLiteral_1= 'none' )
                    // InternalDefinitionDSL.g:1558:4: enumLiteral_1= 'none'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getROLEAccess().getNONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getROLEAccess().getNONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDefinitionDSL.g:1565:3: (enumLiteral_2= 'rtrader' )
                    {
                    // InternalDefinitionDSL.g:1565:3: (enumLiteral_2= 'rtrader' )
                    // InternalDefinitionDSL.g:1566:4: enumLiteral_2= 'rtrader'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getROLEAccess().getRTRADEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getROLEAccess().getRTRADEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDefinitionDSL.g:1573:3: (enumLiteral_3= 'supervisor' )
                    {
                    // InternalDefinitionDSL.g:1573:3: (enumLiteral_3= 'supervisor' )
                    // InternalDefinitionDSL.g:1574:4: enumLiteral_3= 'supervisor'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getROLEAccess().getSUPERVISOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getROLEAccess().getSUPERVISOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleROLE"


    // $ANTLR start "ruleRECORDCLASS"
    // InternalDefinitionDSL.g:1584:1: ruleRECORDCLASS returns [Enumerator current=null] : ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) ) ;
    public final Enumerator ruleRECORDCLASS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDefinitionDSL.g:1590:2: ( ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) ) )
            // InternalDefinitionDSL.g:1591:2: ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) )
            {
            // InternalDefinitionDSL.g:1591:2: ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt18=1;
                }
                break;
            case 49:
                {
                alt18=2;
                }
                break;
            case 50:
                {
                alt18=3;
                }
                break;
            case 51:
                {
                alt18=4;
                }
                break;
            case 52:
                {
                alt18=5;
                }
                break;
            case 53:
                {
                alt18=6;
                }
                break;
            case 54:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDefinitionDSL.g:1592:3: (enumLiteral_0= 'B' )
                    {
                    // InternalDefinitionDSL.g:1592:3: (enumLiteral_0= 'B' )
                    // InternalDefinitionDSL.g:1593:4: enumLiteral_0= 'B'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getMETHOD_READ_ONLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRECORDCLASSAccess().getMETHOD_READ_ONLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDefinitionDSL.g:1600:3: (enumLiteral_1= 'U' )
                    {
                    // InternalDefinitionDSL.g:1600:3: (enumLiteral_1= 'U' )
                    // InternalDefinitionDSL.g:1601:4: enumLiteral_1= 'U'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getPARENT_READ_ONLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRECORDCLASSAccess().getPARENT_READ_ONLYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDefinitionDSL.g:1608:3: (enumLiteral_2= 'G' )
                    {
                    // InternalDefinitionDSL.g:1608:3: (enumLiteral_2= 'G' )
                    // InternalDefinitionDSL.g:1609:4: enumLiteral_2= 'G'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getPARENT_READ_WRITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRECORDCLASSAccess().getPARENT_READ_WRITEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDefinitionDSL.g:1616:3: (enumLiteral_3= 'R' )
                    {
                    // InternalDefinitionDSL.g:1616:3: (enumLiteral_3= 'R' )
                    // InternalDefinitionDSL.g:1617:4: enumLiteral_3= 'R'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getPARENT_READ_REFERENCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRECORDCLASSAccess().getPARENT_READ_REFERENCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDefinitionDSL.g:1624:3: (enumLiteral_4= 'D' )
                    {
                    // InternalDefinitionDSL.g:1624:3: (enumLiteral_4= 'D' )
                    // InternalDefinitionDSL.g:1625:4: enumLiteral_4= 'D'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getCHILD_READ_ONLYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRECORDCLASSAccess().getCHILD_READ_ONLYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDefinitionDSL.g:1632:3: (enumLiteral_5= 'P' )
                    {
                    // InternalDefinitionDSL.g:1632:3: (enumLiteral_5= 'P' )
                    // InternalDefinitionDSL.g:1633:4: enumLiteral_5= 'P'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getCHILD_READ_WRITEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRECORDCLASSAccess().getCHILD_READ_WRITEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDefinitionDSL.g:1640:3: (enumLiteral_6= 'S' )
                    {
                    // InternalDefinitionDSL.g:1640:3: (enumLiteral_6= 'S' )
                    // InternalDefinitionDSL.g:1641:4: enumLiteral_6= 'S'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRECORDCLASSAccess().getCHILD_READ_REFERENCEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRECORDCLASSAccess().getCHILD_READ_REFERENCEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRECORDCLASS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000FE000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000FE000004080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020004080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000804080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007F000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001380000102L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001380000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});

}