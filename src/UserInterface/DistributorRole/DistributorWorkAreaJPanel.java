/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DistributorRole;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import UserInterface.CDCRole.AddPHDJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class DistributorWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem business;
    Network n;
    UserAccount userAccount;


    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public DistributorWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem business,Network n,UserAccount userAccount) {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Manage Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, -1));

        jLabel1.setText("Distributor Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ManageDistributorRequestJPanel apjp = new ManageDistributorRequestJPanel(userProcessContainer,business,n,userAccount);
        userProcessContainer.add("ManageDistributorJPanel", apjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
