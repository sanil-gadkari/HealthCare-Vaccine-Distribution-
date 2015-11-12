/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PHDEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CDCRole.CDCWorkAreaJPanel;
import UserInterface.PHDRole.PHDWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class PHDRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network n) {
        System.out.println("phd"+enterprise.getName()); 
        return new PHDWorkAreaJPanel(userProcessContainer,enterprise,business,n,account); //To change body of generated methods, choose Tools | Templates.
    }
    
}
