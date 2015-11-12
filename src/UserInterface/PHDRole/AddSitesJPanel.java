/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PHDRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.PHDEnterprise;
import Business.Enterprise.SiteDirectoryEnterprise;
import Business.Network.Network;
import Business.OrderItem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanil
 */
public class AddSitesJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    PHDEnterprise phdEnterprise;
    EcoSystem business;
    Network n;
    Enterprise enterprise;
    //SiteDirectoryEnterprise siteDirectoryEnterprise;
    
    
    /**
     * Creates new form AddSitesJPanel
     */
    public AddSitesJPanel(JPanel userProcessContainer, EcoSystem business,Network n,Enterprise enterprise,PHDEnterprise phdEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.phdEnterprise = phdEnterprise;
        this.n=n;
//        System.out.println("ent"+phdEnterprise.getName());
       this.business= business;
       this.enterprise=enterprise;
//        
//         
//       
    }
        private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)sitesjTable.getModel();
                
        dtm.setRowCount(0);
        
            for (SiteDirectoryEnterprise siteDirectoryEnterprise : phdEnterprise.getSiteDirectoryEnterprise()){
                
                
                Object[] row = new Object[3];
                row[0] = siteDirectoryEnterprise;
                
                row[1] = siteDirectoryEnterprise.getLocation();
                row[2] = siteDirectoryEnterprise.getType();
                
                dtm.addRow(row);
            }
//        
        }
    

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbSiteType = new javax.swing.JComboBox();
        locationjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sitesjTable = new javax.swing.JTable();
        submitjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        siteNamejTextField = new javax.swing.JTextField();
        addProviderjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Site Type");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel6.setText("Location");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        cmbSiteType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hospital", "Pharmacy", "Clinic" }));
        add(cmbSiteType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        locationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationjTextFieldActionPerformed(evt);
            }
        });
        add(locationjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, -1));

        sitesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Location", "Type"
            }
        ));
        jScrollPane1.setViewportView(sitesjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 120));

        submitjButton.setText("Submit");
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });
        add(submitjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, 20));

        jLabel1.setText("Site Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        siteNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteNamejTextFieldActionPerformed(evt);
            }
        });
        add(siteNamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 70, -1));

        addProviderjButton.setText("Add Provider");
        addProviderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProviderjButtonActionPerformed(evt);
            }
        });
        add(addProviderjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        jLabel2.setText("ADD Sites");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void locationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationjTextFieldActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
//       String location=locationjTextField.getText();       
//String name=siteNamejTextField.getText();
//SiteDirectoryEnterprise siteDirectoryEnterprise = new SiteDirectoryEnterprise(name,Enterprise.EnterpriseType.SiteDirectory );
//String type = (String)cmbSiteType.getSelectedItem();
//siteDirectoryEnterprise.setType(type);
//siteDirectoryEnterprise.setLocation(location);
//phdEnterprise.getSiteDirectoryEnterprise().add(siteDirectoryEnterprise);
//n.getEnterpriseDirectory().getEnterpriseList().add(phdEnterprise);
//populateTable(); // TODO add your handling code here:
 String name=siteNamejTextField.getText();
     String location=locationjTextField.getText();    
        SiteDirectoryEnterprise siteDirectoryEnterprise = new SiteDirectoryEnterprise(name,Enterprise.EnterpriseType.SiteDirectory );
        phdEnterprise.getSiteDirectoryEnterprise().add(siteDirectoryEnterprise);
        String type = (String)cmbSiteType.getSelectedItem();
        siteDirectoryEnterprise.setType(type);
        siteDirectoryEnterprise.setLocation(location);
        
        n.getEnterpriseDirectory().getEnterpriseList().add(phdEnterprise);
        populateTable();      
        
        
        
        
        
    }//GEN-LAST:event_submitjButtonActionPerformed

    private void siteNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteNamejTextFieldActionPerformed






    }//GEN-LAST:event_siteNamejTextFieldActionPerformed

    private void addProviderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProviderjButtonActionPerformed
        int selectedRow = sitesjTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row in the table");
            return;
        }
        SiteDirectoryEnterprise sDe = (SiteDirectoryEnterprise)sitesjTable.getValueAt(selectedRow, 0);
        
        AddNewProviderJPanel mmajp = new AddNewProviderJPanel(userProcessContainer,business,n,enterprise);
        userProcessContainer.add("AddProvidJPanel", mmajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_addProviderjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProviderjButton;
    private javax.swing.JComboBox cmbSiteType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationjTextField;
    private javax.swing.JTextField siteNamejTextField;
    private javax.swing.JTable sitesjTable;
    private javax.swing.JButton submitjButton;
    // End of variables declaration//GEN-END:variables
}
