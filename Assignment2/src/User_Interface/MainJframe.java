/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Business.Patient;
import Business.VitalSignHistory;

/**
 *
 * @author Raghuram
 */
public class MainJframe extends javax.swing.JFrame {
    private Patient patient;
    private VitalSignHistory vitalSignHistory;

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
        this.patient=new Patient();
        this.vitalSignHistory=new VitalSignHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnCreatePatient = new javax.swing.JButton();
        btnCreateVitalSign = new javax.swing.JButton();
        btnViewVitalSign = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setDividerLocation(175);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreatePatient.setText("Create Patient details");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 305, 77));

        btnCreateVitalSign.setText("Create Vital Sign");
        btnCreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalSignActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 305, 82));

        btnViewVitalSign.setText("View Vital Sign");
        btnViewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, 305, 79));

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        splitPane.setRightComponent(jPanel2);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
       CreatePatientJPanel createPatient = new CreatePatientJPanel(patient);
        splitPane.setRightComponent(createPatient);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnCreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalSignActionPerformed
     
        CreateVitalSignJPanel createVitalSign = new CreateVitalSignJPanel(vitalSignHistory);
        splitPane.setRightComponent(createVitalSign);// TODO add your handling code here:
    }//GEN-LAST:event_btnCreateVitalSignActionPerformed

    private void btnViewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignActionPerformed
       
        ViewVitalSignJPanel viewVitalSign = new ViewVitalSignJPanel(patient,vitalSignHistory);
        splitPane.setRightComponent(viewVitalSign);
    // TODO add your handling code here:
    }//GEN-LAST:event_btnViewVitalSignActionPerformed

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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnCreateVitalSign;
    private javax.swing.JButton btnViewVitalSign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
