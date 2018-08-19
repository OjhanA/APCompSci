/* Physical Actions:
 * Press Conferences/interview
 * Make a YouTube video
 *                                                                      Rallies
 * Propaganda
 * 
 * Management/Daily Actions
 * Manage Staff Members
 * Manage ads
 * Budget Management
 * 
 * Special Actions:
 * Debates
 * Party Conventions
 * Endorsements
 * 
 * Bad Events:
 * "You have dysentery. Lose 3 days"
 * Email hack
 * NSA/CIA leak/FBI investigation/Access Hollywood leaks footage of you
 * Fake news
 * Attack ads
 * A meteor falls and destroys your HQ, pay a fine or lose a positive event
 * SNL memes you
 * 
 */

/**
 * Abstract class to describe actions that a player can take
 * @author Chester A Arthur
 * @version 2/21/17
 */

public abstract class Action extends NamedThing {
    private Campaign c;
    private Politician p;
    private boolean special;
    private int duration;
    
    //Changes to fix later, incl. duration
    private int cost;
    
    /**
     * Constructor gives an action a name and description, and a special indicator
     * @param n name of action
     * @param d description of action
     * @param ca campaign object
     * @param spe special event or not
     * @param dur duration of event - aka tells how long the budget will be impacted and time lost 
     *                                
     */
    
    public Action (String n, String d, Campaign ca, boolean spe, int dur) {
        super (n, d);
        c = ca;
        p = ca.getPlayer();
        special = spe;
        duration = dur;
        
        //Changes to fix later
        cost = 0;
    }
    
    /**
     * The 1st "choice" decision in an event: the player is given "subchoices" to pick from
     * @return subchoices for the 1st choice
     */
    public abstract String choice1 ();  //like i said earlier, put all text/script/dialog
                                                    //in these methods, we'll have another class to
                                                    //actually run the event w/ a Scanner and all
                                                    //those shenanigans
    
    /**
     * The 2nd "choice" decision in an event: the player is given "subchoices" to pick from
     * @return subchoices for the 2nd choice
     */
    public abstract String choice2 ();  //if there are left over choice methods, then
                                                    //just have the extra ones return "" (empty string)
    
    /**
     * The 3rd "choice" decision in an event: the player is given "subchoices" to pick from
     * @return subchoices for the 3rd choice
     */
    public abstract String choice3 ();  //if u need more than 5 choices, add more here to
                                                    //this class
    
    /**
     * The 4th "choice" decision in an event: the player is given "subchoices" to pick from
     * @return subchoices for the 4th choice
     */
    public abstract String choice4 ();
    
    /**
     * The 5th "choice" decision in an event: the player is given "subchoices" to pick from
     * @return subchoices for the 5th choice
     */
    public abstract String choice5 ();
    
    /**
     * Changes the Politician/player and Campaign as needed for subchoice 1
     */
    public abstract void result1 ();
    
    /**
     * Changes the Politician/player and Campaign as needed for subchoice 2
     */
    public abstract void result2 ();
    
    /**
     * Changes the Politician/player and Campaign as needed for subchoice 3
     */
    public abstract void result3 ();
    
    /**
     * Changes the Politician/player and Campaign as needed for subchoice 4
     */
    public abstract void result4 ();
    
    /**
     * Changes the Politician/player and Campaign as needed for subchoice 5
     */
    public abstract void result5 ();
    
    /**
     * Actual method that changes stuff
     * @return -1 if failure, 1 if success
     */
    public abstract int finalResult();
    
    /**
     * Gives the player/Politician object
     * @return the player object
     */
    public Politician getPlayer () {
        return p;
    }
    
    /**
     * Gives the Campaign objecet
     * @returna a campaign
     */
    public Campaign getCampaign () {
        return c;
    }
    
    /**
     * Returns the number of choices (not subchoices) in the Action
     * @return number of choices
     */
    public int numChoices () {
        int total = 1;
        if (!choice2().equals(""))
            total++;
        if (!choice3().equals(""))
            total++;
        if (!choice4().equals(""))
            total++;
        if (!choice5().equals(""))
            total++;
            
        return total;
    }
    
    /**
     * Returns the duration of the Action
     * @return duration (in days)
     */
    public int getDuration () {
        return duration;
    }
    
    /**
     * Reduces the duration of the Action by 1 day (i.e. one day passes by)
     */
    public void changeDuration () {
        duration--;
    }
    
    /**
     * Gets the cost of the action
     * @return cost
     */
    public int getCost () {
        return cost;
    }
    
    /**
     * Adds a value to the action cost
     * @param expense value to add to the cost of the event
     */
    public void editCost (int expense) {
        cost += expense;
    }
    
    /**
     * Returns a string of the Action's name and cost
     * @return name: $cost
     */
    public String toString () {
        return getName() + ": $" + cost;
    }
}