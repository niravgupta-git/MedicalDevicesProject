/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Supplier.MedicalDevice;
import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class GetDeviceFromOtherEnterpriseRequest extends WorkRequest{
    
    private String requiredMedicalDeviceType;
    private String assignedMedicalDeviceType;
    private Date deviceRequiredOnDate;
    private String deviceRequiredAtHospital;
    private String deviceCurrentLocation;
    private String deviceShippingStatus;
    private Date estimatedDeliveryDate;
    private MedicalDevice assignedDevice;
    
    public GetDeviceFromOtherEnterpriseRequest(){
        assignedDevice = new MedicalDevice();
}
    
    public enum deviceShippingStatus{
        
        INSHIPPING("INSHIPPING"),
        DELIVERED("DELIVERED"),
        CANCELLED("CANCELLED");
        
        private String value;
        
        private deviceShippingStatus(String value){
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

    public String getAssignedMedicalDeviceType() {
        return assignedMedicalDeviceType;
    }

    public void setAssignedMedicalDeviceType(String assignedMedicalDeviceType) {
        this.assignedMedicalDeviceType = assignedMedicalDeviceType;
    }

    public String getDeviceCurrentLocation() {
        return deviceCurrentLocation;
    }

    public void setDeviceCurrentLocation(String deviceCurrentLocation) {
        this.deviceCurrentLocation = deviceCurrentLocation;
    }

    public String getDeviceShippingStatus() {
        return deviceShippingStatus;
    }

    public void setDeviceShippingStatus(String deviceShippingStatus) {
        this.deviceShippingStatus = deviceShippingStatus;
    }

    public Date getDeviceRequiredOnDate() {
        return deviceRequiredOnDate;
    }

    public void setDeviceRequiredOnDate(Date deviceRequiredOnDate) {
        this.deviceRequiredOnDate = deviceRequiredOnDate;
    }

    public String getDeviceRequiredAtHospital() {
        return deviceRequiredAtHospital;
    }

    public void setDeviceRequiredAtHospital(String deviceRequiredAtHospital) {
        this.deviceRequiredAtHospital = deviceRequiredAtHospital;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public MedicalDevice getAssignedDevice() {
        return assignedDevice;
    }

    public void setAssignedDevice(MedicalDevice assignedDevice) {
        this.assignedDevice = assignedDevice;
    }
    
    
    
}
