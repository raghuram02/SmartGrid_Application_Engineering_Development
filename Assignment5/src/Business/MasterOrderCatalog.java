package Business;

import java.util.ArrayList;

/**
 * @author Hechen Gao
 * @contact gao.h@husky.neu.edu
 * @date Oct 2, 2014
 */
public class MasterOrderCatalog {

    private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog() {
        orderCatalog = new ArrayList<>();
    }
    
    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }
    
    public Order addOrder(Order o) {
        orderCatalog.add(o);
        return o;
    }
    
}
