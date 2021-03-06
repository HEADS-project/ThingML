/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.eclipse.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.thingml.eclipse.ui.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class ThingMLPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public ThingMLPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("ThingML preferences");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(
			new DirectoryFieldEditor(PreferenceConstants.P_STRING, "Arduino: IDE Folder", getFieldEditorParent()));
		addField(
				new DirectoryFieldEditor(PreferenceConstants.T_STRING, "Arduino: Library Folder", getFieldEditorParent()));
        addField(
                new StringFieldEditor(PreferenceConstants.PACK_STRING, "Java: Default package", getFieldEditorParent()));
        addField(
                new BooleanFieldEditor(PreferenceConstants.PRINT_NOTICE_STRING, "Checker: Print Notices?", getFieldEditorParent()));
        addField(
                new BooleanFieldEditor(PreferenceConstants.UML_ELLIPSIS, "UML: Use Ellipsis for params?", getFieldEditorParent()));
        addField(
                new IntegerFieldEditor(PreferenceConstants.UML_BLOCK_SIZE, "UML: Max block size", getFieldEditorParent()));
        addField(
                new BooleanFieldEditor(PreferenceConstants.UML_HIDE_BLOCK, "UML: Hide blocks?", getFieldEditorParent()));
        addField(
                new BooleanFieldEditor(PreferenceConstants.UML_FACTORIZE, "UML: Factorize transitions?", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}