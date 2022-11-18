

package librarysystem;


public class Admin extends Person{

    private String password;
    
    public Admin() {
    }

    public Admin(String name, String password) {
        super(name);
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
    
}
