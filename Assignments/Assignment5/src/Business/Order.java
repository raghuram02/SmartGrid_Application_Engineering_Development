package Business;

import java.util.ArrayList;

/**
 * 
 */
public class Order {

    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private String employeeID;
    private String customerID;
    private Customer customer;
    private Employee employee;
    private int sumTotal;

    public int getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(int sumTotal) {
        this.sumTotal = sumTotal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    
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
