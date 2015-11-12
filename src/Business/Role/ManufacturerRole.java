/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ManufacturerEnterprise;
import Business.Manufacturer;
import Business.Network.Network;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ManufacturerRole.ManufacturerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sanil
 */
public class ManufacturerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network n) {
        return new ManufacturerWorkAreaJPanel(userProcessContainer,(ManufacturerEnterprise)enterprise,business);
    }
    
}
