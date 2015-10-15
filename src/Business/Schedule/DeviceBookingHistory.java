/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Schedule;

import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class DeviceBookingHistory {
    
    private Date previousScheduledBookingDate;
    private Date previousScheduledBookingTillDate;
    private String previousBookingEnterprise;
    private boolean failureStatusValue; 
    private String failureStatusReason;
    private boolean failureFixedValue;
    private String failureFixedMessage;
    
    public Date getPreviousScheduledBookingDate() {
        return previousScheduledBookingDate;
    }

    public void setPreviousScheduledBookingDate(Date previousScheduledBookingDate) {
        this.previousScheduledBookingDate = previousScheduledBookingDate;
    }

    public Date getPreviousScheduledBookingTillDate() {
        return previousScheduledBookingTillDate;
    }

    public void setPreviousScheduledBookingTillDate(Date previousScheduledBookingTillDate) {
        this.previousScheduledBookingTillDate = previousScheduledBookingTillDate;
    }

    public String getPreviousBookingEnterprise() {
        return previousBookingEnterprise;
    }

    public void setPreviousBookingEnterprise(String previousBookingEnterprise) {
        this.previousBookingEnterprise = previousBookingEnterprise;
    }

    public boolean isFailureStatusValue() {
        return failureStatusValue;
    }

    public void setFailureStatusValue(boolean failureStatusValue) {
        this.failureStatusValue = failureStatusValue;
    }

    public String getFailureStatusReason() {
        return failureStatusReason;
    }

    public void setFailureStatusReason(String failureStatusReason) {
        this.failureStatusReason = failureStatusReason;
    }

    public boolean isFailureFixedValue() {
        return failureFixedValue;
    }

    public void setFailureFixedValue(boolean failureFixedValue) {
        this.failureFixedValue = failureFixedValue;
    }

    public String getFailureFixedMessage() {
        return failureFixedMessage;
    }

    public void setFailureFixedMessage(String failureFixedMessage) {
        this.failureFixedMessage = failureFixedMessage;
    }
    
    
    
}
