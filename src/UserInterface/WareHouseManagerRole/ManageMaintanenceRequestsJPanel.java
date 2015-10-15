/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.WareHouseManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Enterprise.WarehouseEnterprise;
import Business.Network.Network;
import Business.Organization.CareTeamOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Organization.WarehouseOrganization;
import Business.Supplier.MedicalDevice;
import Business.Supplier.Supplier;
import Business.WorkQueue.MaintenanceAlertRequest;
import Business.WorkQueue.MaintenanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ManageMaintanenceRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMaintanenceRequestsJPanel
     */
    JPanel userProcessContainer; Enterprise enterprise; Organization organization; EcoSystem system;
    Date sysDate;
    
    public ManageMaintanenceRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        this.organization=organization;
        sysDate = new Date();
                
        populateDeviceJtable();
        populateRequestTable();
    }

    public void populateRequestTable(){
            DefaultTableModel model = (DefaultTableModel) deviceRequestjTable1.getModel();
            model.setRowCount(0);

            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof SupplierEnterprise) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            if (org instanceof SupplierOrganization) {
                                for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                                    if (request instanceof MaintenanceWorkRequest){
                                    Object[] row = new Object[9];
                                    row[0] = request;
                                    row[1] = request.getRequestDate();
                                    row[2] = request.getStatus();
                                    row[3] = ((MaintenanceWorkRequest) request).getRequestedDevice().getDeviceName();
                                    row[4] = ((MaintenanceWorkRequest) request).getRequestedDevice().getDeviceType();
                                    row[5] = ((MaintenanceWorkRequest) request).getRequestedDevice().getCurrentLocation();
                                    row[6] = ((MaintenanceWorkRequest) request).getRequestedDevice().getDeviceStatus();
                                    row[7] = ((MaintenanceWorkRequest) request).getRequestedDevice().getNextMaitainenceDueDate();
                                    row[8] = ((MaintenanceWorkRequest) request).getMaintanenceStatus();
                                    model.addRow(row);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    
     public void populateDeviceJtable(){
        
        DefaultTableModel dtm = (DefaultTableModel) devicejTable1.getModel();
        dtm.setRowCount(0);
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        cal.setTime(date);
        cal.set(Calendar.DATE, Calendar.DATE + 30);
        date = cal.getTime();
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (!enterprise2.getEnterpriseType().getValue().equalsIgnoreCase("Supplier")) {
                    for (Organization o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equalsIgnoreCase("Warehouse Organization")) {
                            WarehouseOrganization whOrg = (WarehouseOrganization) o;
                            for (MedicalDevice md : whOrg.getMedicalDeviceCatalog().getProductCatalog()) {
                                    Object[] row = new Object[8];
                                    row[0] = md;
                                    row[1] = md.getDeviceType();
                                    row[2] = md.getCurrentLocation();
                                    row[3] = md.getDeviceStatus();
                                    row[4] = md.getAvailability();
                                    row[5] = md.getWarrantyExpirationDate();
                                    row[6] = md.getPreviousMaitainenceDate();
                                    row[7] = md.getNextMaitainenceDueDate();
                                    dtm.addRow(row);         
                            }
                        }
                        if (o.getName().equalsIgnoreCase("Care Team Organization")) {
                            CareTeamOrganization ctOrg = (CareTeamOrganization) o;
                            for (MedicalDevice md : ctOrg.getMedicalDeviceCatalog().getProductCatalog()) {
                                Object[] row = new Object[8];
                                row[0] = md;
                                row[1] = md.getDeviceType();
                                row[2] = md.getCurrentLocation();
                                row[3] = md.getDeviceStatus();
                                row[4] = md.getAvailability();
                                row[5] = md.getWarrantyExpirationDate();
                                row[6] = md.getPreviousMaitainenceDate();
                                row[7] = md.getNextMaitainenceDueDate();
                                dtm.addRow(row);

                            }
                        }
                    }
                }
            }
        }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deviceRequestjTable1 = new javax.swing.JTable();
        makeDeviceAvailablejButton1 = new javax.swing.JButton();
        requestDeviceMainenancejButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        devicejTable1 = new javax.swing.JTable();
        refreshjButton2 = new javax.swing.JButton();
        closeRequestjButton2 = new javax.swing.JButton();
        backjButton4 = new javax.swing.JButton();
        datejButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE MAINTANENCE REQUESTS");

        deviceRequestjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Date", "Request Status", "Device Name", "Type", "Current Location", "Device Status", "Next Maintainence Date", "Maitanence Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deviceRequestjTable1);

        makeDeviceAvailablejButton1.setBackground(new java.awt.Color(255, 255, 0));
        makeDeviceAvailablejButton1.setText("Make Device Available");
        makeDeviceAvailablejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeDeviceAvailablejButton1ActionPerformed(evt);
            }
        });

        requestDeviceMainenancejButton2.setBackground(new java.awt.Color(255, 255, 0));
        requestDeviceMainenancejButton2.setText("Request Maintainence");
        requestDeviceMainenancejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDeviceMainenancejButton2ActionPerformed(evt);
            }
        });

        devicejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Type", "Current Location", "Status", "Availability", "Expiry Date", "Previous Maintainence Date", "Next Maintainence Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(devicejTable1);

        refreshjButton2.setText("Refresh");
        refreshjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButton2ActionPerformed(evt);
            }
        });

        closeRequestjButton2.setBackground(new java.awt.Color(153, 255, 153));
        closeRequestjButton2.setText("Close Request");
        closeRequestjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeRequestjButton2ActionPerformed(evt);
            }
        });

        backjButton4.setText("<<Back");
        backjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton4ActionPerformed(evt);
            }
        });

        datejButton2.setText("test");
        datejButton2.setEnabled(false);
        datejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datejButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton4)
                                .addGap(95, 95, 95)
                                .addComponent(datejButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel1)
                                .addGap(88, 88, 88)
                                .addComponent(refreshjButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(requestDeviceMainenancejButton2)
                        .addGap(96, 96, 96)
                        .addComponent(makeDeviceAvailablejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(closeRequestjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshjButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestDeviceMainenancejButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeDeviceAvailablejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeRequestjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton4)
                    .addComponent(datejButton2))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButton2ActionPerformed
        populateDeviceJtable();
        populateRequestTable();
    }//GEN-LAST:event_refreshjButton2ActionPerformed

    private void requestDeviceMainenancejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDeviceMainenancejButton2ActionPerformed
       
        int selectedDevice = devicejTable1.getSelectedRow();
        if ( selectedDevice < 0){
            JOptionPane.showMessageDialog(null, "Please select a device from device table");
            return;
        }

        MedicalDevice device = (MedicalDevice) devicejTable1.getValueAt(selectedDevice, 0);
        
        if (device.getDeviceStatus().equalsIgnoreCase(MedicalDevice.devicebookedStatusType.INMAINTENENCE.getValue())){
            JOptionPane.showMessageDialog(null, "ERROR: Device already in maintenance");
            return;
        }
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getName().equalsIgnoreCase(device.getCurrentLocation())) {
                    if (e instanceof WarehouseEnterprise){
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            if (org instanceof WarehouseOrganization){
                                WarehouseOrganization wareHouseOrg = (WarehouseOrganization) org;
                                wareHouseOrg.getMedicalDeviceCatalog().removeProduct(device);
                            }
                        }
                    }else if (e instanceof HospitalEnterprise){
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            if (org instanceof CareTeamOrganization){
                                CareTeamOrganization careTeamOrg = (CareTeamOrganization) org;
                                careTeamOrg.getMedicalDeviceCatalog().removeProduct(device);
                            }
                        }
                    }
                }
            }
        }
        
        device.setDeviceStatus(MedicalDevice.devicebookedStatusType.INMAINTENENCE.getValue());
        device.setCurrentLocation(enterprise.getName());
        
        MaintenanceWorkRequest mainWrkReq = new MaintenanceWorkRequest();
        mainWrkReq.setRequestedDevice(device);
        mainWrkReq.setMessage("Maintenance Requested");
        mainWrkReq.setStatus("pending");
        mainWrkReq.setMaintanenceStatus("Pending");
        
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof SupplierEnterprise) {
                    for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof SupplierOrganization) {
                            SupplierOrganization sporg = (SupplierOrganization) org;
                            for (Supplier s : sporg.getSupplierDirectory().getSupplierDict()) {
                                if (s.getSupplyName().equalsIgnoreCase(device.getManufacturerName())) {
                                    org.getWorkQueue().getWorkRequestList().add(mainWrkReq);
                                    JOptionPane.showMessageDialog(null, "Device Requested for Maintainence");
                                }
                            }
                        }
                    }
                }
            }
        }
        populateRequestTable();
        populateDeviceJtable();
    }//GEN-LAST:event_requestDeviceMainenancejButton2ActionPerformed

    private void makeDeviceAvailablejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeDeviceAvailablejButton1ActionPerformed
        
        int selectedDevice = devicejTable1.getSelectedRow();
        
        if ( selectedDevice < 0){
            JOptionPane.showMessageDialog(null, "Please select a device from device table");
            return;
        }

        MedicalDevice device = (MedicalDevice) devicejTable1.getValueAt(selectedDevice, 0);
        
        if (device.getDeviceStatus().equalsIgnoreCase(MedicalDevice.devicebookedStatusType.AVAILABLE.getValue())){
            JOptionPane.showMessageDialog(null, "ERROR: Device status already available!! ");
            return;
        }
        
        device.setDeviceStatus(MedicalDevice.devicebookedStatusType.AVAILABLE.getValue());
        device.setCurrentLocation(enterprise.getName());
        JOptionPane.showMessageDialog(null,"Device made Available for Scheduling !!!");
        
        populateRequestTable();
        populateDeviceJtable();
    }//GEN-LAST:event_makeDeviceAvailablejButton1ActionPerformed

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton4ActionPerformed

    private void closeRequestjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeRequestjButton2ActionPerformed
        
        int selectedRequest = deviceRequestjTable1.getSelectedRow();
        
        if (selectedRequest < 0 ){
            JOptionPane.showMessageDialog(null, "Please select a request from request table");
            return;
        }
        
        WorkRequest request = (WorkRequest)deviceRequestjTable1.getValueAt(selectedRequest, 0);
        
        if (((MaintenanceWorkRequest) request).getMessage().equalsIgnoreCase("Maintenance In Progress")){
            JOptionPane.showMessageDialog(null, "ERROR: Cannot close as Device already in maintenance!!");
            return;
        }
        
        int reply = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO CLOSE REQUEST???", "!!! CLOSE REQUEST !!!", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof SupplierEnterprise) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            if (org instanceof SupplierOrganization) {
                                org.getWorkQueue().getWorkRequestList().remove(request);
                                
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Request Resolved and Closed");
            
        }else{
        return;
    }
        populateRequestTable();
                    
//                if (e instanceof WarehouseEnterprise) {
//                    for (Organization org4 : e.getOrganizationDirectory().getOrganizationList()) {
//                        if (org4 instanceof WarehouseOrganization) {
//                            for (WorkRequest request33 : org4.getWorkQueue().getWorkRequestList()) {
//                                if (request33 instanceof MaintenanceAlertRequest) {
//                                    if (((MaintenanceWorkRequest) request).getRequestedDevice().getDeviceName().equalsIgnoreCase(((MaintenanceAlertRequest) request33).getDevice().getDeviceName())) {
//                                        
//                                            org4.getWorkQueue().getWorkRequestList().remove(request);
//                                            JOptionPane.showMessageDialog(null, "Alert Request Closed");
//                                        
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//                if (e instanceof HospitalEnterprise) {
//                    for (Organization org5 : e.getOrganizationDirectory().getOrganizationList()) {
//                        if (org5 instanceof CareTeamOrganization) {
//                            for (WorkRequest request33 : org5.getWorkQueue().getWorkRequestList()) {
//                                if (request33 instanceof MaintenanceAlertRequest) {
//                                    if (((MaintenanceWorkRequest) request).getRequestedDevice().getDeviceName().equalsIgnoreCase(((MaintenanceAlertRequest) request33).getDevice().getDeviceName())) {
//                                        
//                                            org5.getWorkQueue().getWorkRequestList().remove(request);
//                                            JOptionPane.showMessageDialog(null, "Alert Request Closed");
//                                        
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
         
    }//GEN-LAST:event_closeRequestjButton2ActionPerformed

    private void datejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datejButton2ActionPerformed
                                    Date date = new Date();
                                //if (md.getNextMaitainenceDueDate().after(date)){
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                                    String s = dateFormat.format(date);
                                    System.out.println("full date is :" +s);
                                    
                                    SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd");
                                    int day = (Integer.valueOf( dateFormat2.format(date)));
                                    System.out.println("day is :" + day);
                                
                                    Calendar cal = Calendar.getInstance();
                                    cal.setTime(date);
                                    //cal.add(Calendar.DATE, 10);
                                    cal.set(Calendar.DATE, Calendar.DATE-10);
                                    Date newDate = cal.getTime();
                                    //newDate = dateFormat.parse(newDate);
                                    System.out.println("new date is :" + newDate);
    }//GEN-LAST:event_datejButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton4;
    private javax.swing.JButton closeRequestjButton2;
    private javax.swing.JButton datejButton2;
    private javax.swing.JTable deviceRequestjTable1;
    private javax.swing.JTable devicejTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton makeDeviceAvailablejButton1;
    private javax.swing.JButton refreshjButton2;
    private javax.swing.JButton requestDeviceMainenancejButton2;
    // End of variables declaration//GEN-END:variables
}
