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
public class Person {
    
    String firstname;
    String lastname;
    String college_name;
    String nuid;

    Address college_address;
    Address permanentAddress;
    
    Contact personalContact;
    Contact officeContact;
    
    public Person() {
        this.firstname = "";
        this.lastname = "";
        this.college_name = "";
        this.nuid = "";
        this.college_address = new Address();
        this.permanentAddress = new Address();
        
        this.officeContact = new Contact();
        this.personalContact = new Contact();
    }
    
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }
    
    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }


    public Address getCollege_address() {
        return college_address;
    }

    public void setCollege_address(Address college_address) {
        this.college_address = college_address;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }
}
