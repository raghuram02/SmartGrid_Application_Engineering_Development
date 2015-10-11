/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_CVSAdminRole;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class CVSAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    /**
     * Creates new form CVSAdminWorkAreaJPanel
     */
    public CVSAdminWorkAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageDrug = new javax.swing.JButton();
        BtnCreateCVS = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        btnManageDrug.setText("Manage Drug Catalog");

        BtnCreateCVS.setText("Manage CVS Stores");
        BtnCreateCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateCVSActionPerformed(evt);
            }
        });

        jButton3.setText("Manage Suppliers");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageDrug)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnCreateCVS, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton3)
                .addGap(39, 39, 39)
                .addComponent(BtnCreateCVS)
                .addGap(41, 41, 41)
                .addComponent(btnManageDrug)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnCreateCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateCVSActionPerformed

        ManageCVSStoresJPanel workArea = new ManageCVSStoresJPanel(userProcessContainer);
        userProcessContainer.add("workArea", workArea);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
// TODO add your handling code here:
    }//GEN-LAST:event_BtnCreateCVSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateCVS;
    private javax.swing.JButton btnManageDrug;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}