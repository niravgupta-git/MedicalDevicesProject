/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

/**
 *
 * @author nirav gupta
 */
public class BuyNewMedicalDeviceRequest extends WorkRequest{
    
    private String requiredMedicalDeviceType;
    private String boughtMedicalDeviceType;
    private String locationRequired;
    
    public String getRequiredMedicalDeviceType() {
        return requiredMedicalDeviceType;
    }

    public void setRequiredMedicalDeviceType(String requiredMedicalDeviceType) {
        this.requiredMedicalDeviceType = requiredMedicalDeviceType;
    }

    public String getBoughtMedicalDeviceType() {
        return boughtMedicalDeviceType;
    }

    public void setBoughtMedicalDeviceType(String boughtMedicalDeviceType) {
        this.boughtMedicalDeviceType = boughtMedicalDeviceType;
    }

    public String getLocationRequired() {
        return locationRequired;
    }

    public void setLocationRequired(String locationRequired) {
        this.locationRequired = locationRequired;
    }
    
    
    
}
