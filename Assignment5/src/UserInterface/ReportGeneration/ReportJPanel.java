/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReportGeneration;

import Business.EmployeeDirectory;
import Business.MasterOrderCatalog;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import UserInterface.SalesManagerRole.SalesManagerWorkAreaJPanel;
import UserInterface.SupplierRole.LoginSupplier;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class ReportJPanel extends javax.swing.JPanel {
private EmployeeDirectory employeeDirectory;
    private MasterOrderCatalog moc;
    private JPanel userProcessContainer;
    /**
     * Creates new form ReportJPanel
     */
    public ReportJPanel(EmployeeDirectory employeeDirectory, MasterOrderCatalog moc,JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.employeeDirectory = employeeDirectory;
        this.moc = moc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBelow = new javax.swing.JButton();
        btnAboveTP = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBelow.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnBelow.setText("Product Below Target Price");
        btnBelow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBelow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBelowActionPerformed(evt);
            }
        });
        add(btnBelow, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, 32));

        btnAboveTP.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnAboveTP.setText("Product Above Target Price");
        btnAboveTP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAboveTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboveTPActionPerformed(evt);
            }
        });
        add(btnAboveTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 210, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBelowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBelowActionPerformed
        BelowTargetPriceJPanel smwajp = new BelowTargetPriceJPanel(employeeDirectory, userProcessContainer);
        userProcessContainer.add("smwajp", smwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBelowActionPerformed

    private void btnAboveTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboveTPActionPerformed
        AboveTargetPriceJPanel smwajp = new AboveTargetPriceJPanel(employeeDirectory, userProcessContainer);
        userProcessContainer.add("smwajp", smwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboveTPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboveTP;
    private javax.swing.JButton btnBelow;
    // End of variables declaration//GEN-END:variables
}