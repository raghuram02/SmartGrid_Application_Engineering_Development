/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Appliances.AppliancesDirectory;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.Sensors.SensorDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public abstract class Organization {

    private String name;    
    
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private SensorDirectory sensorDirectory;
    private AppliancesDirectory appliancesDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {

        Admin("Admin Organization"), Industry("Industry Organization"), Public("Public Organization"), Rural("Rural Organization"), Urban("Urban Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization( String name ) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();  
        appliancesDirectory = new AppliancesDirectory();  
        sensorDirectory = new SensorDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }

    public AppliancesDirectory getAppliancesDirectory() {
        return appliancesDirectory;
    }

    public void setAppliancesDirectory(AppliancesDirectory appliancesDirectory) {
        this.appliancesDirectory = appliancesDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
   

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
