/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nirav gupta
 */
public class Order {
    private ArrayList <OrderItem> order;
    private static int count;
    private int orderId;
    private String customerName;
    private Date orderDate;
    private Invoice invoice;

    public String setValue(String value) {
        return value;
    }
    
    
    public Order(){
        //customer = new Customer();
        order = new ArrayList<OrderItem>();
        count++;
        orderId=count;
        invoice = new Invoice();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<OrderItem> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<OrderItem> order) {
        this.order = order;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
    
    
    
    public OrderItem addOrderItem(){
        OrderItem oi = new OrderItem();
        order.add(oi);
        return oi;
    }
    
    public void removeOrderItem(OrderItem oi){
        order.remove(oi);
    }

    
    
    @Override
    public String toString() {
        return String.valueOf(orderId);
    }
    
    
}
