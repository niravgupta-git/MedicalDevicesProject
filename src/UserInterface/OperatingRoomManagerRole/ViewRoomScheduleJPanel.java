/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.OperatingRoomManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.OperatingRoom.OperatingRoom;
import Business.OperatingRoom.RoomBookingHistory;
import Business.Organization.OperatingRoomOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ViewRoomScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRoomScheduleJPanel
     */
    JPanel userProcessContainer;
    UserAccount account; 
    Enterprise enterprise; 
    EcoSystem system;
    
    public ViewRoomScheduleJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        this.enterprise=enterprise;
        populateOperatingRoomTable();
    }

    public void populateOperatingRoomTable(){
        
        DefaultTableModel model = (DefaultTableModel) operatingRoomjTable1.getModel();
        model.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof OperatingRoomOrganization) {
                OperatingRoomOrganization oro = (OperatingRoomOrganization) org;
                for (OperatingRoom opm : oro.getOperatingRoomList()) {
                    Object[] row = new Object[2];
                    row[0] = opm;
                    row[1] = opm.getRoomNo();
                    model.addRow(row);
                }
            }
        }
    }
    
    
    public void populateRoomHistoryTable(OperatingRoom oro){
        
        DefaultTableModel model = (DefaultTableModel) roomHistoryjTable2.getModel();
        model.setRowCount(0);

                for (RoomBookingHistory rh : oro.getBookingHistorylist()) {
                    Object[] row = new Object[3];
                    row[0] = rh.getPreviousScheduledBookingDate();
                    row[1] = rh.getBookedForDoctor();
                    row[2] = rh.getBookedForOperationType();
                    model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        operatingRoomjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewRoomHistoryjButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        roomHistoryjTable2 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        operatingRoomjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Name", "Room no"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(operatingRoomjTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("VIEW ROOM SCHEDULES");

        viewRoomHistoryjButton1.setBackground(new java.awt.Color(153, 0, 153));
        viewRoomHistoryjButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewRoomHistoryjButton1.setText("View Room Booking History");
        viewRoomHistoryjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomHistoryjButton1ActionPerformed(evt);
            }
        });

        roomHistoryjTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booked For Date", "For Doctor", "For Operation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(roomHistoryjTable2);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(viewRoomHistoryjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(viewRoomHistoryjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewRoomHistoryjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomHistoryjButton1ActionPerformed

        int selectedRoom = operatingRoomjTable1.getSelectedRow();
        
        if (selectedRoom < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from room table");
            return;
        }
        
        OperatingRoom room = (OperatingRoom) operatingRoomjTable1.getValueAt(selectedRoom, 0);
        
        if (room.getBookingHistorylist() != null){
            populateRoomHistoryTable(room);
        }else{
            DefaultTableModel model = (DefaultTableModel) roomHistoryjTable2.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_viewRoomHistoryjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable operatingRoomjTable1;
    private javax.swing.JTable roomHistoryjTable2;
    private javax.swing.JButton viewRoomHistoryjButton1;
    // End of variables declaration//GEN-END:variables
}
