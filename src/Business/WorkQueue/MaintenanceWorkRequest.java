/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Supplier.MedicalDevice;

/**
 *
 * @author nirav gupta
 */
public class MaintenanceWorkRequest extends WorkRequest {
    
    private MedicalDevice requestedDevice;
    private String maintanenceStatus;

    public MedicalDevice getRequestedDevice() {
        return requestedDevice;
    }

    public void setRequestedDevice(MedicalDevice requestedDevice) {
        this.requestedDevice = requestedDevice;
    }

    public String getMaintanenceStatus() {
        return maintanenceStatus;
    }

    public void setMaintanenceStatus(String maintanenceStatus) {
        this.maintanenceStatus = maintanenceStatus;
    }
    
    
}
