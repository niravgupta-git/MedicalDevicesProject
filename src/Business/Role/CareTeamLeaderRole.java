/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Schedule.PersonSchedule;
import Business.UserAccount.UserAccount;
import UserInterface.CareTeamLeaderRole.CareTeamLeaderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class CareTeamLeaderRole extends Role {
    
     private PersonSchedule careTeamMemberSchedule;
    
    public CareTeamLeaderRole() {
        super(Role.RoleType.CARETEAMLEADER.getValue());
        careTeamMemberSchedule = new PersonSchedule();
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new CareTeamLeaderWorkAreaJPanel(userProcessContainer, account, enterprise, organization, system);
    }
    
}
