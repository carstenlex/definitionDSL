/*
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.idea.lang.psi.impl;

import ch.raiffeisen.ipricer.definition.idea.lang.DefinitionDSLFileType;
import ch.raiffeisen.ipricer.definition.idea.lang.DefinitionDSLLanguage;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.eclipse.xtext.psi.impl.BaseXtextFile;

public final class DefinitionDSLFileImpl extends BaseXtextFile {

	public DefinitionDSLFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, DefinitionDSLLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return DefinitionDSLFileType.INSTANCE;
	}
}
