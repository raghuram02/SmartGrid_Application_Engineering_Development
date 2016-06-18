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
public class Supplier {

    private String supplierName;
    private String SupplierID;
    private String supplierPhone;
    private DrugCatalog drugList;

    public Supplier()
    {
        drugList = new DrugCatalog();
    }
    public DrugCatalog getDrugList() {
        return drugList;
    }

    public void setDrugList(DrugCatalog drugList) {
        this.drugList = drugList;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return supplierName;
    }

}
