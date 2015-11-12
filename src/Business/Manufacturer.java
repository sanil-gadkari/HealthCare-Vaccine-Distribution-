/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Employee.Employee;

/**
 *
 * @author sanil
 */
public class Manufacturer extends Employee {
    private String manufacturerName;
    private ProductCatalog productCatalog;
    
    public Manufacturer()
    {
        productCatalog=new ProductCatalog();
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

   

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
     @Override
    public String toString() {
        return manufacturerName;
    }
    
}
