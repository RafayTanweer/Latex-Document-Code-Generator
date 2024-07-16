
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdur-Rafay
 */
public class AddSections_And_Subsections_GUI extends javax.swing.JFrame {

    /**
     * Creates new form AddSections_And_Subsections
     */
    
    CreateCode LatexCode;
    boolean ListCreated = false;
    boolean isEmpty = true;
    boolean SectionCreated = false;
    boolean SubSectionCreated = false;
    
    public AddSections_And_Subsections_GUI(CreateCode LatexCode) {
        initComponents();
        this.LatexCode = LatexCode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SecNameLabel = new javax.swing.JLabel();
        SecNameField = new javax.swing.JTextField();
        SecDescLabel = new javax.swing.JLabel();
        SecDescField = new javax.swing.JTextField();
        CreateSectionButton = new javax.swing.JButton();
        CreateListButton = new javax.swing.JButton();
        AddItemButton = new javax.swing.JButton();
        CompListButton = new javax.swing.JButton();
        AddCodeButton = new javax.swing.JButton();
        CreateSubSectionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemArea = new javax.swing.JTextArea();
        SubNameLabel = new javax.swing.JLabel();
        SubNameField = new javax.swing.JTextField();
        SubDescLabel = new javax.swing.JLabel();
        SubDescField = new javax.swing.JTextField();
        InfoLabel1 = new javax.swing.JLabel();
        InfoLabel3 = new javax.swing.JLabel();
        CompleteSectionButton = new javax.swing.JButton();
        CompleteSubButton = new javax.swing.JButton();
        InfoLabel2 = new javax.swing.JLabel();
        InfoLabel4 = new javax.swing.JLabel();
        CompleteDocumentButton = new javax.swing.JButton();
        AddPathButton = new javax.swing.JButton();
        AddNormalTextButton = new javax.swing.JButton();
        AddSpaceButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        SpaceComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SecNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SecNameLabel.setText("Section Name");

        SecNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecNameFieldActionPerformed(evt);
            }
        });

        SecDescLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SecDescLabel.setText("Section Description");

        CreateSectionButton.setText("Create Section");
        CreateSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSectionButtonActionPerformed(evt);
            }
        });

        CreateListButton.setText("Create Item List");
        CreateListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateListButtonActionPerformed(evt);
            }
        });

        AddItemButton.setText("Add item");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });

        CompListButton.setText("Complete List");
        CompListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompListButtonActionPerformed(evt);
            }
        });

        AddCodeButton.setText("Add Code");
        AddCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCodeButtonActionPerformed(evt);
            }
        });

        CreateSubSectionButton.setText("Create Subsection");
        CreateSubSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSubSectionButtonActionPerformed(evt);
            }
        });

        CodeArea.setColumns(20);
        CodeArea.setRows(5);
        jScrollPane1.setViewportView(CodeArea);

        ItemArea.setColumns(20);
        ItemArea.setRows(5);
        jScrollPane2.setViewportView(ItemArea);

        SubNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SubNameLabel.setText("Subsection Name");

        SubDescLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SubDescLabel.setText("Subsection Description");

        InfoLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InfoLabel1.setText("After creating a section, you can add items, code or sub sections to your original section and once you are done please click Complete Section");

        InfoLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InfoLabel3.setText("After creating a subsection, you can add items, code to your sub section and once you are done please click complete subsection");

        CompleteSectionButton.setText("Complete Section");
        CompleteSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteSectionButtonActionPerformed(evt);
            }
        });

        CompleteSubButton.setText("Complete Subsection");
        CompleteSubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteSubButtonActionPerformed(evt);
            }
        });

        InfoLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InfoLabel2.setText("You can add multiple sections");

        InfoLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InfoLabel4.setText("You can add multiple subsections ");

        CompleteDocumentButton.setText("Complete Document");
        CompleteDocumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteDocumentButtonActionPerformed(evt);
            }
        });

        AddPathButton.setText("Add Path");
        AddPathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPathButtonActionPerformed(evt);
            }
        });

        AddNormalTextButton.setText("Add Normal Text");
        AddNormalTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNormalTextButtonActionPerformed(evt);
            }
        });

        AddSpaceButton.setText("Add Space");
        AddSpaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSpaceButtonActionPerformed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLabel.setText("Adding Sections and Subsections");

        SpaceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));
        SpaceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpaceComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddSpaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TitleLabel)
                            .addComponent(InfoLabel2)
                            .addComponent(InfoLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoLabel4)
                            .addComponent(InfoLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddPathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddNormalTextButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CreateListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CompListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(CreateSectionButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SecNameLabel)
                                    .addComponent(SecDescLabel))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SecNameField)
                                    .addComponent(SecDescField, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                                .addGap(104, 104, 104)
                                .addComponent(CompleteSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SubDescLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SubDescField, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SubNameLabel)
                                        .addGap(103, 103, 103)
                                        .addComponent(SubNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addComponent(CompleteSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 292, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateSubSectionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CompleteDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecNameLabel)
                            .addComponent(SecNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(CompleteSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecDescLabel)
                    .addComponent(SecDescField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(CreateSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(InfoLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InfoLabel2)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CreateListButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CompListButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddCodeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddPathButton)
                                .addGap(12, 12, 12)
                                .addComponent(AddNormalTextButton)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddSpaceButton))
                        .addGap(27, 27, 27)
                        .addComponent(InfoLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(InfoLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SubNameLabel)
                                    .addComponent(SubNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SubDescLabel)
                                    .addComponent(SubDescField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(CompleteSubButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                        .addComponent(CreateSubSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CompleteDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SecNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecNameFieldActionPerformed

    private void CreateSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSectionButtonActionPerformed
        
        if(SecNameField.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please fill the Section Name field");
        else{
            
            try {
                this.LatexCode.createSection(SecNameField.getText(), SecDescField.getText());
                JOptionPane.showMessageDialog(null,"Section Created");
                SectionCreated = true;
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_CreateSectionButtonActionPerformed

    private void CreateListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateListButtonActionPerformed
        
        try {
            this.LatexCode.BeginItemList();
            JOptionPane.showMessageDialog(null,"List Created. Now you can add items.");
            this.ListCreated = true;
        } catch (IOException ex) {
            Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CreateListButtonActionPerformed

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
        
        if(ListCreated == false)
            JOptionPane.showMessageDialog(null,"A List hasnt been created yet");
        else if(ItemArea.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please enter an item first");
        else{
            
            try {
                isEmpty = false;
                this.LatexCode.AddItem(ItemArea.getText());
                JOptionPane.showMessageDialog(null,"Item Added");
                ItemArea.selectAll();
                ItemArea.replaceSelection("");
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_AddItemButtonActionPerformed

    private void CompListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompListButtonActionPerformed
        
        if(ListCreated == false)
            JOptionPane.showMessageDialog(null,"A List hasnt been created yet");
        else if(isEmpty == true)
            JOptionPane.showMessageDialog(null,"List is Empty");
        else{
            
            try {
                this.LatexCode.EndList();
                JOptionPane.showMessageDialog(null,"List Completed");
                ListCreated = false;
                isEmpty = true;
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }//GEN-LAST:event_CompListButtonActionPerformed

    private void AddCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCodeButtonActionPerformed
       
        if(CodeArea.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please enter some code first");
        else{
            
            try {
                this.LatexCode.AddJavaCode(CodeArea.getText());
                JOptionPane.showMessageDialog(null,"Code Added");
                CodeArea.selectAll();
                CodeArea.replaceSelection("");
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_AddCodeButtonActionPerformed

    private void CreateSubSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSubSectionButtonActionPerformed
        
        if(SubNameField.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please fill the Sub Section Name field");
        else{
            
            try {
                this.LatexCode.createSubSection(SubNameField.getText(), SubDescField.getText());
                JOptionPane.showMessageDialog(null,"Sub Section Created");
                SubSectionCreated = true;
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
    }//GEN-LAST:event_CreateSubSectionButtonActionPerformed

    private void CompleteSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteSectionButtonActionPerformed
        
        if(SectionCreated == false)
            JOptionPane.showMessageDialog(null,"No Section has been created yet");
        else{
            JOptionPane.showMessageDialog(null,"Section Completed");
            SecNameField.setText("");
            SecDescField.setText("");
            SectionCreated = false;
        }
        
    }//GEN-LAST:event_CompleteSectionButtonActionPerformed

    private void CompleteSubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteSubButtonActionPerformed
        
        if(SectionCreated == false)
            JOptionPane.showMessageDialog(null,"No Section has been created for a Sub Section");
        else if(SubSectionCreated == false)
            JOptionPane.showMessageDialog(null,"No Sub Section has been created yet");
        else{
            
            JOptionPane.showMessageDialog(null,"SubSection Completed");
            SubNameField.setText("");
            SubDescField.setText("");
            SubSectionCreated = false;
            
        }
        
        
    }//GEN-LAST:event_CompleteSubButtonActionPerformed

    private void CompleteDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteDocumentButtonActionPerformed
        
        JOptionPane.showMessageDialog(null,"Tex File Created");
        try {
            this.LatexCode.EndDocument();
            this.LatexCode.Close();
            this.LatexCode.ReadFile();
            new Home_GUI().setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_CompleteDocumentButtonActionPerformed

    private void AddPathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPathButtonActionPerformed
        
        if(CodeArea.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please enter a path first");
        else{
            
            try {
                this.LatexCode.AddPath(CodeArea.getText());
                JOptionPane.showMessageDialog(null,"Path Added");
                CodeArea.selectAll();
                CodeArea.replaceSelection("");
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_AddPathButtonActionPerformed

    private void AddNormalTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNormalTextButtonActionPerformed
        
        if(CodeArea.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Please enter some text first");
        else{
            
            try {
                this.LatexCode.AddNormalText(CodeArea.getText());
                JOptionPane.showMessageDialog(null,"Text Added");
                CodeArea.selectAll();
                CodeArea.replaceSelection("");
            } catch (IOException ex) {
                Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
        
    }//GEN-LAST:event_AddNormalTextButtonActionPerformed

    private void AddSpaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSpaceButtonActionPerformed
        
        try {
            this.LatexCode.AddSpace(SpaceComboBox.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null,"Space Added");
        } catch (IOException ex) {
            Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_AddSpaceButtonActionPerformed

    private void SpaceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceComboBoxActionPerformed
       
        
        
        
    }//GEN-LAST:event_SpaceComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSections_And_Subsections_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSections_And_Subsections().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSections_And_Subsections().setVisible(true);
            }
        });*/
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCodeButton;
    private javax.swing.JButton AddItemButton;
    private javax.swing.JButton AddNormalTextButton;
    private javax.swing.JButton AddPathButton;
    private javax.swing.JButton AddSpaceButton;
    private javax.swing.JTextArea CodeArea;
    private javax.swing.JButton CompListButton;
    private javax.swing.JButton CompleteDocumentButton;
    private javax.swing.JButton CompleteSectionButton;
    private javax.swing.JButton CompleteSubButton;
    private javax.swing.JButton CreateListButton;
    private javax.swing.JButton CreateSectionButton;
    private javax.swing.JButton CreateSubSectionButton;
    private javax.swing.JLabel InfoLabel1;
    private javax.swing.JLabel InfoLabel2;
    private javax.swing.JLabel InfoLabel3;
    private javax.swing.JLabel InfoLabel4;
    private javax.swing.JTextArea ItemArea;
    private javax.swing.JTextField SecDescField;
    private javax.swing.JLabel SecDescLabel;
    private javax.swing.JTextField SecNameField;
    private javax.swing.JLabel SecNameLabel;
    private javax.swing.JComboBox<String> SpaceComboBox;
    private javax.swing.JTextField SubDescField;
    private javax.swing.JLabel SubDescLabel;
    private javax.swing.JTextField SubNameField;
    private javax.swing.JLabel SubNameLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
