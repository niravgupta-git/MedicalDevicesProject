/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.WareHouseManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PHSenterprise;
import Business.Network.Network;
import Business.Organization.CareTeamOrganization;
import Business.Organization.Organization;
import Business.Organization.PHSorganization;
import Business.Organization.WarehouseOrganization;
import Business.Supplier.MedicalDevice;
import Business.WorkQueue.BuyNewMedicalDeviceRequest;
import Business.WorkQueue.GetDeviceFromOtherEnterpriseRequest;
import Business.WorkQueue.SupplierEnrollmentRequest;
import Business.WorkQueue.SurgeryOperationWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ManageDeviceMovementRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMedicalDeviceJPanel
     */
    JPanel userProcessContainer; Enterprise enterprise; Organization organization; EcoSystem system;
    
    public ManageDeviceMovementRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        this.organization=organization;
        populateRequestTable();
        populateDeviceTable();
        
    }

    public void populateRequestTable(){
            DefaultTableModel model = (DefaultTableModel) requestjTable1.getModel();
            model.setRowCount(0);


                        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (org instanceof WarehouseOrganization) {
                                for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                                    Object[] row = new Object[9];
                                    row[0] = request;
                                    row[1] = request.getSender();
                                    row[2] = request.getRequestDate();
                                    row[3] = ((GetDeviceFromOtherEnterpriseRequest) request).getRequiredMedicalDeviceType();
                                    row[4] = ((GetDeviceFromOtherEnterpriseRequest) request).getAssignedMedicalDeviceType();
                                    row[5] = ((GetDeviceFromOtherEnterpriseRequest) request).getDeviceRequiredAtHospital();
                                    row[6] = ((GetDeviceFromOtherEnterpriseRequest) request).getDeviceCurrentLocation();
                                    row[7] = ((GetDeviceFromOtherEnterpriseRequest) request).getDeviceShippingStatus();
                                    row[8] = ((GetDeviceFromOtherEnterpriseRequest) request).getEstimatedDeliveryDate();
                                    model.addRow(row);
                                }
                            }
                        }

        }


    public void populateDeviceTable(){
       
    DefaultTableModel dtm = (DefaultTableModel) devicejTable1.getModel();
    dtm.setRowCount(0);
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (!enterprise2.getEnterpriseType().getValue().equalsIgnoreCase("Supplier")) {
                    for (Organization o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getName().equalsIgnoreCase("Warehouse Organization")) {
                            WarehouseOrganization whOrg = (WarehouseOrganization) o;
                            for (MedicalDevice md : whOrg.getMedicalDeviceCatalog().getProductCatalog()) {
                                Object[] row = new Object[6];
                                row[0] = md;
                                row[1] = md.getDeviceType();
                                row[2] = md.getCurrentLocation();
                                row[3] = md.getDeviceStatus();
                                row[4] = md.getNextScheduledBookingDate();
                                row[5] = md.getAvailability();
                                dtm.addRow(row);
                            }
                        }
                        if (o.getName().equalsIgnoreCase("Care Team Organization")) {
                            CareTeamOrganization ctOrg = (CareTeamOrganization) o;
                            for (MedicalDevice md : ctOrg.getMedicalDeviceCatalog().getProductCatalog()) {
                                Object[] row = new Object[6];
                                row[0] = md;
                                row[1] = md.getDeviceType();
                                row[2] = md.getCurrentLocation();
                                row[3] = md.getDeviceStatus();
                                row[4] = md.getNextMaitainenceDueDate();
                                row[5] = md.getAvailability();
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
        devicejTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestjTable1 = new javax.swing.JTable();
        shipDeviceToRequestedLocationjButton1 = new javax.swing.JButton();
        estimatedDeliveryDatejDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        backjButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        requestNewDeviceBuyjButton2 = new javax.swing.JButton();
        viewNewDeviceBuyRequestjButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MANAGE DEVICE MOVEMENT REQUESTS");

        devicejTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Type", "Current Location", "Available Status", "Next Scheduled Date", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(devicejTable1);
        if (devicejTable1.getColumnModel().getColumnCount() > 0) {
            devicejTable1.getColumnModel().getColumn(0).setResizable(false);
            devicejTable1.getColumnModel().getColumn(1).setResizable(false);
            devicejTable1.getColumnModel().getColumn(2).setResizable(false);
            devicejTable1.getColumnModel().getColumn(3).setResizable(false);
            devicejTable1.getColumnModel().getColumn(4).setResizable(false);
            devicejTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        requestjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Date", "Required Device", "Assigned device Type", "Location required", "Current Location", "Shipping status", "Estimated delivery date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestjTable1);
        if (requestjTable1.getColumnModel().getColumnCount() > 0) {
            requestjTable1.getColumnModel().getColumn(0).setResizable(false);
            requestjTable1.getColumnModel().getColumn(1).setResizable(false);
            requestjTable1.getColumnModel().getColumn(2).setResizable(false);
            requestjTable1.getColumnModel().getColumn(3).setResizable(false);
            requestjTable1.getColumnModel().getColumn(5).setResizable(false);
            requestjTable1.getColumnModel().getColumn(6).setResizable(false);
            requestjTable1.getColumnModel().getColumn(7).setResizable(false);
            requestjTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        shipDeviceToRequestedLocationjButton1.setBackground(new java.awt.Color(204, 204, 0));
        shipDeviceToRequestedLocationjButton1.setText("Ship Device to Requested Location");
        shipDeviceToRequestedLocationjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipDeviceToRequestedLocationjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Estimated Delivery Date:");

        backjButton4.setText("<<Back");
        backjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        requestNewDeviceBuyjButton2.setBackground(new java.awt.Color(153, 153, 255));
        requestNewDeviceBuyjButton2.setText("Request New Device Buy to PHS Manager");
        requestNewDeviceBuyjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestNewDeviceBuyjButton2ActionPerformed(evt);
            }
        });

        viewNewDeviceBuyRequestjButton2.setBackground(new java.awt.Color(153, 153, 255));
        viewNewDeviceBuyRequestjButton2.setText("View New Device Buy Request Status>>");
        viewNewDeviceBuyRequestjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNewDeviceBuyRequestjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(shipDeviceToRequestedLocationjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(estimatedDeliveryDatejDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(backjButton4)
                        .addGap(41, 41, 41)
                        .addComponent(requestNewDeviceBuyjButton2)
                        .addGap(29, 29, 29)
                        .addComponent(viewNewDeviceBuyRequestjButton2)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shipDeviceToRequestedLocationjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estimatedDeliveryDatejDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton4)
                    .addComponent(requestNewDeviceBuyjButton2)
                    .addComponent(viewNewDeviceBuyRequestjButton2))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void shipDeviceToRequestedLocationjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipDeviceToRequestedLocationjButton1ActionPerformed

        int selectedRequest = requestjTable1.getSelectedRow();
        int selectedDevice = devicejTable1.getSelectedRow();
        
        if (selectedRequest < 0 || selectedDevice < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from both request and device table");
            return;
        }
        
        WorkRequest request = (WorkRequest)requestjTable1.getValueAt(selectedRequest, 0);
        MedicalDevice device = (MedicalDevice) devicejTable1.getValueAt(selectedDevice, 0);
        GetDeviceFromOtherEnterpriseRequest deviceShiftequest = (GetDeviceFromOtherEnterpriseRequest) request;
        
        if (deviceShiftequest.getDeviceShippingStatus().equalsIgnoreCase(GetDeviceFromOtherEnterpriseRequest.deviceShippingStatus.INSHIPPING.getValue())){
            JOptionPane.showMessageDialog(null, "ERROR: Request already has device in shipping ");
            return;
        }
        
        if (deviceShiftequest.getAssignedMedicalDeviceType()!=null){
            JOptionPane.showMessageDialog(null, "ERROR: Device is already assigned for request to shipping ");
            return;
        }
        
        if (estimatedDeliveryDatejDateChooser1.getDate() == null){
            JOptionPane.showMessageDialog(null, "ERROR: Please enter delivery date !!!");
            return;
        }
        
        if(deviceShiftequest.getRequiredMedicalDeviceType().equalsIgnoreCase(device.getDeviceType()) && deviceShiftequest.getDeviceRequiredAtHospital().equalsIgnoreCase(device.getCurrentLocation())){
            JOptionPane.showMessageDialog(null, "ERROR: Device of the requested type already exixts in the requested hospital !!!");
            return;
        }
        
        Date currentDate = new Date();
        if (estimatedDeliveryDatejDateChooser1.getDate().before(currentDate)){
            JOptionPane.showMessageDialog(null, "ERROR: Delivery Date cannot be before current date");
            return;
        }
        
        Date date2 = estimatedDeliveryDatejDateChooser1.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date2);
        cal.set(Calendar.DATE, Calendar.DATE - 10);
        date2 = cal.getTime();
        if (currentDate.compareTo(date2) > 0) {
           JOptionPane.showMessageDialog(null, "WARNING: Please input delivery date atleast more than 2 weeks from current date!!");
            return; 
        }
        
        //device.setAvailability(device.getAvailability()-1);
        
        if (!((GetDeviceFromOtherEnterpriseRequest) request).getRequiredMedicalDeviceType().equalsIgnoreCase(device.getDeviceType())){
            JOptionPane.showMessageDialog(null, "Wrong device type selected for the request ");
            return;
        }
        
        
        //if (device.getAvailability() < 1) {
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise2.getName().equalsIgnoreCase(device.getCurrentLocation())) {
                        for (Organization o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
                            if (o instanceof CareTeamOrganization ) {
                                CareTeamOrganization ctOrg = (CareTeamOrganization) o;
                                ctOrg.getMedicalDeviceCatalog().removeProduct(device);
                                
                            } else if (o instanceof WarehouseOrganization ) {
                                WarehouseOrganization whOrg = (WarehouseOrganization) o;
                                whOrg.getMedicalDeviceCatalog().removeProduct(device);
                                
                            }
                        }
                    }
                }
            }
        //}
        
        deviceShiftequest.setAssignedMedicalDeviceType(device.getDeviceType());
        deviceShiftequest.setAssignedDevice(device);
        deviceShiftequest.getAssignedDevice().setDeviceStatus(GetDeviceFromOtherEnterpriseRequest.deviceShippingStatus.INSHIPPING.getValue());
        deviceShiftequest.setEstimatedDeliveryDate(estimatedDeliveryDatejDateChooser1.getDate());
        deviceShiftequest.setDeviceShippingStatus(GetDeviceFromOtherEnterpriseRequest.deviceShippingStatus.INSHIPPING.getValue());
        JOptionPane.showMessageDialog(null, "Device requested for shipping and added in device list of requested organization with pending status!!!");
        

        populateRequestTable();
        populateDeviceTable();
        
    }//GEN-LAST:event_shipDeviceToRequestedLocationjButton1ActionPerformed

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateDeviceTable();
        populateRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void requestNewDeviceBuyjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestNewDeviceBuyjButton2ActionPerformed
        
        int selectedRequest = requestjTable1.getSelectedRow();

        if (selectedRequest < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from request table");
            return;
        }
        
        WorkRequest deviceRequest = (WorkRequest)requestjTable1.getValueAt(selectedRequest, 0);
        
        if (((GetDeviceFromOtherEnterpriseRequest) deviceRequest).getAssignedDevice()!=null){
            JOptionPane.showMessageDialog(null, "ERROR: Cannot create new device request as same device type already assigned !!!!");
            return;
        }
        
        BuyNewMedicalDeviceRequest buyingRequest = new BuyNewMedicalDeviceRequest();
       
        buyingRequest.setRequiredMedicalDeviceType(((GetDeviceFromOtherEnterpriseRequest) deviceRequest).getRequiredMedicalDeviceType() );
        buyingRequest.setStatus("Pending");
        Date date = new Date();
        buyingRequest.setRequestDate(date);
        buyingRequest.setLocationRequired(((GetDeviceFromOtherEnterpriseRequest) deviceRequest).getDeviceRequiredAtHospital());
        buyingRequest.setMessage("Buy New Device");
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof PHSenterprise) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof PHSorganization) {
                            for (WorkRequest request : o.getWorkQueue().getWorkRequestList()) {
                                    if ((!(request instanceof SupplierEnrollmentRequest)) && ((BuyNewMedicalDeviceRequest) request).getRequiredMedicalDeviceType().equalsIgnoreCase(buyingRequest.getRequiredMedicalDeviceType())){
                                        JOptionPane.showMessageDialog(null, "Request already created for this device type!!!");
                                        return;
                                    }else {
                                        o.getWorkQueue().getWorkRequestList().add(buyingRequest);
                                        JOptionPane.showMessageDialog(null, "New Device Buying Request Created"); 
                                     }
                            }
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_requestNewDeviceBuyjButton2ActionPerformed

    private void viewNewDeviceBuyRequestjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNewDeviceBuyRequestjButton2ActionPerformed
        RequestDeviceBuyJPanel RequestDeviceBuy = new RequestDeviceBuyJPanel(userProcessContainer,enterprise, organization, system);
        userProcessContainer.add("RequestDeviceBuy", RequestDeviceBuy);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewNewDeviceBuyRequestjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton4;
    private javax.swing.JTable devicejTable1;
    private com.toedter.calendar.JDateChooser estimatedDeliveryDatejDateChooser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestNewDeviceBuyjButton2;
    private javax.swing.JTable requestjTable1;
    private javax.swing.JButton shipDeviceToRequestedLocationjButton1;
    private javax.swing.JButton viewNewDeviceBuyRequestjButton2;
    // End of variables declaration//GEN-END:variables
}
