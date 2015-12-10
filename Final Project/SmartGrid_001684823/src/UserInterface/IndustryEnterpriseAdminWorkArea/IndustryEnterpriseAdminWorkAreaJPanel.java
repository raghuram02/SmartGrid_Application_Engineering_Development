/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.IndustryEnterpriseAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.SmartGrid;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class IndustryEnterpriseAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    SmartGrid sg;

    /**
     * Creates new form ElectricityManagerWorkAreaJPanel
     */
    public IndustryEnterpriseAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, SmartGrid sg) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.sg = sg;
        valueLabel.setText(enterprise.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        manageOrganizationJButton2 = new javax.swing.JButton();
        manageEmployeeJButton2 = new javax.swing.JButton();
        userJButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("MY WORK AREA - INDUSTRY ADMIN ROLE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        manageOrganizationJButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        manageOrganizationJButton2.setText("Manage Organization");
        manageOrganizationJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageOrganizationJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButton2ActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 240, 40));

        manageEmployeeJButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        manageEmployeeJButton2.setText("Manage Person");
        manageEmployeeJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageEmployeeJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButton2ActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 240, 40));

        userJButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        userJButton2.setText("Manage User");
        userJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton2ActionPerformed(evt);
            }
        });
        add(userJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 240, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Enterprise");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButton2ActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_manageOrganizationJButton2ActionPerformed

    private void manageEmployeeJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButton2ActionPerformed
        ManagePersonJPanel manageEmployeeJPanel = new ManagePersonJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_manageEmployeeJButton2ActionPerformed

    private void userJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton2ActionPerformed
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise, sg);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_userJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton2;
    private javax.swing.JButton manageOrganizationJButton2;
    private javax.swing.JButton userJButton2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
