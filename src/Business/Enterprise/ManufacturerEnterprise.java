/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.ProductCatalog;
import Business.Role.CDCRole;
import Business.Role.ManufacturerRole;
import Business.Role.PHDRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class ManufacturerEnterprise extends Enterprise {
    private ProductCatalog productCatalog;
    public ManufacturerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Manufacturer);
        productCatalog=new ProductCatalog();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>role = new ArrayList<>();
       role.add(new ManufacturerRole());
       return role;
        //return null;
    }
    public String toString(){
        return super.getName();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    


    
    
    
    
}

