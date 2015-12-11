/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityUrbanOrganizationAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class UrbanAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    private UserAccount account;
    private Organization organization;

    /**
     * Creates new form IndustryAdminWorkAreaJPanel
     */
    public UrbanAdminWorkAreaJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account,
            Organization organization ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;

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
        btnAccess = new javax.swing.JButton();
        serveConsumer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("MY WORK AREA - URBAN ADMIN ROLE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 330, -1));

        btnAccess.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnAccess.setText("Grant User Access");
        btnAccess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });
        add(btnAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 240, 40));

        serveConsumer.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        serveConsumer.setText("Serve Consumers");
        serveConsumer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        serveConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serveConsumerActionPerformed(evt);
            }
        });
        add(serveConsumer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        GrantUserAccessWorkAreaJPanel grantUserAccessJPanel = new GrantUserAccessWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("requestAccessJPanel", grantUserAccessJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccessActionPerformed

    private void serveConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serveConsumerActionPerformed
        ServeConsumerJPanel serveConsumerJPanel = new ServeConsumerJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("serveConsumerJPanel", serveConsumerJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_serveConsumerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccess;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton serveConsumer;
    // End of variables declaration//GEN-END:variables
}
