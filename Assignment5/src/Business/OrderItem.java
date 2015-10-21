package Business;

/**
 * 
 */
public class OrderItem {

    private Product product;
    private int quantity;
    private int salesPrice;
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getSalesPrice() {
        return salesPrice;
    }
    
    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    @Override
    public String toString() {
        return product.getProdName();
    }
    
}
