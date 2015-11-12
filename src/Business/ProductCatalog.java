/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class ProductCatalog {
     private ArrayList<ProductVaccine> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<ProductVaccine>();
    }

    public ArrayList<ProductVaccine> getProductCatalog() {
        return productCatalog;
    }
    
    public ProductVaccine addProduct() {
        ProductVaccine p = new ProductVaccine();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(ProductVaccine p) {
        productCatalog.remove(p);
    }
    
    public ProductVaccine searchProduct(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(ProductVaccine p : productCatalog) {
            if(p.getVaccineNumber() == id) {
                return p;
            }
        }
        return null;
    }
    
}
