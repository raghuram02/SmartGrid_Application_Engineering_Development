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
public class Employee {

    private String employeeName;
    private String employeeID;
    private int employeePhone;
    double profit;
    private CustomerDirectory customerDirectory;
    private int targetPriceAbove = 0;
    private int targetPriceBelow = 0;
    
    public Employee() {
        customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public int getTargetPriceAbove() {
        return targetPriceAbove;
    }

    public void setTargetPriceAbove(int targetPriceAbove) {
        this.targetPriceAbove = targetPriceAbove;
    }

    public int getTargetPriceBelow() {
        return targetPriceBelow;
    }

    public void setTargetPriceBelow(int targetPriceBelow) {
        this.targetPriceBelow = targetPriceBelow;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(int employeePhone) {
        this.employeePhone = employeePhone;
    }

    public double getProfit(OrderItem orderItem, int salesPrice, Product selectedProduct, int fetchedQuantity) {

        if ((salesPrice >= (selectedProduct.getTargetPrice())) && (salesPrice <= (selectedProduct.getTargetPrice() + ((0.20) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice())))))) {
            profit = (0.05) * salesPrice;
        } else if ((salesPrice >= (selectedProduct.getTargetPrice() + ((0.20) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice()))))) && (salesPrice <= (selectedProduct.getTargetPrice() + ((0.40) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice())))))) {
            profit = (0.10) * salesPrice;
        } else if ((salesPrice >= (selectedProduct.getTargetPrice() + ((0.40) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice()))))) && (salesPrice <= (selectedProduct.getTargetPrice() + ((0.60) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice())))))) {
            profit = (0.15) * salesPrice;
        } else if ((salesPrice >= (selectedProduct.getTargetPrice() + ((0.60) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice()))))) && (salesPrice <= (selectedProduct.getTargetPrice() + ((0.80) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice())))))) {
            profit = (0.20) * salesPrice;
        } else if ((salesPrice >= (selectedProduct.getTargetPrice() + ((0.80) * ((selectedProduct.getCeilingPrice()) - (selectedProduct.getTargetPrice()))))) && (salesPrice <= (selectedProduct.getCeilingPrice()))) {
            profit = (0.25) * salesPrice;
        } else if ((salesPrice >= (selectedProduct.getFloorPrice())) && (salesPrice <= (selectedProduct.getTargetPrice()))) {
            profit = (0.05) * salesPrice;
        }
        return (profit * fetchedQuantity);
    }

    @Override
    public String toString() {
        return employeeName; //To change body of generated methods, choose Tools | Templates.
    }
}
