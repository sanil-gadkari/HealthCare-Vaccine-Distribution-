/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SiteDirectoryEnterprise;
import Business.Network.Network;

import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.UserAccount.UserAccount;

import UserInterface.ProviderRole.ProviderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class ProviderRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network n) {
       return new ProviderWorkAreaJPanel(userProcessContainer, account,(ProviderOrganization)organization,enterprise, business,n);
        //return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
}
