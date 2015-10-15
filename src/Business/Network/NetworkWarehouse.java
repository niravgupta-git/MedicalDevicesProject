/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Role.Role;
import Business.Role.WareHouseManagerRole;
import Business.Supplier.MedicalDeviceCatalog;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class NetworkWarehouse {
    
    private MedicalDeviceCatalog medicalDeviceCatalog;
    
    
    
    public NetworkWarehouse(){
        medicalDeviceCatalog = new MedicalDeviceCatalog();
    }
    

    public MedicalDeviceCatalog getMedicalDeviceCatalog() {
        return medicalDeviceCatalog;
    }

    public void setMedicalDeviceCatalog(MedicalDeviceCatalog medicalDeviceCatalog) {
        this.medicalDeviceCatalog = medicalDeviceCatalog;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WareHouseManagerRole());
        return roles;
    }
    
}
