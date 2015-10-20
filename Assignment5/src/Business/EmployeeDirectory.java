/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raghuram
 */
public class EmployeeDirectory {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public EmployeeDirectory() {
    
        employeeList = new ArrayList<Employee>();
    }
public Employee addEmployee(){
        Employee e = new Employee();
        employeeList.add(e);
        return e;
    }
    
    public void removeEmployee(Employee e){
        employeeList.remove(e);
    }
}
