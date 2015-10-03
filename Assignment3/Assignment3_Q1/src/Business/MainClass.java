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

    public static void main(String[] args) {
        SupplierDirectory supplierDirectory = new SupplierDirectory();
        ProductCatalog productCatalog = new ProductCatalog();
        Supplier dell = supplierDirectory.addSupplier();
        dell.setSupplierName("Dell");
        dell.setSupplierID("s101");
        Supplier hp = supplierDirectory.addSupplier();
        hp.setSupplierName("HP");
        hp.setSupplierID("s102");
        Supplier toshiba = supplierDirectory.addSupplier();
        toshiba.setSupplierName("Toshiba");
        toshiba.setSupplierID("s103");
        Supplier apple = supplierDirectory.addSupplier();
        apple.setSupplierName("Apple");
        apple.setSupplierID("s104");
        Supplier lenovo = supplierDirectory.addSupplier();
        lenovo.setSupplierName("Lenovo");
        lenovo.setSupplierID("s105");

        Product p1 = dell.getProductCatalog().addProduct();
        p1.setProductName("INSPIRON");
        p1.setPrice(200);
        p1.setAvailability("twenty");

        Product p2 = dell.getProductCatalog().addProduct();
        p2.setProductName("STUDIO");
        p2.setPrice(300);
        p2.setAvailability("twenty");

        Product p3 = dell.getProductCatalog().addProduct();
        p3.setProductName("xps");
        p3.setPrice(400);
        p3.setAvailability("fourty");

        Product p4 = dell.getProductCatalog().addProduct();
        p4.setProductName("desktop");
        p4.setPrice(100);
        p4.setAvailability("twenty");

        Product p5 = dell.getProductCatalog().addProduct();
        p5.setProductName("vostro");
        p5.setPrice(100);
        p5.setAvailability("twenty");

        Product p6 = dell.getProductCatalog().addProduct();
        p6.setProductName("Dell Charger");
        p6.setPrice(50);
        p6.setAvailability("twenty");

        Product p7 = dell.getProductCatalog().addProduct();
        p7.setProductName("Battery 4 cell pack");
        p7.setPrice(100);
        p7.setAvailability("twenty");

        Product p8 = dell.getProductCatalog().addProduct();
        p8.setProductName("Battery 6 cell pack");
        p8.setPrice(150);
        p8.setAvailability("fourty");

        Product p9 = dell.getProductCatalog().addProduct();
        p9.setProductName("Battery 8 cell pack");
        p9.setPrice(200);
        p9.setAvailability("twenty");

        Product p10 = dell.getProductCatalog().addProduct();
        p10.setProductName("Alienware");
        p10.setPrice(600);
        p10.setAvailability("twenty");

        Product hp1 = hp.getProductCatalog().addProduct();
        hp1.setProductName("Desktop pavillion");
        hp1.setPrice(200);
        hp1.setAvailability("twenty");

        Product hp2 = hp.getProductCatalog().addProduct();
        hp2.setProductName("desktop");
        hp2.setPrice(300);
        hp2.setAvailability("twenty");

        Product hp3 = hp.getProductCatalog().addProduct();
        hp3.setProductName("Laptop");
        hp3.setPrice(400);
        hp3.setAvailability("fourty");

        Product hp4 = hp.getProductCatalog().addProduct();
        hp4.setProductName("Laptop charger");
        hp4.setPrice(100);
        hp4.setAvailability("twenty");

        Product hp5 = hp.getProductCatalog().addProduct();
        hp5.setProductName("Battery 4 cell pack");
        hp5.setPrice(100);
        hp5.setAvailability("twenty");

        Product hp6 = hp.getProductCatalog().addProduct();
        hp6.setProductName("Battery 6 cell pack");
        hp6.setPrice(200);
        hp6.setAvailability("twenty");

        Product hp7 = hp.getProductCatalog().addProduct();
        hp7.setProductName("Battery 8cell pack");
        hp7.setPrice(300);
        hp7.setAvailability("twenty");

        Product hp8 = hp.getProductCatalog().addProduct();
        hp8.setProductName("HP printer");
        hp8.setPrice(400);
        hp8.setAvailability("fourty");

        Product hp9 = hp.getProductCatalog().addProduct();
        hp9.setProductName("HP laser printer");
        hp9.setPrice(100);
        hp9.setAvailability("twenty");

        Product hp10 = hp.getProductCatalog().addProduct();
        hp10.setProductName("Hp tablet");
        hp10.setPrice(100);
        hp10.setAvailability("twenty");

        Product t1 = toshiba.getProductCatalog().addProduct();
        t1.setProductName("Toshiba laptop1");
        t1.setPrice(200);
        t1.setAvailability("twenty");

        Product t2 = toshiba.getProductCatalog().addProduct();
        t2.setProductName("Toshiba laptop2");
        t2.setPrice(300);
        t2.setAvailability("twenty");

        Product t3 = toshiba.getProductCatalog().addProduct();
        t3.setProductName("Toshiba laptop3");
        t3.setPrice(400);
        t3.setAvailability("fourty");

        Product t4 = toshiba.getProductCatalog().addProduct();
        t4.setProductName("Toshiba laptop4");
        t4.setPrice(100);
        t4.setAvailability("twenty");

        Product t5 = toshiba.getProductCatalog().addProduct();
        t5.setProductName("Toshiba laptop5");
        t5.setPrice(100);
        t5.setAvailability("twenty");

        Product t6 = toshiba.getProductCatalog().addProduct();
        t6.setProductName("Toshiba laptop6");
        t6.setPrice(300);
        t6.setAvailability("twenty");

        Product t7 = toshiba.getProductCatalog().addProduct();
        t7.setProductName("Toshiba laptop7");
        t7.setPrice(400);
        t7.setAvailability("fourty");

        Product t8 = toshiba.getProductCatalog().addProduct();
        t8.setProductName("Charger");
        t8.setPrice(100);
        t8.setAvailability("twenty");

        Product t9 = toshiba.getProductCatalog().addProduct();
        t9.setProductName("Battery pack");
        t9.setPrice(200);
        t9.setAvailability("twenty");

        Product t10 = toshiba.getProductCatalog().addProduct();
        t10.setProductName("Desktop");
        t10.setPrice(100);
        t10.setAvailability("twenty");

        Product a1 = apple.getProductCatalog().addProduct();
        a1.setProductName("Mac Pro");
        a1.setPrice(200);
        a1.setAvailability("twenty");

        Product a2 = apple.getProductCatalog().addProduct();
        a2.setProductName("I phone 5s");
        a2.setPrice(300);
        a2.setAvailability("twenty");

        Product a3 = apple.getProductCatalog().addProduct();
        a3.setProductName("I phone 5 c");
        a3.setPrice(400);
        a3.setAvailability("fourty");

        Product a4 = apple.getProductCatalog().addProduct();
        a4.setProductName("I phone 6");
        a4.setPrice(100);
        a4.setAvailability("twenty");

        Product a5 = apple.getProductCatalog().addProduct();
        a5.setProductName("Mac Air");
        a5.setPrice(100);
        a5.setAvailability("twenty");

        Product a6 = apple.getProductCatalog().addProduct();
        a6.setProductName("I watch");
        a6.setPrice(200);
        a6.setAvailability("twenty");

        Product a7 = apple.getProductCatalog().addProduct();
        a7.setProductName("I stylus");
        a7.setPrice(300);
        a7.setAvailability("twenty");

        Product a8 = apple.getProductCatalog().addProduct();
        a8.setProductName("Mac pro mini");
        a8.setPrice(400);
        a8.setAvailability("fourty");

        Product a9 = apple.getProductCatalog().addProduct();
        a9.setProductName("I pad air");
        a9.setPrice(100);
        a9.setAvailability("twenty");

        Product a10 = apple.getProductCatalog().addProduct();
        a10.setProductName("I pad mini");
        a10.setPrice(100);
        a10.setAvailability("twenty");

        Product l1 = lenovo.getProductCatalog().addProduct();
        l1.setProductName("Y557");
        l1.setPrice(200);
        l1.setAvailability("twenty");

        Product l2 = lenovo.getProductCatalog().addProduct();
        l2.setProductName("Y555");
        l2.setPrice(300);
        l2.setAvailability("twenty");

        Product l3 = lenovo.getProductCatalog().addProduct();
        l3.setProductName("Y554");
        l3.setPrice(400);
        l3.setAvailability("fourty");

        Product l4 = lenovo.getProductCatalog().addProduct();
        l4.setProductName("Y553");
        l4.setPrice(100);
        l4.setAvailability("twenty");

        Product l5 = lenovo.getProductCatalog().addProduct();
        l5.setProductName("Y552");
        l5.setPrice(100);
        l5.setAvailability("twenty");

        Product l6 = lenovo.getProductCatalog().addProduct();
        l6.setProductName("Y551");
        l6.setPrice(200);
        l6.setAvailability("twenty");

        Product l7 = lenovo.getProductCatalog().addProduct();
        l7.setProductName("Y550");
        l7.setPrice(300);
        l7.setAvailability("twenty");

        Product l8 = lenovo.getProductCatalog().addProduct();
        l8.setProductName("Laptop Charger");
        l8.setPrice(400);
        l8.setAvailability("fourty");

        Product l9 = lenovo.getProductCatalog().addProduct();
        l9.setProductName("6 cell battery");
        l9.setPrice(100);
        l9.setAvailability("twenty");

        Product l10 = lenovo.getProductCatalog().addProduct();
        l10.setProductName("8 cell battery");
        l10.setPrice(100);
        l10.setAvailability("twenty");

        for (Supplier supplier : supplierDirectory.getSupplierList()) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Supplier Name : " + supplier.getSupplierName());
            System.out.println("Supplier ID : " + supplier.getSupplierID());
            System.out.println("-------------------------");

            for (Product product : supplier.getProductCatalog().getProductList()) {
                System.out.println("Product name : " + product.getProductName());
                System.out.println("Product Price : " + product.getPrice());
                System.out.println("Availability : " + product.getAvailability());
                System.out.println("\n");

            }
        }
    }
}
