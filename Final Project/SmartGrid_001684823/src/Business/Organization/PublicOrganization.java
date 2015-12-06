/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.MaintenanceEmployeeRole;
import Business.Role.PublicOrganizationAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class PublicOrganization  extends Organization{
    public PublicOrganization() {
        super(Organization.Type.Public.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PublicOrganizationAdmin());
        roles.add(new MaintenanceEmployeeRole());
        return roles;
    }
}
