/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Business.Patient;
import Business.VitalSign;
import Business.VitalSignHistory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class ViewVitalSignJPanel extends javax.swing.JPanel {
private Patient patient;
    private VitalSignHistory vitalSignHistory;
    /**
     * Creates new form ViewVitalSignJPanel
     */
    public ViewVitalSignJPanel( Patient patient, VitalSignHistory vitalSignHistory) {
        initComponents();
        this.patient = patient;
        this.vitalSignHistory = vitalSignHistory;
        populateTable();
    }
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblVitalSign.getModel();
        for(int i=dtm.getRowCount() -1;i>=0;i--){
            dtm.removeRow(i);
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
        tblVitalSign = new javax.swing.JTable();
        lblDoctor = new javax.swing.JLabel();
        lblPharmacy = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblRespiiratoryRate = new javax.swing.JLabel();
        txtRespiratoryRate = new javax.swing.JTextField();
        lblHeartRate = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtPharmacy = new javax.swing.JTextField();
        btnViewDetails = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVitalSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time Stamp", "Vital Sign"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSign);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, 550, 179));

        lblDoctor.setText("Primary Doctor Name");
        add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        lblPharmacy.setText("Preferred Pharmacy");
        add(lblPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        lblPatientName.setText("Patient Name");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        lblPatientID.setText("Patient ID");
        add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lblRespiiratoryRate.setText("Respiratory Rate");
        add(lblRespiiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        txtRespiratoryRate.setEditable(false);
        txtRespiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespiratoryRateActionPerformed(evt);
            }
        });
        add(txtRespiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 110, -1));

        lblHeartRate.setText("Heart Rate");
        add(lblHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        lblBP.setText("Systolic Blood Pressure");
        add(lblBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        lblWeight.setText("Weight in pounds");
        add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        txtHeartRate.setEditable(false);
        txtHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRateActionPerformed(evt);
            }
        });
        add(txtHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 110, -1));

        txtBP.setEditable(false);
        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });
        add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 110, -1));

        txtDate.setEditable(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 110, -1));

        txtPatientName.setEditable(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 100, -1));

        txtPatientID.setEditable(false);
        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });
        add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, -1));

        txtAge.setEditable(false);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, -1));

        txtDoctor.setEditable(false);
        txtDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorActionPerformed(evt);
            }
        });
        add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, -1));

        txtPharmacy.setEditable(false);
        txtPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPharmacyActionPerformed(evt);
            }
        });
        add(txtPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, -1));

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespiratoryRateActionPerformed

    private void txtHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRateActionPerformed

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorActionPerformed

    private void txtPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPharmacyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmacyActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblRespiiratoryRate;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTable tblVitalSign;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPharmacy;
    private javax.swing.JTextField txtRespiratoryRate;
    // End of variables declaration//GEN-END:variables
}
