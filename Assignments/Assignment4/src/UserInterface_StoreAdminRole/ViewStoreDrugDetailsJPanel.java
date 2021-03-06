/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_StoreAdminRole;

import UserInterface_Supplier.*;
import Business.Drug;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class ViewStoreDrugDetailsJPanel extends javax.swing.JPanel {

    private Drug d;
    private JPanel userProcessContainer;

    /**
     * Creates new form ViewDrugDetailsJPanel
     */
    public ViewStoreDrugDetailsJPanel(Drug d, JPanel userProcessContainer) {
        initComponents();
        this.d = d;
        this.userProcessContainer = userProcessContainer;
        txtName.setText(d.getDrugName());
        txtID.setText(d.getDrugID());
        txtPrice.setText(String.valueOf(d.getDrugPrice()));
        txtQuantity.setText(String.valueOf(d.getQuantity()));
        txtEDate.setText(d.getExpirationDate());
        txtMDate.setText(d.getManufactureDate());
        txtSideeffects.setText(d.getSideeffects());
        txtPurpose.setText(d.getPurpose());
        txtComposition.setText(d.getComposition());
        txtDescription.setText(d.getDescription());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtEDate = new javax.swing.JTextField();
        txtMDate = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtSideeffects = new javax.swing.JTextField();
        txtComposition = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 176, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 70, 30));

        jLabel1.setText("View Store Drug Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel4.setText("Description");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel6.setText("Drug ID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setText("List Price");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel8.setText("Quantity");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel9.setText("Expiration Date");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel10.setText("Drug Name");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel11.setText("Side effects");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel12.setText("Composition of antibiotics");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel13.setText("Drug purpose");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel14.setText("Manufacture Date ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, -1));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, -1));
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, -1));
        add(txtEDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, -1));
        add(txtMDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 140, -1));
        add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, -1));
        add(txtSideeffects, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 140, -1));
        add(txtComposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 140, -1));
        add(txtPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 140, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        txtName.setEnabled(true);
        txtID.setEnabled(true);
        txtPrice.setEnabled(true);
        txtDescription.setEnabled(true);
        txtQuantity.setEnabled(true);
        txtEDate.setEnabled(true);
        txtMDate.setEnabled(true);
        txtSideeffects.setEnabled(true);
        txtPurpose.setEnabled(true);
        txtComposition.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backAction();
    }

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageStoreDrugCatalogJPanel manageDrugCatalogJPanel = (ManageStoreDrugCatalogJPanel) component;
        manageDrugCatalogJPanel.populateTable();

        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Drug name");
            return;
        } else if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Drug ID");
            return;
        } else if (!txtPrice.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter the Price");
            return;
        } else if (txtDescription.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Description");
            return;
        } else if (txtSideeffects.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Side Effects");
            return;
        }
        if (txtEDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Expiry date");
            return;
        } else if (txtMDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Manufacture DAte");
            return;
        } else if (!txtQuantity.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter the Quantity");
            return;
        } else if (txtComposition.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Antibiotic's composition");
            return;
        } else if (txtPurpose.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Purpose of Drug ");
            return;
        }

        try {
            d.setDrugName(txtName.getText());
            d.setDrugID(txtID.getText());
            d.setDrugPrice(Integer.parseInt(txtPrice.getText()));
            d.setExpirationDate(txtEDate.getText());
            d.setQuantity(Integer.parseInt(txtQuantity.getText()));
            d.setDescription(txtDescription.getText());
            d.setSideeffects(txtSideeffects.getText());
            d.setComposition(txtComposition.getText());
            d.setManufactureDate(txtMDate.getText());
            d.setPurpose(txtPurpose.getText());
            JOptionPane.showMessageDialog(null, "Drug details saved successfully",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to save the Drug details",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        } finally {
            txtName.setEditable(false);
            txtID.setEditable(false);
            txtPrice.setEditable(false);
            txtDescription.setEditable(false);
            txtQuantity.setEditable(false);
            txtEDate.setEditable(false);
            txtMDate.setEditable(false);
            txtSideeffects.setEditable(false);
            txtPurpose.setEditable(false);
            txtComposition.setEditable(false);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);

        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtComposition;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSideeffects;
    // End of variables declaration//GEN-END:variables
}
