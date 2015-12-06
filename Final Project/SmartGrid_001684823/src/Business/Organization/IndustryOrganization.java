/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IndustryEmployeeRole;
import Business.Role.IndustryOrganizationAdmin;
import Business.Role.Role;
import static Business.Role.Role.RoleType.IndustryOrganizationAdmin;
import Business.Role.RuralHouseHoldRole;
import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class IndustryOrganization extends Organization {
    public IndustryOrganization() {
        super(Organization.Type.Industry.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new IndustryOrganizationAdmin());
        roles.add(new IndustryEmployeeRole());
        return roles;
    }
}
