/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityRuralOrganizationAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.SmartGrid;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class ViewCustomerDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SmartGrid sg;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    private Person p;

    /**
     * Creates new form ViewCustomerDetailsJPanel
     */
    public ViewCustomerDetailsJPanel(JPanel userProcessContainer, Person p, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.p = p;

        Address.setText(p.getAddress());
        txtEName.setText(p.getName());
        txtCity.setText(p.getCity());
        txtEmail.setText(p.getEmailID());
        txtSSN.setText(String.valueOf(p.getTIN()));
        txtPhone.setText(String.valueOf(p.getPhoneNumber()));

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
        btnUpdateStore = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("VIEW CUSTOMER DETAILS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        btnUpdateStore.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnUpdateStore.setText("Update Details");
        btnUpdateStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdateStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStoreActionPerformed(evt);
            }
        });
        add(btnUpdateStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 140, 30));

        btnSave.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 70, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel6.setText("SSN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 20));

        Address.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        Address.setEnabled(false);
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 160, -1));

        txtSSN.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtSSN.setEnabled(false);
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 160, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 20));

        txtPhone.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtPhone.setEnabled(false);
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 160, -1));

        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 90, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel11.setText("Email ID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 20));

        txtEmail.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtEmail.setEnabled(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 160, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel12.setText("City");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, 20));

        txtCity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtCity.setEnabled(false);
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 160, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel8.setText("Customer Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, 30));

        txtEName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtEName.setEnabled(false);
        add(txtEName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStoreActionPerformed
        txtEName.setEnabled(true);
        Address.setEnabled(true);
        txtSSN.setEnabled(true);
        txtEmail.setEnabled(true);
        txtPhone.setEnabled(true);
        txtCity.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdateStore.setEnabled(false);
    }//GEN-LAST:event_btnUpdateStoreActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtEName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a Customer Name");
            return;
        } else if (Address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Address");
            return;
        } else if (txtCity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid City Name");
            return;
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Email id");
            return;
        } else if (!txtSSN.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid Tin");
            return;

        } else if (!txtPhone.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid Phone Number");
            return;
        }

        p.setName(txtEName.getText());
        p.setCity(txtCity.getText());
        p.setAddress(Address.getText());
        p.setTIN(Integer.parseInt(txtSSN.getText()));
        p.setEmailID(txtEmail.getText());
        p.setPhoneNumber(Integer.parseInt(txtPhone.getText()));

        JOptionPane.showMessageDialog(null, "Customer Details saved successfully",
                "Information", JOptionPane.INFORMATION_MESSAGE);

        Address.setEditable(false);
        txtEName.setEditable(false);
        txtSSN.setEditable(false);
        txtCity.setEditable(false);
        txtPhone.setEditable(false);
        txtEmail.setEditable(false);
        btnSave.setEnabled(false);
        btnUpdateStore.setEnabled(true);


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        back();

    }

    private void back() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component serveConsumerJPanel = componentArray[componentArray.length - 1];
        ServeConsumerJPanel manage = (ServeConsumerJPanel) serveConsumerJPanel;
        manage.populateTable();
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdateStore;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
