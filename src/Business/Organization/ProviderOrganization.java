/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.PatientDirectory;
import Business.ProductCatalog;
import Business.Role.ProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class ProviderOrganization extends Organization {
    private PatientDirectory patientDir;
    public ProviderOrganization()
            
    {
      super(Organization.Type.ProviderOrganization.getValue());
      patientDir=new PatientDirectory();
      
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new ProviderRole());
       return roles;
    }
    
    
}
