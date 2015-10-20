package Business;

import java.util.ArrayList;

/**
 * @author Hechen Gao
 * @contact gao.h@husky.neu.edu
 * @date Oct 2, 2014
 */
public class Order {

    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    
    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, int q, int price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
}
