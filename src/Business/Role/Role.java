
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role{

    private String role;
    
    public Role(String role){
        this.role=role;
    }
    
    
    public enum RoleType{
        ADMIN("ADMIN"),
        DOCTOR("DOCTOR"),
        CARETEAMMEMBER("CARE TEAM MEMBER"),
        CARETEAMLEADER("CARE TEEAM LEADER"),
        SUPPLIER("SUPPLIER ROLE"),
        INVENTORYMANAGER("INVENTORY MANAGER ROLE"),
        OPERATINGROOMMANAGER("OPERATING ROOM MANAGER ROLE"),
        WAREHOUSEMANAGER("WAREHOUSE MANAGER ROLE"),
        PHSMANAGER("PHS MANAGER ROLE"),
        SURGERYTEAMMEMBER("SURGERY TEAM MEMBER");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}