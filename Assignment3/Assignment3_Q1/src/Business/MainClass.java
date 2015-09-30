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
public class MainClass {
    public static void main (String[]args)
    {
        SupplierDirectory supplierDirectory = new SupplierDirectory();
        Supplier s1 = supplierDirectory.addSupplier();
        s1.setSupplierName("Dell");
        s1.setSupplierID("s101");
        Supplier s2 = supplierDirectory.addSupplier();
        s2.setSupplierName("HP");
        s2.setSupplierID("s102");
        Supplier s3 = supplierDirectory.addSupplier();
        s3.setSupplierName("Toshiba");
        s3.setSupplierID("s103");
        Supplier s4 = supplierDirectory.addSupplier();
        s4.setSupplierName("Apple");
        s4.setSupplierID("s104");
        Supplier s5 = supplierDirectory.addSupplier();
        s5.setSupplierName("Lenovo");
        s5.setSupplierID("s105");
        for(Supplier supplier: supplierDirectory.getSupplierList()){
            System.out.println("Supplier Name " +supplier.getSupplierName());
            System.out.println("Supplier ID " +supplier.getSupplierID());
        }
    }
}
