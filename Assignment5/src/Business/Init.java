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
public class Init {

    public SupplierDirectory populateFields() {
        SupplierDirectory supplierDirectory = new SupplierDirectory();
        Supplier dell = supplierDirectory.addSupplier();
        dell.setSupplyName("Dell");

        Supplier hp = supplierDirectory.addSupplier();
        hp.setSupplyName("HP");

        Supplier toshiba = supplierDirectory.addSupplier();
        toshiba.setSupplyName("Toshiba");

        Supplier apple = supplierDirectory.addSupplier();
        apple.setSupplyName("Apple");

        Supplier lenovo = supplierDirectory.addSupplier();
        lenovo.setSupplyName("Lenovo");

        Product p1 = dell.getProductCatalog().addProduct();
        p1.setProdName("INSPIRON");
        p1.setPrice(200);
        p1.setAvail(20);
       

        Product p2 = dell.getProductCatalog().addProduct();
        p2.setProdName("STUDIO");
        p2.setPrice(300);
        p2.setAvail(20);

        Product p3 = dell.getProductCatalog().addProduct();
        p3.setProdName("xps");
        p3.setPrice(400);
        p3.setAvail(20);

        Product p4 = dell.getProductCatalog().addProduct();
        p4.setProdName("desktop");
        p4.setPrice(100);
        p4.setAvail(20);

        Product p5 = dell.getProductCatalog().addProduct();
        p5.setProdName("vostro");
        p5.setPrice(100);
        p5.setAvail(20);

        Product hp1 = hp.getProductCatalog().addProduct();
        hp1.setProdName("Desktop pavillion");
        hp1.setPrice(200);
        hp1.setAvail(20);

        Product hp2 = hp.getProductCatalog().addProduct();
        hp2.setProdName("desktop");
        hp2.setPrice(300);
        hp2.setAvail(20);

        Product hp3 = hp.getProductCatalog().addProduct();
        hp3.setProdName("Laptop");
        hp3.setPrice(400);
        hp3.setAvail(20);

        Product hp4 = hp.getProductCatalog().addProduct();
        hp4.setProdName("Laptop charger");
        hp4.setPrice(100);
        hp4.setAvail(20);

        Product hp5 = hp.getProductCatalog().addProduct();
        hp5.setProdName("Battery 4 cell pack");
        hp5.setPrice(100);
        hp5.setAvail(20);

        Product t1 = toshiba.getProductCatalog().addProduct();
        t1.setProdName("Toshiba laptop1");
        t1.setPrice(200);
        t1.setAvail(20);

        Product t2 = toshiba.getProductCatalog().addProduct();
        t2.setProdName("Toshiba laptop2");
        t2.setPrice(300);
        t2.setAvail(20);

        Product t3 = toshiba.getProductCatalog().addProduct();
        t3.setProdName("Toshiba laptop3");
        t3.setPrice(400);
        t3.setAvail(20);

        Product t4 = toshiba.getProductCatalog().addProduct();
        t4.setProdName("Toshiba laptop4");
        t4.setPrice(100);
        t4.setAvail(20);

        Product t5 = toshiba.getProductCatalog().addProduct();
        t5.setProdName("Toshiba laptop5");
        t5.setPrice(100);
        t5.setAvail(20);

        Product a1 = apple.getProductCatalog().addProduct();
        a1.setProdName("Mac Pro");
        a1.setPrice(200);
        a1.setAvail(20);

        Product a2 = apple.getProductCatalog().addProduct();
        a2.setProdName("I phone 5s");
        a2.setPrice(300);
        a2.setAvail(20);

        Product a3 = apple.getProductCatalog().addProduct();
        a3.setProdName("I phone 5 c");
        a3.setPrice(400);
        a3.setAvail(20);

        Product a4 = apple.getProductCatalog().addProduct();
        a4.setProdName("I phone 6");
        a4.setPrice(100);
        a4.setAvail(20);

        Product a5 = apple.getProductCatalog().addProduct();
        a5.setProdName("Mac Air");
        a5.setPrice(100);
        a5.setAvail(20);

        Product l1 = lenovo.getProductCatalog().addProduct();
        l1.setProdName("Y557");
        l1.setPrice(200);
        l1.setAvail(20);

        Product l2 = lenovo.getProductCatalog().addProduct();
        l2.setProdName("Y555");
        l2.setPrice(300);
        l2.setAvail(20);

        Product l3 = lenovo.getProductCatalog().addProduct();
        l3.setProdName("Y554");
        l3.setPrice(400);
        l3.setAvail(20);

        Product l4 = lenovo.getProductCatalog().addProduct();
        l4.setProdName("Y553");
        l4.setPrice(100);
        l4.setAvail(20);

        Product l5 = lenovo.getProductCatalog().addProduct();
        l5.setProdName("Y552");
        l5.setPrice(100);
        l5.setAvail(20);

        return supplierDirectory;

//        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
//            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//            System.out.println("Supplier Name : " + supplier.getSupplyName());
//          
//            System.out.println("-------------------------");
//
//            for (Product product : supplier.getProductCatalog().getProductcatalog()) {
//                System.out.println("Product name : " + product.getProdName());
//                System.out.println("Product Price : " + product.getPrice());
//                System.out.println("Availability : " + product.getAvail());
//                System.out.println("\n");
//
//            
//            }}
    }
}
