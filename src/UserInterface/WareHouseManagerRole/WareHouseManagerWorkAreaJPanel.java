/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.WareHouseManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class WareHouseManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Enterprise enterprise;
    Organization organization;
    
    public WareHouseManagerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        this.organization=organization;
        //populateDeviceAlertJtable();
    }

    
//    public void calculateMaintenanceAlert(){
//        
//        Calendar cal = Calendar.getInstance();
//        Date date = new Date();
//        cal.setTime(date);
//        cal.set(Calendar.DATE, Calendar.DATE + 10);
//        date = cal.getTime();
//        
//        //Date daysBeforeMaintenanceDate = cal.getTime();
//        for (Network network : system.getNetworkList()) {
//            for (Enterprise enterprise2 : network.getEnterpriseDirectory().getEnterpriseList()) {
//                if (!enterprise2.getEnterpriseType().getValue().equalsIgnoreCase("Supplier")) {
//                    for (Organization o : enterprise2.getOrganizationDirectory().getOrganizationList()) {
//                        if (o.getName().equalsIgnoreCase("Warehouse Organization")) {
//                            WarehouseOrganization whOrg = (WarehouseOrganization) o;
//                            for (MedicalDevice md : whOrg.getMedicalDeviceCatalog().getProductCatalog()) {
//                                
//                                    if (date.compareTo(md.getNextMaitainenceDueDate()) > 0) {
//
//                                    MaintenanceAlertRequest mar = new MaintenanceAlertRequest();
//                                    mar.setDevice(md);
//                                    mar.setStatus("Pending");
//                                    mar.setMessage("Immediate Maintainence");
//                                    //organization.getWorkQueue().getWorkRequestList().add(mar);
////                                    for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()){
////                                        if (wr instanceof MaintenanceAlertRequest){
////                                            if (! ((MaintenanceAlertRequest)wr).getDevice().getDeviceName().equalsIgnoreCase(mar.getDevice().getDeviceName()) &&  ((MaintenanceAlertRequest)wr).getDevice().getDeviceID()==(mar.getDevice().getDeviceID())){
////                                                o.getWorkQueue().getWorkRequestList().add(mar);
////                                            }
////                                        }
////                                    } 
//                                }          
//                            }
//                        }
//                        if (o.getName().equalsIgnoreCase("Care Team Organization")) {
//                            CareTeamOrganization ctOrg = (CareTeamOrganization) o;
//                            for (MedicalDevice md : ctOrg.getMedicalDeviceCatalog().getProductCatalog()) {
//                                if (date.compareTo(md.getNextMaitainenceDueDate()) > 0) {
//                                    MaintenanceAlertRequest mar2 = new MaintenanceAlertRequest();
//                                    mar2.setDevice(md);
//                                    mar2.setStatus("Pending");
//                                    mar2.setMessage("Immediate Maintainence");
//                                   //organization.getWorkQueue().getWorkRequestList().add(mar2);
////                                    for (WorkRequest wr : ctOrg.getWorkQueue().getWorkRequestList()){
////                                        if (wr instanceof MaintenanceAlertRequest){
////                                            if (! ((MaintenanceAlertRequest)wr).getDevice().getDeviceName().equalsIgnoreCase(mar2.getDevice().getDeviceName()) &&  ((MaintenanceAlertRequest)wr).getDevice().getDeviceID()==(mar2.getDevice().getDeviceID())){
////                                                o.getWorkQueue().getWorkRequestList().add(mar2);
////                                            }
////                                        }
////                                    }
//                                }  
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//    }

//    public void populateDeviceAlertJtable(){
//        
//        calculateMaintenanceAlert();
//        
//        DefaultTableModel dtm = (DefaultTableModel) deviceAlertsjTable1.getModel();
//        dtm.setRowCount(0);
//        for (Network n : system.getNetworkList()) {
//            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                if (e instanceof WarehouseEnterprise) {
//                    for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
//                        if (org instanceof WarehouseOrganization) {
//                            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
//                                if (request instanceof MaintenanceAlertRequest) {
//                                    Object[] row = new Object[4];
//                                    row[0] = request;
//                                    row[1] = ((MaintenanceAlertRequest) request).getDevice().getDeviceName();
//                                    row[2] = ((MaintenanceAlertRequest) request).getDevice().getNextMaitainenceDueDate();
//                                    row[3] = request.getStatus();
//                                    dtm.addRow(row);
//                                }
//                            }
//                        }
//                    }
//                }if (e instanceof HospitalEnterprise) {
//                    for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
//                        if (org instanceof CareTeamOrganization) {
//                            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
//                                if (request instanceof MaintenanceAlertRequest) {
//                                    Object[] row = new Object[4];
//                                    row[0] = request;
//                                    row[1] = ((MaintenanceAlertRequest) request).getDevice().getDeviceName();
//                                    row[2] = ((MaintenanceAlertRequest) request).getDevice().getNextMaitainenceDueDate();
//                                    row[3] = request.getStatus();
//                                    dtm.addRow(row);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageMedicalDeviceRequestsjButton1 = new javax.swing.JButton();
        requestDeviceMaintainencejButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deviceAlertsjTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewDeviceProblemHistorysjButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("WAREHOUSE MANAGER WORK AREA");

        manageMedicalDeviceRequestsjButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageMedicalDeviceRequestsjButton1.setText("Manage Device Movement Requests >>>");
        manageMedicalDeviceRequestsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMedicalDeviceRequestsjButton1ActionPerformed(evt);
            }
        });

        requestDeviceMaintainencejButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestDeviceMaintainencejButton2.setText("View Maintainence Requests >>>");
        requestDeviceMaintainencejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDeviceMaintainencejButton2ActionPerformed(evt);
            }
        });

        deviceAlertsjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alert Message", "Device Name", "Next Maintenance Date", "Alert Status"
            }
        ));
        jScrollPane1.setViewportView(deviceAlertsjTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Device Maintenance Alerts:");

        viewDeviceProblemHistorysjButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewDeviceProblemHistorysjButton2.setText("View Device Problem History >>>");
        viewDeviceProblemHistorysjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeviceProblemHistorysjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(requestDeviceMaintainencejButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageMedicalDeviceRequestsjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewDeviceProblemHistorysjButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(requestDeviceMaintainencejButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(manageMedicalDeviceRequestsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(viewDeviceProblemHistorysjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageMedicalDeviceRequestsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMedicalDeviceRequestsjButton1ActionPerformed
        ManageDeviceMovementRequestsJPanel devMov = new ManageDeviceMovementRequestsJPanel(userProcessContainer,enterprise, organization, system);
        userProcessContainer.add("devMov", devMov);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMedicalDeviceRequestsjButton1ActionPerformed

    private void requestDeviceMaintainencejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDeviceMaintainencejButton2ActionPerformed
        ManageMaintanenceRequestsJPanel manageMaint = new ManageMaintanenceRequestsJPanel(userProcessContainer,enterprise, organization, system);
        userProcessContainer.add("manageMaint", manageMaint);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestDeviceMaintainencejButton2ActionPerformed

    private void viewDeviceProblemHistorysjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeviceProblemHistorysjButton2ActionPerformed
        ViewDeviceProblemsHistoryJPanel manageMaint = new ViewDeviceProblemsHistoryJPanel(userProcessContainer,enterprise, organization, system);
        userProcessContainer.add("manageMaint", manageMaint);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDeviceProblemHistorysjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable deviceAlertsjTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageMedicalDeviceRequestsjButton1;
    private javax.swing.JButton requestDeviceMaintainencejButton2;
    private javax.swing.JButton viewDeviceProblemHistorysjButton2;
    // End of variables declaration//GEN-END:variables
}
