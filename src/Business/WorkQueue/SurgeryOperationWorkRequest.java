/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.CareTeam.CareTeamDirectory;
import Business.Supplier.MedicalDevice;
import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class SurgeryOperationWorkRequest extends WorkRequest{
    
    private String requiredMedicalDeviceType;
    private String assignedMedicalDeviceType;
    private MedicalDevice assignedMedicalDevice;
    private int requiredCareTeamSize;
    private int assignedTeamSize;
    private Date operationDate;
    private String allotedOperatingRoom;
    private CareTeamDirectory careTeamDirectory;
    
    
    public SurgeryOperationWorkRequest(){
         careTeamDirectory=new CareTeamDirectory();
    }
    
    public enum requestStatusType{
        PENDING("PENDING"),
        ASSIGNED("ASSIGNED"),
        INOPERATION("INOPERATION"),
        CLOSED("CLOSED"),
        PENDINGforDEVICEandTEAMandROOM("PENDINGforDEVICEandTEAMandROOM"),
        PENDINGforDEVICEandROOM("PENDINGforDEVICEandROOM"),
        PENDINGforDEVICEandTEAM("PENDINGforDEVICEandTEAM"),
        PENDINGforTEAMandROOM("TEAMandROOM"),
        PENDINGforTEAM("PENDINGforTEAM"),
        PENDINGforDEVICE("PENDINGforDEVICE"),
        PENDINGforROOM("PENDINGforROOM");
        
        
        private String value;
        
        private requestStatusType(String value){
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
    
    public String getRequiredMedicalDeviceType() {
        return requiredMedicalDeviceType;
    }

    public void setRequiredMedicalDeviceType(String requiredMedicalDeviceType) {
        this.requiredMedicalDeviceType = requiredMedicalDeviceType;
    }

    public int getRequiredCareTeamSize() {
        return requiredCareTeamSize;
    }

    public void setRequiredCareTeamSize(int requiredCareTeamSize) {
        this.requiredCareTeamSize = requiredCareTeamSize;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getAllotedOperatingRoom() {
        return allotedOperatingRoom;
    }

    public void setAllotedOperatingRoom(String allotedOperatingRoom) {
        this.allotedOperatingRoom = allotedOperatingRoom;
    }

    public String getAssignedMedicalDeviceType() {
        return assignedMedicalDeviceType;
    }

    public void setAssignedMedicalDeviceType(String assignedMedicalDeviceType) {
        this.assignedMedicalDeviceType = assignedMedicalDeviceType;
    }

    public int getAssignedTeamSize() {
        return assignedTeamSize;
    }

    public void setAssignedTeamSize(int assignedTeamSize) {
        this.assignedTeamSize = assignedTeamSize;
    }

    public CareTeamDirectory getCareTeamDirectory() {
        return careTeamDirectory;
    }

    public void setCareTeamDirectory(CareTeamDirectory careTeamDirectory) {
        this.careTeamDirectory = careTeamDirectory;
    }

    public MedicalDevice getAssignedMedicalDevice() {
        return assignedMedicalDevice;
    }

    public void setAssignedMedicalDevice(MedicalDevice assignedMedicalDevice) {
        this.assignedMedicalDevice = assignedMedicalDevice;
    }
    
    
    
}
