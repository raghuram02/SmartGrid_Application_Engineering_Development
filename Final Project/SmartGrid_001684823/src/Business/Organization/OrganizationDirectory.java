/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Urban.getValue())) {
            organization = new UrbanOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Rural.getValue())) {
            organization = new RuralOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Industry.getValue())) {
            organization = new IndustryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Public.getValue())) {
            organization = new PublicOrganization();
            organizationList.add(organization);
        }
       

        return organization;
    }
}
