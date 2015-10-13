/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_CVSAdminRole;

import Business.Store;
import Business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class ManageCVSStoresJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StoreDirectory storeDirectory;

    /**
     * Creates new form ManageCVSStoresJPanel
     */
    public ManageCVSStoresJPanel(JPanel userProcessContainer, StoreDirectory storeDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory = storeDirectory;
          populateTable();
    }
     public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) storeTable.getModel();
        dtm.setRowCount(0);
        for (Store S : storeDirectory.getStoreDirectory()) {
            Object row[] = new Object[3];
            row[0] = S;
            row[1] = S.getStoreManager();
            row[2] = S.getStoreID();
            dtm.addRow(row);
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

        btnDeleteCVS = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnCreateCVS = new javax.swing.JButton();
        btnViewCVS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        storeTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeleteCVS.setText("Delete CVS stores");
        btnDeleteCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCVSActionPerformed(evt);
            }
        });
        add(btnDeleteCVS, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 216, 140, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        btnCreateCVS.setText("Create CVS stores");
        btnCreateCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCVSActionPerformed(evt);
            }
        });
        add(btnCreateCVS, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 59, 140, -1));

        btnViewCVS.setText("View CVS stores");
        btnViewCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCVSActionPerformed(evt);
            }
        });
        add(btnViewCVS, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 132, 140, -1));

        jLabel1.setText("Search by Store Manager");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 20));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 131, -1));

        storeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Store Name", "Store Manager", "Store ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storeTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 350, 110));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnCreateCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCVSActionPerformed
        CreateCVSStoresJPanel workArea = new CreateCVSStoresJPanel(storeDirectory, userProcessContainer);
        userProcessContainer.add("workArea", workArea);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);

// TODO add your handling code here:
    }//GEN-LAST:event_btnCreateCVSActionPerformed

    private void btnViewCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCVSActionPerformed

        int row = storeTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Store from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Store store = (Store) storeTable.getValueAt(row, 0);
        ViewCVSStoresJPanel VSD = new ViewCVSStoresJPanel(store, userProcessContainer);
        userProcessContainer.add("VSD", VSD);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
// TODO add your handling code here:
    }//GEN-LAST:event_btnViewCVSActionPerformed

    private void btnDeleteCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCVSActionPerformed
        int selectedRow = storeTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select store from the table!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete Store", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Store store = (Store) storeTable.getValueAt(selectedRow, 0);
                storeDirectory.deleteStore(store);
                populateTable();
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCVSActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String key = txtSearch.getText().trim();
        if (key == null || key.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please specify a name to search!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Store store = storeDirectory.searchStore(key);
            if (store != null) {
                ViewCVSStoresJPanel searchResult = new ViewCVSStoresJPanel(store, userProcessContainer);
                userProcessContainer.add("searchResult", searchResult);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "No matching names", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCVS;
    private javax.swing.JButton btnDeleteCVS;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewCVS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable storeTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
