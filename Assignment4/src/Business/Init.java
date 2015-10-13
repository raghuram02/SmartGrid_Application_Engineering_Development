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
//        DrugList drugCatalog = new DrugList();
        Supplier JohnsonAndJohnson = supplierDirectory.addSupplier();
        JohnsonAndJohnson.setSupplierName("JohnsonAndJohnson");
        JohnsonAndJohnson.setSupplierID("s101");
        JohnsonAndJohnson.setSupplierPhone("123456");
        Supplier cuticura = supplierDirectory.addSupplier();
        cuticura.setSupplierName("Cuticura");
        cuticura.setSupplierID("s102");
        cuticura.setSupplierPhone("54321");
        Supplier sunpharma = supplierDirectory.addSupplier();
        sunpharma.setSupplierName("Sunpharma");
        sunpharma.setSupplierID("s103");
        sunpharma.setSupplierPhone("58963");
        Supplier pfizer = supplierDirectory.addSupplier();
        pfizer.setSupplierName("Pfizer");
        pfizer.setSupplierID("s104");
        pfizer.setSupplierPhone("14785");
        Supplier cipla = supplierDirectory.addSupplier();
        cipla.setSupplierName("Cipla");
        cipla.setSupplierID("s105");
        cipla.setSupplierPhone("36985");

        Drug p1 = JohnsonAndJohnson.getDrugList().addDrug();
        p1.setDrugName("Drug101");
        p1.setDrugPrice(200);
        p1.setQuantity(20);
         p1.setExpirationDate("12/31/2015");
        p1.setManufactureDate("01/01/2010");
        p1.setPurpose("allergie");
        p1.setDescription(" Available at all stores");
        p1.setSideeffects(" not advised for children");
        p1.setComposition("twenty");
        p1.setDrugID("ID 100");


        Drug p2 = JohnsonAndJohnson.getDrugList().addDrug();
        p2.setDrugName("Drug101");
        p2.setDrugPrice(300);
        p2.setQuantity(20);
         p2.setExpirationDate("12/31/2015");
        p2.setManufactureDate("01/01/2010");
        p2.setPurpose("allergie");
        p2.setDescription(" Available at all stores");
        p2.setSideeffects(" not advised for children");
        p2.setComposition("twenty");
        p2.setDrugID("ID 100");


        Drug p3 = JohnsonAndJohnson.getDrugList().addDrug();
        p3.setDrugName("Drug101");
        p3.setDrugPrice(400);
        p3.setQuantity(40);
         p3.setExpirationDate("12/31/2015");
        p3.setManufactureDate("01/01/2010");
        p3.setPurpose("allergie");
        p3.setDescription(" Available at all stores");
        p3.setSideeffects(" not advised for children");
        p3.setComposition("twenty");
        p3.setDrugID("ID 100");


        Drug p4 = JohnsonAndJohnson.getDrugList().addDrug();
        p4.setDrugName("Drug101");
        p4.setDrugPrice(100);
        p4.setQuantity(20);
         p4.setExpirationDate("12/31/2015");
        p4.setManufactureDate("01/01/2010");
        p4.setPurpose("allergie");
        p4.setDescription(" Available at all stores");
        p4.setSideeffects(" not advised for children");
        p4.setComposition("twenty");
        p4.setDrugID("ID 100");


        Drug p5 = JohnsonAndJohnson.getDrugList().addDrug();
        p5.setDrugName("Drug101");
        p5.setDrugPrice(100);
        p5.setQuantity(20);
        p5.setExpirationDate("12/31/2015");
        p5.setManufactureDate("01/01/2010");
        p5.setPurpose("allergie");
        p5.setDescription(" Available at all stores");
        p5.setSideeffects(" not advised for children");
        p5.setComposition("twenty");
        p5.setDrugID("ID 100");

        Drug cuticura1 = cuticura.getDrugList().addDrug();
        cuticura1.setDrugName("Drug101");
        cuticura1.setDrugPrice(200);
        cuticura1.setQuantity(20);
        cuticura1.setExpirationDate("12/31/2015");
        cuticura1.setManufactureDate("01/01/2010");
        cuticura1.setPurpose("allergie");
        cuticura1.setDescription(" Available at all stores");
        cuticura1.setSideeffects(" not advised for children");
        cuticura1.setComposition("twenty");
        cuticura1.setDrugID("ID 100");

        Drug cuticura2 = cuticura.getDrugList().addDrug();
        cuticura2.setDrugName("Drug101");
        cuticura2.setDrugPrice(300);
        cuticura2.setQuantity(20);
        cuticura2.setExpirationDate("12/31/2015");
        cuticura2.setManufactureDate("01/01/2010");
        cuticura2.setPurpose("allergie");
        cuticura2.setDescription(" Available at all stores");
        cuticura2.setSideeffects(" not advised for children");
        cuticura2.setComposition("twenty");
        cuticura2.setDrugID("ID 100");

        Drug cuticura3 = cuticura.getDrugList().addDrug();
        cuticura3.setDrugName("Drug101");
        cuticura3.setDrugPrice(400);
        cuticura3.setQuantity(40);
        cuticura3.setExpirationDate("12/31/2015");
        cuticura3.setManufactureDate("01/01/2010");
        cuticura3.setPurpose("allergie");
        cuticura3.setDescription(" Available at all stores");
        cuticura3.setSideeffects(" not advised for children");
        cuticura3.setComposition("twenty");
        cuticura3.setDrugID("ID 100");

        Drug cuticura4 = cuticura.getDrugList().addDrug();
        cuticura4.setDrugName("Drug101");
        cuticura4.setDrugPrice(100);
        cuticura4.setQuantity(20);
        cuticura4.setExpirationDate("12/31/2015");
        cuticura4.setManufactureDate("01/01/2010");
        cuticura4.setPurpose("allergie");
        cuticura4.setDescription(" Available at all stores");
        cuticura4.setSideeffects(" not advised for children");
        cuticura4.setComposition("twenty");
        cuticura4.setDrugID("ID 100");

        Drug cuticura5 = cuticura.getDrugList().addDrug();
        cuticura5.setDrugName("Battery 4 cell pack");
        cuticura5.setDrugPrice(100);
        cuticura5.setQuantity(20);
        cuticura5.setExpirationDate("12/31/2015");
        cuticura5.setManufactureDate("01/01/2010");
        cuticura5.setPurpose("allergie");
        cuticura5.setDescription(" Available at all stores");
        cuticura5.setSideeffects(" not advised for children");
        cuticura5.setComposition("twenty");
        cuticura5.setDrugID("ID 100");

        Drug t1 = sunpharma.getDrugList().addDrug();
        t1.setDrugName("Drug101");
        t1.setDrugPrice(200);
        t1.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug t2 = sunpharma.getDrugList().addDrug();
        t2.setDrugName(" Drug101");
        t2.setDrugPrice(300);
        t2.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug t3 = sunpharma.getDrugList().addDrug();
        t3.setDrugName("Drug101");
        t3.setDrugPrice(400);
        t3.setQuantity(40);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug t4 = sunpharma.getDrugList().addDrug();
        t4.setDrugName("Drug101");
        t4.setDrugPrice(100);
        t4.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug t5 = sunpharma.getDrugList().addDrug();
        t5.setDrugName("Drug101");
        t5.setDrugPrice(100);
        t5.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug a1 = pfizer.getDrugList().addDrug();
        a1.setDrugName("Drug101");
        a1.setDrugPrice(200);
        a1.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug a2 = pfizer.getDrugList().addDrug();
        a2.setDrugName(" Drug101");
        a2.setDrugPrice(300);
        a2.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug a3 = pfizer.getDrugList().addDrug();
        a3.setDrugName("Drug101");
        a3.setDrugPrice(400);
        a3.setQuantity(40);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug a4 = pfizer.getDrugList().addDrug();
        a4.setDrugName("Drug101");
        a4.setDrugPrice(100);
        a4.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug a5 = pfizer.getDrugList().addDrug();
        a5.setDrugName("Drug101");
        a5.setDrugPrice(100);
        a5.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug l1 = cipla.getDrugList().addDrug();
        l1.setDrugName("Drug101");
        l1.setDrugPrice(200);
        l1.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug l2 = cipla.getDrugList().addDrug();
        l2.setDrugName("Drug101");
        l2.setDrugPrice(300);
        l2.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug l3 = cipla.getDrugList().addDrug();
        l3.setDrugName("Drug101");
        l3.setDrugPrice(400);
        l3.setQuantity(40);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug l4 = cipla.getDrugList().addDrug();
        l4.setDrugName("Y553");
        l4.setDrugPrice(100);
        l4.setQuantity(20);
        t1.setExpirationDate("12/31/2015");
        t1.setManufactureDate("01/01/2010");
        t1.setPurpose("allergie");
        t1.setDescription(" Available at all stores");
        t1.setSideeffects(" not advised for children");
        t1.setComposition("twenty");
        t1.setDrugID("ID 100");

        Drug l5 = cipla.getDrugList().addDrug();
        l5.setDrugName("Y552");
        l5.setDrugPrice(100);
        l5.setQuantity(20);
        l5.setExpirationDate("12/31/2015");
        l5.setManufactureDate("01/01/2010");
        l5.setPurpose("allergie");
        l5.setDescription(" Available at all stores");
        l5.setSideeffects(" not advised for children");
        l5.setComposition("twenty");
        l5.setDrugID("ID 100");

//        for (Supplier supplier : supplierDirectory.getSupplierDirectory()) {
//            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//            System.out.println("Supplier Name : " + supplier.getSupplierName());
//            System.out.println("Supplier ID : " + supplier.getSupplierID());
//            System.out.println("-------------------------");
//
//            for (Drug drug : supplier.getDrugList().getDrugList()) {
//                System.out.println("Drug name : " + drug.getDrugName());
//                System.out.println("Drug DrugPrice : " + drug.getDrugPrice());
//                System.out.println("Quantity : " + drug.getQuantity());
//                System.out.println("\n");
return supplierDirectory;
            
        }
    

}