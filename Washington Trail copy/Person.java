/**
 * Person with gender, race, and salary
 * @author Jacob Huang
 * @version 2/18/17
 */

public class Person extends NamedThing {
    private int salary;
    
    /**
     * Constructor creates a person with a name, description, and salary
     * @param n name of person
     * @param d description of person
     * @param s salary
     */
    public Person (String n, String d, int s) {
        super (n, d);
        salary = s;
    }
    
    /**
     * Gives the person's salary
     * @return salary
     */
    public int getSalary () {
        return salary;
    }
    
    /**
     * Gives a string with info about a person
     * @return name, description, and salary
     */
    public String toString () {
        String result = super.toString();
        result += "\n\tSalary: $" + salary;
        return result;
    }
}