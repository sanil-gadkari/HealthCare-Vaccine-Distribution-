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
public class ProductVaccine {
     private static int count = 0;
    private String prodName;
    private int price;
    private int vaccineNumber;
     private int avail;
     private int productId;
     private int quantity;
     private int origavail;
      private int sumPrice;
    private int sumQuantity;
     

    public ProductVaccine() {
        count++;
        productId = count;
        
    }
      public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }

    public int getSumQuantity() {
        return sumQuantity;
    }

    public void setSumQuantity(int sumQuantity) {
        this.sumQuantity = sumQuantity;
    }
    
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
   public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrigavail() {
        return origavail;
    }

    public void setOrigavail(int origavail) {
        this.origavail = origavail;
    }

    public int getVaccineNumber() {
        return vaccineNumber;
    }

    public void setVaccineNumber(int vaccineNumber) {
        this.vaccineNumber = vaccineNumber;
    }

   
    

  
    
    @Override
    public String toString() {
        return prodName;
    }
    
    
}
