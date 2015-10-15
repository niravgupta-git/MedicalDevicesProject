/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.OperatingRoom;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class OperatingRoom {
    
    private String roomName;
    private int roomNo;
    private String hospitalName; 
    private Date nextBookedForDate;
    private String bookedForDoctor;
    private String bookedForOperationType;
    private String bookedStatus;
    private ArrayList<RoomBookingHistory> bookingHistorylist;
    
    public enum bookedStatusType{
        BOOKED("BOOKED"),
        AVAILABLE("AVAILABLE");
        
        private String value;
        
        private bookedStatusType(String value){
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
    
    
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }


    public String getBookedForDoctor() {
        return bookedForDoctor;
    }

    public void setBookedForDoctor(String bookedForDoctor) {
        this.bookedForDoctor = bookedForDoctor;
    }

    public Date getNextBookedForDate() {
        return nextBookedForDate;
    }

    public void setNextBookedForDate(Date nextBookedForDate) {
        this.nextBookedForDate = nextBookedForDate;
    }

    public String getBookedForOperationType() {
        return bookedForOperationType;
    }

    public void setBookedForOperationType(String bookedForOperationType) {
        this.bookedForOperationType = bookedForOperationType;
    }
    
    

    public String getBookedStatus() {
        return bookedStatus;
    }

    public void setBookedStatus(String bookedStatus) {
        this.bookedStatus = bookedStatus;
    }

    public ArrayList<RoomBookingHistory> getBookingHistorylist() {
        return bookingHistorylist;
    }

    public void setBookingHistorylist(ArrayList<RoomBookingHistory> bookingHistorylist) {
        this.bookingHistorylist = bookingHistorylist;
    }

    public void createNewDeviceBookingHistoryArraylist(){
        if (bookingHistorylist == null){
        this.bookingHistorylist = new ArrayList<>();
        }
    }
    
    public void addBookingDateinBookingHistory(Date startDate,String operationType, String bookingDoctor){
        RoomBookingHistory rbh = new RoomBookingHistory();
        this.bookingHistorylist.add(rbh);
        rbh.setPreviousScheduledBookingDate(startDate);
        rbh.setBookedForDoctor(bookedForDoctor);
        rbh.setBookedForOperationType(operationType);
    }
    
    @Override
    public String toString() {
        return roomName;
    }

   
    
    
    
}
