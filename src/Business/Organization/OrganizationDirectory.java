/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Supplier.getValue())) {
            organization = new SupplierOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CareTeam.getValue())) {
            organization = new CareTeamOrganization();
            organizationList.add(organization);
        }  else if (type.getValue().equals(Type.OperatingRoom.getValue())) {
            organization = new OperatingRoomOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Warehouse.getValue())) {
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HospitalAdmin.getValue())) {
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PHSorganization.getValue())) {
            organization = new PHSorganization();
            organizationList.add(organization);
        }return organization;
    }
    
}