/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovernmentOwnedMaintenanceEmployeeWorkAreaJPanel;

import UserInterface.IndustryEmployeeWorkArea.*;
import Business.Enterprise.Enterprise;
import Business.Organization.IndustryOrganization;
import Business.Organization.Organization;
import Business.Organization.PublicOrganization;
import Business.Person.Person;
import Business.Role.PublicOrganizationAdmin;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RequestAccessWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class PlaceRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private Person person;
    private UserAccount account;

    /**
     * Creates new form PlaceRequestJPanel
     */
    public PlaceRequestJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.account = account;
        popOrganizationComboBox();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PublicOrganization) {
                organizationJComboBox.addItem(organization);
            }
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        employeeJComboBox.removeAllItems();

        for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
            for (Role role : organization.getSupportedRole()) {
                if (role instanceof PublicOrganizationAdmin) {
                    employeeJComboBox.addItem(userAccount);
                }
            }
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PLACE REQUEST ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 40));

        messageJTextField.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        messageJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 140, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, 30));

        employeeJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJComboBoxActionPerformed(evt);
            }
        });
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 146, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 30));

        organizationJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 146, 30));

        requestTestJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        requestTestJButton.setText("Request Access");
        requestTestJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, 30));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 70, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void employeeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeJComboBoxActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);

        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        UserAccount UA = (UserAccount) employeeJComboBox.getSelectedItem();
        String message = messageJTextField.getText();
        if (messageJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Message");
            return;

        }
        if (message.equals("") || message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        RequestAccessWorkRequest request = new RequestAccessWorkRequest();
        request.setSender(account);
        request.setMessage(message);
        request.setReceiver(UA);
        request.setStatus("Sent");
        request.setEmp(person);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PublicOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Request message sent");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RequestMaintenanceAccessJPanel dwjp = (RequestMaintenanceAccessJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
