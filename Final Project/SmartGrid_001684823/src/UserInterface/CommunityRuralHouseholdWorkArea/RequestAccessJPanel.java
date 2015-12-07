/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityRuralHouseholdWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RequestAccessWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class RequestAccessJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private Person person;
    private UserAccount account;

    /**
     * Creates new form RequestAccessJPanel
     */
    public RequestAccessJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.account = account;
        this.person = person;
        populateRequestTable();
    }

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request instanceof RequestAccessWorkRequest) {
                Object[] row = new Object[8];
                row[0] = ((RequestAccessWorkRequest) request).getRequestDate();
                row[1] = request.getMessage();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
                row[3] = request.getStatus();
                String result = ((WorkRequest) request).getResult();
                row[4] = result == null ? "Waiting" : result;
                row[5] = (request).getSender().getPerson().getName();
                row[6] = ((RequestAccessWorkRequest) request).getId();
                row[7] = request.getResolveDate();

                model.addRow(row);
            }
        }
//        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAccessRequest = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        backJButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("REQUEST ACCESS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Message", "Receiver", "Status", "Result", "Name", "ID", "Resolve Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 630, 120));

        btnAccessRequest.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnAccessRequest.setText("Request for Access");
        btnAccessRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAccessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessRequestActionPerformed(evt);
            }
        });
        add(btnAccessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 160, 30));

        backJButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton2.setText("Refresh");
        backJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        add(backJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 30));

        backJButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton3.setText("<< Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessRequestActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PlaceRequestJPanel", new PlaceRequestJPanel(userProcessContainer, enterprise, account, organization, person));
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccessRequestActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        populateRequestTable();
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton backJButton3;
    private javax.swing.JButton btnAccessRequest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
