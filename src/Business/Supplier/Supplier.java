/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import Business.Order.MasterOrderCatalog;
import Business.Person;

/**
 *
 * @author Rushabh
 */
public class Supplier extends Person {
    
    private String supplyName;
    private MedicalDeviceCatalog medicalDeviceCatalog;
    private String EnrollmentStatus; 
    
    
    public Supplier() {
        medicalDeviceCatalog = new MedicalDeviceCatalog();
        
    }

     public enum enrollmentStatusType{
         
        PENDING("PENDING"),
        SENT("SENT"),
        DISAPPROVED("DISAPPROVED"),
        ENROLLED("ENROLLED");
        
        private String value;
        
        private enrollmentStatusType(String value){
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
    
    
    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public MedicalDeviceCatalog getProductCatalog() {
        return medicalDeviceCatalog;
    }

    public String getEnrollmentStatus() {
        return EnrollmentStatus;
    }

    public void setEnrollmentStatus(String EnrollmentStatus) {
        this.EnrollmentStatus = EnrollmentStatus;
    }

    public MedicalDeviceCatalog getMedicalDeviceCatalog() {
        return medicalDeviceCatalog;
    }

    public void setMedicalDeviceCatalog(MedicalDeviceCatalog medicalDeviceCatalog) {
        this.medicalDeviceCatalog = medicalDeviceCatalog;
    }

    
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
