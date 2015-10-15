/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.OperatingRoom.OperatingRoom;
import Business.Role.OperatingRoomManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class OperatingRoomOrganization extends Organization{

    private ArrayList<OperatingRoom> operatingRoomList;
    
    public OperatingRoomOrganization() {
        super(Organization.Type.OperatingRoom.getValue());
        operatingRoomList = new ArrayList<>();
    }

    public ArrayList<OperatingRoom> getOperatingRoomList() {
        return operatingRoomList;
    }

    public void setOperatingRoomList(ArrayList<OperatingRoom> operatingRoomList) {
        this.operatingRoomList = operatingRoomList;
    }
    
    public OperatingRoom addOperatingRoominDir(){
        OperatingRoom orm = new OperatingRoom();
        operatingRoomList.add(orm);
        return orm;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> role = new ArrayList();
        role.add(new OperatingRoomManagerRole());
        return role;
        
    } 
    
    
    
    
}
