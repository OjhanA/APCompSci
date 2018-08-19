/**
 * Action that is a campaign Interview
 * @author Ojhan
 * @version 2/23
 */

public class Interview extends Action {
    private int approval;
    private int credibility;
    private int religion;
    private int tradition;
    private int populism;
    private int unions;
    private int wallSt;
    
    /**
     * Constructor gives name "Interview"
     * @param c campaign object
     */
    public Interview (Campaign c) {
        super ("Interview", "An news network wants to interview you", c, false, 7);
        approval = credibility = religion = tradition = populism = unions = wallSt = 0;
    }

    /**
     * Gives options on types of responses to the interview
     * @return response for helping workers, companies, staying traditional or having changes
     */
    public String choice1() { 
        String s = "The interviewer asks you what you will focus on if you get elected:\n1) Help the workers";
        s += "\n2) Help companies";
        s += "\n3) Continue on the couse the current government is taking";
        s += "\n4) Have massive reforms";
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
        unions += 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result2 () {
        wallSt += 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result3 () {
        tradition += 1;
    }

    /**
     * result of subchoice 1 on campaign finances and Politician approval
     */
    public void result4 () {
        populism += 1;
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