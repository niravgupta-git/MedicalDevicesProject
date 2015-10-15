/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Supplier.Supplier;

/**
 *
 * @author nirav gupta
 */
public class SupplierEnrollmentRequest extends WorkRequest{
    private String enrollmentRequest;
    Supplier supplier;
    

    public String getEnrollmentRequest() {
        return enrollmentRequest;
    }

    public void setEnrollmentRequest(String enrollmentRequest) {
        this.enrollmentRequest = enrollmentRequest;
    }

//    @Override
//    public String toString() {
//        return super.getSender().getEmployee().getName();
//    }
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    
    
}
