/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Employee.Employee;

/**
 *
 * @author sanil
 */
public class Patient extends Employee  {
    private String insuranceStatus;
    private int insuranceNo;

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public int getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(int insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    
 @Override
    public String toString() {
        return name;
    }
   
    
}
