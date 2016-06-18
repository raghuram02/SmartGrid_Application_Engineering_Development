/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class BloodDonationWorkRequest extends WorkRequest{
    
    private String testResult;
    private String bloodGroup;
    private String requestDate;
    private String barCode;
    private Employee donor;

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

  public String getrequestDate() {
        requestDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
        return requestDate;
    }
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Employee getDonor() {
        return donor;
    }

    public void setDonor(Employee donor) {
        this.donor = donor;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    @Override
    public String toString(){ 
            return this.getMessage();
    }
}
