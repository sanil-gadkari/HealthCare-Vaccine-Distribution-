/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author sanil
 */
public class OrderItem {
     private ProductVaccine productvaccine;
    private int quantity;
    private int salesPrice;

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public ProductVaccine getProductvaccine() {
        return productvaccine;
    }

    public void setProductvaccine(ProductVaccine productvaccine) {
        this.productvaccine = productvaccine;
    }
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.salesPrice= this.quantity*this.getProductvaccine().getPrice();
    }
    
    @Override
    public String toString(){
        return productvaccine.getProdName();
    }
    
     
    }
    
    

