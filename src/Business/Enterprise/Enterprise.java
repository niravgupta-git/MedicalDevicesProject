/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Order.MasterOrderCatalog;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author nirav gupta
 */
public abstract class Enterprise extends Organization{
    
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    private MasterOrderCatalog masterOrderCatalog;
    
    public Enterprise(String name, EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType= enterpriseType;
        this.organizationDirectory = new OrganizationDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
    }

    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Supplier("Supplier"),
        PHSenterprise("PHSenterprise"),
        WareHouse("WareHouse");
        
        private String value;

        public String getValue() {
            return value;
        }

        
        private EnterpriseType (String value){
            this.value=value;
        }
        
        

        @Override
        public String toString() {
            return value;
        }
        
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    
    
    
}
