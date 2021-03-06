/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovernmentOwnedMaintenanceEmployeeWorkAreaJPanel;

import Business.Appliances.Appliance;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Sensors.Sensor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class SensorInputJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Appliance appliance;
    private Organization organization;

    /**
     * Creates new form PayEBillJPanel
     */
    public SensorInputJPanel(JPanel userProcessContainer, UserAccount account, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lightSlider = new javax.swing.JSlider();
        submitJButton = new javax.swing.JButton();
        mediumSlider = new javax.swing.JSlider();
        backJButton3 = new javax.swing.JButton();
        hourSpinner1 = new javax.swing.JSpinner();
        hourSpinner = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SENSOR INPUT");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Light Duty Appliances");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 50));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("Medium Duty Appliances");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 50));

        lightSlider.setBackground(new java.awt.Color(255, 204, 102));
        lightSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lightSlider.setForeground(new java.awt.Color(0, 0, 102));
        lightSlider.setMajorTickSpacing(10);
        lightSlider.setMinorTickSpacing(10);
        lightSlider.setPaintLabels(true);
        lightSlider.setPaintTicks(true);
        lightSlider.setSnapToTicks(true);
        lightSlider.setValue(0);
        add(lightSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 360, -1));

        submitJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 90, 30));

        mediumSlider.setBackground(new java.awt.Color(255, 204, 102));
        mediumSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mediumSlider.setForeground(new java.awt.Color(0, 0, 102));
        mediumSlider.setMajorTickSpacing(200);
        mediumSlider.setMaximum(1000);
        mediumSlider.setMinorTickSpacing(200);
        mediumSlider.setPaintLabels(true);
        mediumSlider.setPaintTicks(true);
        mediumSlider.setSnapToTicks(true);
        add(mediumSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 360, -1));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("<< Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 30));
        add(hourSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 60, 50));
        add(hourSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 60, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        int lowDuty = lightSlider.getValue();
        int mediumDuty = mediumSlider.getValue();
        int hours = (Integer) hourSpinner.getValue();
        int hours1 = (Integer) hourSpinner1.getValue();
        if (hours <= 0) {
            JOptionPane.showMessageDialog(this, "Enter a valid input", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (hours1 <= 0) {
            JOptionPane.showMessageDialog(this, "Enter a valid input", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Person p : organization.getPersonDirectory().getPersonList()) {
            if (p.getName().equals(account.getPerson().getName())) {
                for (Appliance a : p.getAppliancesDirectory().getApplianceList()) {
                    if (a.getApplianceName().equals(Appliance.ApplianceType.LightDutyAppliance.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Low duty sensor");
                        s.setAppliance(a);
                        s.setValue(lowDuty);
                        s.setPerson(p);
                        s.setHours(hours);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.MediumDutyAppliance.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Medium duty sensor");
                        s.setAppliance(a);
                        s.setValue(mediumDuty);
                        s.setPerson(p);
                        s.setHours(hours1);
                    }

                }
            }
        }
        JOptionPane.showMessageDialog(null, "Sensor created successfully!!!", "Information", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JSpinner hourSpinner1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider lightSlider;
    private javax.swing.JSlider mediumSlider;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
