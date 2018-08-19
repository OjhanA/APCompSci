/**
 * A person who is a Politician - this kind of person has approval ratings, scores based on appeals to 
 * certain kinds of people (i.e. the stuff polls measure)
 * @author Jacob Huang
 * @version 2/18/17
 */

public class Politician extends Person {
   private int approval;                         //Stat 1                    //20% base weight - personality
   private int credibility;                      //2                         //10% - personality
   
   private int patriotism;                       //3                         //7.5% - cultural
   private int religion;                         //4                         //12.5% - cultural
   
   private int tradition;  //appeal to traditional politics/status quo  //5   //10% - "other" factor it changes with
   private int populism; //likeability/the "it" factor                  //6   //10% - every election, thus all RNG
   
   private int unions; //appeal to working class                        //7   //15% - economic
   private int wallSt; //appeal to elites/upper-class                   //8   //15% - economic
   
   //scores are all 0-100
   
   /**
     * Constructor creates a politician with a name, description, gender, and race, plus a bunch of "scores"
     * @param n name of person
     * @param d description of person
     * @param a approval rating 
     * @param c credibility rating
     * @param pat appeal to American patriotism and/or military
     * @param rel appeal to religious individuals
     * @param t appeal to status quo/traditional institutions 
     * @param pop appeal to populist interests vs. status quo
     * @param u appeal to working class
     * @param w appeal to elites
     */
    public Politician (String n, String d, int a, int c, int pat, int rel, int t, int pop, int u, int w) {
        super (n, d, 0);
        approval = a;
        credibility = c;
        patriotism = pat;
        religion = rel;
        tradition = t;
        populism = pop;
        unions = u;
        wallSt = w;
    }
    
    /**
     * Constructor creates a completely new Politician with a name, description,
     * and scores of 0 (beginner) all around
     * @param n name of person
     * @param d description of person
     * @param g gender of person
     * @param r race of person
     */
    public Politician (String n, String d) {
        super (n, d, 0);
        approval = credibility = patriotism = religion = tradition = populism = unions = wallSt = 0;
    }
    
    /**
     * Gets all 8 ratings and puts them in an array (approval, credibility, patriotism, religion, tradition,
     * populism, unions, wallSt)
     * @return array of the Politician's scores - see method description for order
     */
    public int[] getScores () {
        int[] scores = {approval, credibility, patriotism, religion, tradition, populism, unions, wallSt};
        return scores;
    }
    
    
    /**
     * Changes approval rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editApproval (int x) {
        approval += x;
        if (approval > 100)
            approval = 100;
        else if (approval < 0)
            approval = 0;
    }
    
    /**
     * Changes credibility rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editCredibility (int x) {
        credibility += x;
        if (credibility > 100)
            credibility = 100;
        else if (credibility < 0)
            credibility = 0;
    }
    
    /**
     * Changes patriotism rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editPatriotism (int x) {
        patriotism += x;
        if (patriotism > 100)
            patriotism = 100;
        else if (patriotism < 0)
            patriotism = 0;
    }
    
    /**
     * Changes religion rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editReligion (int x) {
        religion += x;
        if (religion > 100)
            religion = 100;
        else if (religion < 0)
            religion = 0;
    }
    
    /**
     * Changes tradition rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editTradition (int x) {
        tradition += x;
        if (tradition > 100)
            tradition = 100;
        else if (tradition < 0)
            tradition = 0;
    }
    
    /**
     * Changes populism rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editPopulism (int x) {
        populism += x;
        if (populism > 100)
            populism = 100;
        else if (populism < 0)
            populism = 0;
    }
    
    /**
     * Changes unions rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editUnions (int x) {
        unions += x;
        if (unions > 100)
            unions = 100;
        else if (unions < 0)
            unions = 0;
    }
    
    /**
     * Changes wallSt rating
     * @param x positive or negative change to specified rating, can't be over 100 
     * or below 0 (in normal circumstances)
     */
    public void editWallSt (int x) {
        wallSt += x;
        if (wallSt > 100)
            wallSt = 100;
        else if (wallSt < 0)
            wallSt = 0;
    }
    
    /**
     * Gives info about the politician
     * @return name, description, gender, race, 8 scores
     */
    public String toString () {
        String result = super.toString() + "\n";
        for (int i : getScores())
            result += i + " ";
        return result;
    }
}