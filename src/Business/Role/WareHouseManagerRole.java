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
import UserInterface.WareHouseManagerRole.WareHouseManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class WareHouseManagerRole extends Role{
    
    public WareHouseManagerRole() {
        super(Role.RoleType.WAREHOUSEMANAGER.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem System) {
        return new WareHouseManagerWorkAreaJPanel(userProcessContainer,enterprise, organization, System);
    }
    
}
