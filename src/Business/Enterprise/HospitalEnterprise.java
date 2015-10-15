/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.Role;
import Business.Supplier.MedicalDeviceCatalog;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class HospitalEnterprise extends Enterprise{

    private MedicalDeviceCatalog medicalDeviceCatalog;
    
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        medicalDeviceCatalog = new MedicalDeviceCatalog();
    }

    public MedicalDeviceCatalog getMedicalDeviceCatalog() {
        return medicalDeviceCatalog;
    }

    public void setMedicalDeviceCatalog(MedicalDeviceCatalog medicalDeviceCatalog) {
        this.medicalDeviceCatalog = medicalDeviceCatalog;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
