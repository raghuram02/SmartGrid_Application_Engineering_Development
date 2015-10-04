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
        this.personDirectory =  personDirectory;
        this.userProcessContainer =  userProcessContainer;
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
        }}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreatePersonJPanel = new javax.swing.JButton();
        viewPerson = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnPatient = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.CardLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, -1, 238));

        CreatePersonJPanel.setText("Create Person");
        CreatePersonJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePersonJPanelActionPerformed(evt);
            }
        });
        add(CreatePersonJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        viewPerson.setText("View Details");
        viewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonActionPerformed(evt);
            }
        });
        add(viewPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 101, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 59, 356, 91));

        jLabel1.setText("Manage Person Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 11, -1, 30));

        btnPatient.setText("Create Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CreatePersonJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePersonJPanelActionPerformed
        
        CreatePersonJPanel CP = new CreatePersonJPanel(personDirectory, userProcessContainer);
        userProcessContainer.add("workArea", CP);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);// TODO add your handling code here:
    }//GEN-LAST:event_CreatePersonJPanelActionPerformed

    private void viewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonActionPerformed
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
    }//GEN-LAST:event_viewPersonActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
    
        int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                } 
        else
        {
      Person person = (Person) personTable.getValueAt(row, 0);
      if(person.getPatient().getPatientId().isEmpty())
      {
        CreatePatientJPanel CPD = new CreatePatientJPanel( person, userProcessContainer);
        userProcessContainer.add("VPD", CPD);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPatientActionPerformed
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatePersonJPanel;
    private javax.swing.JButton btnPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personTable;
    private javax.swing.JButton viewPerson;
    // End of variables declaration//GEN-END:variables
}
