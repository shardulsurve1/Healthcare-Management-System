/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Admins;

import Business.Model.City;
import Business.Model.Hospital;
import Business.Model.User;

/**
 *
 * @author chinm
 */
public class TreatmentUnitAdmin  extends User{
    
    City city;
    Hospital hospital;

    public TreatmentUnitAdmin(City city, Hospital hospital, String Name, String Username, String password) {
        super(Name, Username, password);
        this.city = city;
        this.hospital = hospital;
    }

    

    public TreatmentUnitAdmin() {
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    
}
