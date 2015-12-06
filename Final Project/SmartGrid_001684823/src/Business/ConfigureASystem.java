/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Raghuram
 */
public class ConfigureASystem {

    public static SmartGrid configure() {
        SmartGrid sg = SmartGrid.getInstance();
        Person person = sg.getPersonDirectory().createPerson("rrr");
        UserAccount ua = sg.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());

        return sg;
    }

}
