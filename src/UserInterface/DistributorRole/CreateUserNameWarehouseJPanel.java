/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DistributorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanil
 */
public class CreateUserNameWarehouseJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;    
    private Enterprise enterprise;
    private Network network;
    

    /**
     * Creates new form CreateUserNameWarehouseJPanel
     */
    public CreateUserNameWarehouseJPanel(JPanel userProcessContainer,EcoSystem business,Enterprise enterprise,Network network) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.enterprise=enterprise;
        this.network=network;
        populateTable();
       populateComboBox();
    }
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) warehouseJTable.getModel();

        model.setRowCount(0);
        
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(e instanceof DistributorEnterprise){
                for (UserAccount userAccount : e.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = e.getName();
                     
                    row[1] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
            }
     }
           private void populateComboBox(){
               warehouseJComboBox.removeAllItems();
               for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(e instanceof DistributorEnterprise){
                    warehouseJComboBox.addItem(e);
                }
               }
                for(Role role : enterprise.getSupportedRole())
    {
        rolejComboBox2.addItem(role);
           
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

        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        warehouseJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        warehouseJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        rolejComboBox2 = new javax.swing.JComboBox();

        jLabel5.setText("Name");

        jLabel1.setText("Warehouse");

        warehouseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        warehouseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        warehouseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Warehouse Name", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(warehouseJTable);

        jLabel3.setText("Role");

        rolejComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(warehouseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(52, 52, 52)
                                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(82, 82, 82)
                        .addComponent(rolejComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitJButton)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(warehouseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rolejComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(submitJButton)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void warehouseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseJComboBoxActionPerformed

       

    }//GEN-LAST:event_warehouseJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        DistributorEnterprise distributorEnterprise=(DistributorEnterprise) warehouseJComboBox.getSelectedItem();
            String username=usernameJTextField.getText();
            Role role = (Role)rolejComboBox2.getSelectedItem();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name=nameJTextField.getText();
            Employee employee =distributorEnterprise.getEmployeeDirectory().createEmployee(name);
            UserAccount userAccount =distributorEnterprise.getUserAccountDirectory().createUserAccount(username,password,employee,role);
            populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JComboBox rolejComboBox2;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    private javax.swing.JComboBox warehouseJComboBox;
    private javax.swing.JTable warehouseJTable;
    // End of variables declaration//GEN-END:variables
}
