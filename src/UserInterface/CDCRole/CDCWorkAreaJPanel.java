/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CDCRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

import UserInterface.PHDRole.ProcessRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class CDCWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem business;
    Network n;
    UserAccount userAccount;

    /**
     * Creates new form CDCWorkAreaJPanel
     */
    public CDCWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem business,Network n,UserAccount userAccount) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business= business;
        this.n=n;
        this.userAccount=userAccount;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPHDjButton = new javax.swing.JButton();
        AddManufacturerjButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addPHDjButton.setText("Add PHD");
        addPHDjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPHDjButtonActionPerformed(evt);
            }
        });
        add(addPHDjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 143, 194, -1));

        AddManufacturerjButton.setText("Add Manufacturer");
        AddManufacturerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddManufacturerjButtonActionPerformed(evt);
            }
        });
        add(AddManufacturerjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 194, -1));

        jButton1.setText("New Manage PHD Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 194, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("                               CDC Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 360, 41));

        jButton2.setText("View Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 194, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addPHDjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPHDjButtonActionPerformed
 AddPHDJPanel apjp = new AddPHDJPanel(userProcessContainer, business,enterprise);
        userProcessContainer.add("AddPHDJPanel", apjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);       
    }//GEN-LAST:event_addPHDjButtonActionPerformed

    private void AddManufacturerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddManufacturerjButtonActionPerformed
       AddManuafacturerJPanel mmajp = new AddManuafacturerJPanel(userProcessContainer,enterprise,business);
        userProcessContainer.add("AddManufacturerJPanel", mmajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_AddManufacturerjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      NewMangePHDRequestJPanel mprjp = new NewMangePHDRequestJPanel(userProcessContainer,business,userAccount,n);
        userProcessContainer.add("processWorkRequestJPanel", mprjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ViewDistributorBillJPanel vdbjp = new ViewDistributorBillJPanel(userProcessContainer, business,enterprise,n,userAccount);
        userProcessContainer.add("AddDistributorJPanel", vdbjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddManufacturerjButton;
    private javax.swing.JButton addPHDjButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
