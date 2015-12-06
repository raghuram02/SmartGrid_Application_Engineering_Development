/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Appliances.Appliance;
import Business.Person.Person;

/**
 *
 * @author Raghuram
 */
public class AddAppliancesWorkRequest extends WorkRequest {

    private String result;
    private String applianceName;
    private Person emp;
    private int quantity;
    private Appliance appliance;

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public Person getEmp() {
        return emp;
    }

    public void setEmp(Person emp) {
        this.emp = emp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Appliance getAppliance() {
        return appliance;
    }

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }

}
