/**
 * A campaign, with a lead politician, other persons assisting, other politician allies,
 * money, and the location the campaign is occuring in
 * @author Jacob Huang
 * @version 2/18/17
 */

import java.util.ArrayList;

public class Campaign extends NamedThing {
    private Politician player;
    private ArrayList<Ally> allies;
    private int allyLimit;
    private ArrayList<Staff> staffMembers;
    private int budget;  //daily budget
    private int money;   //money used per day
    private City location;
    private String type; //mayoral, gubernatorial, or presidential
    private int statsError;
    private ArrayList<Action> events;
    private int experience;
    private String[] available;

    /**
     * Constructor assigns values to everything in the campaign
     * @param n name of campaign
     * @param d description (aka slogan)
     * @param a array of Allies (should theoretically be empty at first)
     * @param limit maximum number of allies at any given moment (also used to find # of allies/staff available
     *              for hire when prompted)
     * @param s array of Staff members (should be empty at first)
     * @param b campaign budget (daily)
     * @param m initial money used per day
     * @param l location of campaign
     * @param t type of campaign (i.e. mayoral, gubernatorial, or presidential campaign)
     * @param e error in displaying stats (improved with staff members)
     */
    public Campaign (String n, String d, Politician p, ArrayList<Ally> a, int limit,
                    ArrayList<Staff> s, int b, int m, City l, String t, int e) {
        super (n, d);
        player = p;
        allies = a;
        allyLimit = limit;
        staffMembers = s;
        budget = b;
        money = m;
        location = l;    
        type = t;
        statsError = e;
        events = new ArrayList<Action>();
        experience = 2;
        available = new String[2];
            available[0] = "Rally";
            available[1] = "Advertisement";
    }

    /**
     * Adds a political ally to the campaign
     * @param a an Ally who will help change the player's stats
     */
    public void addAlly (Ally a) {
        if (allies.size() < allyLimit) {
            allies.add(a);
            int[] boosts = a.getBoosts();

            player.editApproval(boosts[0]);
            player.editCredibility(boosts[1]);
            player.editPatriotism(boosts[2]);
            player.editReligion(boosts[3]);
            player.editTradition(boosts[4]);
            player.editPopulism(boosts[5]);
            player.editUnions(boosts[6]);
            player.editWallSt(boosts[7]);
        }
    }

    /**
     * Removes a political ally from the campaign
     * @param index the position in the array designating which ally to remove
     */
    public void removeAlly (int index) {
        Ally temp = allies.remove(index);
        int[] antiBoosts = temp.getBoosts();

        player.editApproval(-antiBoosts[0]);
        player.editCredibility(-antiBoosts[1]);
        player.editPatriotism(-antiBoosts[2]);
        player.editReligion(-antiBoosts[3]);
        player.editTradition(-antiBoosts[4]);
        player.editPopulism(-antiBoosts[5]);
        player.editUnions(-antiBoosts[6]);
        player.editWallSt(-antiBoosts[7]);
    }

    /**
     * Returns array with allies
     * @return ArrayList of allies
     */
    public ArrayList<Ally> getAllies () {
        return allies;
    }
    
    /**
     * Returns the ally limit 
     * @return ally limit
     */
    public int getAllyLimit () {
        return allyLimit;
    }
    
    /**
     * Adds to the ally limit
     * @param x number to add to limit
     */
    public void changeAllyLimit (int x) {
        allyLimit += x;
    }
    
    /**
     * Adds a staff member to the campaign
     * @param s a Staff member who will help change the player's stats
     */
    public void addStaff (Staff s) {
        int moneyInit = money;
        editMoney(s.getSalary());
        int moneyFinal = money;

        if (moneyInit != moneyFinal) {
            staffMembers.add(s);

            changeBudget ((int) (s.getBudgetMultiplier() * budget)); 

            statsError -= s.getStatError();
            if (statsError < 0)
                statsError = 0;

            player.editApproval (s.getPersonalityChange());
            player.editCredibility (s.getPersonalityChange());

        }
    }

    /**
     * Removes a staff member from the campaign
     * @param index the position in the array designating which staff member to remove
     */
    public void removeStaff (int index) {
        
        Staff temp = staffMembers.get(index);

        if (budget / temp.getBudgetMultiplier() >= money - temp.getSalary()) {
            staffMembers.remove(index);
            editMoney (-temp.getSalary());
            changeBudget ((int) (budget / temp.getBudgetMultiplier()));
            statsError += temp.getStatError();
            player.editApproval (-temp.getPersonalityChange());
            player.editCredibility (-temp.getPersonalityChange());
        }
        
        else
            System.out.println ("That person is too important to remove.");

    }
    
    /**
     * Returns the array of staff members
     * @return ArrayList with staff
     */
    public ArrayList<Staff> getStaff () {
        return staffMembers;
    }

    /**
     * Changes the campaign budget
     * @param b new campaign budget (to replace old one)
     */
    public void changeBudget (int b) {
        budget = b;
    }

    /**
     * Gives the campaign budget
     * @return budget
     */
    public int getBudget () {
        return budget;
    }

    /**
     * Adds or subtracts from the campaign's money-on-hand 
     * @param m money to add/subtract
     */
    public void editMoney (int m) {
        if (money + m > budget)
            System.out.println ("\nThat costs too much money.");
        else if (money + m < 0)
            System.out.println ("\nThere's not enough money.");
        else
            money += m;
    }

    /**
     * Gives amount of money used per day
     * @return money usage per day
     */
    public int getMoney () {
        return money;
    }

    /**
     * Returns the player's Politician object **Very Important**
     * @return player object
     */
    public Politician getPlayer () {
        return player;
    }

    /**
     * Returns the location of the campaign (City, not State)
     * @return location of campaign
     */
    public City getLocation() {
        return location;
    }
    
    /**
     * Changes the location of the campaign
     * @param l new location
     */
    public void changeLocation (City c) {
        location = c;
    }
    
    /**
     * Returns the type of campaign as an int
     * @return mayoral = 1, gubernatorial = 2, presidential = 3, error = 0
     */
    public int getType () {
        if (type.equalsIgnoreCase ("mayoral"))
            return 1;
        else if (type.equalsIgnoreCase ("gubernatorial"))
            return 2;
        else if (type.equalsIgnoreCase ("presidential"))
            return 3;
        return 0;
    }
    
    /**
     * Changes the type of campaign
     * @param String of campaign type
     */
    public void changeType (String s) {
        type = s;
    }
    
    /**
     * Returns the max error (decimal form) in displaying stats 
     * @return stats error
     */
    public int getError () {
        return statsError;
    }
    
    /**
     * Returns the currently scheduled action
     * @return currently planned Actions
     */
    public ArrayList<Action> getActions () {
        return events;
    }
    
    /**
     * Adds an action to the campaign and updates nothing because the playAction() already did
     */
    public void addAction (Action a) {
        events.add(a);
    }
    
    /**
     * Removes an action when the duration goes to zero
     * @param index index of the action to be removed
     */
    public void removeAction (int index) {
        Action temp = events.remove(index);
        editMoney (-temp.getCost());
    }

    /**
     * Gets experience of campaign
     * @return experience level of campaign = number of actions available to use
     */
    public int getExperience () {
        return experience;
    }
    
    /**
     * Changes experience of campaign by adding specified amount
     * @param exp number of new actions to be unlocked
     */
    public void changeExperience (int exp) {
        experience += exp;
        if (experience > available.length)
            experience = available.length;
    }
    
    /**
     * Returns the array of available actions - its limited by experience
     * @return array of available actions
     */
    public String[] getAvailable() {
        return available;
    }
    
    /**
     * Gives info about the campaign
     * @return name, description/slogan, name of candidate, campaign location, number of allies, number of staff, 
     * money used per day out of daily budget
     */
    public String toString () {
        String result = super.toString();
        result += "\nElection Type and Location: " + type + " - " + location.getName();
        result += "\nNumber of Political Allies: " + allies.size();
        result += "\nNumber of Staff: " + staffMembers.size();
        result += "\nCampaign funds: $" + money + " / $" + budget;
        return result;
    }
}