/**
 * A State with demographics (population, economic stats, ethnic stats), a  
 * name/description, and electoral votes
 * @author Jacob Huang
 * @version 2/18/17 - early morning edition
 */

public class State extends City {
    private int electoral;
    
    /**
     * Constructor makes a State with population, economic "score", ethnicity "score",
     * name, description, and electoral votes
     * @param n name of state
     * @param d description of state
     * @param p state population 
     * @param econ economic "score"
     * @param eth ethnic "score"
     * @param u urban "score"
     * @param elec electoral votes
     */
    public State (String n, String d, long p, int econ, int eth, int u, int elec) {
        super (n, d, p, econ, eth, u);
        electoral = elec;
    }
    
    /**
     * Returns number of electoral votes
     * @return electoral votes
     */
    public int getElectoral () {
        return electoral;
    }
    
    /**
     * Gives info about the state
     * @return String with name and description, population, and economic + ethnic diversity descriptors
     * and electoral votes
     */
    public String toString () {
        String result = getName() + ": " + getDescription();
        result += "\nPopulation: " + getPopulation(); 
        result += "\nElectoral Votes: " + electoral;
        
        result += "\nEconomic Outlook: ";
        if (getEconomic() < 40)
            result += "Poor";
        else if (getEconomic() > 67)
            result += "Good";
        else
            result += "Average";
            
        result += "\nEthnic Diversity: ";
        if (getEthnic() < 20)
            result += "Low";
        else if (getEthnic() > 40)
            result += "High";
        else
            result += "Medium";
            
        result += "\nOverall Type: ";
        if (getUrban() < 67)
            result += "Less Urban";
        else if (getUrban() > 90)
            result += "Very Urban";
        else 
            result += "Urban";
        
            
        return result;
    }
}