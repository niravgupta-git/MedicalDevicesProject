/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class MedicalDeviceCatalog {
    
    private ArrayList<MedicalDevice> productCatalog;
    
    public MedicalDeviceCatalog() {
        productCatalog = new ArrayList<MedicalDevice>();
    }

    public ArrayList<MedicalDevice> getProductCatalog() {
        return productCatalog;
    }
    
    public MedicalDevice addProduct() {
        MedicalDevice p = new MedicalDevice();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(MedicalDevice p) {
        productCatalog.remove(p);
    }
    
    public MedicalDevice searchProduct(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(MedicalDevice p : productCatalog) {
            if(p.getModelNumber() == id) {
                return p;
            }
        }
        return null;
    }
    
    public MedicalDevice addDeviceInProductCatalog(MedicalDevice md){
        productCatalog.add(md);
        return md;
    }
    
    public int calculateTotalProdInventoryValue(Supplier s){
        int totalInventoryValue=0;
        for(MedicalDevice md: s.getProductCatalog().getProductCatalog()) {
            totalInventoryValue = totalInventoryValue * (md.getAvailability() * md.getPurchaseCost());
        }
        return totalInventoryValue;
    }
}
