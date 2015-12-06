/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UrbanHouseHoldRole;
import Business.Role.UrbanOrganizationAdmin;
import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class UrbanOrganization extends Organization{

    public UrbanOrganization() {
        super(Organization.Type.Urban.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UrbanOrganizationAdmin());
        roles.add(new UrbanHouseHoldRole());
        return roles;
    }
    
    
}
