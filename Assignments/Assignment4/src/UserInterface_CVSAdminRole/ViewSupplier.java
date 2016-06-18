package UserInterface_CVSAdminRole;

import Business.Drug;
import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewSupplier extends javax.swing.JPanel {

    private SupplierDirectory supplierDirectory;
    private JPanel userProcessContainer;
    private Supplier supplier;

    public ViewSupplier(Supplier supplier, JPanel userProcessContainer) {
        initComponents();
        this.supplier = supplier;
        this.userProcessContainer = userProcessContainer;
        txtName.setText(supplier.getSupplierName());
        populateTable();
    }

    public void populateTable() {
        
        DefaultTableModel dtm = (DefaultTableModel) drugTable.getModel();
        dtm.setRowCount(0);
        for (Drug d : supplier.getDrugList().getDrugList()) {
            Object row[] = new Object[3];
            row[0] = d;
            row[1] = d.getDrugID();
            row[2] = d.getDrugPrice();
            dtm.addRow(row);
        }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 276, -1, -1));

        drugTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug ID", "Drug Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable drugTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
