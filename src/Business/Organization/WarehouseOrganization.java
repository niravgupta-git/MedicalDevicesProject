/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import Business.Role.WareHouseManagerRole;
import Business.Supplier.MedicalDeviceCatalog;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class WarehouseOrganization extends Organization{
   
    private MedicalDeviceCatalog medicalDeviceCatalog;
    
    public WarehouseOrganization() {
        super(Organization.Type.Warehouse.getValue());
        medicalDeviceCatalog = new MedicalDeviceCatalog();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WareHouseManagerRole());
        return roles;
    }

    public MedicalDeviceCatalog getMedicalDeviceCatalog() {
        return medicalDeviceCatalog;
    }

    public void setMedicalDeviceCatalog(MedicalDeviceCatalog medicalDeviceCatalog) {
        this.medicalDeviceCatalog = medicalDeviceCatalog;
    }
    
    
    
}
