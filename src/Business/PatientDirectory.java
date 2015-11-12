/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author sanil
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDir;
    
    public PatientDirectory() {
        patientDir = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public Patient addPatient() {
        Patient pa = new Patient();
        patientDir.add(pa);
        return pa;
    }
    
    public void removeProduct(Patient pa) {
        patientDir.remove(pa);
    }

    
}
