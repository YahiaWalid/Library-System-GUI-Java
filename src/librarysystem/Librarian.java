/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author Yahia
 */
public class Librarian extends Admin {
    
    private int id;
    private String email;
    private String address;
    private String city;
    private String  contactNumber;



    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
    
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    
    
    public Librarian() {
      
    }
    public Librarian(int id, String email, String address, String city, String contactNumber, String name, String password) {
        super(name, password);
        this.id=id;
        this.email = email;
        this.address = address;
        this.city = city;
        this.contactNumber = contactNumber;
      
    }

    public Librarian(String email, String address, String city, String contactNumber) {
        this.email = email;
        this.address = address;
        this.city = city;
        this.contactNumber = contactNumber;
    }

    public Librarian(String name, String password, String email, String address, String city, String contactNumber ) {
        super(name, password);
        this.email = email;
        this.address = address;
        this.city = city;
        this.contactNumber = contactNumber;
    }
    
    
    
    
    
}
