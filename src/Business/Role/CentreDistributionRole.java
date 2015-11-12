/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CDCRole.CDCWorkAreaJPanel;
import UserInterface.CentreDistributionRole.CentreDistributionWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class CentreDistributionRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network n) {
         return new CentreDistributionWorkAreaJPanel(userProcessContainer,enterprise,business,n,account); //To change body of generated methods, choose Tools | Templates.
    }
    
}
