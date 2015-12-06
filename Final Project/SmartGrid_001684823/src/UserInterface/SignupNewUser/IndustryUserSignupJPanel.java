/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SignupNewUser;

import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentOwnedEnterprise;
import Business.Enterprise.IndustryEnterprise;
import Business.Network.Network;
import Business.Organization.IndustryOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.IndustryEmployeeRole;
import Business.Role.Role;
import Business.SmartGrid;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class IndustryUserSignupJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private SmartGrid sg;
    private Organization organization;

    /**
     * Creates new form IndustryUserSignupJPanel
     */
    public IndustryUserSignupJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, SmartGrid sg) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sg = sg;
        this.personDirectory = personDirectory;

        populateComboBox();
        populateRoleComboBox();
    }

    private void populateRoleComboBox() {
        roleJComboBox.removeAllItems();
        for (Network network : sg.getNetworkList()) {
//            System.out.println("hhhhhhhhhhh"+network);
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                System.out.println("hhhhhhhhhhh"+enterprise);
                if (enterprise instanceof IndustryEnterprise) {
//                    System.out.println("enter"+enterprise);
                    for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                        System.out.println("org"+organization1);
                        if ((organization1 instanceof IndustryOrganization)) {
//                            System.out.print("Organization"+organization1);
                            for (Role role : organization1.getSupportedRole()) {
                                if (role instanceof IndustryEmployeeRole) {
                                    roleJComboBox.addItem(role);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void populateComboBox() {
        enterpriseTypeJComboBox.removeAllItems();
        enterpriseJComboBox.removeAllItems();
        organizationJComboBox.removeAllItems();

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (type.getValue().equals(Enterprise.EnterpriseType.Industry.getValue())) {
                enterpriseTypeJComboBox.addItem(type);
            }
        }
        for (Network network : sg.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof IndustryEnterprise) {
                    enterpriseJComboBox.addItem(enterprise);
                }
            }
        }

        for (Organization.Type type : Organization.Type.values()) {
            if ((type.getValue().equals(Organization.Type.Industry.getValue()))) {
                organizationJComboBox.addItem(type);
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
        jLabel4 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTIN = new javax.swing.JTextField();
        txtIName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtAttach = new javax.swing.JTextField();
        labelPhoto = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        txtEmailID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtuserName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SIGNUP INDUSTRY EMPLOYEE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, 30));

        txtPhoneNumber.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 160, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel6.setText("Employee Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 130, 30));

        txtEName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtEName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtENameActionPerformed(evt);
            }
        });
        add(txtEName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 160, 30));

        txtCity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 150, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel8.setText("City");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel9.setText("Industry");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel10.setText("TIN");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 30));

        txtTIN.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtTIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTINActionPerformed(evt);
            }
        });
        add(txtTIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 150, 30));

        txtIName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtIName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtINameActionPerformed(evt);
            }
        });
        add(txtIName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, 30));

        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 80, 30));

        btnCreate.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnCreate.setText("Create Account");
        btnCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 160, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel12.setText("Email ID");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, 30));

        txtAttach.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtAttach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttachActionPerformed(evt);
            }
        });
        add(txtAttach, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 140, 20));
        add(labelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 160));

        btnAttach.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnAttach.setText("Attach Photo");
        btnAttach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });
        add(btnAttach, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 120, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel13.setText("Enterprise Name");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel14.setText("Enterprise Type");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 40));

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 200, 30));

        organizationJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 200, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, 30));

        enterpriseJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 200, 30));

        txtEmailID.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });
        add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 160, 30));

        jLabel15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel15.setText("Password");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 90, 30));

        txtuserName.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtuserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtuserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserNameActionPerformed(evt);
            }
        });
        add(txtuserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 150, 30));

        jLabel17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel17.setText("Username");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 90, 30));

        passwordJTextField.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 160, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setText("Role");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 70, 30));

        roleJComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtTINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTINActionPerformed

    private void txtINameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtINameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtINameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (organization == null) {
            for (Network network : sg.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof IndustryEnterprise) {
                        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (org instanceof IndustryOrganization) {
                                organization = org;
                            }
                        }
                    }
                }
            }
        }
        String industryName = txtIName.getText();
        String name = txtEName.getText();
        Person p = organization.getPersonDirectory().createPerson(name);
        String emailID = txtEmailID.getText();
        String city = txtCity.getText();
        int phoneNumber = (Integer.parseInt(txtPhoneNumber.getText()));
        int TIN = (Integer.parseInt(txtTIN.getText()));
        String password = passwordJTextField.getText();
        String userName = txtuserName.getText();
        p.setName(name);
        p.setIndustryName(industryName);
        p.setEmailID(emailID);
        p.setCity(city);
        p.setPhoneNumber(phoneNumber);
        p.setTIN(TIN);
        p.setPassword(password);
        p.setUserName(userName);
        for (Organization.Type type : Organization.Type.values()) {
            if (type.getValue().equals(Organization.Type.Industry.getValue())) {
                organization.getUserAccountDirectory().createUserAccount(userName, password, p, new IndustryEmployeeRole());
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttachActionPerformed

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        String filename = file.getPath();
        txtAttach.setText(filename);
        ImageIcon icon = new ImageIcon(filename);
        labelPhoto.setIcon(icon);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAttachActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtENameActionPerformed

    private void txtuserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserNameActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtAttach;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtIName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTIN;
    private javax.swing.JTextField txtuserName;
    // End of variables declaration//GEN-END:variables
}
