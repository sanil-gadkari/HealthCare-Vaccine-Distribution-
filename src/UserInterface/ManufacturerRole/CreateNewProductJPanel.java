/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.ManufacturerRole;

import Business.Enterprise.ManufacturerEnterprise;
import Business.Manufacturer;
import Business.ProductVaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {
    ManufacturerEnterprise manufacturerEnterprise;
    JPanel userProcessContainer;

    /**
     * Creates new form CreateNewProductJPanel
     */
    public CreateNewProductJPanel(JPanel userProcessContainer, ManufacturerEnterprise manufacturerEnterprise) {
        initComponents();
       this.manufacturerEnterprise = manufacturerEnterprise;
        this.userProcessContainer = userProcessContainer;
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
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        availablejLabel = new javax.swing.JLabel();
        availabilityjTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceField1 = new javax.swing.JTextField();

        setBackground(java.awt.Color.white);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 141, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 141, 210, -1));

        availablejLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        availablejLabel.setText("Availability :");
        add(availablejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 30));

        availabilityjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(availabilityjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 251, 210, 30));

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add Product");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 311, -1, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 311, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 101, -1, 30));

        nameField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 101, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 191, 110, 30));

        priceField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceField1ActionPerformed(evt);
            }
        });
        add(priceField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 191, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
    try{  
            String vaccinename = nameField1.getText();
            //if(name.length()==0 | name==null)
            if(vaccinename.isEmpty()==true)
            {
                JOptionPane.showMessageDialog(null, "Please enter a name","Warning", JOptionPane.WARNING_MESSAGE);

            }

            else{

                String stringPrice = priceField1.getText();
                if(stringPrice.isEmpty()==false) {
                    int price = Integer.parseInt(stringPrice);
                    if(price < 0)
                    {
                        
             JOptionPane.showMessageDialog(null,"enter a positive value ");
             return;
                    }
                    
                    int availability = Integer.parseInt(availabilityjTextField.getText());
                   
                    if(availability<0)
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a valid value");
                        return;
                    }

                    //CDCEnterprise e = (CDCEnterprise)enterprise;
                    ProductVaccine productVaccine = manufacturerEnterprise.getProductCatalog().addProduct();
                    productVaccine.setProdName(nameField1.getText());
                    productVaccine.setPrice(price);
                    productVaccine.setAvail(availability);
                    JOptionPane.showMessageDialog(null,"Product Successfully ");

                }}
    }
            catch(NumberFormatException ne)
{
    JOptionPane.showMessageDialog(null, " Entered Value is wrong");
}
            

       // }
       /*catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter a integer input","Warning", JOptionPane.WARNING_MESSAGE);

        }*/
    




    }//GEN-LAST:event_createButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    
    
    private void priceField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityjTextField;
    private javax.swing.JLabel availablejLabel;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField priceField1;
    // End of variables declaration//GEN-END:variables
}