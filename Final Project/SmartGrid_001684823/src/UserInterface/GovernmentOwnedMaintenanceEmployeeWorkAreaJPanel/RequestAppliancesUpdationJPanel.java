/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovernmentOwnedMaintenanceEmployeeWorkAreaJPanel;

import Business.Enterprise.Enterprise;
import Business.Organization.IndustryOrganization;
import Business.Organization.Organization;
import Business.Organization.PublicOrganization;
import Business.Person.Person;
import Business.Role.PublicOrganizationAdmin;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.UpdateAppliancesWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class RequestAppliancesUpdationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private Person person;
    private UserAccount account;

    /**
     * Creates new form RequestAppliancesUpdationJPanel
     */
    public RequestAppliancesUpdationJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.account = account;
        this.person = person;
        System.out.println("person inside req access" + person);
        populateRequestTable();
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

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request instanceof UpdateAppliancesWorkRequest) {
                Object[] row = new Object[7];
                row[0] = ((UpdateAppliancesWorkRequest) request).getRequestDate();
                row[1] = request.getMessage();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
                row[3] = request.getStatus();
                String result = ((UpdateAppliancesWorkRequest) request).getResult();
                row[4] = result == null ? "Waiting" : result;
                row[5] = (request).getSender().getPerson().getName();
                row[6] = request.getResolveDate();

                model.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backJButton2 = new javax.swing.JButton();
        backJButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        requestTestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("REQUEST APPLIANCES UPDATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Message", "Receiver", "Status", "Result", "Name", "Resolve Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 630, 120));

        backJButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton2.setText("Refresh");
        backJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 80, 30));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("<< Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 80, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 40));

        messageJTextField.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        messageJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 140, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("Employee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 30));

        employeeJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJComboBoxActionPerformed(evt);
            }
        });
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 146, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, 30));

        organizationJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 146, 30));

        requestTestJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        requestTestJButton.setText("Request Updation ");
        requestTestJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        populateRequestTable();
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

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
        UpdateAppliancesWorkRequest request = new UpdateAppliancesWorkRequest();
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
        populateRequestTable();
    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton backJButton3;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
