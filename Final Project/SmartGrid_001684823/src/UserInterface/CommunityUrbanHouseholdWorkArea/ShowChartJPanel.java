/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityUrbanHouseholdWorkArea;

import UserInterface.CommunityRuralHouseholdWorkArea.*;
import Business.Organization.Organization;
import Business.Sensors.Sensor;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Raghuram
 */
public class ShowChartJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount ua;
    private Organization organization;
    float kwh = 0;
    float amount = 0;
    String applianceName;
    float powerConsumption = 0;
    float usageHours = 0;

    /**
     * Creates new form ShowChartJPanel
     */
    public ShowChartJPanel(JPanel userProcessContainer, UserAccount ua, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.organization = organization;
        createChart1();
        createChart2();
        createChart3();
        createChart4();

    }

    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Sensor s : organization.getSensorDirectory().getSensorList()) {
            if (s.getPerson().getName().equals(ua.getPerson().getName())) {

                applianceName = s.getAppliance().getApplianceName();

                kwh = (s.getValue() * s.getHours() * s.getAppliance().getQuantity()) / 1000;
                amount = (float) (kwh * (0.23));
                dataset.addValue(amount, applianceName, applianceName);

            }
        }
        return dataset;
    }

    private CategoryDataset createDataset1() {

        //  final DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        final DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        for (Sensor s : organization.getSensorDirectory().getSensorList()) {
            if (s.getPerson().getName().equals(ua.getPerson().getName())) {

                applianceName = s.getAppliance().getApplianceName();

                kwh = (s.getValue() * s.getHours() * s.getAppliance().getQuantity()) / 1000;
                amount = (float) (kwh * (0.23));

                dataset1.addValue(kwh, String.valueOf(amount), String.valueOf(amount));

            }
        }
        return dataset1;
    }

    private CategoryDataset createDataset2() {

        //  final DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        final DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        for (Sensor s : organization.getSensorDirectory().getSensorList()) {
            if (s.getPerson().getName().equals(ua.getPerson().getName())) {

                applianceName = s.getAppliance().getApplianceName();
                powerConsumption = s.getValue();

                dataset2.addValue(powerConsumption, applianceName, applianceName);

            }
        }
        return dataset2;
    }

    private CategoryDataset createDataset3() {

        //  final DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        final DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();
        for (Sensor s : organization.getSensorDirectory().getSensorList()) {
            if (s.getPerson().getName().equals(ua.getPerson().getName())) {

                applianceName = s.getAppliance().getApplianceName();
                usageHours = s.getHours();

                dataset3.addValue(usageHours, applianceName, applianceName);

            }
        }
        return dataset3;
    }

    private void createChart1() {
        System.out.println("Inside create chart fucntion");
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
                "  Amount Distribution (Appliance Wise) ", // chart title
                "Appliance", // domain axis label
                "Amount", // range axis label
                createDataset(), // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips?
                false // URLs?
        );

        ChartPanel chart1 = new ChartPanel(chart);
        chartPanel1.removeAll();
        chartPanel1.add(chart1, BorderLayout.CENTER);
        chartPanel1.validate();

    }

    private void createChart2() {
        System.out.println("Inside create chart fucntion");
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
                "  Cost Per Unit ", // chart title
                "Amount", // domain axis label
                "Kwh", // range axis label
                createDataset1(), // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips?
                false // URLs?
        );

        ChartPanel chart2 = new ChartPanel(chart);
        chartPanel2.removeAll();
        chartPanel2.add(chart2, BorderLayout.CENTER);
        chartPanel2.validate();

    }

    private void createChart3() {
        System.out.println("Inside create chart fucntion");
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
                "  Power Consumption of each Appliance ", // chart title
                "Appliance ", // domain axis label
                "Power Consumption", // range axis label
                createDataset2(), // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips?
                false // URLs?
        );

        ChartPanel chart3 = new ChartPanel(chart);
        chartPanel3.removeAll();
        chartPanel3.add(chart3, BorderLayout.CENTER);
        chartPanel3.validate();

    }

    private void createChart4() {
        System.out.println("Inside create chart fucntion");
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
                "  Hours of appliance usage ", // chart title
                "Appliance", // domain axis label
                "Hours of usage", // range axis label
                createDataset3(), // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips?
                false // URLs?
        );

        ChartPanel chart4 = new ChartPanel(chart);
        chartPanel4.removeAll();
        chartPanel4.add(chart4, BorderLayout.CENTER);
        chartPanel4.validate();

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
        backJButton3 = new javax.swing.JButton();
        chartPanel1 = new javax.swing.JPanel();
        chartPanel4 = new javax.swing.JPanel();
        chartPanel3 = new javax.swing.JPanel();
        chartPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Daily Usage Chart");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("<< Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 30));

        chartPanel1.setLayout(new java.awt.BorderLayout());
        add(chartPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 210));

        chartPanel4.setLayout(new java.awt.BorderLayout());
        add(chartPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 450, 220));

        chartPanel3.setLayout(new java.awt.BorderLayout());
        add(chartPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 450, 220));

        chartPanel2.setLayout(new java.awt.BorderLayout());
        add(chartPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 450, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JPanel chartPanel1;
    private javax.swing.JPanel chartPanel2;
    private javax.swing.JPanel chartPanel3;
    private javax.swing.JPanel chartPanel4;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
