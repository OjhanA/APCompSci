public class Staff extends Person{
    private int errorChange;
    private int publicityChange;
    private double budgetMultiplier;
    
    /**
     * Constructor creates a staff member with a name, description, salary, and effects on the Campaign/Politician
     * @param n name of person
     * @param d description/job in campaign (statistician, press secretary, campaign researcher, fundraising director
     * @param s salary
     * @param e change in error of stats in campaign - statistician/researcher
     * @param pub change in Politician's publicity aka approval and/or credibility - press secretary
     * @param b increases the amount of money raised --> increased daily budget - fundraising director
     */
    public Staff (String n, String d, int s, int e, int pub, double b) {
        super (n, d, s);
        errorChange = e;
        publicityChange = pub;
        budgetMultiplier = b;
    }
    
    /**
     * Gets the decimal to change the amount of potential error in the campaign-based stats
     * @return error change
     */
    public int getStatError () {
        return errorChange;
    }
    
    /**
     * Gets the number to increase the approval and credibility
     * @return personality categories change
     */
    public int getPersonalityChange () {
        return publicityChange;
    }
    
    /**
     * Gets the decimal to increase the budget by
     * @return budget multiplier
     */
    public double getBudgetMultiplier () {
        return budgetMultiplier;
    }
   
    /**
     * returns the basic info of a Staff: name and job
     * @return name and job
     */
    public String getInfo () {
        return getName() + ": " + getDescription();
    }
}