/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Raghuram
 */
public class VitalSignHistory {
   private ArrayList<VitalSign>vitalSignList;
    public VitalSignHistory(){
        vitalSignList = new ArrayList();
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
     public VitalSign addVitalSign(){
        VitalSign vitalSign = new VitalSign();
        vitalSignList.add(vitalSign);
        return vitalSign;
    }
    public void deleteVitalSign(VitalSign vitalSign){
        this.vitalSignList.remove(vitalSign);
    }
}
