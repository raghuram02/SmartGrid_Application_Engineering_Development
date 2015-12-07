/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityRuralHouseholdWorkArea;

import UserInterface.CommunityUrbanHouseholdWorkArea.*;
import UserInterface.IndustryEmployeeWorkArea.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class SensorInputJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    /**
     * Creates new form PayEBillJPanel
     */
    public SensorInputJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
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
        jLabel5 = new javax.swing.JLabel();
        heavySlider = new javax.swing.JSlider();
        lightSlider = new javax.swing.JSlider();
        submitJButton = new javax.swing.JButton();
        mediumSlider1 = new javax.swing.JSlider();
        backJButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        heavySlider1 = new javax.swing.JSlider();
        mediumSlider2 = new javax.swing.JSlider();
        mediumSlider3 = new javax.swing.JSlider();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SENSOR INPUT-RURAL AREA");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setText("Light Duty Appliances");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("Fridge");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Heater");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 40));

        heavySlider.setBackground(new java.awt.Color(255, 204, 102));
        heavySlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        heavySlider.setForeground(new java.awt.Color(0, 0, 102));
        heavySlider.setMajorTickSpacing(1000);
        heavySlider.setMaximum(5000);
        heavySlider.setMinimum(1000);
        heavySlider.setMinorTickSpacing(1000);
        heavySlider.setPaintLabels(true);
        heavySlider.setPaintTicks(true);
        heavySlider.setSnapToTicks(true);
        add(heavySlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 240, 40));

        lightSlider.setBackground(new java.awt.Color(255, 204, 102));
        lightSlider.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lightSlider.setForeground(new java.awt.Color(0, 0, 102));
        lightSlider.setMajorTickSpacing(10);
        lightSlider.setMinorTickSpacing(10);
        lightSlider.setPaintLabels(true);
        lightSlider.setPaintTicks(true);
        lightSlider.setSnapToTicks(true);
        lightSlider.setValue(0);
        add(lightSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 240, 40));

        submitJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 90, 30));

        mediumSlider1.setBackground(new java.awt.Color(255, 204, 102));
        mediumSlider1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mediumSlider1.setForeground(new java.awt.Color(0, 0, 102));
        mediumSlider1.setMajorTickSpacing(200);
        mediumSlider1.setMaximum(1000);
        mediumSlider1.setMinorTickSpacing(200);
        mediumSlider1.setPaintLabels(true);
        mediumSlider1.setPaintTicks(true);
        mediumSlider1.setSnapToTicks(true);
        add(mediumSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 240, 40));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("<< Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 80, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel6.setText("Television");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, 40));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setText("Blender");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel8.setText("Motor");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 40));

        heavySlider1.setBackground(new java.awt.Color(255, 204, 102));
        heavySlider1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        heavySlider1.setForeground(new java.awt.Color(0, 0, 102));
        heavySlider1.setMajorTickSpacing(1000);
        heavySlider1.setMaximum(5000);
        heavySlider1.setMinimum(1000);
        heavySlider1.setMinorTickSpacing(1000);
        heavySlider1.setPaintLabels(true);
        heavySlider1.setPaintTicks(true);
        heavySlider1.setSnapToTicks(true);
        add(heavySlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 240, 40));

        mediumSlider2.setBackground(new java.awt.Color(255, 204, 102));
        mediumSlider2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mediumSlider2.setForeground(new java.awt.Color(0, 0, 102));
        mediumSlider2.setMajorTickSpacing(200);
        mediumSlider2.setMaximum(1000);
        mediumSlider2.setMinorTickSpacing(200);
        mediumSlider2.setPaintLabels(true);
        mediumSlider2.setPaintTicks(true);
        mediumSlider2.setSnapToTicks(true);
        add(mediumSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 240, 40));

        mediumSlider3.setBackground(new java.awt.Color(255, 204, 102));
        mediumSlider3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mediumSlider3.setForeground(new java.awt.Color(0, 0, 102));
        mediumSlider3.setMajorTickSpacing(200);
        mediumSlider3.setMaximum(1000);
        mediumSlider3.setMinorTickSpacing(200);
        mediumSlider3.setPaintLabels(true);
        mediumSlider3.setPaintTicks(true);
        mediumSlider3.setSnapToTicks(true);
        add(mediumSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
int lowDuty = lightSlider.getValue();
int mediumDuty = heavySlider.getValue();
int heavyDuty = heavySlider.getValue();

        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JSlider heavySlider;
    private javax.swing.JSlider heavySlider1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSlider lightSlider;
    private javax.swing.JSlider mediumSlider1;
    private javax.swing.JSlider mediumSlider2;
    private javax.swing.JSlider mediumSlider3;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
