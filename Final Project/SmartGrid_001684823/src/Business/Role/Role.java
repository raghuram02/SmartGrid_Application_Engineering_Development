/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.SmartGrid;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        IndustryEnterpriseAdmin("IndustryEnterpriseAdmin"),
        IndustryOrganizationAdmin("IndustryOrganizationAdmin"),
        IndustryEmployeeAdmin("IndustryEmployeeAdmin"),
        CommunityEnterpriseAdmin("CommunityEnterpriseAdmin"),
        RuralAdmin("RuralAdmin"),
        RuralHouseHoldRole("RuralHouseHoldRole"),
        UrbanHouseHoldRole("UrbanHouseHoldRole"),
        UrbanAdmin("UrbanAdmin"),
        GovernmentEnterpriseAdmin("GovernmentEnterpriseAdmin"),
        PublicOrganizationAdmin("PublicOrganizationAdmin"),
        MaintenanceEmployeeRole("MaintenanceEmployeeRole");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            SmartGrid sg);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
