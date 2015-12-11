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
import Business.Sensors.Sensor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.UpdateAppliancesWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class GenerateConsumptionJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UpdateAppliancesWorkRequest request;
    private AppliancesDirectory appliancesDirectory;
    private Person person;
    private Appliance appliance;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;

    /**
     * Creates new form GenerateConsumptionJPanel
     */
    public GenerateConsumptionJPanel(JPanel userProcessContainer, UserAccount account, Organization organization) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = account;
        populateSensorTable();
        calculateTotalAmount();
    }

    public void calculateTotalAmount() {
        float sum = 0;
        for (Sensor s : organization.getSensorDirectory().getSensorList()) {
            System.out.println("sensor s" + s.getSensorName());
            if (s.getPerson().getName().equals(userAccount.getPerson().getName())) {

                sum = sum + s.getAmt();

            }
            s.getPerson().setTotalAmount(sum);
            tAmount.setText(String.valueOf(s.getPerson().getTotalAmount()));
        }

    }

    private void populateSensorTable() {
        float kwh = 0;
        float amt = 0;
        DefaultTableModel model = (DefaultTableModel) sensorTbl.getModel();
        model.setRowCount(0);
        for (Sensor s : organization.getSensorDirectory().getSensorList()) {
            if (s.getPerson().getName().equals(userAccount.getPerson().getName())) {
                Object[] row = new Object[6];
                row[0] = s.getAppliance().getApplianceName();
                row[1] = s.getValue();
                row[2] = s.getAppliance().getQuantity();
                row[3] = s.getHours();
                row[4] = kwh = (s.getValue() * s.getHours() * s.getAppliance().getQuantity()) / 1000;
                amt = (float) (kwh * (0.23));
                row[5] = amt;
                s.setAmt(amt);
                s.setUnit(kwh);
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sensorTbl = new javax.swing.JTable();
        backJButton3 = new javax.swing.JButton();
        backJButton4 = new javax.swing.JButton();
        tAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("GENERATE CONSUMPTION");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        sensorTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appliance", "Power Consumption(Watts)", "Quantity", "Hours of Usage", "Units in KWH", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sensorTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 750, 300));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("Show Chart");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 120, 30));

        backJButton4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton4.setText("<< Back");
        backJButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton4ActionPerformed(evt);
            }
        });
        add(backJButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 30));

        tAmount.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        tAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tAmount.setEnabled(false);
        add(tAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 140, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Total Amount");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        ShowChartJPanel scj = new ShowChartJPanel(userProcessContainer, userAccount, organization);
        userProcessContainer.add("scj", scj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void backJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton4ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JButton backJButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sensorTbl;
    private javax.swing.JTextField tAmount;
    // End of variables declaration//GEN-END:variables
}
