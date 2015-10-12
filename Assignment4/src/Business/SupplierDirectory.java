/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class SupplierDirectory {

    private ArrayList<Supplier> supplierDirectory;

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }

    public SupplierDirectory() {
        supplierDirectory = new ArrayList<Supplier>();
    }

    public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        supplierDirectory.add(supplier);
        return supplier;
    }

    public void removeSupplier(Supplier supplier) {
        supplierDirectory.remove(supplier);
    }

    public Supplier searchSupplier(String key) {
        for (Supplier s : supplierDirectory ) {
            if (key.equalsIgnoreCase(s.getSupplierName())) {
                return s;
            }
        }
        return null;
    }
}
