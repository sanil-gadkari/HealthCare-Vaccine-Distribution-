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

import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class CDCRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network n) {
     return new CDCWorkAreaJPanel(userProcessContainer,enterprise,business,n,account);
    }
    
}
