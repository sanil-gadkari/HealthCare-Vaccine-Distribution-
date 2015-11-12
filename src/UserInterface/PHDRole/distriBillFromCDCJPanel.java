/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PHDRole;

import Business.EcoSystem;
import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.DistributorRole.DistriBtrProcessWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanil
 */
public class distriBillFromCDCJPanel extends javax.swing.JPanel {
 JPanel userProcessContainer;
    EcoSystem business;
    Network n;
    UserAccount userAccount;
    Enterprise enterprise;
    /**
     * Creates new form distriBillFromCDCJPanel
     */
    public distriBillFromCDCJPanel(JPanel userProcessContainer,Enterprise enterprise,EcoSystem business,Network n,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.n=n;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        populateTable();
    }
     private void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) billjTable1.getModel();
//        Enterprise ent1 = null;
//
//        model.setRowCount(0);
//        for (Network n : business.getNetworkList()){
//            for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()){
//               
//                  if (enterprise instanceof CDCEnterprise){
//                       ent1 = enterprise;
//                    for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
             
         DefaultTableModel model = (DefaultTableModel) billjTable1.getModel();
Enterprise ent1 = null;
        model.setRowCount(0);
        for (Network n : business.getNetworkList()){
            for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()){
               
                  if (enterprise instanceof CDCEnterprise){
                      ent1 = enterprise;
                    for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
                   
            Object[] row = new Object[5];
            row[0] = request;
           // row[] = request.getSender().getEmployee().getName();
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2]=  ((ProviderWorkRequest)request).getOrder();
            row[3]=((ProviderWorkRequest)request).getTotalPrice();
            row[4] = request.getStatus();

            model.addRow(row);
            } if (ent1 != null) {
                            break;
                        }  
                  
             
        }
                  if (ent1 != null) {
                            break;
                       }
            }
            if (ent1 != null) {
                            break;
                        }
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        billjTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Order", "Cost($) + CDC Commission", "Status"
            }
        ));
        jScrollPane1.setViewportView(billjTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 640, 155));

        jButton1.setText("Assign to me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 123, -1));

        jButton2.setText("Pay the Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = billjTable1.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        // UserAccount userAccount = null;
        WorkRequest request = (WorkRequest) billjTable1.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("To bee Paid");
        populateTable();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = billjTable1.getSelectedRow();

        if (selectedRow < 0){
            {
             JOptionPane.showMessageDialog(null,"select a row");
            }
            return;
            
            
            
            
        }

        ProviderWorkRequest request1 = (ProviderWorkRequest)billjTable1.getValueAt(selectedRow, 0);

        request1.setStatus("Processing");

        DistriBtrProcessWorkRequestJPanel processWorkRequestJPanel = new DistriBtrProcessWorkRequestJPanel(userProcessContainer, request1);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
populateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billjTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
