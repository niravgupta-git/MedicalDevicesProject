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
import UserInterface.OperatingRoomManagerRole.OperatingRoomManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class OperatingRoomManagerRole extends Role{
   
    //private PersonSchedule careTeamMemberSchedule;
    
    public OperatingRoomManagerRole() {
        super(Role.RoleType.OPERATINGROOMMANAGER.getValue());
        //careTeamMemberSchedule = new PersonSchedule();
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new OperatingRoomManagerWorkAreaJPanel(userProcessContainer, account, enterprise, system);
    }
    
}
