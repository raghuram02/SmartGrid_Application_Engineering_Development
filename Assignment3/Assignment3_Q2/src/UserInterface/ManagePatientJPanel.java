/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.PersonDirectory;
import Business.VitalSignHistory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;

    /**
     * Creates new form ManagePatientJPanel
     */
    public ManagePatientJPanel(PersonDirectory personDirectory, JPanel userProcessContainer) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        btnPatient = new javax.swing.JButton();
        btnVitalSign = new javax.swing.JButton();
        btnViewVitalSign = new javax.swing.JButton();

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

        btnPatient.setText("Create Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnVitalSign.setText("Create VitalSign");
        btnVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalSignActionPerformed(evt);
            }
        });

        btnViewVitalSign.setText("View Vital Sign");
        btnViewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnViewVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnViewVitalSign)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatient)
                    .addComponent(btnVitalSign))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed

        int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Person person = (Person) personTable.getValueAt(row, 0);

            if (person.getPatient().getPatientId() == null) {
                CreatePatientJPanel CPD = new CreatePatientJPanel(person, userProcessContainer);
                userProcessContainer.add("VPD", CPD);
                CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
                Layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "patient already exist",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalSignActionPerformed

        int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Person person = (Person) personTable.getValueAt(row, 0);
            if (person.getPatient().getPatientId() == null) {
                JOptionPane.showMessageDialog(null, "Patient doesn't exist. Please create patient entry",
                        "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                CreateVitalSignJPanel CVS = new CreateVitalSignJPanel(person, userProcessContainer);
                userProcessContainer.add("VPD", CVS);
                CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
                Layout.next(userProcessContainer);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnVitalSignActionPerformed

    private void btnViewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignActionPerformed

       int row = personTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Person person = (Person) personTable.getValueAt(row, 0);
            if (person.getPatient().getPatientId() == null) {
                JOptionPane.showMessageDialog(null, "Patient doesn't exist. Please create patient entry",
                        "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                ViewVitalSignJPanel CVS = new ViewVitalSignJPanel(person, userProcessContainer);
                userProcessContainer.add("VPD", CVS);
                CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
                Layout.next(userProcessContainer);
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewVitalSignActionPerformed

        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnViewVitalSign;
    private javax.swing.JButton btnVitalSign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personTable;
    // End of variables declaration//GEN-END:variables
}
