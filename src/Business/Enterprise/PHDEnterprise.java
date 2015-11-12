/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.CDCRole;
import Business.Role.PHDRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class PHDEnterprise extends Enterprise {
     
    private ArrayList<SiteDirectoryEnterprise>siteDirectoryEnterprise;
    private int population;
    
    public PHDEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.PHD);
        siteDirectoryEnterprise=new ArrayList<>();
       
        
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
   
   

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>role = new ArrayList<>();
       role.add(new PHDRole());
       return role;
       
    }

    public ArrayList<SiteDirectoryEnterprise> getSiteDirectoryEnterprise() {
        return siteDirectoryEnterprise;
    }

    public void setSiteDirectoryEnterprise(ArrayList<SiteDirectoryEnterprise> siteDirectoryEnterprise) {
        this.siteDirectoryEnterprise = siteDirectoryEnterprise;
    }
   
     
    
}
