/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;


public class Student extends Librarian{

    public Student() {
    }

    public Student(int id,String name, String password, String email, String address, String city, String contactNumber ) {
        super(id, email, address, city, contactNumber, name, password);
    }

    
    public Student(String name, String password, String email, String address, String city, String contactNumber ) {
        super( name, password,email, address,city,contactNumber);
    }
    
  /*  
    private static int studCounter= 0;

    public static int getStudCounter() {
        return studCounter;
    }

  */
    
    
    
    
}
