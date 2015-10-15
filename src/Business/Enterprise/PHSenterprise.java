/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class PHSenterprise extends Enterprise{
    
    private int availableFunds;
    
    public PHSenterprise(String name) {
        super(name, EnterpriseType.PHSenterprise);
    }
   
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public int getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(int availableFunds) {
        this.availableFunds = availableFunds;
    }
    
    
    
}
