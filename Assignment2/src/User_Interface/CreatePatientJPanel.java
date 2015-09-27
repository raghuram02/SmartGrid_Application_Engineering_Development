/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Business.Patient;
import Business.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Raghuram
 */
public class CreatePatientJPanel extends javax.swing.JPanel {
private Patient patient;
    /**
     * Creates new form CreatePatientJPanel
     */
    public CreatePatientJPanel(Patient patient) {
        initComponents();
        this.patient =  patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblPatientID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        btnCreatePatient = new javax.swing.JButton();
        txtPatientID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblPharmacy = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        txtPharmacy = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientName.setText("Patient Name");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 60, -1, -1));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 60, 110, -1));

        lblPatientID.setText("Patient ID");
        add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 90, -1, -1));

        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 120, -1, -1));

        lblDoctor.setText("Primary Doctor Name");
        add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 150, -1, -1));

        btnCreatePatient.setText("Create ");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });
        add(btnCreatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });
        add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 91, 110, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 122, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CREATE PATIENT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblPharmacy.setText("Preferred Pharmacy");
        add(lblPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 180, -1, -1));

        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });
        add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 153, 110, -1));

        txtPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPharmacyActionPerformed(evt);
            }
        });
        add(txtPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 179, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
         if (txtPatientName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Patient name");
            return;
        } else if (txtPatientID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Patient ID");
            return;
        } else if (!txtAge.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter the Age");
            return;
        } else if (txtDoctor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Doctor's name");
            return;
            } else if (txtPharmacy.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Preferred pharmacy");
            return;
        } 
         
          patient.setName(txtPatientName.getText());
          patient.setId(txtPatientID.getText());
          patient.setAge(Double.parseDouble(txtAge.getText()));
          patient.setDoctorName(txtDoctor.getText());
          patient.setPharmacy(txtPharmacy.getText());
                   
          JOptionPane.showMessageDialog(null,"Patient Details has been saved successfully!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void txtPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPharmacyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmacyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPharmacy;
    // End of variables declaration//GEN-END:variables
}
