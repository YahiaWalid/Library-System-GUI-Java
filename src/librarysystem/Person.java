
package librarysystem;


public abstract class Person {
    
    private String Name;

    public Person() {
        this.Name=null;
    }

    public Person(String Name) {
        this.Name = Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }
    
    
}
