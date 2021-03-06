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
import UserInterface.CommunityUrbanOrganizationAdminWorkArea.UrbanAdminWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class UrbanOrganizationAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, SmartGrid sg) {
        return new UrbanAdminWorkAreaJPanel(userProcessContainer, enterprise, account, organization);
    }
    
}
