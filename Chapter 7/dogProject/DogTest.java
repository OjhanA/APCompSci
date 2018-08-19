package dogProject;
/**
 * A simple test class that creates a Dog and makes it speak.
 * @author Ojhan Ardalan 
 * @version 2/28/17
 */
public class DogTest
{
    public static void main(String[] args) {
        System.out.print("\f");
        
        Dog lab = new Labrador("Mike", "Black");
        Dog york = new Yorkshire("Ike");
        System.out.println(lab.getName() + " says " + lab.speak() + "\nAverage breed weight: " + lab.avgBreedWeight());
        System.out.println();
        System.out.println(york.getName() + " says " + (york).speak() + "\nAverage breed weight: " + (york).avgBreedWeight());  
    }
}
