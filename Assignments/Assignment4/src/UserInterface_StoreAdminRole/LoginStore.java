package UserInterface_StoreAdminRole;

import Business.Store;
import Business.StoreDirectory;
import Business.Supplier;
import Business.SupplierDirectory;
import UserInterface_CVSAdminRole.ViewCVSStoresJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class LoginStore extends javax.swing.JPanel {
     private SupplierDirectory supplierDirectory;
    private StoreDirectory storeDirectory;  
  private JPanel userProcessContainer;
    public LoginStore(JPanel userProcessContainer,StoreDirectory storeDirectory, SupplierDirectory supplierDirectory) {
        initComponents();
        this.storeDirectory = storeDirectory;
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        
        storeComboBox.removeAllItems();
        for(Store s : storeDirectory.getStoreDirectory()){
            storeComboBox.addItem(s);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        storeComboBox = new javax.swing.JComboBox();
        btnViewInventory = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Store Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        btnFind.setText("GO>>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Store Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        storeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        storeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeComboBoxActionPerformed(evt);
            }
        });
        add(storeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 30));

        btnViewInventory.setText("View Inventory");
        btnViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInventoryActionPerformed(evt);
            }
        });
        add(btnViewInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
Store s = (Store) storeComboBox.getSelectedItem();
ManageStoreDrugCatalogJPanel storeWorkArea = new ManageStoreDrugCatalogJPanel(s,userProcessContainer, supplierDirectory);
        userProcessContainer.add("storeWorkArea", storeWorkArea);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed

    private void storeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeComboBoxActionPerformed

     
    }//GEN-LAST:event_storeComboBoxActionPerformed

    private void btnViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInventoryActionPerformed
Store s = (Store) storeComboBox.getSelectedItem();
        ViewInventoryJPanel VSD = new ViewInventoryJPanel(s, userProcessContainer);
        userProcessContainer.add("VSD", VSD);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnViewInventoryActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnViewInventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox storeComboBox;
    // End of variables declaration//GEN-END:variables
    
}
