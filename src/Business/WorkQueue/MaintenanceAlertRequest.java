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
public class MaintenanceAlertRequest extends WorkRequest{
    
    MedicalDevice device;

    public MedicalDevice getDevice() {
        return device;
    }

    public void setDevice(MedicalDevice device) {
        this.device = device;
    }
    
    
    
}
