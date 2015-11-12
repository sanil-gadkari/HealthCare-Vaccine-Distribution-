/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.CentreDistributionRole;
import Business.Role.ManufacturerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class CentreDistributionEnterprise extends Enterprise{
     public CentreDistributionEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CentreDistribution);
    }

     @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>role = new ArrayList<>();
       role.add(new CentreDistributionRole());
       return role;
    } 
}
