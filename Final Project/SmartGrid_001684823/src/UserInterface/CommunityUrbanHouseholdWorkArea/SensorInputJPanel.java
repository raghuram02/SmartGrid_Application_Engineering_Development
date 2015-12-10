/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityUrbanHouseholdWorkArea;

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
        submitJButton = new javax.swing.JButton();
        backJButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        heaterSlider = new javax.swing.JSlider();
        lightSlider = new javax.swing.JSlider();
        fridgeSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        computerSlider = new javax.swing.JSlider();
        televisionSlider = new javax.swing.JSlider();
        blenderSlider = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        otherSlider = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        acSlider = new javax.swing.JSlider();
        wmSlider = new javax.swing.JSlider();
        ovenSlider = new javax.swing.JSlider();
        hourSpinner2 = new javax.swing.JSpinner();
        hourSpinner1 = new javax.swing.JSpinner();
        hourSpinner = new javax.swing.JSpinner();
        hourSpinner3 = new javax.swing.JSpinner();
        hourSpinner4 = new javax.swing.JSpinner();
        hourSpinner5 = new javax.swing.JSpinner();
        hourSpinner6 = new javax.swing.JSpinner();
        hourSpinner7 = new javax.swing.JSpinner();
        hourSpinner8 = new javax.swing.JSpinner();
        hourSpinner9 = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SENSOR INPUT");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        submitJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 90, 30));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("<< Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 80, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Light Duty Appliances");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("Fridge");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Heater");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 40));

        heaterSlider.setBackground(new java.awt.Color(255, 204, 102));
        heaterSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        heaterSlider.setForeground(new java.awt.Color(0, 0, 102));
        heaterSlider.setMajorTickSpacing(1000);
        heaterSlider.setMaximum(5000);
        heaterSlider.setMinimum(1000);
        heaterSlider.setMinorTickSpacing(1000);
        heaterSlider.setPaintLabels(true);
        heaterSlider.setPaintTicks(true);
        heaterSlider.setSnapToTicks(true);
        add(heaterSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 240, 40));

        lightSlider.setBackground(new java.awt.Color(255, 204, 102));
        lightSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lightSlider.setForeground(new java.awt.Color(0, 0, 102));
        lightSlider.setMajorTickSpacing(10);
        lightSlider.setMinorTickSpacing(10);
        lightSlider.setPaintLabels(true);
        lightSlider.setPaintTicks(true);
        lightSlider.setSnapToTicks(true);
        lightSlider.setValue(0);
        add(lightSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 240, 40));

        fridgeSlider.setBackground(new java.awt.Color(255, 204, 102));
        fridgeSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        fridgeSlider.setForeground(new java.awt.Color(0, 0, 102));
        fridgeSlider.setMajorTickSpacing(200);
        fridgeSlider.setMaximum(1000);
        fridgeSlider.setMinorTickSpacing(200);
        fridgeSlider.setPaintLabels(true);
        fridgeSlider.setPaintTicks(true);
        fridgeSlider.setSnapToTicks(true);
        add(fridgeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel6.setText("Television");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, 40));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setText("Blender");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel8.setText("Computer");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, 40));

        computerSlider.setBackground(new java.awt.Color(255, 204, 102));
        computerSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        computerSlider.setForeground(new java.awt.Color(0, 0, 102));
        computerSlider.setMajorTickSpacing(1000);
        computerSlider.setMaximum(5000);
        computerSlider.setMinimum(1000);
        computerSlider.setMinorTickSpacing(1000);
        computerSlider.setPaintLabels(true);
        computerSlider.setPaintTicks(true);
        computerSlider.setSnapToTicks(true);
        add(computerSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 240, 40));

        televisionSlider.setBackground(new java.awt.Color(255, 204, 102));
        televisionSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        televisionSlider.setForeground(new java.awt.Color(0, 0, 102));
        televisionSlider.setMajorTickSpacing(200);
        televisionSlider.setMaximum(1000);
        televisionSlider.setMinorTickSpacing(200);
        televisionSlider.setPaintLabels(true);
        televisionSlider.setPaintTicks(true);
        televisionSlider.setSnapToTicks(true);
        add(televisionSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 240, 40));

        blenderSlider.setBackground(new java.awt.Color(255, 204, 102));
        blenderSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        blenderSlider.setForeground(new java.awt.Color(0, 0, 102));
        blenderSlider.setMajorTickSpacing(200);
        blenderSlider.setMaximum(1000);
        blenderSlider.setMinorTickSpacing(200);
        blenderSlider.setPaintLabels(true);
        blenderSlider.setPaintTicks(true);
        blenderSlider.setSnapToTicks(true);
        add(blenderSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 240, 40));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel9.setText("Oven");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 40));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel10.setText("Other Pluggable Appliances");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, 40));

        otherSlider.setBackground(new java.awt.Color(255, 204, 102));
        otherSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        otherSlider.setForeground(new java.awt.Color(0, 0, 102));
        otherSlider.setMajorTickSpacing(200);
        otherSlider.setMaximum(1000);
        otherSlider.setMinorTickSpacing(200);
        otherSlider.setPaintLabels(true);
        otherSlider.setPaintTicks(true);
        otherSlider.setSnapToTicks(true);
        add(otherSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 240, 40));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel11.setText("Washing Machine");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, 40));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel12.setText("Air Conditioner");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, 40));

        acSlider.setBackground(new java.awt.Color(255, 204, 102));
        acSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        acSlider.setForeground(new java.awt.Color(0, 0, 102));
        acSlider.setMajorTickSpacing(1000);
        acSlider.setMaximum(5000);
        acSlider.setMinimum(1000);
        acSlider.setMinorTickSpacing(1000);
        acSlider.setPaintLabels(true);
        acSlider.setPaintTicks(true);
        acSlider.setSnapToTicks(true);
        add(acSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 240, 40));

        wmSlider.setBackground(new java.awt.Color(255, 204, 102));
        wmSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        wmSlider.setForeground(new java.awt.Color(0, 0, 102));
        wmSlider.setMajorTickSpacing(200);
        wmSlider.setMaximum(1000);
        wmSlider.setMinorTickSpacing(200);
        wmSlider.setPaintLabels(true);
        wmSlider.setPaintTicks(true);
        wmSlider.setSnapToTicks(true);
        add(wmSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 240, 40));

        ovenSlider.setBackground(new java.awt.Color(255, 204, 102));
        ovenSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        ovenSlider.setForeground(new java.awt.Color(0, 0, 102));
        ovenSlider.setMajorTickSpacing(200);
        ovenSlider.setMaximum(1000);
        ovenSlider.setMinorTickSpacing(200);
        ovenSlider.setPaintLabels(true);
        ovenSlider.setPaintTicks(true);
        ovenSlider.setSnapToTicks(true);
        add(ovenSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 240, 40));
        add(hourSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 40));
        add(hourSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 50, 40));
        add(hourSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 50, 40));
        add(hourSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 50, 40));
        add(hourSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 50, 40));
        add(hourSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 50, 40));
        add(hourSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 50, 40));
        add(hourSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 50, 40));
        add(hourSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 50, 40));
        add(hourSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 50, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        int lowDutySensor = lightSlider.getValue();
        int tvSensor = televisionSlider.getValue();
        int blenderSensor = blenderSlider.getValue();
        int computerSensor = computerSlider.getValue();
        int fridgeSensor = fridgeSlider.getValue();
        int heaterSensor = heaterSlider.getValue();
        int acSensor = acSlider.getValue();
        int otherSensor = otherSlider.getValue();
        int wmSensor = wmSlider.getValue();
        int ovenSensor = ovenSlider.getValue();
        int hours = (Integer) hourSpinner.getValue();
        int hours1 = (Integer) hourSpinner1.getValue();
        int hours2 = (Integer) hourSpinner2.getValue();
        int hours3 = (Integer) hourSpinner3.getValue();
        int hours4 = (Integer) hourSpinner4.getValue();
        int hours5 = (Integer) hourSpinner5.getValue();
        int hours6 = (Integer) hourSpinner6.getValue();
        int hours7 = (Integer) hourSpinner7.getValue();
        int hours8 = (Integer) hourSpinner8.getValue();
        int hours9 = (Integer) hourSpinner9.getValue();

        for (Person p : organization.getPersonDirectory().getPersonList()) {
            if (p.getName().equals(account.getPerson().getName())) {
                for (Appliance a : p.getAppliancesDirectory().getApplianceList()) {
                    if (a.getApplianceName().equals(Appliance.ApplianceType.LightDutyAppliance.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Low duty sensor");
                        s.setAppliance(a);
                        s.setValue(lowDutySensor);
                        s.setPerson(p);
                        s.setHours(hours);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.TV.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("TV");
                        s.setAppliance(a);
                        s.setValue(tvSensor);
                        s.setPerson(p);
                        s.setHours(hours5);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.Blender.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Blender");
                        s.setAppliance(a);
                        s.setValue(blenderSensor);
                        s.setPerson(p);
                        s.setHours(hours6);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.Oven.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Oven");
                        s.setAppliance(a);
                        s.setValue(ovenSensor);
                        s.setPerson(p);
                        s.setHours(hours3);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.Fridge.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Fridge");
                        s.setAppliance(a);
                        s.setValue(fridgeSensor);
                        s.setPerson(p);
                        s.setHours(hours1);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.Heater.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Heater");
                        s.setAppliance(a);
                        s.setValue(heaterSensor);
                        s.setPerson(p);
                        s.setHours(hours2);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.AirConditioner.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("AirConditioner");
                        s.setAppliance(a);
                        s.setValue(acSensor);
                        s.setPerson(p);
                        s.setHours(hours9);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.OtherPluggableDevices.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("OtherPluggableDevices");
                        s.setAppliance(a);
                        s.setValue(otherSensor);
                        s.setPerson(p);
                        s.setHours(hours4);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.WashingMachine.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("WashingMachine");
                        s.setAppliance(a);
                        s.setValue(wmSensor);
                        s.setPerson(p);
                        s.setHours(hours8);
                    }
                    if (a.getApplianceName().equals(Appliance.ApplianceType.Computer.getValue())) {
                        Sensor s = organization.getSensorDirectory().createSensor("Computer");
                        s.setAppliance(a);
                        s.setValue(computerSensor);
                        s.setPerson(p);
                        s.setHours(hours7);
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
    private javax.swing.JSlider acSlider;
    private javax.swing.JButton backJButton3;
    private javax.swing.JSlider blenderSlider;
    private javax.swing.JSlider computerSlider;
    private javax.swing.JSlider fridgeSlider;
    private javax.swing.JSlider heaterSlider;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JSpinner hourSpinner1;
    private javax.swing.JSpinner hourSpinner2;
    private javax.swing.JSpinner hourSpinner3;
    private javax.swing.JSpinner hourSpinner4;
    private javax.swing.JSpinner hourSpinner5;
    private javax.swing.JSpinner hourSpinner6;
    private javax.swing.JSpinner hourSpinner7;
    private javax.swing.JSpinner hourSpinner8;
    private javax.swing.JSpinner hourSpinner9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider lightSlider;
    private javax.swing.JSlider otherSlider;
    private javax.swing.JSlider ovenSlider;
    private javax.swing.JButton submitJButton;
    private javax.swing.JSlider televisionSlider;
    private javax.swing.JSlider wmSlider;
    // End of variables declaration//GEN-END:variables
}