/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;


import Business.Role.Role;
import Business.Role.SiteDirectoryRole;
import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class SiteDirectoryEnterprise extends Enterprise {
    private String location;
    private String type;
    //private ArrayList<PEnterprise> phdList;
    
    public SiteDirectoryEnterprise(String name,EnterpriseType type  ) {
        super(name, Enterprise.EnterpriseType.SiteDirectory);
    }

   

     @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>role = new ArrayList<>();
       role.add(new SiteDirectoryRole());
       return role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  
    
}
