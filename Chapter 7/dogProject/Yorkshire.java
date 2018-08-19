package dogProject;
/**
 * A class derived from Dog that holds information about a Yorkshire terrie
 * @author Ojhan Ardalan 
 * @version 2/28/17
 */
public class Yorkshire extends Dog {
    private int breedWeight = 65;
    public Yorkshire(String name) { 
        super(name);    
    }

    public String speak() { 
        return "yap yap";  
    }  
    
    public int avgBreedWeight() { 
        return breedWeight;   
    }
}

    