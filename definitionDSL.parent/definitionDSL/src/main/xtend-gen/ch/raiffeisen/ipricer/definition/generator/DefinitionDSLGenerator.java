/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
package ch.raiffeisen.ipricer.definition.generator;

import ch.raiffeisen.ipricer.definition.ChildGenerator;
import ch.raiffeisen.ipricer.definition.MethodGenerator;
import ch.raiffeisen.ipricer.definition.ParentGenerator;
import ch.raiffeisen.ipricer.definition.definitionDSL.Definition;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DefinitionDSLGenerator extends AbstractGenerator {
  private final String targetPackage = "ch.raiffeisen.ipricer.methods.";
  
  @Extension
  private MethodGenerator methodGenerator = new MethodGenerator();
  
  @Extension
  private ParentGenerator parentGenerator = new ParentGenerator();
  
  @Extension
  private ChildGenerator childGenerator = new ChildGenerator();
  
  @Override
  public void doGenerate(final Resource definition, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _definitionName = this.getDefinitionName(definition);
    String _lowerCase = _definitionName.toLowerCase();
    final String prefix = (this.targetPackage + _lowerCase);
    String _replaceAll = (prefix + ".").replaceAll("\\.", "/");
    final String prefixFile = ("/" + _replaceAll);
    String _definitionName_1 = this.getDefinitionName(definition);
    String _plus = (prefixFile + _definitionName_1);
    String _plus_1 = (_plus + "Method.java");
    String _definitionName_2 = this.getDefinitionName(definition);
    String _generateMethodClass = this.methodGenerator.generateMethodClass(definition, prefix, _definitionName_2);
    fsa.generateFile(_plus_1, _generateMethodClass);
    String _definitionName_3 = this.getDefinitionName(definition);
    String _plus_2 = (prefixFile + _definitionName_3);
    String _plus_3 = (_plus_2 + "Child.java");
    String _definitionName_4 = this.getDefinitionName(definition);
    String _generateChildClass = this.childGenerator.generateChildClass(definition, prefix, _definitionName_4);
    fsa.generateFile(_plus_3, _generateChildClass);
    String _definitionName_5 = this.getDefinitionName(definition);
    String _plus_4 = (prefixFile + _definitionName_5);
    String _plus_5 = (_plus_4 + "Parent.java");
    String _definitionName_6 = this.getDefinitionName(definition);
    String _generateParentClass = this.parentGenerator.generateParentClass(definition, prefix, _definitionName_6);
    fsa.generateFile(_plus_5, _generateParentClass);
    String _createCalculator = this.createCalculator(prefix);
    fsa.generateFile((prefixFile + "/process/Calculator.java"), _createCalculator);
    String _createContributor = this.createContributor(prefix);
    fsa.generateFile((prefixFile + "/process/Contributor.java"), _createContributor);
    String _definitionName_7 = this.getDefinitionName(definition);
    String _createProcessor = this.createProcessor(prefix, _definitionName_7);
    fsa.generateFile((prefixFile + "/process/Processor.java"), _createProcessor);
  }
  
  public String getDefinitionName(final Resource resource) {
    EList<EObject> _contents = resource.getContents();
    Iterable<Definition> _filter = Iterables.<Definition>filter(_contents, Definition.class);
    final Function1<Definition, String> _function = (Definition it) -> {
      return it.getMethodName();
    };
    Iterable<String> _map = IterableExtensions.<Definition, String>map(_filter, _function);
    return ((String[])Conversions.unwrapArray(_map, String.class))[0];
  }
  
  public String createCalculator(final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(prefix, "");
    _builder.append(".process;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public final class Calculator {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Calculator() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// singleton");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static class SingletonHolder {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("static final Calculator instance = new Calculator();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Calculator getInstance() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return SingletonHolder.instance;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String createContributor(final String prefix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(prefix, "");
    _builder.append(".process;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public final class Contributor {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Contributor() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// singleton");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static class SingletonHolder {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("static final Contributor instance = new Contributor();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Contributor getInstance() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return Contributor.SingletonHolder.instance;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String createProcessor(final String prefix, final String methodName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(prefix, "");
    _builder.append(".process;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(prefix, "");
    _builder.append(".");
    _builder.append(methodName, "");
    _builder.append("Child;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(prefix, "");
    _builder.append(".");
    _builder.append(methodName, "");
    _builder.append("Method;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(prefix, "");
    _builder.append(".");
    _builder.append(methodName, "");
    _builder.append("Parent;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ch.raiffeisen.ipricer.methods.common.model.BaseProcessor;");
    _builder.newLine();
    _builder.append("import com.csksoftware.ipricer.RawParam;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public final class Processor extends BaseProcessor<");
    _builder.append(methodName, "");
    _builder.append("Method, ");
    _builder.append(methodName, "");
    _builder.append("Parent, ");
    _builder.append(methodName, "");
    _builder.append("Child> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Processor() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// singleton");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static class SingletonHolder {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("static final Processor instance = new Processor();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static Processor getInstance() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return SingletonHolder.instance;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void processMethodUpdate(");
    _builder.append(methodName, "    ");
    _builder.append("Method method, String paramString, RawParam<");
    _builder.append(methodName, "    ");
    _builder.append("Method, ");
    _builder.append(methodName, "    ");
    _builder.append("Parent, ");
    _builder.append(methodName, "    ");
    _builder.append("Child> methodParam) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// no method parameters defined");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void processParentUpdate(");
    _builder.append(methodName, "    ");
    _builder.append("Parent p, boolean enforceRedistribution) {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void processChildUpdate(");
    _builder.append(methodName, "    ");
    _builder.append("Child c, boolean enforceRedistribution) {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void processParentDelete(");
    _builder.append(methodName, "    ");
    _builder.append("Parent parent) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("//");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void processChildDelete(");
    _builder.append(methodName, "    ");
    _builder.append("Child child) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("processUpdate(child);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
