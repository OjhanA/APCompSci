package dogProject;
/**
 * A class that holds a dog's name and can make it speak.
 * @author Ojhan Ardalan 
 * @version 2/28/17
 */
public abstract class Dog {     
    private String name; 
    public Dog(String name) {  
        this.name = name;     
    } 

    public String getName() {  
        return name;     
    }

    public String speak() {
        return "woof";   
    } 
    
    public abstract int avgBreedWeight();
}