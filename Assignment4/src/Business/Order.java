/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class Order {

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    private ArrayList<OrderItem>orderItemList;
    private int orderNumber;
    private static int count =0;
    
    public Order(){
        orderNumber = ++count;
        orderItemList = new ArrayList<OrderItem>();
    }
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
        
    }
     public OrderItem addOrderItem(Drug drug, int quantity, int price){
        OrderItem item = new OrderItem();
        item.setDrug(drug);
        item.setQuantity(quantity);
        item.setPrice(price);
        orderItemList.add(item);
        return item;
    }
    
}
