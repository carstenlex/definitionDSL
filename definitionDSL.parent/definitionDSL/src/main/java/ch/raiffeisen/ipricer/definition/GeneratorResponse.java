package ch.raiffeisen.ipricer.definition;

import org.eclipse.xtext.validation.Issue;

import java.util.List;
import java.util.Map;

public class GeneratorResponse {

    private Map<String, CharSequence> generatedFiles;
    private List<Issue> issues;

    public GeneratorResponse(Map<String, CharSequence> generatedFiles, List<Issue> issues) {
        this.generatedFiles = generatedFiles;
        this.issues = issues;
    }

    public Map<String, CharSequence> getGeneratedFiles() {
        return generatedFiles;
    }

    public List<Issue> getIssues() {
        return issues;
    }
}
