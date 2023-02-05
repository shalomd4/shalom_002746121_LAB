/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shalomdaniel
 */
public class Observation {

    int observationId;
    private double bloodPressure;
    private double temperature;
    private Medicine med_assignment;

    public Medicine getMed_assignment() {
        return med_assignment;
    }

    public void setMed_assignment(Medicine med_assignment) {
        this.med_assignment = med_assignment;
    }
    
    
    public Observation() {
        this.med_assignment = new Medicine();
    }
    
    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    

    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
    

}
