/**
 * A City with demographics (population, economic stats, ethnic stats) and a  
 * name/description - will randomly generate target "scores" (for politicians/the election) based on those stats,
 * although some will be completely RNG
 * @author Jacob Huang
 * @version 2/18/17 - early morning edition
 */

public class City extends NamedThing {
    private long population;
    private int economic; //economic scale - higher # = richer/upper-class, lower # = poorer/low-class, 0-100
    private int ethnic; //ethnic diversity scale - higher # = more diversity
    private int urban; //urban score - higher = more urban, lower = more rural
    private int change; //completely RNG value that, in reality, actually is pretty random
    private int[] targets; //8 topics, see Politician class for specifc order, etc.
   
    /* Overview
     * So, there are also 8 categories contained in a Politician with slightly different weights that, for the
     * sake of keeping the game simple, that % of the population will hold as the "most important factor,"
     * unequivocally (e.g. 10% of the pop will "care" most about patriotism --> patriotism will determine
     * 10% of the popular vote - BUT it's NOT winner take all (except electoral voting))
     * 
     * So...how do the #s get calculated???
     * First of all, there are 3 important values in City/State - economic, ethnic, and urban. I will use
     * some arbitrary equations (based on my own preconceived notions about politics) to derive a "target" 
     * score for each of the 8 Politician categories based in one or some of the 3 City values
     * However, these "targets" will be slightly different than the target - to add some randomness to the game
     * (who doesn't like RNG?) - specifically the actual target will be within a ±10 range of the "target"
     * 
     * Hao 2 Declare A Winner??
     * Well, I will take these targets and compare them to the 2 (or more) politicians' end scores in each of the
     * 8 categories. I think I will do the closest automatically gets 40% of the votes (e.g. 4% in 10% 
     * category) (tie is 50-50 split) and then what will determine the remaining is take the absolute % error and 
     * then add the 2 (or more) % errors and then calculate the ratio/percent of each canidate and award the 
     * remaining 6% in the same proportion as the % errors in reverse order
     * 
     * End Notes
     * Once this is done for each of the 8 categories, each candidate will have a percentage that will add
     * up to 100%, and this is the popular vote divide (population ≠ votes b/c voter turnout will be randomized)
     */
    
    /**
     * Constructor makes a City with population, economic "score", ethnicity "score", urban "score"
     * name, and description
     * @param n name of city
     * @param d description of city
     * @param p city population 
     * @param econ economic "score"
     * @param eth ethnic "score"
     * @param u urban "score"
     */
    public City (String n, String d, long p, int econ, int eth, int u) {
        super (n, d);
        population = p;
        economic = econ;
        ethnic = eth;
        urban = u;
        change = (int) (Math.random() * 101);
        targets = calculateTargets();
    }
    
    /**
     * Gives population of city
     * @return population
     */
    public long getPopulation () {
        return population;
    }
    
    /**
     * Gives economic "score"
     * @return economic score of city - not intended for user to ever see exact number, 
     * only "low" "medium" or "high" from toString; see data field for more info
     */
    public int getEconomic () {
        return economic;
    }
    
    /**
     * Gives ethnic "score"
     * @return ethnic score of city - see getEcon() for qualification
     */
    public int getEthnic () {
        return ethnic;
    }
    
    /**
     * Gives urban score
     * @return urban score of city (getEcon() for qualification)
     */
    public int getUrban() {
        return urban;
    }
    
    /**
     * Gives the randomized score - never to be seen by player
     * @return "change" score
     */
    public int getChange () {
        return change;
    }
    
    /**
     * Gives the array with the target values for the 8 categories
     * @return array with targets
     */
    public int[] getTargets () {
        return targets;
    }
    
    /**
     * Creates the 8 target values based on City info
     * @return int array with the target values in order listed in Politician class
     */
    private int[] calculateTargets () {
        int[] goals = new int[8];
        goals[0] = 100;
        goals[1] = 100;
        goals[2] = ((int) (100 - (ethnic + urban)/2.0)) + ((int) (Math.random() * 21 - 10));
        goals[3] = ((int) (100 - (3 * ethnic + urban)/4.0)) + ((int) (Math.random() * 21 - 10));
        goals[4] = (100 - change) + ((int) (Math.random() * 21 - 10));
        goals[5] = (change) + ((int) (Math.random() * 41 - 20));
        goals[6] = ((int) ((3 * (100 - economic) + ethnic + 2 * urban)/6.0)) + ((int) (Math.random() * 21 - 10));
        goals[7] = ((int) ((2 * economic + urban)/3.0)) + ((int) (Math.random() * 21 - 10));
        
        for (int i = 0; i < goals.length; i++) {
            if (goals[i] > 100)
                goals[i] = 100;
            else if (goals[i] < 0)
                goals[i] = 0;
        }
        
        return goals;
    }
    
    /**
     * Gives info about the city
     * @return String with name and description, population, and economic/ethnic/urban descriptors
     */
    public String toString () {
        String result = super.toString();
        result += "\nPopulation: " + population;
        
        result += "\nEconomic State: ";
        if (economic < 33)
            result += "Lower-class";
        else if (economic > 67)
            result += "Upper-class";
        else
            result += "Middle-class";
            
        result += "\nEthnic Diversity: ";
        if (ethnic < 33)
            result += "Low";
        else if (ethnic > 67)
            result += "High";
        else
            result += "Medium";
            
        result += "\nType: ";
        if (urban < 33)
            result += "Rural";
        else if (urban > 67)
            result += "Urban";
        else 
            result += "Suburban";
            
        return result;
    }
}