/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private OrganizationDirectory organizationDirectory;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if (business == null){
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        organizationDirectory = new OrganizationDirectory();
        networkList = new ArrayList<>();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
                
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}