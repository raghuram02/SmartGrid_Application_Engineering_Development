/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.*;

/**
 *
 * @author Raghuram
 */
public class Drug {

    private String drugName;
    private String drugID;
    private String expirationDate;
    private int quantity;
    private int DrugPrice;
    private String description;
    private String sideeffects;
    private String composition;
    private String manufactureDate;
    private String purpose;
    private int threshold = 5;
    
    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugID() {
        return drugID;
    }

    public void setDrugID(String drugID) {
        this.drugID = drugID;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDrugPrice() {
        return DrugPrice;
    }

    public void setDrugPrice(int DrugPrice) {
        this.DrugPrice = DrugPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSideeffects() {
        return sideeffects;
    }

    public void setSideeffects(String sideeffects) {
        this.sideeffects = sideeffects;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

//    public void setFields(String drugName, String drugID, int drugPrice , int quantity , String expirationDate, 
//            String manufactureDate, String composition, String description, String sideeffects, String purpose)
//    {
//        this.DrugPrice = DrugPrice;
//        this.drugName = drugName;
//        this.drugID = drugID;
//        this.quantity = DrugPrice;
//        this.description = description;
//        this.manufactureDate = manufactureDate;
//        this.expirationDate = expirationDate;
//        this.purpose = purpose;
//        this.composition = composition;
//        this.sideeffects = sideeffects;
        
        
   
@Override
        public String toString() {
        return drugName;
}
}
