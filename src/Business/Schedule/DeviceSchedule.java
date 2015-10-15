/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Schedule;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class DeviceSchedule {
    
    private boolean isDeviceAvailableStatus;
    private int deviceBookedDuration;
    private Date deviceLeasedDate;
    private String currentDeviceOwner;
    private String currentLocation;
    private Date nextLeasingDate;
    private Date nextScheduledBookingDate;
    private Date nextScheduledBookingTillDate;
    private ArrayList<DeviceBookingHistory> bookingHistorylist;
    
    //private ArrayList<Date>[][] bookingHistoryList;
    //private ArrayList<Date>[][] nextBookingList;
    
    public boolean isIsDeviceAvailableStatus() {
        return isDeviceAvailableStatus;
    }

    public void setIsDeviceAvailableStatus(boolean isDeviceAvailableStatus) {
        this.isDeviceAvailableStatus = isDeviceAvailableStatus;
    }
    
    public int getDeviceBookedDuration() {
        return deviceBookedDuration;
    }

    public void setDeviceBookedDuration(int deviceBookedDuration) {
        this.deviceBookedDuration = deviceBookedDuration;
    }

    public Date getDeviceLeasedDate() {
        return deviceLeasedDate;
    }

    public void setDeviceLeasedDate(Date deviceLeasedDate) {
        this.deviceLeasedDate = deviceLeasedDate;
    }

    public String getCurrentDeviceOwner() {
        return currentDeviceOwner;
    }

    public void setCurrentDeviceOwner(String currentDeviceOwner) {
        this.currentDeviceOwner = currentDeviceOwner;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Date getNextLeasingDate() {
        return nextLeasingDate;
    }

    public void setNextLeasingDate(Date nextLeasingDate) {
        this.nextLeasingDate = nextLeasingDate;
    }

    public Date getNextScheduledBookingDate() {
        return nextScheduledBookingDate;
    }

    public void setNextScheduledBookingDate(Date nextScheduledBookingDate) {
        this.nextScheduledBookingDate = nextScheduledBookingDate;
    }

    public Date getNextScheduledBookingTillDate() {
        return nextScheduledBookingTillDate;
    }

    public void setNextScheduledBookingTillDate(Date nextScheduledBookingTillDate) {
        this.nextScheduledBookingTillDate = nextScheduledBookingTillDate;
    }

    public ArrayList<DeviceBookingHistory> getBookingHistorylist() {
        return bookingHistorylist;
    }

    public void setBookingHistorylist(ArrayList<DeviceBookingHistory> bookingHistorylist) {
        this.bookingHistorylist = bookingHistorylist;
    }

    public void createNewDeviceBookingHistoryArraylist(){
        if (bookingHistorylist == null){
        this.bookingHistorylist = new ArrayList<>();
        }
    }
    
    public void addStartEndDateinBookingHistory(Date startDate, Date endDate, String bookinEnterprise){
        DeviceBookingHistory dbh = new DeviceBookingHistory();
        this.bookingHistorylist.add(dbh);
        dbh.setPreviousScheduledBookingDate(startDate);
        dbh.setPreviousScheduledBookingTillDate(endDate);
        dbh.setPreviousBookingEnterprise(bookinEnterprise);
    }
    
}
