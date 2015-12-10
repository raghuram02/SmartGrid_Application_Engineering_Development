/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRoleJPanel;

import Business.WorkQueue.BloodDonationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    BloodDonationWorkRequest request;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, BloodDonationWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBarCode = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, -1));

        jLabel1.setText("Bar Code");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, 20));
        add(btnBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 88, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 20));

        jLabel4.setText("Blood Group");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, -1));
        add(btnBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 88, -1));

        jLabel5.setText("Result");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 70, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 88, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Process Work Request");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NurseWorkAreaJPanel lwjp = (NurseWorkAreaJPanel) component;
        lwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (resultJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Result");
            return;

        } else if (btnBG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Blood Group");
            return;

        } else if (btnBarCode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Barcode");
            return;
        }
        Date d = new Date();
        String resolveDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(d);
        request.setTestResult(resultJTextField.getText());
        request.setBloodGroup(btnBG.getText());
        request.setResolveDate(d);
        request.setBarCode(btnBarCode.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Message processed");

    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField btnBG;
    private javax.swing.JTextField btnBarCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}