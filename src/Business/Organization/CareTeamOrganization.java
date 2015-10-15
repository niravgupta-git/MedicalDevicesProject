/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.CareTeam.CareTeamDirectory;
import Business.Role.CareTeamLeaderRole;
import Business.Role.CareTeamMemberRole;
import Business.Role.Role;
import Business.Supplier.MedicalDeviceCatalog;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class CareTeamOrganization extends Organization{
    
    private CareTeamDirectory careTeamDirectory; 
    private MedicalDeviceCatalog medicalDeviceCatalog;
    
    public CareTeamOrganization() {
         super(Organization.Type.CareTeam.getValue());
         careTeamDirectory = new CareTeamDirectory();
         medicalDeviceCatalog = new MedicalDeviceCatalog();
    }

    
    @Override
    public ArrayList <Role> getSupportedRole(){
        ArrayList<Role> role = new ArrayList();
        role.add(new CareTeamMemberRole());
        role.add(new CareTeamLeaderRole());
        return role;
        
    }

    public CareTeamDirectory getCareTeamDirectory() {
        return careTeamDirectory;
    }

    public void setCareTeamDirectory(CareTeamDirectory careTeamDirectory) {
        this.careTeamDirectory = careTeamDirectory;
    }

    public MedicalDeviceCatalog getMedicalDeviceCatalog() {
        return medicalDeviceCatalog;
    }

    public void setMedicalDeviceCatalog(MedicalDeviceCatalog medicalDeviceCatalog) {
        this.medicalDeviceCatalog = medicalDeviceCatalog;
    }

   
    
}
