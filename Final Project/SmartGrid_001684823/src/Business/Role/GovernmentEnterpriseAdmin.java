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
import UserInterface.GovernmentOwnedEnterpriseAdminWorkArea.GovernmentAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class GovernmentEnterpriseAdmin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, SmartGrid sg) {
       return new GovernmentAdminWorkAreaJPanel(userProcessContainer, enterprise,sg);
    }
}
