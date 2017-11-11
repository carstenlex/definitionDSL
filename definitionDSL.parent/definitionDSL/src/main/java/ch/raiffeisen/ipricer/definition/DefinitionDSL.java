package ch.raiffeisen.ipricer.definition;

import ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;


import java.util.List;
import java.util.Map;


/**
 * Created by UPR4796 on 09.03.2017.
 */
public class DefinitionDSL {

    com.google.inject.Injector injector;
    XtextResourceSet xtextResourceSet;

    public DefinitionDSL() {
        injector=new DefinitionDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        xtextResourceSet= injector.getInstance(XtextResourceSet.class);
    }

    public GeneratorResponse generateJavaFromDefinition(java.net.URI inputURIforDefintion, String encoding){
        URI inputURI = URI.createURI(inputURIforDefintion.toString());
        xtextResourceSet.addLoadOption(XtextResource.OPTION_ENCODING,encoding);
        Resource resource = xtextResourceSet.getResource(inputURI, true);

        // Validation
        IResourceValidator validator = ((XtextResource)resource).getResourceServiceProvider().getResourceValidator();
        List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);

        // Code Generator
        GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);

        InMemoryFileSystemAccess inMemFSA = injector.getInstance(InMemoryFileSystemAccess.class);
        generator.doGenerate(resource, inMemFSA);

        GeneratorResponse response = new GeneratorResponse(inMemFSA.getTextFiles(), issues);
        return response;
    }

    public DefinitionImpl parseDefinition(java.net.URI inputURIforDefinition, String encoding){
        URI inputURI = URI.createURI(inputURIforDefinition.toString());
        xtextResourceSet.addLoadOption(XtextResource.OPTION_ENCODING,encoding);
        Resource resource = xtextResourceSet.getResource(inputURI, true);
        
        /* Parser besorgen und Root-Element */
        EObject eObject = resource.getContents().get(0);
        DefinitionImpl defFileRoot = (DefinitionImpl)eObject;   //Mit dem Knoten kann man den Baum traversieren und im Designer einbinden -> Objekte generieren
        return defFileRoot;
    }


    public static void main(String[] args) {
        com.google.inject.Injector injector =new DefinitionDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

        XtextResourceSet xtextResourceSet = injector.getInstance(XtextResourceSet.class);
        String inputFile = args.length >0 ? args[0]:null;
        if (inputFile == null ) {
//            inputFile = "D:\\WS\\xtext\\mydsl\\mydsl.parent\\mydsl\\src\\main\\resources\\method.mydsl";
            inputFile = "C:\\Users\\carst\\Desktop\\ap.def";
        }

        String outputDir = args.length>1?args[1]:null;
        if (outputDir==null)
            outputDir = "d:/temp/xtext/";
        
        Resource resource = xtextResourceSet.getResource(URI.createFileURI(inputFile), true);

        // Validation
        IResourceValidator validator = ((XtextResource)resource).getResourceServiceProvider().getResourceValidator();
        List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
        for (Issue issue : issues) {
            System.out.println(issue.getMessage());
        }

        /* Parser besorgen und Root-Element */
        EObject eObject = resource.getContents().get(0);
        DefinitionImpl defFileRoot = (DefinitionImpl)eObject;   //Mit dem Knoten kann man den Baum traversieren und im Designer einbinden -> Objekte generieren
        System.out.println("Parser root: "+eObject);

        // Code Generator
        GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);

InMemoryFileSystemAccess inMemFSA = injector.getInstance(InMemoryFileSystemAccess.class);

        JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccess.class);
        fsa.setOutputPath(outputDir);
        generator.doGenerate(resource, fsa);
        generator.doGenerate(resource, inMemFSA);

//        Map<String, CharSequence> textFiles = inMemFSA.getTextFiles();
//        System.out.println("**************************************Files");
//        for(Map.Entry<String, CharSequence> entry: textFiles.entrySet()){
//            System.out.println("**************************** "+entry.getKey());
//            System.out.println(entry.getValue());
//
//        }

    }
}
