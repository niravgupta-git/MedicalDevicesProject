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
public class PersonSchedule {
    
    private String currentVacantStatus;
    private Date nextAvailableDate;
    private Date nextScheduledActivityDate;
    private String nextScheduledActivity;

    public String getCurrentVacantStatus() {
        return currentVacantStatus;
    }

    public void setCurrentVacantStatus(String currentVacantStatus) {
        this.currentVacantStatus = currentVacantStatus;
    }

    public Date getNextAvailableDate() {
        return nextAvailableDate;
    }

    public void setNextAvailableDate(Date nextAvailableDate) {
        this.nextAvailableDate = nextAvailableDate;
    }

    public Date getNextScheduledActivityDate() {
        return nextScheduledActivityDate;
    }

    public void setNextScheduledActivityDate(Date nextScheduledActivityDate) {
        this.nextScheduledActivityDate = nextScheduledActivityDate;
    }


    public String getNextScheduledActivity() {
        return nextScheduledActivity;
    }

    public void setNextScheduledActivity(String nextScheduledActivity) {
        this.nextScheduledActivity = nextScheduledActivity;
    }
    
    
    
}
