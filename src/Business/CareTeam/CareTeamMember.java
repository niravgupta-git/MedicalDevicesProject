/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.CareTeam;

import Business.UserAccount.UserAccount;

/**
 *
 * @author nirav gupta
 */
public class CareTeamMember extends UserAccount{
    
    
    private String speciality;
    private String workingAtHospital;
    private String availabilityStatus;
    
    
   public enum availabilityStatusType{
       
       AVAILABLE("AVAILABLE"), 
       UNAVAILABLE("UNAVAILABLE"), 
        SCHEDULED("SCHEDULED"),
        INOPERATION("INOPERATION");
        
        
        private String value;
        
        private availabilityStatusType(String value){
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
    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getWorkingAtHospital() {
        return workingAtHospital;
    }

    public void setWorkingAtHospital(String workingAtHospital) {
        this.workingAtHospital = workingAtHospital;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    

    @Override
    public String toString() {
        return super.getEmployee().getName();
    }

   
    
    
    
}
