package ch.raiffeisen.ipricer.definition.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import ch.raiffeisen.ipricer.definition.idea.lang.DefinitionDSLElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import ch.raiffeisen.ipricer.definition.services.DefinitionDSLGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalDefinitionDSLParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_DEF_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Definition'", "'{'", "'}'", "'Data'", "'Init'", "'InitField'", "':'", "'-valproc'", "'-strict'", "'-range'", "'[list'", "']'", "'-contrib'", "'StringField'", "'TimeField'", "'IntegerField'", "'PriceField'", "'DoubleField'", "'DateField'", "'radmin'", "'none'", "'rtrader'", "'supervisor'", "'B'", "'U'", "'G'", "'R'", "'D'", "'P'", "'S'"
    };
    public static final int RULE_DEF_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=6;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public PsiInternalDefinitionDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalDefinitionDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalDefinitionDSLParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalDefinitionDSL.g"; }



    	protected DefinitionDSLGrammarAccess grammarAccess;

    	protected DefinitionDSLElementTypeProvider elementTypeProvider;

    	public PsiInternalDefinitionDSLParser(PsiBuilder builder, TokenStream input, DefinitionDSLElementTypeProvider elementTypeProvider, DefinitionDSLGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Definition";
    	}




    // $ANTLR start "entryRuleDefinition"
    // PsiInternalDefinitionDSL.g:52:1: entryRuleDefinition returns [Boolean current=false] : iv_ruleDefinition= ruleDefinition EOF ;
    public final Boolean entryRuleDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDefinition = null;


        try {
            // PsiInternalDefinitionDSL.g:52:52: (iv_ruleDefinition= ruleDefinition EOF )
            // PsiInternalDefinitionDSL.g:53:2: iv_ruleDefinition= ruleDefinition EOF
            {
             markComposite(elementTypeProvider.getDefinitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // PsiInternalDefinitionDSL.g:59:1: ruleDefinition returns [Boolean current=false] : (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) otherlv_8= '}' ( ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) ) )* ) ;
    public final Boolean ruleDefinition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_methodName_1_0=null;
        Token lv_guiLabelMethod_2_0=null;
        Token lv_guiLabelParent_3_0=null;
        Token lv_guiLabelChild_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_eventuellTclProcedures_9_1=null;
        Token lv_eventuellTclProcedures_9_2=null;
        Boolean lv_data_6_0 = null;

        Boolean lv_initSection_7_0 = null;


        try {
            // PsiInternalDefinitionDSL.g:60:1: ( (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) otherlv_8= '}' ( ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) ) )* ) )
            // PsiInternalDefinitionDSL.g:61:2: (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) otherlv_8= '}' ( ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) ) )* )
            {
            // PsiInternalDefinitionDSL.g:61:2: (otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) otherlv_8= '}' ( ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) ) )* )
            // PsiInternalDefinitionDSL.g:62:3: otherlv_0= 'Definition' ( (lv_methodName_1_0= RULE_ID ) ) ( (lv_guiLabelMethod_2_0= RULE_STRING ) ) ( (lv_guiLabelParent_3_0= RULE_STRING ) ) ( (lv_guiLabelChild_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_data_6_0= ruleData ) ) ( (lv_initSection_7_0= ruleInitSection ) ) otherlv_8= '}' ( ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) ) )*
            {

            			markLeaf(elementTypeProvider.getDefinition_DefinitionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalDefinitionDSL.g:69:3: ( (lv_methodName_1_0= RULE_ID ) )
            // PsiInternalDefinitionDSL.g:70:4: (lv_methodName_1_0= RULE_ID )
            {
            // PsiInternalDefinitionDSL.g:70:4: (lv_methodName_1_0= RULE_ID )
            // PsiInternalDefinitionDSL.g:71:5: lv_methodName_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getDefinition_MethodNameIDTerminalRuleCall_1_0ElementType());
            				
            lv_methodName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_methodName_1_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:86:3: ( (lv_guiLabelMethod_2_0= RULE_STRING ) )
            // PsiInternalDefinitionDSL.g:87:4: (lv_guiLabelMethod_2_0= RULE_STRING )
            {
            // PsiInternalDefinitionDSL.g:87:4: (lv_guiLabelMethod_2_0= RULE_STRING )
            // PsiInternalDefinitionDSL.g:88:5: lv_guiLabelMethod_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getDefinition_GuiLabelMethodSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_guiLabelMethod_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_guiLabelMethod_2_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:103:3: ( (lv_guiLabelParent_3_0= RULE_STRING ) )
            // PsiInternalDefinitionDSL.g:104:4: (lv_guiLabelParent_3_0= RULE_STRING )
            {
            // PsiInternalDefinitionDSL.g:104:4: (lv_guiLabelParent_3_0= RULE_STRING )
            // PsiInternalDefinitionDSL.g:105:5: lv_guiLabelParent_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getDefinition_GuiLabelParentSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_guiLabelParent_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_guiLabelParent_3_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:120:3: ( (lv_guiLabelChild_4_0= RULE_STRING ) )
            // PsiInternalDefinitionDSL.g:121:4: (lv_guiLabelChild_4_0= RULE_STRING )
            {
            // PsiInternalDefinitionDSL.g:121:4: (lv_guiLabelChild_4_0= RULE_STRING )
            // PsiInternalDefinitionDSL.g:122:5: lv_guiLabelChild_4_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getDefinition_GuiLabelChildSTRINGTerminalRuleCall_4_0ElementType());
            				
            lv_guiLabelChild_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_guiLabelChild_4_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getDefinition_LeftCurlyBracketKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalDefinitionDSL.g:144:3: ( (lv_data_6_0= ruleData ) )
            // PsiInternalDefinitionDSL.g:145:4: (lv_data_6_0= ruleData )
            {
            // PsiInternalDefinitionDSL.g:145:4: (lv_data_6_0= ruleData )
            // PsiInternalDefinitionDSL.g:146:5: lv_data_6_0= ruleData
            {

            					markComposite(elementTypeProvider.getDefinition_DataDataParserRuleCall_6_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_data_6_0=ruleData();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalDefinitionDSL.g:159:3: ( (lv_initSection_7_0= ruleInitSection ) )
            // PsiInternalDefinitionDSL.g:160:4: (lv_initSection_7_0= ruleInitSection )
            {
            // PsiInternalDefinitionDSL.g:160:4: (lv_initSection_7_0= ruleInitSection )
            // PsiInternalDefinitionDSL.g:161:5: lv_initSection_7_0= ruleInitSection
            {

            					markComposite(elementTypeProvider.getDefinition_InitSectionInitSectionParserRuleCall_7_0ElementType());
            				
            pushFollow(FOLLOW_8);
            lv_initSection_7_0=ruleInitSection();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getDefinition_RightCurlyBracketKeyword_8ElementType());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_9); 

            			doneLeaf(otherlv_8);
            		
            // PsiInternalDefinitionDSL.g:181:3: ( ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_ANY_OTHER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalDefinitionDSL.g:182:4: ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) )
            	    {
            	    // PsiInternalDefinitionDSL.g:182:4: ( (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER ) )
            	    // PsiInternalDefinitionDSL.g:183:5: (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER )
            	    {
            	    // PsiInternalDefinitionDSL.g:183:5: (lv_eventuellTclProcedures_9_1= RULE_ID | lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER )
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
            	            // PsiInternalDefinitionDSL.g:184:6: lv_eventuellTclProcedures_9_1= RULE_ID
            	            {

            	            						markLeaf(elementTypeProvider.getDefinition_EventuellTclProceduresIDTerminalRuleCall_9_0_0ElementType());
            	            					
            	            lv_eventuellTclProcedures_9_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            	            						if(!current) {
            	            							associateWithSemanticElement();
            	            							current = true;
            	            						}
            	            					

            	            						doneLeaf(lv_eventuellTclProcedures_9_1);
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalDefinitionDSL.g:198:6: lv_eventuellTclProcedures_9_2= RULE_ANY_OTHER
            	            {

            	            						markLeaf(elementTypeProvider.getDefinition_EventuellTclProceduresANY_OTHERTerminalRuleCall_9_0_1ElementType());
            	            					
            	            lv_eventuellTclProcedures_9_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_9); 

            	            						if(!current) {
            	            							associateWithSemanticElement();
            	            							current = true;
            	            						}
            	            					

            	            						doneLeaf(lv_eventuellTclProcedures_9_2);
            	            					

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleData"
    // PsiInternalDefinitionDSL.g:218:1: entryRuleData returns [Boolean current=false] : iv_ruleData= ruleData EOF ;
    public final Boolean entryRuleData() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleData = null;


        try {
            // PsiInternalDefinitionDSL.g:218:46: (iv_ruleData= ruleData EOF )
            // PsiInternalDefinitionDSL.g:219:2: iv_ruleData= ruleData EOF
            {
             markComposite(elementTypeProvider.getDataElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // PsiInternalDefinitionDSL.g:225:1: ruleData returns [Boolean current=false] : (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' ) ;
    public final Boolean ruleData() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        Boolean lv_fieldDefinitions_3_0 = null;


        try {
            // PsiInternalDefinitionDSL.g:226:1: ( (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' ) )
            // PsiInternalDefinitionDSL.g:227:2: (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' )
            {
            // PsiInternalDefinitionDSL.g:227:2: (otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}' )
            // PsiInternalDefinitionDSL.g:228:3: otherlv_0= 'Data' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+ otherlv_4= '}'
            {

            			markLeaf(elementTypeProvider.getData_DataKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getData_LeftCurlyBracketKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalDefinitionDSL.g:242:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DEF_COMMENT) ) {
                    alt3=1;
                }
                else if ( ((LA3_0>=25 && LA3_0<=30)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalDefinitionDSL.g:243:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {

            	    				markLeaf(elementTypeProvider.getData_DEF_COMMENTTerminalRuleCall_2_0ElementType());
            	    			
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_11); 

            	    				doneLeaf(this_DEF_COMMENT_2);
            	    			

            	    }
            	    break;
            	case 2 :
            	    // PsiInternalDefinitionDSL.g:251:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )
            	    {
            	    // PsiInternalDefinitionDSL.g:251:4: ( (lv_fieldDefinitions_3_0= ruleFieldDefinition ) )
            	    // PsiInternalDefinitionDSL.g:252:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
            	    {
            	    // PsiInternalDefinitionDSL.g:252:5: (lv_fieldDefinitions_3_0= ruleFieldDefinition )
            	    // PsiInternalDefinitionDSL.g:253:6: lv_fieldDefinitions_3_0= ruleFieldDefinition
            	    {

            	    						markComposite(elementTypeProvider.getData_FieldDefinitionsFieldDefinitionParserRuleCall_2_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_fieldDefinitions_3_0=ruleFieldDefinition();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

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


            			markLeaf(elementTypeProvider.getData_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleInitSection"
    // PsiInternalDefinitionDSL.g:278:1: entryRuleInitSection returns [Boolean current=false] : iv_ruleInitSection= ruleInitSection EOF ;
    public final Boolean entryRuleInitSection() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInitSection = null;


        try {
            // PsiInternalDefinitionDSL.g:278:53: (iv_ruleInitSection= ruleInitSection EOF )
            // PsiInternalDefinitionDSL.g:279:2: iv_ruleInitSection= ruleInitSection EOF
            {
             markComposite(elementTypeProvider.getInitSectionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitSection=ruleInitSection();

            state._fsp--;

             current =iv_ruleInitSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitSection"


    // $ANTLR start "ruleInitSection"
    // PsiInternalDefinitionDSL.g:285:1: ruleInitSection returns [Boolean current=false] : (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' ) ;
    public final Boolean ruleInitSection() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_DEF_COMMENT_2=null;
        Token otherlv_4=null;
        Boolean lv_initDefinitions_3_0 = null;


        try {
            // PsiInternalDefinitionDSL.g:286:1: ( (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' ) )
            // PsiInternalDefinitionDSL.g:287:2: (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' )
            {
            // PsiInternalDefinitionDSL.g:287:2: (otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}' )
            // PsiInternalDefinitionDSL.g:288:3: otherlv_0= 'Init' otherlv_1= '{' (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )* otherlv_4= '}'
            {

            			markLeaf(elementTypeProvider.getInitSection_InitKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getInitSection_LeftCurlyBracketKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalDefinitionDSL.g:302:3: (this_DEF_COMMENT_2= RULE_DEF_COMMENT | ( (lv_initDefinitions_3_0= ruleInitDefinition ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DEF_COMMENT) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalDefinitionDSL.g:303:4: this_DEF_COMMENT_2= RULE_DEF_COMMENT
            	    {

            	    				markLeaf(elementTypeProvider.getInitSection_DEF_COMMENTTerminalRuleCall_2_0ElementType());
            	    			
            	    this_DEF_COMMENT_2=(Token)match(input,RULE_DEF_COMMENT,FOLLOW_12); 

            	    				doneLeaf(this_DEF_COMMENT_2);
            	    			

            	    }
            	    break;
            	case 2 :
            	    // PsiInternalDefinitionDSL.g:311:4: ( (lv_initDefinitions_3_0= ruleInitDefinition ) )
            	    {
            	    // PsiInternalDefinitionDSL.g:311:4: ( (lv_initDefinitions_3_0= ruleInitDefinition ) )
            	    // PsiInternalDefinitionDSL.g:312:5: (lv_initDefinitions_3_0= ruleInitDefinition )
            	    {
            	    // PsiInternalDefinitionDSL.g:312:5: (lv_initDefinitions_3_0= ruleInitDefinition )
            	    // PsiInternalDefinitionDSL.g:313:6: lv_initDefinitions_3_0= ruleInitDefinition
            	    {

            	    						markComposite(elementTypeProvider.getInitSection_InitDefinitionsInitDefinitionParserRuleCall_2_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_initDefinitions_3_0=ruleInitDefinition();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getInitSection_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitSection"


    // $ANTLR start "entryRuleInitDefinition"
    // PsiInternalDefinitionDSL.g:338:1: entryRuleInitDefinition returns [Boolean current=false] : iv_ruleInitDefinition= ruleInitDefinition EOF ;
    public final Boolean entryRuleInitDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInitDefinition = null;


        try {
            // PsiInternalDefinitionDSL.g:338:56: (iv_ruleInitDefinition= ruleInitDefinition EOF )
            // PsiInternalDefinitionDSL.g:339:2: iv_ruleInitDefinition= ruleInitDefinition EOF
            {
             markComposite(elementTypeProvider.getInitDefinitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitDefinition=ruleInitDefinition();

            state._fsp--;

             current =iv_ruleInitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitDefinition"


    // $ANTLR start "ruleInitDefinition"
    // PsiInternalDefinitionDSL.g:345:1: ruleInitDefinition returns [Boolean current=false] : (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleInitDefinition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_initValue_2_0=null;

        try {
            // PsiInternalDefinitionDSL.g:346:1: ( (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) ) )
            // PsiInternalDefinitionDSL.g:347:2: (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) )
            {
            // PsiInternalDefinitionDSL.g:347:2: (otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) ) )
            // PsiInternalDefinitionDSL.g:348:3: otherlv_0= 'InitField' ( (lv_id_1_0= RULE_ID ) ) ( (lv_initValue_2_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getInitDefinition_InitFieldKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalDefinitionDSL.g:355:3: ( (lv_id_1_0= RULE_ID ) )
            // PsiInternalDefinitionDSL.g:356:4: (lv_id_1_0= RULE_ID )
            {
            // PsiInternalDefinitionDSL.g:356:4: (lv_id_1_0= RULE_ID )
            // PsiInternalDefinitionDSL.g:357:5: lv_id_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getInitDefinition_IdIDTerminalRuleCall_1_0ElementType());
            				
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_id_1_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:372:3: ( (lv_initValue_2_0= RULE_STRING ) )
            // PsiInternalDefinitionDSL.g:373:4: (lv_initValue_2_0= RULE_STRING )
            {
            // PsiInternalDefinitionDSL.g:373:4: (lv_initValue_2_0= RULE_STRING )
            // PsiInternalDefinitionDSL.g:374:5: lv_initValue_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getInitDefinition_InitValueSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_initValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_initValue_2_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitDefinition"


    // $ANTLR start "entryRuleFieldDefinition"
    // PsiInternalDefinitionDSL.g:393:1: entryRuleFieldDefinition returns [Boolean current=false] : iv_ruleFieldDefinition= ruleFieldDefinition EOF ;
    public final Boolean entryRuleFieldDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldDefinition = null;


        try {
            // PsiInternalDefinitionDSL.g:393:57: (iv_ruleFieldDefinition= ruleFieldDefinition EOF )
            // PsiInternalDefinitionDSL.g:394:2: iv_ruleFieldDefinition= ruleFieldDefinition EOF
            {
             markComposite(elementTypeProvider.getFieldDefinitionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDefinition=ruleFieldDefinition();

            state._fsp--;

             current =iv_ruleFieldDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDefinition"


    // $ANTLR start "ruleFieldDefinition"
    // PsiInternalDefinitionDSL.g:400:1: ruleFieldDefinition returns [Boolean current=false] : ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* ) ;
    public final Boolean ruleFieldDefinition() throws RecognitionException {
        Boolean current = false;

        Token lv_id_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token lv_fieldName_6_0=null;
        Token lv_length_7_0=null;
        Boolean lv_fieldType_0_0 = null;

        Boolean lv_access_3_0 = null;

        Boolean lv_recordClass_4_0 = null;

        Boolean lv_options_8_0 = null;


        try {
            // PsiInternalDefinitionDSL.g:401:1: ( ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* ) )
            // PsiInternalDefinitionDSL.g:402:2: ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* )
            {
            // PsiInternalDefinitionDSL.g:402:2: ( ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )* )
            // PsiInternalDefinitionDSL.g:403:3: ( (lv_fieldType_0_0= ruleFIELD_TYPE ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_access_3_0= ruleROLE ) ) ( (lv_recordClass_4_0= ruleRECORDCLASS ) ) otherlv_5= ':' ( (lv_fieldName_6_0= RULE_ID ) ) ( (lv_length_7_0= RULE_INT ) )? ( (lv_options_8_0= ruleOption ) )*
            {
            // PsiInternalDefinitionDSL.g:403:3: ( (lv_fieldType_0_0= ruleFIELD_TYPE ) )
            // PsiInternalDefinitionDSL.g:404:4: (lv_fieldType_0_0= ruleFIELD_TYPE )
            {
            // PsiInternalDefinitionDSL.g:404:4: (lv_fieldType_0_0= ruleFIELD_TYPE )
            // PsiInternalDefinitionDSL.g:405:5: lv_fieldType_0_0= ruleFIELD_TYPE
            {

            					markComposite(elementTypeProvider.getFieldDefinition_FieldTypeFIELD_TYPEEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_3);
            lv_fieldType_0_0=ruleFIELD_TYPE();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalDefinitionDSL.g:418:3: ( (lv_id_1_0= RULE_ID ) )
            // PsiInternalDefinitionDSL.g:419:4: (lv_id_1_0= RULE_ID )
            {
            // PsiInternalDefinitionDSL.g:419:4: (lv_id_1_0= RULE_ID )
            // PsiInternalDefinitionDSL.g:420:5: lv_id_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFieldDefinition_IdIDTerminalRuleCall_1_0ElementType());
            				
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_id_1_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:435:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalDefinitionDSL.g:436:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalDefinitionDSL.g:436:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalDefinitionDSL.g:437:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getFieldDefinition_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:452:3: ( (lv_access_3_0= ruleROLE ) )
            // PsiInternalDefinitionDSL.g:453:4: (lv_access_3_0= ruleROLE )
            {
            // PsiInternalDefinitionDSL.g:453:4: (lv_access_3_0= ruleROLE )
            // PsiInternalDefinitionDSL.g:454:5: lv_access_3_0= ruleROLE
            {

            					markComposite(elementTypeProvider.getFieldDefinition_AccessROLEEnumRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_14);
            lv_access_3_0=ruleROLE();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalDefinitionDSL.g:467:3: ( (lv_recordClass_4_0= ruleRECORDCLASS ) )
            // PsiInternalDefinitionDSL.g:468:4: (lv_recordClass_4_0= ruleRECORDCLASS )
            {
            // PsiInternalDefinitionDSL.g:468:4: (lv_recordClass_4_0= ruleRECORDCLASS )
            // PsiInternalDefinitionDSL.g:469:5: lv_recordClass_4_0= ruleRECORDCLASS
            {

            					markComposite(elementTypeProvider.getFieldDefinition_RecordClassRECORDCLASSEnumRuleCall_4_0ElementType());
            				
            pushFollow(FOLLOW_15);
            lv_recordClass_4_0=ruleRECORDCLASS();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getFieldDefinition_ColonKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalDefinitionDSL.g:489:3: ( (lv_fieldName_6_0= RULE_ID ) )
            // PsiInternalDefinitionDSL.g:490:4: (lv_fieldName_6_0= RULE_ID )
            {
            // PsiInternalDefinitionDSL.g:490:4: (lv_fieldName_6_0= RULE_ID )
            // PsiInternalDefinitionDSL.g:491:5: lv_fieldName_6_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFieldDefinition_FieldNameIDTerminalRuleCall_6_0ElementType());
            				
            lv_fieldName_6_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_fieldName_6_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:506:3: ( (lv_length_7_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalDefinitionDSL.g:507:4: (lv_length_7_0= RULE_INT )
                    {
                    // PsiInternalDefinitionDSL.g:507:4: (lv_length_7_0= RULE_INT )
                    // PsiInternalDefinitionDSL.g:508:5: lv_length_7_0= RULE_INT
                    {

                    					markLeaf(elementTypeProvider.getFieldDefinition_LengthINTTerminalRuleCall_7_0ElementType());
                    				
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    					doneLeaf(lv_length_7_0);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalDefinitionDSL.g:523:3: ( (lv_options_8_0= ruleOption ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=21)||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalDefinitionDSL.g:524:4: (lv_options_8_0= ruleOption )
            	    {
            	    // PsiInternalDefinitionDSL.g:524:4: (lv_options_8_0= ruleOption )
            	    // PsiInternalDefinitionDSL.g:525:5: lv_options_8_0= ruleOption
            	    {

            	    					markComposite(elementTypeProvider.getFieldDefinition_OptionsOptionParserRuleCall_8_0ElementType());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_options_8_0=ruleOption();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDefinition"


    // $ANTLR start "entryRuleOption"
    // PsiInternalDefinitionDSL.g:542:1: entryRuleOption returns [Boolean current=false] : iv_ruleOption= ruleOption EOF ;
    public final Boolean entryRuleOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOption = null;


        try {
            // PsiInternalDefinitionDSL.g:542:48: (iv_ruleOption= ruleOption EOF )
            // PsiInternalDefinitionDSL.g:543:2: iv_ruleOption= ruleOption EOF
            {
             markComposite(elementTypeProvider.getOptionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // PsiInternalDefinitionDSL.g:549:1: ruleOption returns [Boolean current=false] : (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib ) ;
    public final Boolean ruleOption() throws RecognitionException {
        Boolean current = false;

        Boolean this_OptionValproc_0 = null;

        Boolean this_OptionStrict_1 = null;

        Boolean this_OptionRange_2 = null;

        Boolean this_OptionContrib_3 = null;


        try {
            // PsiInternalDefinitionDSL.g:550:1: ( (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib ) )
            // PsiInternalDefinitionDSL.g:551:2: (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib )
            {
            // PsiInternalDefinitionDSL.g:551:2: (this_OptionValproc_0= ruleOptionValproc | this_OptionStrict_1= ruleOptionStrict | this_OptionRange_2= ruleOptionRange | this_OptionContrib_3= ruleOptionContrib )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // PsiInternalDefinitionDSL.g:552:3: this_OptionValproc_0= ruleOptionValproc
                    {

                    			markComposite(elementTypeProvider.getOption_OptionValprocParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionValproc_0=ruleOptionValproc();

                    state._fsp--;


                    			current = this_OptionValproc_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalDefinitionDSL.g:561:3: this_OptionStrict_1= ruleOptionStrict
                    {

                    			markComposite(elementTypeProvider.getOption_OptionStrictParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionStrict_1=ruleOptionStrict();

                    state._fsp--;


                    			current = this_OptionStrict_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalDefinitionDSL.g:570:3: this_OptionRange_2= ruleOptionRange
                    {

                    			markComposite(elementTypeProvider.getOption_OptionRangeParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionRange_2=ruleOptionRange();

                    state._fsp--;


                    			current = this_OptionRange_2;
                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalDefinitionDSL.g:579:3: this_OptionContrib_3= ruleOptionContrib
                    {

                    			markComposite(elementTypeProvider.getOption_OptionContribParserRuleCall_3ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionContrib_3=ruleOptionContrib();

                    state._fsp--;


                    			current = this_OptionContrib_3;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleOptionValproc"
    // PsiInternalDefinitionDSL.g:591:1: entryRuleOptionValproc returns [Boolean current=false] : iv_ruleOptionValproc= ruleOptionValproc EOF ;
    public final Boolean entryRuleOptionValproc() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptionValproc = null;


        try {
            // PsiInternalDefinitionDSL.g:591:55: (iv_ruleOptionValproc= ruleOptionValproc EOF )
            // PsiInternalDefinitionDSL.g:592:2: iv_ruleOptionValproc= ruleOptionValproc EOF
            {
             markComposite(elementTypeProvider.getOptionValprocElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionValproc=ruleOptionValproc();

            state._fsp--;

             current =iv_ruleOptionValproc; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionValproc"


    // $ANTLR start "ruleOptionValproc"
    // PsiInternalDefinitionDSL.g:598:1: ruleOptionValproc returns [Boolean current=false] : ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleOptionValproc() throws RecognitionException {
        Boolean current = false;

        Token lv_valproc_0_0=null;
        Token lv_tclProc_1_0=null;

        try {
            // PsiInternalDefinitionDSL.g:599:1: ( ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) ) )
            // PsiInternalDefinitionDSL.g:600:2: ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) )
            {
            // PsiInternalDefinitionDSL.g:600:2: ( ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) ) )
            // PsiInternalDefinitionDSL.g:601:3: ( (lv_valproc_0_0= '-valproc' ) ) ( (lv_tclProc_1_0= RULE_ID ) )
            {
            // PsiInternalDefinitionDSL.g:601:3: ( (lv_valproc_0_0= '-valproc' ) )
            // PsiInternalDefinitionDSL.g:602:4: (lv_valproc_0_0= '-valproc' )
            {
            // PsiInternalDefinitionDSL.g:602:4: (lv_valproc_0_0= '-valproc' )
            // PsiInternalDefinitionDSL.g:603:5: lv_valproc_0_0= '-valproc'
            {

            					markLeaf(elementTypeProvider.getOptionValproc_ValprocValprocKeyword_0_0ElementType());
            				
            lv_valproc_0_0=(Token)match(input,19,FOLLOW_3); 

            					doneLeaf(lv_valproc_0_0);
            				

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalDefinitionDSL.g:618:3: ( (lv_tclProc_1_0= RULE_ID ) )
            // PsiInternalDefinitionDSL.g:619:4: (lv_tclProc_1_0= RULE_ID )
            {
            // PsiInternalDefinitionDSL.g:619:4: (lv_tclProc_1_0= RULE_ID )
            // PsiInternalDefinitionDSL.g:620:5: lv_tclProc_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getOptionValproc_TclProcIDTerminalRuleCall_1_0ElementType());
            				
            lv_tclProc_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_tclProc_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionValproc"


    // $ANTLR start "entryRuleOptionStrict"
    // PsiInternalDefinitionDSL.g:639:1: entryRuleOptionStrict returns [Boolean current=false] : iv_ruleOptionStrict= ruleOptionStrict EOF ;
    public final Boolean entryRuleOptionStrict() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptionStrict = null;


        try {
            // PsiInternalDefinitionDSL.g:639:54: (iv_ruleOptionStrict= ruleOptionStrict EOF )
            // PsiInternalDefinitionDSL.g:640:2: iv_ruleOptionStrict= ruleOptionStrict EOF
            {
             markComposite(elementTypeProvider.getOptionStrictElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionStrict=ruleOptionStrict();

            state._fsp--;

             current =iv_ruleOptionStrict; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionStrict"


    // $ANTLR start "ruleOptionStrict"
    // PsiInternalDefinitionDSL.g:646:1: ruleOptionStrict returns [Boolean current=false] : ( (lv_strict_0_0= '-strict' ) ) ;
    public final Boolean ruleOptionStrict() throws RecognitionException {
        Boolean current = false;

        Token lv_strict_0_0=null;

        try {
            // PsiInternalDefinitionDSL.g:647:1: ( ( (lv_strict_0_0= '-strict' ) ) )
            // PsiInternalDefinitionDSL.g:648:2: ( (lv_strict_0_0= '-strict' ) )
            {
            // PsiInternalDefinitionDSL.g:648:2: ( (lv_strict_0_0= '-strict' ) )
            // PsiInternalDefinitionDSL.g:649:3: (lv_strict_0_0= '-strict' )
            {
            // PsiInternalDefinitionDSL.g:649:3: (lv_strict_0_0= '-strict' )
            // PsiInternalDefinitionDSL.g:650:4: lv_strict_0_0= '-strict'
            {

            				markLeaf(elementTypeProvider.getOptionStrict_StrictStrictKeyword_0ElementType());
            			
            lv_strict_0_0=(Token)match(input,20,FOLLOW_2); 

            				doneLeaf(lv_strict_0_0);
            			

            				if (!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionStrict"


    // $ANTLR start "entryRuleOptionRange"
    // PsiInternalDefinitionDSL.g:668:1: entryRuleOptionRange returns [Boolean current=false] : iv_ruleOptionRange= ruleOptionRange EOF ;
    public final Boolean entryRuleOptionRange() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptionRange = null;


        try {
            // PsiInternalDefinitionDSL.g:668:53: (iv_ruleOptionRange= ruleOptionRange EOF )
            // PsiInternalDefinitionDSL.g:669:2: iv_ruleOptionRange= ruleOptionRange EOF
            {
             markComposite(elementTypeProvider.getOptionRangeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionRange=ruleOptionRange();

            state._fsp--;

             current =iv_ruleOptionRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionRange"


    // $ANTLR start "ruleOptionRange"
    // PsiInternalDefinitionDSL.g:675:1: ruleOptionRange returns [Boolean current=false] : (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final Boolean ruleOptionRange() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;

        try {
            // PsiInternalDefinitionDSL.g:676:1: ( (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // PsiInternalDefinitionDSL.g:677:2: (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // PsiInternalDefinitionDSL.g:677:2: (otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // PsiInternalDefinitionDSL.g:678:3: otherlv_0= '-range' otherlv_1= '[list' ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {

            			markLeaf(elementTypeProvider.getOptionRange_RangeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getOptionRange_ListKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalDefinitionDSL.g:692:3: ( (lv_min_2_0= RULE_INT ) )
            // PsiInternalDefinitionDSL.g:693:4: (lv_min_2_0= RULE_INT )
            {
            // PsiInternalDefinitionDSL.g:693:4: (lv_min_2_0= RULE_INT )
            // PsiInternalDefinitionDSL.g:694:5: lv_min_2_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getOptionRange_MinINTTerminalRuleCall_2_0ElementType());
            				
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_min_2_0);
            				

            }


            }

            // PsiInternalDefinitionDSL.g:709:3: ( (lv_max_3_0= RULE_INT ) )
            // PsiInternalDefinitionDSL.g:710:4: (lv_max_3_0= RULE_INT )
            {
            // PsiInternalDefinitionDSL.g:710:4: (lv_max_3_0= RULE_INT )
            // PsiInternalDefinitionDSL.g:711:5: lv_max_3_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getOptionRange_MaxINTTerminalRuleCall_3_0ElementType());
            				
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_max_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getOptionRange_RightSquareBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionRange"


    // $ANTLR start "entryRuleOptionContrib"
    // PsiInternalDefinitionDSL.g:737:1: entryRuleOptionContrib returns [Boolean current=false] : iv_ruleOptionContrib= ruleOptionContrib EOF ;
    public final Boolean entryRuleOptionContrib() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptionContrib = null;


        try {
            // PsiInternalDefinitionDSL.g:737:55: (iv_ruleOptionContrib= ruleOptionContrib EOF )
            // PsiInternalDefinitionDSL.g:738:2: iv_ruleOptionContrib= ruleOptionContrib EOF
            {
             markComposite(elementTypeProvider.getOptionContribElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionContrib=ruleOptionContrib();

            state._fsp--;

             current =iv_ruleOptionContrib; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionContrib"


    // $ANTLR start "ruleOptionContrib"
    // PsiInternalDefinitionDSL.g:744:1: ruleOptionContrib returns [Boolean current=false] : ( (lv_contrib_0_0= '-contrib' ) ) ;
    public final Boolean ruleOptionContrib() throws RecognitionException {
        Boolean current = false;

        Token lv_contrib_0_0=null;

        try {
            // PsiInternalDefinitionDSL.g:745:1: ( ( (lv_contrib_0_0= '-contrib' ) ) )
            // PsiInternalDefinitionDSL.g:746:2: ( (lv_contrib_0_0= '-contrib' ) )
            {
            // PsiInternalDefinitionDSL.g:746:2: ( (lv_contrib_0_0= '-contrib' ) )
            // PsiInternalDefinitionDSL.g:747:3: (lv_contrib_0_0= '-contrib' )
            {
            // PsiInternalDefinitionDSL.g:747:3: (lv_contrib_0_0= '-contrib' )
            // PsiInternalDefinitionDSL.g:748:4: lv_contrib_0_0= '-contrib'
            {

            				markLeaf(elementTypeProvider.getOptionContrib_ContribContribKeyword_0ElementType());
            			
            lv_contrib_0_0=(Token)match(input,24,FOLLOW_2); 

            				doneLeaf(lv_contrib_0_0);
            			

            				if (!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionContrib"


    // $ANTLR start "ruleFIELD_TYPE"
    // PsiInternalDefinitionDSL.g:766:1: ruleFIELD_TYPE returns [Boolean current=false] : ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'DateField' ) ) ;
    public final Boolean ruleFIELD_TYPE() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

        try {
            // PsiInternalDefinitionDSL.g:767:1: ( ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'DateField' ) ) )
            // PsiInternalDefinitionDSL.g:768:2: ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'DateField' ) )
            {
            // PsiInternalDefinitionDSL.g:768:2: ( (enumLiteral_0= 'StringField' ) | (enumLiteral_1= 'TimeField' ) | (enumLiteral_2= 'IntegerField' ) | (enumLiteral_3= 'PriceField' ) | (enumLiteral_4= 'DoubleField' ) | (enumLiteral_5= 'DateField' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 28:
                {
                alt8=4;
                }
                break;
            case 29:
                {
                alt8=5;
                }
                break;
            case 30:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // PsiInternalDefinitionDSL.g:769:3: (enumLiteral_0= 'StringField' )
                    {
                    // PsiInternalDefinitionDSL.g:769:3: (enumLiteral_0= 'StringField' )
                    // PsiInternalDefinitionDSL.g:770:4: enumLiteral_0= 'StringField'
                    {

                    				markLeaf(elementTypeProvider.getFIELD_TYPE_STRING_FIELDEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalDefinitionDSL.g:779:3: (enumLiteral_1= 'TimeField' )
                    {
                    // PsiInternalDefinitionDSL.g:779:3: (enumLiteral_1= 'TimeField' )
                    // PsiInternalDefinitionDSL.g:780:4: enumLiteral_1= 'TimeField'
                    {

                    				markLeaf(elementTypeProvider.getFIELD_TYPE_TIME_FIELDEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalDefinitionDSL.g:789:3: (enumLiteral_2= 'IntegerField' )
                    {
                    // PsiInternalDefinitionDSL.g:789:3: (enumLiteral_2= 'IntegerField' )
                    // PsiInternalDefinitionDSL.g:790:4: enumLiteral_2= 'IntegerField'
                    {

                    				markLeaf(elementTypeProvider.getFIELD_TYPE_INTEGER_FIELDEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalDefinitionDSL.g:799:3: (enumLiteral_3= 'PriceField' )
                    {
                    // PsiInternalDefinitionDSL.g:799:3: (enumLiteral_3= 'PriceField' )
                    // PsiInternalDefinitionDSL.g:800:4: enumLiteral_3= 'PriceField'
                    {

                    				markLeaf(elementTypeProvider.getFIELD_TYPE_PRICE_FIELDEnumLiteralDeclaration_3ElementType());
                    			
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				doneLeaf(enumLiteral_3);
                    			

                    }


                    }
                    break;
                case 5 :
                    // PsiInternalDefinitionDSL.g:809:3: (enumLiteral_4= 'DoubleField' )
                    {
                    // PsiInternalDefinitionDSL.g:809:3: (enumLiteral_4= 'DoubleField' )
                    // PsiInternalDefinitionDSL.g:810:4: enumLiteral_4= 'DoubleField'
                    {

                    				markLeaf(elementTypeProvider.getFIELD_TYPE_DOUBLE_FIELDEnumLiteralDeclaration_4ElementType());
                    			
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				doneLeaf(enumLiteral_4);
                    			

                    }


                    }
                    break;
                case 6 :
                    // PsiInternalDefinitionDSL.g:819:3: (enumLiteral_5= 'DateField' )
                    {
                    // PsiInternalDefinitionDSL.g:819:3: (enumLiteral_5= 'DateField' )
                    // PsiInternalDefinitionDSL.g:820:4: enumLiteral_5= 'DateField'
                    {

                    				markLeaf(elementTypeProvider.getFIELD_TYPE_DATE_FIELDEnumLiteralDeclaration_5ElementType());
                    			
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				doneLeaf(enumLiteral_5);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFIELD_TYPE"


    // $ANTLR start "ruleROLE"
    // PsiInternalDefinitionDSL.g:832:1: ruleROLE returns [Boolean current=false] : ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) ) ;
    public final Boolean ruleROLE() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

        try {
            // PsiInternalDefinitionDSL.g:833:1: ( ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) ) )
            // PsiInternalDefinitionDSL.g:834:2: ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) )
            {
            // PsiInternalDefinitionDSL.g:834:2: ( (enumLiteral_0= 'radmin' ) | (enumLiteral_1= 'none' ) | (enumLiteral_2= 'rtrader' ) | (enumLiteral_3= 'supervisor' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // PsiInternalDefinitionDSL.g:835:3: (enumLiteral_0= 'radmin' )
                    {
                    // PsiInternalDefinitionDSL.g:835:3: (enumLiteral_0= 'radmin' )
                    // PsiInternalDefinitionDSL.g:836:4: enumLiteral_0= 'radmin'
                    {

                    				markLeaf(elementTypeProvider.getROLE_RADMINEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalDefinitionDSL.g:845:3: (enumLiteral_1= 'none' )
                    {
                    // PsiInternalDefinitionDSL.g:845:3: (enumLiteral_1= 'none' )
                    // PsiInternalDefinitionDSL.g:846:4: enumLiteral_1= 'none'
                    {

                    				markLeaf(elementTypeProvider.getROLE_NONEEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalDefinitionDSL.g:855:3: (enumLiteral_2= 'rtrader' )
                    {
                    // PsiInternalDefinitionDSL.g:855:3: (enumLiteral_2= 'rtrader' )
                    // PsiInternalDefinitionDSL.g:856:4: enumLiteral_2= 'rtrader'
                    {

                    				markLeaf(elementTypeProvider.getROLE_RTRADEREnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalDefinitionDSL.g:865:3: (enumLiteral_3= 'supervisor' )
                    {
                    // PsiInternalDefinitionDSL.g:865:3: (enumLiteral_3= 'supervisor' )
                    // PsiInternalDefinitionDSL.g:866:4: enumLiteral_3= 'supervisor'
                    {

                    				markLeaf(elementTypeProvider.getROLE_SUPERVISOREnumLiteralDeclaration_3ElementType());
                    			
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				doneLeaf(enumLiteral_3);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleROLE"


    // $ANTLR start "ruleRECORDCLASS"
    // PsiInternalDefinitionDSL.g:878:1: ruleRECORDCLASS returns [Boolean current=false] : ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) ) ;
    public final Boolean ruleRECORDCLASS() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

        try {
            // PsiInternalDefinitionDSL.g:879:1: ( ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) ) )
            // PsiInternalDefinitionDSL.g:880:2: ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) )
            {
            // PsiInternalDefinitionDSL.g:880:2: ( (enumLiteral_0= 'B' ) | (enumLiteral_1= 'U' ) | (enumLiteral_2= 'G' ) | (enumLiteral_3= 'R' ) | (enumLiteral_4= 'D' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'S' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            case 38:
                {
                alt10=4;
                }
                break;
            case 39:
                {
                alt10=5;
                }
                break;
            case 40:
                {
                alt10=6;
                }
                break;
            case 41:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // PsiInternalDefinitionDSL.g:881:3: (enumLiteral_0= 'B' )
                    {
                    // PsiInternalDefinitionDSL.g:881:3: (enumLiteral_0= 'B' )
                    // PsiInternalDefinitionDSL.g:882:4: enumLiteral_0= 'B'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_METHOD_READ_ONLYEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalDefinitionDSL.g:891:3: (enumLiteral_1= 'U' )
                    {
                    // PsiInternalDefinitionDSL.g:891:3: (enumLiteral_1= 'U' )
                    // PsiInternalDefinitionDSL.g:892:4: enumLiteral_1= 'U'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_PARENT_READ_ONLYEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalDefinitionDSL.g:901:3: (enumLiteral_2= 'G' )
                    {
                    // PsiInternalDefinitionDSL.g:901:3: (enumLiteral_2= 'G' )
                    // PsiInternalDefinitionDSL.g:902:4: enumLiteral_2= 'G'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_PARENT_READ_WRITEEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalDefinitionDSL.g:911:3: (enumLiteral_3= 'R' )
                    {
                    // PsiInternalDefinitionDSL.g:911:3: (enumLiteral_3= 'R' )
                    // PsiInternalDefinitionDSL.g:912:4: enumLiteral_3= 'R'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_PARENT_READ_REFERENCEEnumLiteralDeclaration_3ElementType());
                    			
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				doneLeaf(enumLiteral_3);
                    			

                    }


                    }
                    break;
                case 5 :
                    // PsiInternalDefinitionDSL.g:921:3: (enumLiteral_4= 'D' )
                    {
                    // PsiInternalDefinitionDSL.g:921:3: (enumLiteral_4= 'D' )
                    // PsiInternalDefinitionDSL.g:922:4: enumLiteral_4= 'D'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_CHILD_READ_ONLYEnumLiteralDeclaration_4ElementType());
                    			
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				doneLeaf(enumLiteral_4);
                    			

                    }


                    }
                    break;
                case 6 :
                    // PsiInternalDefinitionDSL.g:931:3: (enumLiteral_5= 'P' )
                    {
                    // PsiInternalDefinitionDSL.g:931:3: (enumLiteral_5= 'P' )
                    // PsiInternalDefinitionDSL.g:932:4: enumLiteral_5= 'P'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_CHILD_READ_WRITEEnumLiteralDeclaration_5ElementType());
                    			
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				doneLeaf(enumLiteral_5);
                    			

                    }


                    }
                    break;
                case 7 :
                    // PsiInternalDefinitionDSL.g:941:3: (enumLiteral_6= 'S' )
                    {
                    // PsiInternalDefinitionDSL.g:941:3: (enumLiteral_6= 'S' )
                    // PsiInternalDefinitionDSL.g:942:4: enumLiteral_6= 'S'
                    {

                    				markLeaf(elementTypeProvider.getRECORDCLASS_CHILD_READ_REFERENCEEnumLiteralDeclaration_6ElementType());
                    			
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				doneLeaf(enumLiteral_6);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000007E000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000007E004080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000024080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001380102L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001380002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});

}