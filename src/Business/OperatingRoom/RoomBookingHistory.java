/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.OperatingRoom;

import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class RoomBookingHistory {
    
    private Date previousScheduledBookingDate;
    private String bookedForDoctor;
    private String bookedForOperationType;
    
    public Date getPreviousScheduledBookingDate() {
        return previousScheduledBookingDate;
    }

    public void setPreviousScheduledBookingDate(Date previousScheduledBookingDate) {
        this.previousScheduledBookingDate = previousScheduledBookingDate;
    }

    public String getBookedForDoctor() {
        return bookedForDoctor;
    }

    public void setBookedForDoctor(String bookedForDoctor) {
        this.bookedForDoctor = bookedForDoctor;
    }

    public String getBookedForOperationType() {
        return bookedForOperationType;
    }

    public void setBookedForOperationType(String bookedForOperationType) {
        this.bookedForOperationType = bookedForOperationType;
    }
    
    
    
}
