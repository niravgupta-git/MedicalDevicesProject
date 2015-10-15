/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import Business.Schedule.DeviceSchedule;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rushabh
 */
public class MedicalDevice extends DeviceSchedule{
    
    private static int count = 0;
    private String deviceName;
    private int modelNumber;
    private String deviceType;
    private int deviceID;
    private int purchaseCost;
    private Date purchaseDate;
    private Date manufactureDate;
    private Date warrantyExpirationDate;
    private Date nextMaitainenceDueDate;
    private Date previousMaitainenceDate;
    private String currentLocation;
    private int availability;
    private String deviceStatus;
    private String manufacturerName;
    
    private int deviceUsageCount;
    private int failureCount;
    private double failureProbablility;
    private ArrayList<String> deviceFailureList;
    
    public MedicalDevice() {
        count++;
        deviceID = count;
        
    }

    public enum deviceType{
        
        ECGDEVICE("ECG"),
        NEURODEVICE("NEURO DEVICE"),
        CATSCANDEVICE("CAT SCAN DEVICE"),
        HEARTDEVICE("HEART DEVICE");
        
        private String value;
        
        private deviceType(String value){
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
    
    public enum devicebookedStatusType{
        
        PREBOOKED("PREBOOKED"),
        AVAILABLE("AVAILABLE"),
        DELIVERD("DELIVERD"),
        INSHIPPING("INSHIPPING"),
        INMAINTENENCE("INMAINTENENCE"),;
        
        private String value;
        
        private devicebookedStatusType(String value){
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

    public Date getPreviousMaitainenceDate() {
        return previousMaitainenceDate;
    }

    public void setPreviousMaitainenceDate(Date previousMaitainenceDate) {
        this.previousMaitainenceDate = previousMaitainenceDate;
    }
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MedicalDevice.count = count;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }
    

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getWarrantyExpirationDate() {
        return warrantyExpirationDate;
    }

    public void setWarrantyExpirationDate(Date warrantyExpirationDate) {
        this.warrantyExpirationDate = warrantyExpirationDate;
    }

    public Date getNextMaitainenceDueDate() {
        return nextMaitainenceDueDate;
    }

    public void setNextMaitainenceDueDate(Date nextMaitainenceDueDate) {
        this.nextMaitainenceDueDate = nextMaitainenceDueDate;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    
    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ArrayList<String> getDeviceFailureList() {
        return deviceFailureList;
    }

    public void setDeviceFailureList(ArrayList<String> deviceFailureList) {
        this.deviceFailureList = deviceFailureList;
    }

    public int getDeviceUsageCount() {
        return deviceUsageCount;
    }

    public void setDeviceUsageCount(int deviceUsageCount) {
        this.deviceUsageCount = deviceUsageCount;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }

    public double getFailureProbablility() {
        return failureProbablility;
    }

    public void setFailureProbablility(double failureProbablility) {
        this.failureProbablility = failureProbablility;
    }

    
    
    public ArrayList addFailureInDeviceFailureList(String failureReason){
        deviceFailureList = new ArrayList<String>();
        deviceFailureList.add(failureReason);
        return deviceFailureList;
    }
    
    public double calculateFailureProbability(){
        
        if (this.getDeviceUsageCount()==0){
            this.setFailureProbablility(0.0);
        } if (this.getFailureCount()==0){
            this.setFailureProbablility(0.0);
        }else {
            double prob = (this.getFailureCount()/this.getDeviceUsageCount()) * 100;
            this.setFailureProbablility(prob);
        }
        return this.failureProbablility ;
    }
    
    @Override
    public String toString() {
        return deviceName;
    }
    
}
