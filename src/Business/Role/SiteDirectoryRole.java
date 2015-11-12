/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Enterprise.SiteDirectoryEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PHDRole.AddSitesJPanel;

import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class SiteDirectoryRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network n) {
//       return new SiteDirectoryWorkAreaJPanel(userProcessContainer,(SiteDirectoryEnterprise)enterprise,business,n,account);
//    }
   
}
