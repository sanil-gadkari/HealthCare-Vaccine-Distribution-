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
import Business.WorkQueue.ProviderWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class PaytheBillJPanel extends javax.swing.JPanel {
     JPanel userProcessContainer;
     ProviderWorkRequest request1;
    /**
     * Creates new form PaytheBillJPanel
     */
    public PaytheBillJPanel(JPanel userProcessContainer, ProviderWorkRequest request1) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.request1 = request1;
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
        signjTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Digital Signature");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 41, -1, -1));
        add(signjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 38, 88, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (signjTextField1.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"enter your Signature");
             return;
        }
        
            request1.setMessage(signjTextField1.getText());
            request1.setStatus("Payment Complete");
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField signjTextField1;
    // End of variables declaration//GEN-END:variables
}
