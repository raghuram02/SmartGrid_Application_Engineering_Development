/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Raghuram
 */
public class VitalSign {
 private float respiratoryRate;
 private float heartRate;
 private float bloodPressure;
 private float weight;
 private String timeStamp;

    public String getTimeStamp() {
        timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
        return timeStamp;
    }

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
@Override
public String toString()
{
    return getTimeStamp();
}
}
 
    

