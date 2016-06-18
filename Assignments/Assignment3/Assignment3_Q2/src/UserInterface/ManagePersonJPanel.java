/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;

    /**
     * Creates new form ManagePerson
     */
    public ManagePersonJPanel(PersonDirectory personDirectory, JPanel userProcessContainer) {
        initComponents();
        this.personDirectory = personDirectory;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) personTable.getModel();
        dtm.setRowCount(0);
        for (Person P : personDirectory.getpersonDirectory()) {
            Object row[] = new Object[3];
            row[0] = P;
            row[1] = P.getAge();
            row[2] = P.getPhoneNumber();
            dtm.addRow(row);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreatePersonJPanel = new javax.swing.JButton();
        btnViewPerson = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnDeletePerson = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.CardLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, -1, 238));

        CreatePersonJPanel.setText("Create Person");
        CreatePersonJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePersonJPanelActionPerformed(evt);
            }
        });
        add(CreatePersonJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        btnViewPerson.setText("View Details");
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });
        add(btnViewPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 100, -1));

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Age", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 340, 130));

        jLabel1.setText("Manage Person Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 11, -1, 30));

        BtnDeletePerson.setText("Delete Person");
        BtnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletePersonActionPerformed(evt);
            }
        });
        add(BtnDeletePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel2.setText("Search by person name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 20));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CreatePersonJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePersonJPanelActionPerformed

        CreatePersonJPanel CP = new CreatePersonJPanel(personDirectory, userProcessContainer);
        userProcessContainer.add("workArea", CP);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);// TODO add your handling code here:
    }//GEN-LAST:event_CreatePersonJPanelActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed
        int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person) personTable.getValueAt(row, 0);
        ViewPersonJPanel VPD = new ViewPersonJPanel(person, userProcessContainer);
        userProcessContainer.add("VPD", VPD);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPersonActionPerformed

    private void BtnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletePersonActionPerformed
        // TODO add your handling code here:
        int selectedRow = personTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select person from the table!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            

                int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the person associated with the patient", "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Person person = (Person) personTable.getValueAt(selectedRow, 0);
                    personDirectory.deletePerson(person);
                    populateTable();
//                JOptionPane.showConfirmDialog(null,"Person deleted!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
//                }
//                else
//                {
//                    JOptionPane.showConfirmDialog(null,"Person not deleted!!!", "Warning", JOptionPane.WARNING_MESSAGE);
//                }
//            }
//            else 
//            {
//                int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete the person??", "Warning", JOptionPane.YES_NO_OPTION);
//                if (dialogResult == JOptionPane.YES_OPTION)
//                {        
//                    personDirectory.deletePerson(person);
//                    populateTable();
//                    JOptionPane.showConfirmDialog(null,"Person deleted!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
//                }
                
            }

        }
    }//GEN-LAST:event_BtnDeletePersonActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String key = txtSearch.getText().trim();
        if (key == null || key.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please specify aname to search!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Person person = personDirectory.searchPerson(key);
            if (person != null) {
                ViewPersonJPanel searchResult = new ViewPersonJPanel(person, userProcessContainer);
                userProcessContainer.add("searchResult", searchResult);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "No matching names", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeletePerson;
    private javax.swing.JButton CreatePersonJPanel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
