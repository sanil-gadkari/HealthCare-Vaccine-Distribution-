/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.CDCRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanil
 */

public class CDCEnterprise extends Enterprise {
private ArrayList<PHDEnterprise> phdList;
private int population;

    
    public CDCEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CDC);
    phdList = new ArrayList<>();
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    

    public ArrayList<PHDEnterprise> getPhdList() {
        return phdList;
    }

    public void setPhdList(ArrayList<PHDEnterprise> phdList) {
        this.phdList = phdList;
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>role = new ArrayList<>();
       role.add(new CDCRole());
       return role;
//        return null;
    }
    
    
}
