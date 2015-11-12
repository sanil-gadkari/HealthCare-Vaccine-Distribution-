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
public class ManufacturerDirectory {
     private ArrayList<Manufacturer> manufacturerDirectory;
    
    public ManufacturerDirectory() {
        manufacturerDirectory = new ArrayList<Manufacturer>();
    }

    public ArrayList<Manufacturer> getManufacturerDict() {
        return manufacturerDirectory;
    }
    
    public Manufacturer addManufacturer() {
        Manufacturer m = new Manufacturer();
        manufacturerDirectory.add(m);
        return m;
    }
    
    public void removeManufacturer(Manufacturer m) {
        manufacturerDirectory.remove(m);
    }
    
}
