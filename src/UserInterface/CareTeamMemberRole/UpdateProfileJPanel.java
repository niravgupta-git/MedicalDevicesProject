/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CareTeamMemberRole;

import Business.CareTeam.CareTeamMember;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class UpdateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateProfileJPanel
     */
    JPanel userProcessContainer;
    CareTeamMember ctm;
    EcoSystem system;
    Enterprise e;
    
    public UpdateProfileJPanel(JPanel userProcessContainer, CareTeamMember ctm, Enterprise e, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ctm=ctm;
        this.system=system;
        this.e=e;
        
        ctmNamejTextField1.setText(ctm.getEmployee().getName());
        workingAtHospitaljTextField1.setText(e.getName());
        
        availabilityStatusjComboBox1.removeAllItems();
        for(CareTeamMember.availabilityStatusType type : CareTeamMember.availabilityStatusType.values()){
            if (!(type.equals(CareTeamMember.availabilityStatusType.INOPERATION) || type.equals(CareTeamMember.availabilityStatusType.SCHEDULED)))
            availabilityStatusjComboBox1.addItem(type);
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
        jLabel2 = new javax.swing.JLabel();
        ctmNamejTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        specialityjTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        workingAtHospitaljTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updateProfilejButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        availabilityStatusjComboBox1 = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("UPDATE PROFILE");

        jLabel2.setText("NAME:");

        ctmNamejTextField1.setEnabled(false);

        jLabel3.setText("SPECIALITY:");

        jLabel4.setText("WORKING AT HOSPITAL:");

        workingAtHospitaljTextField1.setEnabled(false);

        jLabel5.setText("AVAILABILITY STATUS:");

        updateProfilejButton1.setText("UPDATE PROFILE");
        updateProfilejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfilejButton1ActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        availabilityStatusjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctmNamejTextField1)
                            .addComponent(specialityjTextField1)
                            .addComponent(workingAtHospitaljTextField1)
                            .addComponent(availabilityStatusjComboBox1, 0, 78, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(backJButton)
                        .addGap(39, 39, 39)
                        .addComponent(updateProfilejButton1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctmNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(specialityjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(workingAtHospitaljTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(availabilityStatusjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProfilejButton1)
                    .addComponent(backJButton))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateProfilejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfilejButton1ActionPerformed
        String speciality = specialityjTextField1.getText();
        
        if(specialityjTextField1.getText().isEmpty()==true || specialityjTextField1.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid value in speciality field");
            return;
        }
        
        String availabilityStatus = String.valueOf(availabilityStatusjComboBox1.getSelectedItem());
        
        ctm.setSpeciality(speciality);
        ctm.setWorkingAtHospital(e.getName());
        ctm.setAvailabilityStatus(availabilityStatus);
        
        JOptionPane.showMessageDialog(null, "Profile Updated");
    }//GEN-LAST:event_updateProfilejButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox availabilityStatusjComboBox1;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField ctmNamejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField specialityjTextField1;
    private javax.swing.JButton updateProfilejButton1;
    private javax.swing.JTextField workingAtHospitaljTextField1;
    // End of variables declaration//GEN-END:variables
}
