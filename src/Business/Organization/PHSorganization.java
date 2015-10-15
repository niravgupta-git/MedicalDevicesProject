/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.PHSmanagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class PHSorganization extends Organization{
    
    public PHSorganization() {
        super(Organization.Type.PHSorganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PHSmanagerRole());
        return roles;
    }
    
}
