/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_CVSAdminRole;

import Business.Store;
import Business.StoreDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class CreateCVSStoresJPanel extends javax.swing.JPanel {

    private StoreDirectory storeDirectory;
    private JPanel userProcessContainer;

    /**
     * Creates new form CreateCVSStoresJPanel
     */
    public CreateCVSStoresJPanel(StoreDirectory storeDirectory, JPanel userProcessContainer) {
        initComponents();
        this.storeDirectory = storeDirectory;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        txtSID = new javax.swing.JTextField();
        txtSLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSZipcode = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSManager = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CVS Stores");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setText("Store Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 20));

        jLabel3.setText("Store ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 20));

        jLabel4.setText("Location");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 20));
        add(txtSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, -1));
        add(txtSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 100, -1));
        add(txtSLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 100, -1));

        jLabel5.setText("Zip Code");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));
        add(txtSZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 100, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel6.setText("Store Manager");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 20));
        add(txtSManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 100, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (txtSName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Store name");
            return;
        } else if (txtSID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Store ID");
            return;
        } else if (txtSLocation.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid Store Location");
            return;

        } else if (txtSManager.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a valid store Manager");
            return;
        } else if (!txtSZipcode.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid zipcode");
            return;
        }
//        try {
        Store store = storeDirectory.addStore();
        store.setStoreName(txtSName.getText());
        store.setStoreID(txtSID.getText());
        store.setStoreLocation(txtSLocation.getText());
        store.setStoreManager(txtSManager.getText());
        store.setZipcode(Integer.parseInt(txtSZipcode.getText()));

        JOptionPane.showMessageDialog(null, "Store created successfully!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Please enter the details!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
//        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        back();

    }

    private void back() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component manageCVSStoresJPanel = componentArray[componentArray.length - 1];
        ManageCVSStoresJPanel manage = (ManageCVSStoresJPanel) manageCVSStoresJPanel;
        manage.populateTable();
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtSID;
    private javax.swing.JTextField txtSLocation;
    private javax.swing.JTextField txtSManager;
    private javax.swing.JTextField txtSName;
    private javax.swing.JTextField txtSZipcode;
    // End of variables declaration//GEN-END:variables
}
