/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Person;

/**
 *
 * @author Raghuram
 */
public class UpdateAppliancesWorkRequest extends WorkRequest {

    private String result;
    private Person emp;

    public Person getEmp() {
        return emp;
    }

    public void setEmp(Person emp) {
        this.emp = emp;
    }
}
