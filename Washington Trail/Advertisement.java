/**
 * Action that is a campaign Advertisement
 * @author Ojhan
 * @version 2/23
 */

public class Advertisement extends Action {
    private int approval;
    private int credibility;
    private int religion;
    private int tradition;
    private int populism;
    private int unions;
    private int wallSt;
    
    /**
     * Constructor gives name "Advertisement"
     * @param c campaign object
     */
    public Advertisement (Campaign c) {
        super ("Advertisement", "", c, false, 7);
        approval = credibility = religion = tradition = populism = unions = wallSt = 0;
    }

    /**
     * Gives options on types of advertisements
     * @return advertisement for kindness, wealth, faith, or fake qualities
     */
    public String choice1() { 
        String s = "Type of advertisement:\n1) Advertise your kindness";
        s += "\n2) Advertise your wealth";
        s += "\n3) Advertise your faith";
        s += "\n4) Advertise some good qualities you don't have (lie)";
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
        editCost (500);
        approval += 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result2 () {
        editCost (500);
        wallSt += 2;
        unions -= 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result3 () {
        editCost (500);
        religion += 1;
        tradition += 1;
        populism -= 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result4 () {
        editCost (500);
        populism += 2;
        credibility -= 1;
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
            getCampaign().getPlayer().editCredibility(credibility);
            getCampaign().getPlayer().editReligion(religion);
            getCampaign().getPlayer().editTradition(tradition);
            getCampaign().getPlayer().editPopulism(populism);
            getCampaign().getPlayer().editUnions(unions);
            getCampaign().getPlayer().editWallSt(wallSt);
            return 1;
        }
        else {
            System.out.println ("Try again when you have more funds.");
            return -1;
        }
    }
}