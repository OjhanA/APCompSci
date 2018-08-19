/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
public class Task implements Priority, Comparable {
    private int priority;
    private String name;
    
    /**
     * This constructor method takes in a name
     * @param n Name
     */
    public Task(String n) {
        name = n;
    }

    /**
     * This method returns the name
     * @return The name
     */
    public String getName() {
        return name;
    }
    
    /**
     * This method sets the priority
     * @param p The priority
     */
    @Override
    public void setPriority(int p) {
        priority = p;
    }

    /**
     * This method gets the priority
     * @return The priority
     */
    @Override
    public int getPriority() {
        return priority;
    }
    
    /**
     * This method prints out the name and priority
     * @return The name and priority
     */
    public String toString() {
        return "Name: " + name + "\nPrioirty " + priority;
    }
    
    /**
     * This method compares one object to another
     * @return 1 if it's greater, 0 if it's equal, or -1 if it's less
     */
    public int compareTo(Object o) {
        if (priority > ((Task)o).getPriority())
            return 1;
        else if (priority == ((Task)o).getPriority())
            return 0;
        else
            return -1;
    }
}

