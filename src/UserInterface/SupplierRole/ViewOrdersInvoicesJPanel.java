/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SupplierRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirav gupta
 */
public class ViewOrdersInvoicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrdersInvoicesJPanel
     */
    JPanel userProcessContainer; Supplier supplier; Enterprise enterprise; Organization organization; EcoSystem system;
    
    public ViewOrdersInvoicesJPanel(JPanel userProcessContainer, Supplier supplier, Enterprise enterprise, Organization organization, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
       this.system=system;
       this.supplier=supplier;
       this.enterprise=enterprise;
       this.organization=organization;
       populateOrderTable();
    }

  public void populateOrderTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) orderjTable1.getModel();
        dtm.setRowCount(0);
        
        
        for (Order order2 : enterprise.getMasterOrderCatalog().getMasterOrderCatalog()){
            for (OrderItem oi : order2.getOrder()){
        
                                Object[] row = new Object[8];
                                row[0] = order2;
                                row[1] = oi.getMedicalDevice().getDeviceName();
                                row[2] = oi.getMedicalDevice().getDeviceType();
                                row[3] = oi.getMedicalDevice().getModelNumber();
                                row[4] = oi.getMedicalDevice().getDeviceID();
                                row[5] = oi.getMedicalDevice().getManufactureDate();
                                row[6] = oi.getQuantity();
                                row[7] = oi.getMedicalDevice().getPurchaseCost() * oi.getQuantity();
                                dtm.addRow(row);
                                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        orderjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backjButton4 = new javax.swing.JButton();
        orderDatejTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        invoiceIdjTextField1 = new javax.swing.JTextField();
        deviceBoughtjTextField2 = new javax.swing.JTextField();
        paidStatusjTextField3 = new javax.swing.JTextField();
        totalAmountjTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customerNamejTextField5 = new javax.swing.JTextField();
        viewInvoicejButton1 = new javax.swing.JButton();

        orderjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Device Name", "Type", "Model No", "Device ID", "Manufacture Date", "Quantity", "Order Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderjTable1);

        jLabel1.setText("VIEW ORDER AND INVOICES");

        jLabel3.setText("DEVICE BOUGHT:");

        jLabel2.setText("INVOICE ID:");

        jLabel7.setText("ORDER DATE:");

        backjButton4.setText("<<Back");
        backjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton4ActionPerformed(evt);
            }
        });

        orderDatejTextField1.setBackground(new java.awt.Color(204, 255, 204));
        orderDatejTextField1.setEnabled(false);

        jLabel4.setText("PAID STATUS:");

        jLabel5.setText("TOTAL ORDER AMOUNT:");

        invoiceIdjTextField1.setBackground(new java.awt.Color(204, 255, 204));
        invoiceIdjTextField1.setEnabled(false);

        deviceBoughtjTextField2.setBackground(new java.awt.Color(204, 255, 204));
        deviceBoughtjTextField2.setEnabled(false);

        paidStatusjTextField3.setBackground(new java.awt.Color(204, 255, 204));
        paidStatusjTextField3.setEnabled(false);

        totalAmountjTextField4.setBackground(new java.awt.Color(204, 255, 204));
        totalAmountjTextField4.setEnabled(false);

        jLabel6.setText("CUSTOMER NAME:");

        customerNamejTextField5.setBackground(new java.awt.Color(204, 255, 204));
        customerNamejTextField5.setEnabled(false);

        viewInvoicejButton1.setText("View Invoice");
        viewInvoicejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoicejButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(6, 6, 6)))
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerNamejTextField5)
                            .addComponent(totalAmountjTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(paidStatusjTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deviceBoughtjTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invoiceIdjTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderDatejTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(backjButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(viewInvoicejButton1)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewInvoicejButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deviceBoughtjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paidStatusjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalAmountjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderDatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNamejTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(invoiceIdjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(backjButton4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton4ActionPerformed

    private void viewInvoicejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoicejButton1ActionPerformed
        int selectedRequest = orderjTable1.getSelectedRow();
        
        if (selectedRequest < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from order table");
            return;
        }
        
        Order selectedOrder = (Order)orderjTable1.getValueAt(selectedRequest, 0);
        
        
        invoiceIdjTextField1.setText(String.valueOf(selectedOrder.getInvoice().getInvoiceId()));
        deviceBoughtjTextField2.setText(selectedOrder.getInvoice().getBoughtDeviceName());
        paidStatusjTextField3.setText(selectedOrder.getInvoice().getPaidStatus());
        totalAmountjTextField4.setText(String.valueOf(selectedOrder.getInvoice().getTotalOrderAmount()));
        customerNamejTextField5.setText(selectedOrder.getCustomerName());
        orderDatejTextField1.setText(String.valueOf(selectedOrder.getOrderDate()));
        
    }//GEN-LAST:event_viewInvoicejButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton4;
    private javax.swing.JTextField customerNamejTextField5;
    private javax.swing.JTextField deviceBoughtjTextField2;
    private javax.swing.JTextField invoiceIdjTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderDatejTextField1;
    private javax.swing.JTable orderjTable1;
    private javax.swing.JTextField paidStatusjTextField3;
    private javax.swing.JTextField totalAmountjTextField4;
    private javax.swing.JButton viewInvoicejButton1;
    // End of variables declaration//GEN-END:variables
}
