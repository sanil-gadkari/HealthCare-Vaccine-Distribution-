/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.ManufacturerRole;

import Business.EcoSystem;
import Business.Enterprise.ManufacturerEnterprise;
import Business.ProductVaccine;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

            
/**
 *
 * @author sanil
 */
public class TestPanel extends javax.swing.JPanel {

 JPanel userProcessContainer;
    ManufacturerEnterprise manufacturerEnterprise;
    EcoSystem business;
    /**
     * Creates new form TestPanel
     */
    public TestPanel(JPanel userProcessContainer,ManufacturerEnterprise manufacturerEnterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        this.manufacturerEnterprise=manufacturerEnterprise;
        this.business=business;
    }
     private void refreshTable() {
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(ProductVaccine p : manufacturerEnterprise.getProductCatalog().getProductCatalog()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getVaccineNumber();
            row[2] = p.getPrice();
            model.addRow(row);
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

        viewPButton = new javax.swing.JButton();
        createPButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        delButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewPButton.setText("View Product Detail >>");
        viewPButton.setSelected(true);
        viewPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPButtonActionPerformed(evt);
            }
        });
        add(viewPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 291, 220, -1));

        createPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createPButton.setText("Create New Product >>");
        createPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPButtonActionPerformed(evt);
            }
        });
        add(createPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 331, -1, -1));

        refreshButton.setText("Refresh");
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        refreshButton.setMargin(new java.awt.Insets(2, 1, 2, 1));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 71, 80, -1));

        delButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton5.setText("Delete Product(s)");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });
        add(delButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 291, 190, -1));

        productCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Product ID", "Price"
            }
        ));
        jScrollPane1.setViewportView(productCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 101, 500, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void viewPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPButtonActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();

        if(row<0) {
            return;
        }
        ProductVaccine p = (ProductVaccine)productCatalog.getValueAt(row, 0);
        ViewProductDetailsJPanel vpdjp = new ViewProductDetailsJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanelSupplier", vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPButtonActionPerformed

    private void createPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPButtonActionPerformed
        CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessContainer, manufacturerEnterprise);
        userProcessContainer.add("CreateNewProductJPanel",cnpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed
        // TODO add your handling code here:
        int row = productCatalog.getSelectedRow();
        if(row<0) {
            return;
        }
        ProductVaccine p = (ProductVaccine)productCatalog.getValueAt(row, 0);
        manufacturerEnterprise.getProductCatalog().removeProduct(p);
        refreshTable();
    }//GEN-LAST:event_delButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPButton;
    private javax.swing.JButton delButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton viewPButton;
    // End of variables declaration//GEN-END:variables
}