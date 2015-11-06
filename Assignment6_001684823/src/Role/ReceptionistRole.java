/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.ReceptionistRole.ReceptionistWorkAreaJPanel;
import UserInterface.ReceptionistRole.WorkStatusJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ReceptionistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
         return new ReceptionistWorkAreaJPanel(pnl, ua, o,e);
    }
    
}
