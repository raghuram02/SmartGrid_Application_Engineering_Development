package UserInterface_Supplier;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class LoginSupplier extends javax.swing.JPanel {
     private SupplierDirectory supplierDirectory;
      private Supplier supplier;
  private JPanel userProcessContainer;
    public LoginSupplier(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        initComponents();
        this.supplierDirectory = supplierDirectory;
        this.userProcessContainer = userProcessContainer;
        
        supplierComboBox.removeAllItems();
        for(Supplier s : supplierDirectory.getSupplierDirectory()){
            supplierComboBox.addItem(s);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Supplier Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        btnFind.setText("GO>>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Supplier Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        supplierComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });
        add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
Supplier s = (Supplier) supplierComboBox.getSelectedItem();
ManageDrugCatalogJPanel supplierWorkArea = new ManageDrugCatalogJPanel(s,userProcessContainer);
        userProcessContainer.add("supplierWorkArea", supplierWorkArea);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed

    }//GEN-LAST:event_supplierComboBoxActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
    
}
