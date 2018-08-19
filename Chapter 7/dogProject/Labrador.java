package dogProject;
/**
 * A class derived from Dog that holds information about a labrador retriever
 * @author Ojhan Ardalan 
 * @version 2/28/17
 */
public class Labrador extends Dog{
    private String color; //black, yellow, or chocolate?     
    private int breedWeight = 75;
 
    public Labrador(String name, String color) {
        super (name);
        this.color = color;    
    }

    public String speak() {
        return "BOW WOW";    
    }

    public int avgBreedWeight() { 
        return breedWeight;   
    }
}
