/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Raghuram
 */
public class Product {
    private String productName;
    private float price;
    private String avalilability;

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the avalilability
     */
    public String getAvalilability() {
        return avalilability;
    }

    /**
     * @param avalilability the avalilability to set
     */
    public void setAvalilability(String avalilability) {
        this.avalilability = avalilability;
    }
}
