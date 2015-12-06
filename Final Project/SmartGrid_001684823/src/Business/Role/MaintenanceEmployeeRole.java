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

import UserInterface.GovernmentOwnedMaintenanceEmployeeWorkAreaJPanel.MaintenanceEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class MaintenanceEmployeeRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, SmartGrid sg) {
    System.out.print("Enterprise"+ enterprise);
    System.out.print("Organization"+ organization);
        return new MaintenanceEmployeeWorkAreaJPanel(userProcessContainer, enterprise, account, organization);
    
    }
}
