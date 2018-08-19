/**
 * Action that is a campaign rally
 * @author Ojhan
 * @version 2/23
 */

public class Rally extends Action {
    
    private int approval;

    /**
     * Constructor gives name "Rally"
     * @param c campaign object
     */
    public Rally (Campaign c) {
        super ("Rally", "", c, false, 2);
        approval = 0;
    }

    /**
     * Gives options on location of rally (size)
     * @return small, medium, or large options
     */
    public String choice1() { 
        String s = "Location:\n1) Swamp (Rural)";
        s += "\n2) Country Club";
        s += "\n3) Stadium";
        return s;
    }

    /**
     * Nothing
     * @return empty string
     */
    public String choice2() { 
        return "";
    }

    /**
     * Nothing
     * @return empty string
     */
    public String choice3() { 
        return "";
    }

    /**
     * Nothing
     * @return empty string
     */
    public String choice4() { 
        return "";
    }

    /**
     * Nothing
     * @return empty string
     */
    public String choice5() { 
        return "";
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result1 () {
        editCost (1000);
        approval += 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result2 () {
        editCost (3000);
        approval += 2;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result3 () {
        editCost (6000);
        approval += 3;
    }

    /**
     * Nothing
     */
    public void result4 () {
    }

    /**
     * Nothing
     */
    public void result5 (){ 
    }

    /**
     * Changes the campaign budget and only change politicians stats if budget changes
     * @return 1 if success
     *         -1 if failure
     */
    public int finalResult () {
        int initialMoney = getCampaign().getMoney();
        getCampaign().editMoney (getCost());
        int finalMoney = getCampaign().getMoney();
        
        if (initialMoney != finalMoney)  {
            getCampaign().getPlayer().editApproval(approval);
            return 1;
        }
        else {
            System.out.println ("Try again when you have more funds.");
            return -1;
        }
    }
}