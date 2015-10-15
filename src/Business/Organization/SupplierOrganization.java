/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierRole;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import java.util.ArrayList;

/**
 *
 * @author nirav gupta
 */
public class SupplierOrganization extends Organization{
    
    private SupplierDirectory supplierDirectory; 
    
    public SupplierOrganization() {
         super(Organization.Type.Supplier.getValue());
         supplierDirectory = new SupplierDirectory();
    }
    
    @Override
    public ArrayList <Role> getSupportedRole(){
        ArrayList<Role> role = new ArrayList();
        role.add(new SupplierRole());
        return role;
        
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
    public Supplier addSupplierInSupplierDir(){
        Supplier supplier = new Supplier();
        supplierDirectory.getSupplierDict().add(supplier);    
        return supplier;
    }
    
    public void removeSupplierInSupplierDir(Supplier supplier){
        supplierDirectory.getSupplierDict().remove(supplier);
    }
    
}
