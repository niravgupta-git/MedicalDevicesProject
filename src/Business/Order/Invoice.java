/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

/**
 *
 * @author nirav gupta
 */
public class Invoice {
    
    private static int count;
    private int invoiceId;
    private String paidStatus;
    private int totalOrderAmount;
    private String boughtDeviceName;
    
    public Invoice(){
        count++;
        invoiceId=count;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(String paidStatus) {
        this.paidStatus = paidStatus;
    }

    public int getTotalOrderAmount() {
        return totalOrderAmount;
    }

    public void setTotalOrderAmount(int totalOrderAmount) {
        this.totalOrderAmount = totalOrderAmount;
    }

    public String getBoughtDeviceName() {
        return boughtDeviceName;
    }

    public void setBoughtDeviceName(String boughtDeviceName) {
        this.boughtDeviceName = boughtDeviceName;
    }
    
    
}
