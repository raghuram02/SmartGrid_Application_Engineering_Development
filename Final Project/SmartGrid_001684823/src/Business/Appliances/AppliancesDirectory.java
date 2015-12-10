/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appliances;

import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class AppliancesDirectory {

    private ArrayList<Appliance> applianceList;

    public AppliancesDirectory() {
        applianceList = new ArrayList<>();
    }

    public ArrayList<Appliance> getApplianceList() {
        return applianceList;
    }

    public Appliance createAppliance(String applianceName) {
        Appliance a = new Appliance(applianceName);
        applianceList.add(a);
        return a;
    }
     public void deleteAppliance(Appliance appliance) {
        applianceList.remove(appliance);
    }
}
