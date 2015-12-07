/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovernmentOwnedPublicOrganization;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.SmartGrid;
import Business.UserAccount.UserAccount;
import UserInterface.IndustryOrganizationAdminWorkArea.AppliancesUpdationWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class ServeConsumerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SmartGrid sg;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    private Person p;

    /**
     * Creates new form ServeConsumer
     */
    public ServeConsumerJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) consumerTbl.getModel();
        dtm.setRowCount(0);
        for (Person p : organization.getPersonDirectory().getPersonList()) {
            if (!(account.getPerson().getName() == p.getName())) {
                Object row[] = new Object[4];
                row[0] = p;
                row[1] = p.getIndustryName();
                row[2] = p.getCity();
                row[3] = p.getId();
                dtm.addRow(row);
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
        consumerTbl = new javax.swing.JTable();
        btnViewCDetails = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnAppliances = new javax.swing.JButton();
        payEBill = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Serve Consumer");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, 30));

        consumerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Industry", "City", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(consumerTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 540, 150));

        btnViewCDetails.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnViewCDetails.setText("Customer Details");
        btnViewCDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewCDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCDetailsActionPerformed(evt);
            }
        });
        add(btnViewCDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 160, 30));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 100, 30));

        btnAppliances.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnAppliances.setText("Appliances Status");
        btnAppliances.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAppliances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppliancesActionPerformed(evt);
            }
        });
        add(btnAppliances, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 160, 30));

        payEBill.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        payEBill.setText("Updation of Appliances");
        payEBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        payEBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payEBillActionPerformed(evt);
            }
        });
        add(payEBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCDetailsActionPerformed

        int row = consumerTbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Customer from the table",
                "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person) consumerTbl.getValueAt(row, 0);
        ViewCustomerDetailsJPanel VCD = new ViewCustomerDetailsJPanel(userProcessContainer, person, account, organization, enterprise);
        userProcessContainer.add("VCD", VCD);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCDetailsActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAppliancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppliancesActionPerformed
        int row = consumerTbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Customer from the table",
                "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person) consumerTbl.getValueAt(row, 0);
        AppliancesStatusJPanel asj = new AppliancesStatusJPanel(userProcessContainer, account, organization, enterprise,person);
        userProcessContainer.add("asj", asj);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAppliancesActionPerformed

    private void payEBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payEBillActionPerformed
        AppliancesUpdationWorkAreaJPanel appliancesUpdationWorkAreaJPanel = new AppliancesUpdationWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("AppliancesUpdationWorkAreaJPanel", appliancesUpdationWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_payEBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAppliances;
    private javax.swing.JButton btnViewCDetails;
    private javax.swing.JTable consumerTbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton payEBill;
    // End of variables declaration//GEN-END:variables
}
