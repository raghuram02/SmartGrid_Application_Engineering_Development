/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.RuralHouseHoldRole;
import Business.Role.RuralOrganizationAdmin;
import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class RuralOrganization extends Organization {
    public RuralOrganization() {
        super(Organization.Type.Rural.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RuralOrganizationAdmin());
        roles.add(new RuralHouseHoldRole());
        return roles;
    }
}
