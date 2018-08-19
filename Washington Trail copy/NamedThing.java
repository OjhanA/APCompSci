/**
 * A general class for every noun (and maybe more) thing in the game
 * @author Jacob Huang
 * @version 2/16/17
 */

public abstract class NamedThing {
    private String name;
    private String description;
    
    /**
     * Constructor gives a name and no description to a thing
     * @param n name of thing
     */
    public NamedThing (String n) {
        name = n;
        description = "";
    }
    
    /**
     * Constructor gives a name and description to a thing
     * @param n name of thing
     * @param d description of thing
     */
    public NamedThing (String n, String d) {
        name = n;
        description = d;
    }
    
    /**
     * Gives name of thing
     * @return name of thing
     */
    public String getName () {
        return name;
    }
    
    /**
     * Gives description of thing
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * returns a String with info about the thing
     * @return name and description of thing
     */
    public String toString() {
        return name + ": " + description;
    }
}