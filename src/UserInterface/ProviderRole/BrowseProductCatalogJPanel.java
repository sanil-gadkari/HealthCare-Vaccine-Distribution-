/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProviderRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Manufacturer;
import Business.Enterprise.ManufacturerEnterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Enterprise.SiteDirectoryEnterprise;
import Business.Manufacturer;
import Business.MasterOrderCatalog;
import Business.Network.Network;
import Business.Order;
import Business.OrderItem;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.ProviderOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.ProviderOrganization;
import Business.ProductVaccine;
import Business.Provider;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static javax.xml.ws.spi.Provider.provider;

/**
 *
 * @author sanil
 */
public class BrowseProductCatalogJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Order order;

    EcoSystem business;
    private boolean isCheckedOut = false;

    Enterprise enterprise;
    Network n;
    UserAccount userAccount;

    /**
     * Creates new form BrowseProductCatalogJPanel
     */
    public BrowseProductCatalogJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, UserAccount userAccount, Network n) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.n = n;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.business = business;

       // this.business = business;
        populateProviderComboBox();
        if (!isCheckedOut) {
            order = new Order();
        }

        populateProductTable();
        populateOrderItemTable(order);
    }

    private void populateOrderItemTable(Order order) {
        DefaultTableModel dtm = (DefaultTableModel) orderItemjTable.getModel();
        dtm.setRowCount(0);

        for (OrderItem oi : order.getOrderItemList()) {
            Object row[] = new Object[4];
            row[0] = oi;
            row[1] = oi.getQuantity();
            ProductVaccine productVaccine = oi.getProductvaccine();
            row[2] = productVaccine.getPrice();

            row[3] = productVaccine.getPrice() * oi.getQuantity();

            dtm.addRow(row);
        }
    }

    public void populateProviderComboBox() {
        manufacturerjComboBox.removeAllItems();
        for (Network n : business.getNetworkList()) {
            for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof ManufacturerEnterprise) {
                    manufacturerjComboBox.addItem(enterprise);
                }
            }
            // populateProductTable();
        }
    }

    private void populateProductTable() {
        DefaultTableModel dtm = (DefaultTableModel) productJTable.getModel();
        dtm.setRowCount(0);
        ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) manufacturerjComboBox.getSelectedItem();
        if (manufacturerEnterprise != null) {

            //1st  will return an object and then it returns the arraylist
            for (ProductVaccine productVaccine : manufacturerEnterprise.getProductCatalog().getProductCatalog()) {
                Object row[] = new Object[4];

                row[0] = productVaccine;
                row[1] = productVaccine.getProductId();
                row[2] = productVaccine.getPrice();
                row[3] = productVaccine.getAvail();
                dtm.addRow(row);

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

        quantityjSpinner = new javax.swing.JSpinner();
        modifyjTextField = new javax.swing.JTextField();
        modifyjLabel = new javax.swing.JLabel();
        modifyjButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addToCartjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemjTable = new javax.swing.JTable();
        manufacturerjComboBox = new javax.swing.JComboBox();
        checkOutjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productJTable = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(quantityjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 243, -1, -1));
        add(modifyjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 480, 124, -1));

        modifyjLabel.setText("Modify the Quantity");
        add(modifyjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 483, -1, -1));

        modifyjButton.setText("Modify");
        modifyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyjButtonActionPerformed(evt);
            }
        });
        add(modifyjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 479, -1, -1));

        jTextField1.setText("{ Please select both product and Item }");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        addToCartjButton.setText("Add to Cart");
        addToCartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartjButtonActionPerformed(evt);
            }
        });
        add(addToCartjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 291, -1, -1));

        orderItemjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Unit Price", "Total Price"
            }
        ));
        jScrollPane2.setViewportView(orderItemjTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 344, -1, 101));

        manufacturerjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(manufacturerjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 37, -1, -1));

        checkOutjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOutjButton.setText("Check Out");
        checkOutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutjButtonActionPerformed(evt);
            }
        });
        add(checkOutjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 429, -1, -1));

        productJTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Product ID", "Price", "Availablity"
            }
        ));
        jScrollPane1.setViewportView(productJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 95, 441, 127));
    }// </editor-fold>//GEN-END:initComponents

    private void modifyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = productJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        ProductVaccine productVaccine = (ProductVaccine) productJTable.getValueAt(selectedRow, 0);

        int selectedRow1 = orderItemjTable.getSelectedRow();
        if (selectedRow1 < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        OrderItem oi = (OrderItem) orderItemjTable.getValueAt(selectedRow1, 0);
        Integer p = oi.getQuantity();
        String qty = modifyjTextField.getText();
        oi.setQuantity(Integer.parseInt(qty));
        Integer i = Integer.parseInt(qty);
        productVaccine.setAvail((productVaccine.getAvail() + p) - i);

        populateProductTable();
        populateOrderItemTable(order);
        //Integer temp = product.getAvailability() * product.getPrice();
        modifyjTextField.setText("");

    }//GEN-LAST:event_modifyjButtonActionPerformed

    private void addToCartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartjButtonActionPerformed
   int selectedRow = productJTable.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row"); 
            return;
        }
        ProductVaccine p =(ProductVaccine) productJTable.getValueAt(selectedRow, 0);
        int quantity = (Integer)quantityjSpinner.getValue();
        if(quantity <= 0 || quantity > p.getAvail()){
            JOptionPane.showMessageDialog(null,"Quantity selected is more than the availability"); 
            return;
                    }
       
        
        
        boolean isIncluded = false;
        for(OrderItem oi : order.getOrderItemList())
        {
            if(oi.getProductvaccine().getProdName().equals(p.getProdName()))
            {
                int newQuantity =(Integer)quantityjSpinner.getValue();
                if(newQuantity + oi.getQuantity() > p.getAvail()){
                    return;
                }
                oi.setQuantity(newQuantity + oi.getQuantity());
                isIncluded = true;
            }
        }
        if (!isIncluded){
        OrderItem orderItem = order.addOrderItem(p, quantity);
        orderItem.setProductvaccine(p);
        orderItem.setQuantity(quantity);
        }
        
        p.setAvail(p.getAvail()- quantity);
        populateOrderItemTable(order);
        populateProductTable();
                                          
        






// TODO add your handling code here:
//        int selectedRow = productJTable.getSelectedRow();
//
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(null, "Please select a row");
//            return;
//        }
//        ProductVaccine p = (ProductVaccine) productJTable.getValueAt(selectedRow, 0);
//        int quantity = (Integer) quantityjSpinner.getValue();
//        if (quantity <= 0 || quantity > p.getAvail()) {
//            JOptionPane.showMessageDialog(null, "Quantity selected is more than the availability");
//            return;
//        }
       

//        boolean isIncluded = false;
//        for (OrderItem oi : order.getOrderItemList()) {
//            if (oi.getProductvaccine().getProdName().equals(productVaccine.getProdName())) {
//                int newQuantity = (Integer) quantityjSpinner.getValue();
//                if (newQuantity + oi.getQuantity() > productVaccine.getAvail()) {
//                    return;
//                }
//                oi.setQuantity(newQuantity + oi.getQuantity());
//                isIncluded = true;
//            }
//        }
//        if (!isIncluded) {
//            OrderItem orderItem = order.addOrderItem(productVaccine, quantity);
//            orderItem.setProductvaccine(productVaccine);
//            orderItem.setQuantity(quantity);
//        }

//        productVaccine.setAvail(productVaccine.getAvail() - quantity);
//if (flag){
//            OrderItem oi= order.addOrderItem(p, quantity);
//            oi.setProductvaccine(p);
//           oi.setQuantity(quantity);
//            
//
//        }
// p.setAvail(p.getAvail()-quantity);
//        populateProductTable();
//        populateOrderItemTable(order);
    }//GEN-LAST:event_addToCartjButtonActionPerformed

    private void checkOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutjButtonActionPerformed
        // TODO add your handling code here:

        Organization org = null;

        isCheckedOut = true;

        if (order == null || order.getOrderItemList().isEmpty()) {
            JOptionPane.showMessageDialog(this, "order is null");
        }
       
        populateOrderItemTable(order);
        populateProductTable();

        System.out.println(enterprise + "check");
      
        //Enterprise ent = null;
        for (Network n1 : business.getNetworkList()) {
            for (Enterprise en1 : n1.getEnterpriseDirectory().getEnterpriseList()) {
                if (en1 instanceof PHDEnterprise) {
                    PHDEnterprise en = (PHDEnterprise) en1;

                    for (Organization organization : en.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println(en.getOrganizationDirectory().getOrganizationList());
                        if (organization instanceof ProviderOrganization) {

                            System.out.println(organization);
                            org = organization;
                            break;
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
//    

        if (org != null) {
            ProviderWorkRequest providerWorkRequest = new ProviderWorkRequest();
            providerWorkRequest.setOrder(order);
            providerWorkRequest.setStatus("Pending");
            providerWorkRequest.setMessage("Ordered");
            providerWorkRequest.setSender(userAccount);
            System.out.println(org.getWorkQueue().getWorkRequestList());
            org.getWorkQueue().getWorkRequestList().add(providerWorkRequest);
            // System.out.println(org.getWorkQueue().getWorkRequestList());
            userAccount.getWorkQueue().getWorkRequestList().add(providerWorkRequest);
        }
         order = new Order();
  populateProductTable();
        populateOrderItemTable(order);
    }//GEN-LAST:event_checkOutjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartjButton;
    private javax.swing.JButton checkOutjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox manufacturerjComboBox;
    private javax.swing.JButton modifyjButton;
    private javax.swing.JLabel modifyjLabel;
    private javax.swing.JTextField modifyjTextField;
    private javax.swing.JTable orderItemjTable;
    private javax.swing.JTable productJTable;
    private javax.swing.JSpinner quantityjSpinner;
    // End of variables declaration//GEN-END:variables
}
