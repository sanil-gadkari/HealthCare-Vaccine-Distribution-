/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PHDRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Enterprise.SiteDirectoryEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanil
 */
public class ManageProviderWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    //private PHDEnterprise phdEnterprise;

    private Network n;
    private UserAccount userAccount;

    /**
     * Creates new form PHDProviderJPanel
     */
    public ManageProviderWorkRequestJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business, Network n, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.n = n;
        this.userAccount = userAccount;
//        populateTable();
        populateTable1();
    }
//   private void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) requestjTable1.getModel();
//
//        model.setRowCount(0);
//        for (Network n : business.getNetworkList()){
//            for (Enterprise en : n.getEnterpriseDirectory().getEnterpriseList()){
//               for(Organization organization : en.getOrganizationDirectory().getOrganizationList()){
//                  if (organization instanceof ProviderOrganization){
//                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
//                   
//            Object[] row = new Object[4];
//            row[0] = request;
//            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[2] = request.getSender().getEmployee().getName();
//            row[3] = request.getStatus();
//
//            model.addRow(row);
//            }  
//                  }
//               }
//            }
//        }
//    }

    private void populateTable1() {
        Organization org = null;
        DefaultTableModel model = (DefaultTableModel) tablelWrk1Request.getModel();

        model.setRowCount(0);
        for (Network n : business.getNetworkList()) {
            for (Enterprise en : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (en instanceof PHDEnterprise) {
                    for (Organization organization : en.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof ProviderOrganization) {
                            org = organization;
                            System.out.println(organization.getWorkQueue().getWorkRequestList());
                            for (WorkRequest request1 : organization.getWorkQueue().getWorkRequestList()) {
                                ProviderWorkRequest request = (ProviderWorkRequest) request1;

                                Object[] row = new Object[5];
                                row[0] = request;

                                row[1] = request.getSender().getEmployee().getName();
                                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                                row[3] = ((ProviderWorkRequest) request).getOrder();
                                row[4] = request.getStatus();

                                model.addRow(row);
                            }
                        }
                        if (org != null) {
                            break;
                        }
                    }

                }
                if (org != null) {
                    break;
                }
            }
            if (org != null) {
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

        sendRequestCDCjButton3 = new javax.swing.JButton();
        refreshjButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelWrk1Request = new javax.swing.JTable();
        assignTome2jButton2 = new javax.swing.JButton();
        process2jButton3 = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sendRequestCDCjButton3.setText("Send Request CDC");
        sendRequestCDCjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestCDCjButton3ActionPerformed(evt);
            }
        });
        add(sendRequestCDCjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 130, -1));

        refreshjButton1.setText("Refresh");
        refreshjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButton1ActionPerformed(evt);
            }
        });
        add(refreshjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        tablelWrk1Request.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Order No", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablelWrk1Request);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 140));

        assignTome2jButton2.setText("Assignto me");
        assignTome2jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTome2jButton2ActionPerformed(evt);
            }
        });
        add(assignTome2jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        process2jButton3.setText("Process");
        process2jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process2jButton3ActionPerformed(evt);
            }
        });
        add(process2jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButton1ActionPerformed
//populateTable(); 
        populateTable1();// TODO add your handling code here:
    }//GEN-LAST:event_refreshjButton1ActionPerformed

    private void sendRequestCDCjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestCDCjButton3ActionPerformed
        int selectedRow = tablelWrk1Request.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        ProviderWorkRequest request2 = (ProviderWorkRequest) tablelWrk1Request.getValueAt(selectedRow, 0);

        Enterprise ent = null;
        for (Enterprise ent1 : n.getEnterpriseDirectory().getEnterpriseList()) {
            if (ent1 instanceof PHDEnterprise) {
                ent = ent1;
                break;
            }
            
           
        }
        if (ent != null) {
            ent.getWorkQueue().getWorkRequestList().add(request2);
            //userAccount.getWorkQueue().getWorkRequestList();

        }
    }//GEN-LAST:event_sendRequestCDCjButton3ActionPerformed

    private void assignTome2jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTome2jButton2ActionPerformed
        int selectedRow = tablelWrk1Request.getSelectedRow();

        if (selectedRow < 0) {
             {
                 JOptionPane.showMessageDialog(null,"select a row");
            }
            return;
        }
        // UserAccount userAccount = null;
        WorkRequest request = (WorkRequest) tablelWrk1Request.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable1(); 
        {
             JOptionPane.showMessageDialog(null,"Succesfully assigned");
            
}
// TODO add your handling code here:
    }//GEN-LAST:event_assignTome2jButton2ActionPerformed

    private void process2jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process2jButton3ActionPerformed
        int selectedRow = tablelWrk1Request.getSelectedRow();
        
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a row");
            return;
        }
        else{
        ProviderWorkRequest request1 = (ProviderWorkRequest)tablelWrk1Request.getValueAt(selectedRow, 0);
        if(request1.getStatus().equals("Pending"))
        {
     request1.setStatus("Request Completed");
        request1.setStatus("Completed");
         request1.setStatus("Processing");
        PHDEnterprise ent = (PHDEnterprise) enterprise;
        request1.setPopulation(ent.getPopulation());
        ProcessRequestJPanel processCustomerWorkRequest = new ProcessRequestJPanel(userProcessContainer, request1);
        userProcessContainer.add("processWorkRequestJPanel", processCustomerWorkRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        populateTable1();
        }
        
        else{
                JOptionPane.showMessageDialog(null, "First assign the request");
                }
        }
        
        

        
       

        //ProviderWorkRequest request1 = (ProviderWorkRequest) tablelWrk1Request.getValueAt(selectedRow, 0);

//        request1.setStatus("Processing");
//        PHDEnterprise ent = (PHDEnterprise) enterprise;
//        request1.setPopulation(ent.getPopulation());
//        ProcessRequestJPanel processCustomerWorkRequest = new ProcessRequestJPanel(userProcessContainer, request1);
//        userProcessContainer.add("processWorkRequestJPanel", processCustomerWorkRequest);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);// TODO add your handling code here:
    }//GEN-LAST:event_process2jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTome2jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton process2jButton3;
    private javax.swing.JButton refreshjButton1;
    private javax.swing.JButton sendRequestCDCjButton3;
    private javax.swing.JTable tablelWrk1Request;
    // End of variables declaration//GEN-END:variables
}