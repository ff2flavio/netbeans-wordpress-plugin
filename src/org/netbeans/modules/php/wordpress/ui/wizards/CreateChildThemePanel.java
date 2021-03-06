/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2014 Sun Microsystems, Inc.
 */
package org.netbeans.modules.php.wordpress.ui.wizards;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.openide.util.ChangeSupport;

/**
 *
 * @author junichi11
 */
public class CreateChildThemePanel extends JPanel {

    private static final long serialVersionUID = 5508202690126964224L;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    /**
     * Creates new form CreateChildThemePanel
     */
    public CreateChildThemePanel(List<String> themes) {
        initComponents();
        DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<String>(themes.toArray(new String[0]));
        parentThemeComboBox.setModel(defaultComboBoxModel);
        childDirectoryNameTextField.getDocument().addDocumentListener(new DefaultDocumentListener());
        errorLabel.setText(" "); // NOI18N
        errorLabel.setForeground(UIManager.getColor("nb.errorForeground")); // NOI18N
    }

    private void fireChange() {
        changeSupport.fireChange();
    }

    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    public String getParentThemeName() {
        return (String) parentThemeComboBox.getSelectedItem();
    }

    public String getChildDirectoryName() {
        return childDirectoryNameTextField.getText().trim();
    }

    public String getChildThemeName() {
        return childThemeNameTextField.getText().trim();
    }

    public String getChildThemeUri() {
        return childThemeUriTextField.getText().trim();
    }

    public String getDescription() {
        return descriptionTextField.getText().trim();
    }

    public String getVersion() {
        return versionTextField.getText().trim();
    }

    public String getAuthor() {
        return authorTextField.getText().trim();
    }

    public String getAuthorUri() {
        return authorUriTextField.getText().trim();
    }

    public String getTags() {
        return tagsTextField.getText().trim();
    }

    public String getTextDomain() {
        return textDomainTextField.getText().trim();
    }

    public void setError(String message) {
        errorLabel.setText(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentThemeLabel = new javax.swing.JLabel();
        parentThemeComboBox = new javax.swing.JComboBox<String>();
        childDirectoryNameLabel = new javax.swing.JLabel();
        childDirectoryNameTextField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        childThemeUriLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        tagsLabel = new javax.swing.JLabel();
        textDomainLabel = new javax.swing.JLabel();
        childThemeUriTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        versionTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        tagsTextField = new javax.swing.JTextField();
        textDomainTextField = new javax.swing.JTextField();
        authorUriLabel = new javax.swing.JLabel();
        authorUriTextField = new javax.swing.JTextField();
        childThemeNameLabel = new javax.swing.JLabel();
        childThemeNameTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(parentThemeLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.parentThemeLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(childDirectoryNameLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.childDirectoryNameLabel.text")); // NOI18N

        childDirectoryNameTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.childDirectoryNameTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(errorLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.errorLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(childThemeUriLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.childThemeUriLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(descriptionLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.descriptionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(versionLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.versionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(authorLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.authorLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(tagsLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.tagsLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(textDomainLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.textDomainLabel.text")); // NOI18N

        childThemeUriTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.childThemeUriTextField.text")); // NOI18N

        descriptionTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.descriptionTextField.text")); // NOI18N

        versionTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.versionTextField.text")); // NOI18N

        authorTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.authorTextField.text")); // NOI18N

        tagsTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.tagsTextField.text")); // NOI18N

        textDomainTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.textDomainTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(authorUriLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.authorUriLabel.text")); // NOI18N

        authorUriTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.authorUriTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(childThemeNameLabel, org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.childThemeNameLabel.text")); // NOI18N

        childThemeNameTextField.setText(org.openide.util.NbBundle.getMessage(CreateChildThemePanel.class, "CreateChildThemePanel.childThemeNameTextField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(childDirectoryNameLabel)
                            .addComponent(childThemeNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(childDirectoryNameTextField)
                            .addComponent(childThemeNameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLabel)
                            .addComponent(childThemeUriLabel)
                            .addComponent(versionLabel)
                            .addComponent(authorLabel)
                            .addComponent(authorUriLabel)
                            .addComponent(tagsLabel)
                            .addComponent(textDomainLabel))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDomainTextField)
                            .addComponent(tagsTextField)
                            .addComponent(childThemeUriTextField)
                            .addComponent(descriptionTextField)
                            .addComponent(versionTextField)
                            .addComponent(authorTextField)
                            .addComponent(authorUriTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(parentThemeLabel)
                        .addGap(60, 60, 60)
                        .addComponent(parentThemeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentThemeLabel)
                    .addComponent(parentThemeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childDirectoryNameLabel)
                    .addComponent(childDirectoryNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childThemeNameLabel)
                    .addComponent(childThemeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childThemeUriLabel)
                    .addComponent(childThemeUriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionLabel)
                    .addComponent(versionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel)
                    .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorUriLabel)
                    .addComponent(authorUriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagsLabel)
                    .addComponent(tagsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDomainLabel)
                    .addComponent(textDomainTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JLabel authorUriLabel;
    private javax.swing.JTextField authorUriTextField;
    private javax.swing.JLabel childDirectoryNameLabel;
    private javax.swing.JTextField childDirectoryNameTextField;
    private javax.swing.JLabel childThemeNameLabel;
    private javax.swing.JTextField childThemeNameTextField;
    private javax.swing.JLabel childThemeUriLabel;
    private javax.swing.JTextField childThemeUriTextField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JComboBox<String> parentThemeComboBox;
    private javax.swing.JLabel parentThemeLabel;
    private javax.swing.JLabel tagsLabel;
    private javax.swing.JTextField tagsTextField;
    private javax.swing.JLabel textDomainLabel;
    private javax.swing.JTextField textDomainTextField;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JTextField versionTextField;
    // End of variables declaration//GEN-END:variables

    private class DefaultDocumentListener implements DocumentListener {

        public DefaultDocumentListener() {
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            processUpdate();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            processUpdate();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            processUpdate();
        }

        private void processUpdate() {
            fireChange();
        }
    }
}
