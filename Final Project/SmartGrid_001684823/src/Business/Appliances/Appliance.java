/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appliances;

/**
 *
 * @author Raghuram
 */
public class Appliance {

    private String applianceName;
    private int quantity;

    
    private ApplianceType applianceType;

    public Appliance(String name) {

        this.applianceName = name;

    }

    public String getApplianceName() {
        return applianceName;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

   

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public enum ApplianceType {

        LightDutyAppliance("LightDutyAppliance"), MediumDutyAppliance("MediumDutyAppliance"), HeavyDutyAppliance("HeavyDutyAppliance"),
        TV("TV"), Fridge("Fridge"), Motor("Motor"), WashingMachine("WashingMachine"), Blender("Blender"), Heater("Heater"),
        Computer("Computer"), Oven("Oven"), AirConditioner("AirConditioner"), OtherPluggableDevices("OtherPluggableDevices");

        private String value;

        private ApplianceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    @Override
    public String toString() {
        return applianceName;
    }

}
