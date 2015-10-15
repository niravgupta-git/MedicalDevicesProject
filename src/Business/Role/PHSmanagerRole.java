/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PHSlManagerRole.PHSlManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class PHSmanagerRole extends Role{
   
    public PHSmanagerRole() {
        super(Role.RoleType.PHSMANAGER.getValue());
        
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new PHSlManagerWorkAreaJPanel(userProcessContainer, account, enterprise, organization, system);
    }
    
}
