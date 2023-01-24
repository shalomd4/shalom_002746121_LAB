/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author shalomdaniel
 */
public class Address {
    
    String street ;
    String apt_no;
    String city;
    String state;
    int zipcode;
    
    public Address(){
        this.street = "";
        this.apt_no = "";
        this.city = "";
        this.state = "";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getApt_no() {
        return apt_no;
    }

    public void setApt_no(String apt_no) {
        this.apt_no = apt_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
