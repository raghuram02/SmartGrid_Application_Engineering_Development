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
public class StoreDirectory {
    
    private ArrayList<Store> storeDirectory;

    public StoreDirectory() {
        this.storeDirectory = new ArrayList();
    }

    public ArrayList<Store> getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreDirectory(ArrayList<Store> storeDirectory) {
        this.storeDirectory = storeDirectory;
    }
    public Store addStore() {
        Store store = new Store();
        storeDirectory.add(store);
        return store;
    }
     public void deleteStore(Store store)
{
storeDirectory.remove(store);  
}
     public Store searchStore(String storeManager){
        for(Store s : storeDirectory)
        {
            if(s.getStoreManager().equalsIgnoreCase(storeManager)){
                return s;
            
        }
    }
    return null;
    }
}
