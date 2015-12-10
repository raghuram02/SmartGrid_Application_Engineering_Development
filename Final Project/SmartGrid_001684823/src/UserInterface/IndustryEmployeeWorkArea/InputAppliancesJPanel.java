/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.IndustryEmployeeWorkArea;

import Business.Appliances.Appliance;
import Business.Appliances.AppliancesDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.UpdateAppliancesWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class InputAppliancesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UpdateAppliancesWorkRequest request;
    private AppliancesDirectory appliancesDirectory;
    private Person person;
    private Appliance appliance;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;

    /**
     * Creates new form InputAppliancesJPanel
     */
    public InputAppliancesJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Appliance appliance, Person p) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.appliance = appliance;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
        this.person = p;
        System.out.println("person inside IA" + p);
        populateApplianceTable();
    }

    private void populateApplianceTable() {
        DefaultTableModel model = (DefaultTableModel) applianceTbl.getModel();
        model.setRowCount(0);
        for (Appliance a : person.getAppliancesDirectory().getApplianceList()) {
            Object[] row = new Object[2];
            row[0] = a.getApplianceName();
            row[1] = a.getQuantity();
            model.addRow(row);
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
        applianceTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        quantityComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        applianceComboBox1 = new javax.swing.JComboBox();
        backJButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("INPUT APPLIANCES");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        applianceTbl.setBackground(new java.awt.Color(102, 255, 51));
        applianceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appliance Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(applianceTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 730, 280));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Quantity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 30));

        quantityComboBox.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        quantityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", " ", " " }));
        quantityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityComboBoxActionPerformed(evt);
            }
        });
        add(quantityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 50, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Appliance Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 30));

        submitJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 90, 30));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 80, 30));

        applianceComboBox1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        applianceComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LightDutyAppliance", "MediumDutyAppliance", "HeavyDutyAppliance", " " }));
        applianceComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applianceComboBox1ActionPerformed(evt);
            }
        });
        add(applianceComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 200, 30));

        backJButton4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton4.setText("Request Updation of Appliances");
        backJButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton4ActionPerformed(evt);
            }
        });
        add(backJButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 250, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String applianceName = (String) applianceComboBox1.getSelectedItem();
        String quantity = (String) quantityComboBox.getSelectedItem();

        Appliance a = person.getAppliancesDirectory().createAppliance(applianceName);
        a.setApplianceName(applianceName);
        a.setQuantity(Integer.parseInt(quantity));
        populateApplianceTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void quantityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityComboBoxActionPerformed

    private void applianceComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applianceComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_applianceComboBox1ActionPerformed

    private void backJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton4ActionPerformed
        RequestAppliancesUpdationJPanel requestAppliancesUpdationJPanel = new RequestAppliancesUpdationJPanel(userProcessContainer, enterprise, userAccount, organization, person);
        userProcessContainer.add("requestAppliancesUpdationJPanel", requestAppliancesUpdationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox applianceComboBox1;
    private javax.swing.JTable applianceTbl;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox quantityComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
