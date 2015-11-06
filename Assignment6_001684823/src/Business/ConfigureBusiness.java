/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Role.AdminRole;

/**
 *
 * @author Raghuram
 */
public class ConfigureBusiness {

    public static EcoSystem configureBusiness() {
        EcoSystem ecosystem = ConfigureASystem.configure();
        Network network = ecosystem.createAndAddNetwork();
        network.setName("MA");
        for (Network n : ecosystem.getNetworkList()) {
            Enterprise e = n.getEnterpriseDirectory().createAndAddEnterprise("e1", Enterprise.EnterpriseType.Hospital);
            for (Enterprise e1 : n.getEnterpriseDirectory().getEnterpriseList()) {
                AdminOrganization admin = new AdminOrganization();
                e1.getOrganizationDirectory().getOrganizationList().add(admin);
                for (Organization o : e1.getOrganizationDirectory().getOrganizationList()) {
                    Employee emp = o.getEmployeeDirectory().createEmployee("RRH");
                    UserAccount ua = o.getUserAccountDirectory().createUserAccount("admin", "admin", emp, new AdminRole());
                }
            }
        }
        return ecosystem;
    }

}
