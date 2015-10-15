/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PHSlManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PHSenterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nirav gupta
 */
public class ManageFundsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFundsJPanel
     */
    JPanel userProcessContainer; Enterprise enterprise; Organization organization; EcoSystem system;
    
    public ManageFundsJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.organization=organization;
        this.system=system;
        PHSenterprise phsEnt = (PHSenterprise) enterprise;
        avalFundsjTextField1.setText(String.valueOf(phsEnt.getAvailableFunds()));
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
        jLabel3 = new javax.swing.JLabel();
        avalFundsjTextField1 = new javax.swing.JTextField();
        newFundsjTextField2 = new javax.swing.JTextField();
        addFundsjButton1 = new javax.swing.JButton();
        backjButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MANAGE FUNDS IN PHS Inc");

        jLabel2.setText("NEW FUNDS IN $ : ");

        jLabel3.setText("AVAILABLE FUNDS IN $:");

        avalFundsjTextField1.setEnabled(false);

        addFundsjButton1.setBackground(new java.awt.Color(0, 204, 153));
        addFundsjButton1.setText("Add Funds");
        addFundsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFundsjButton1ActionPerformed(evt);
            }
        });

        backjButton4.setText("<<Back");
        backjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newFundsjTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(avalFundsjTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(addFundsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(backjButton4)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(avalFundsjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newFundsjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(addFundsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(backjButton4)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addFundsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFundsjButton1ActionPerformed
        PHSenterprise phsEnt = (PHSenterprise) enterprise;
        
        if(newFundsjTextField2.getText().isEmpty()==true || newFundsjTextField2.getText().startsWith(" ")) {
            JOptionPane.showMessageDialog(null, "Please enter valid text in Room No field");
            return;
        }
        
        if (Integer.valueOf(newFundsjTextField2.getText()) == 0){
            JOptionPane.showMessageDialog(null, "Please enter funds grater than 0");
            return;
        }
        
        if (Integer.valueOf(newFundsjTextField2.getText()) < 1000){
            JOptionPane.showMessageDialog(null, "Funds needs to be greater than atleast 1000");
            return;
        }
        
        phsEnt.setAvailableFunds(Integer.valueOf(newFundsjTextField2.getText()));
        
        JOptionPane.showMessageDialog(null, "Funds Updated");
        addFundsjButton1.setEnabled(false);
    }//GEN-LAST:event_addFundsjButton1ActionPerformed

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFundsjButton1;
    private javax.swing.JTextField avalFundsjTextField1;
    private javax.swing.JButton backjButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField newFundsjTextField2;
    // End of variables declaration//GEN-END:variables
}
