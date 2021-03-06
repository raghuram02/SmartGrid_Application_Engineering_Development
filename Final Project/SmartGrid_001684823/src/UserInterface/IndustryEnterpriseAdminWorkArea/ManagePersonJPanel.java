/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.IndustryEnterpriseAdminWorkArea;

import UserInterface.GovernmentOwnedEnterpriseAdminWorkArea.*;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManagePersonJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;

        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
//        populateCityComboBox();
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpJComboBox.addItem(organization);
        }
    }
//     public void populateCityComboBox(){
//        cityJComboBox.removeAllItems();
//        
//        for (Organization organization : ){
//            cityJComboBox.addItem(organization);
//        }
//    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Person person : organization.getPersonDirectory().getPersonList()) {
            Object[] row = new Object[2];
            row[0] = person.getId();
            row[1] = person.getName();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBackground(new java.awt.Color(51, 255, 51));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 710, 200));

        addJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 160, 30));

        organizationJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("MANAGE PERSON");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel2.setText("Electricity Manager");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, 30));

        nameJTextField.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 190, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, 30));

        organizationEmpJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        if (nameJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Name");
            return;

        }

        organization.getPersonDirectory().createPerson(name);
        populateTable(organization);

    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
