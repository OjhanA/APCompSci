/**
 * A class for static methods that print out menus for the game
 * @author Jacob + Ojhan
 * @version 2/25
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Menus {

    private static Scanner scan = new Scanner (System.in);

    public static void title () {
        System.out.println ("\f __    __   ____  _____ __ __  ____  ____    ____  ______   ___   ____       ______  ____    ____  ____  _     ");
        System.out.println ("|  T__T  T /    T/ ___/|  T  Tl    j|    \\  /    T|      T /   \\ |    \\     |      T|    \\  /    Tl    j| T    ");
        System.out.println ("|  |  |  |Y  o  (   \\_ |  l  | |  T |  _  YY   __j|      |Y     Y|  _  Y    |      ||  D  )Y  o  | |  T | |    ");
        System.out.println ("|  |  |  ||     |\\__  T|  _  | |  | |  |  ||  T  |l_j  l_j|  O  ||  |  |    l_j  l_j|    / |     | |  | | l___ ");
        System.out.println ("l  `  '  !|  _  |/  \\ ||  |  | |  | |  |  ||  l_ |  |  |  |     ||  |  |      |  |  |    \\ |  _  | |  | |     T");
        System.out.println (" \\      / |  |  |\\    ||  |  | j  l |  |  ||     |  |  |  l     !|  |  |      |  |  |  .  Y|  |  | j  l |     |");
        System.out.println ("  \\_/\\_/  l__j__j \\___jl__j__j|____jl__j__jl___,_j  l__j   \\___/ l__j__j      l__j  l__j\\_jl__j__j|____jl_____j");
        System.out.println ("\n\n\n\nBy: Jacob Huang and Ojhan Ardalan\n");
        confirm();
    }

    public static void about() {
        System.out.println ("\fHello! Welcome to the Washington Trail! \n\nThe goal of this game is quite simple.");
        System.out.println ("Essentially, this game is a presidential campaign simulator (as well as a " + 
            "local and state campaign simulator).");
        System.out.println ("So what that means is that you, the player, will have to manage various aspects of a campaign.");
        System.out.println ("\nThis includes things like how well \"people\" (not actually real people) like you, who and how ");
        System.out.print ("many people will be a part of your campaign team. \n\nFurthermore, there will be many different kinds of ");
        System.out.print ("events along the way, such as opportunities for \nrallies, interviews, a debate, and unexpected events ");
        System.out.print ("in which you will have to select an option that \nyou believe will help you win the election at ");
        System.out.println ("the end of the campaign.");
        confirm();
    }

    public static void expenses (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Daily Expenses:");
        System.out.println ("--------------");
        System.out.println ();
        System.out.println ("Staff:");
        for (int i = 0; i < c.getStaff().size(); i++) 
            System.out.println (c.getStaff().get(i));
        System.out.println ("\nEvents:");
        for (int i = 0; i < c.getActions().size(); i++)
            System.out.println ("\t" + c.getActions().get(i));
        if (c.getActions().size() == 0)
            System.out.println ("None");

        System.out.println ("\nOverall Finances: ");
        System.out.println ("\tDaily Expenses: $" + c.getMoney() + " / $" + c.getBudget());
        System.out.println ("*********************************************************");
        confirm();
    }

    public static void peopleMenu () {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Campaign People: ");
        System.out.println ("\n1) Staff");
        System.out.println ("2) Allies");
        System.out.println ("\n3) Cancel");
        System.out.println ("*********************************************************");
    }
    
    public static void allyMenu (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Allies (" + c.getAllies().size() + "/" + c.getAllyLimit() +"): ");
        System.out.println ("\n1) View Allies");
        System.out.println ("2) Add Allies");
        System.out.println ("3) Remove Allies");
        System.out.println ("\n4) Cancel");
        System.out.println ("*********************************************************");
    }
    
    public static void viewAllies (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Allies:\n");
        for (int i = 0; i < c.getAllies().size(); i++)
            System.out.println (c.getAllies().get(i).getName() + ": " + c.getAllies().get(i).getDescription());
        if (c.getAllies().size() == 0)
            System.out.println ("None");
        System.out.println ("*********************************************************");
        confirm();
    }
    
    public static void addAllies (Campaign c, ArrayList<Ally> people) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("You have petitioned your many acquaintances to see");
        System.out.println ("if they are willing to endorse you and maybe improve ");
        System.out.println ("your chances of winning.");
        System.out.println ("(Note: It takes a day to acclimate potential allies to");
        System.out.println ("your campaign)\n");
        int i;
        for (i = 0; i < people.size(); i++)
            System.out.println ((i + 1) + ") " + people.get(i).getName() + ": " + people.get(i).getDescription());
        System.out.println("\n" + (i + 1) + ") Cancel");
    }
    
    public static void removeAllies (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Choose an ally to remove (be careful):\n");
        int i;
        for (i = 0; i < c.getAllies().size(); i++)
            System.out.println ((i + 1) + ") " + c.getAllies().get(i).getName() + ": " + c.getAllies().get(i).getDescription());
        System.out.println ("\n" + (i + 1) + ") Cancel");
    }
    
    public static void staffMenu () {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Staff: ");
        System.out.println ("\n1) View Staff");
        System.out.println ("2) Add Staff");
        System.out.println ("3) Remove Staff");
        System.out.println ("\n4) Cancel");
        System.out.println ("*********************************************************");
    }
    
    public static void viewStaff (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Staff Members:\n");
        for (int i = 0; i < c.getStaff().size(); i++)
            System.out.println (c.getStaff().get(i).getInfo());
        if (c.getStaff().size() == 0)
            System.out.println ("None");
        System.out.println ("*********************************************************");
        confirm();
    }
    
    public static void addStaff (Campaign c, ArrayList<Staff> people) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("You have posted advertisements for more");
        System.out.println ("campaign workers. Who would you like to hire?");
        System.out.println ("(Note: Since it takes so much time to teach hirees");
        System.out.println ("how to do their new job, 1 day will pass if you hire");
        System.out.println ("someone.):\n");
        int i;
        for (i = 0; i < people.size(); i++)
            System.out.println ((i + 1) + ") " + people.get(i).getName() + ": " + people.get(i).getDescription());
        System.out.println("\n" + (i + 1) + ") Cancel");
    }
    
    public static void removeStaff (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Choose a staff member to remove (be careful):\n");
        int i;
        for (i = 0; i < c.getStaff().size(); i++)
            System.out.println ((i + 1) + ") " + c.getStaff().get(i).getInfo());
        System.out.println ("\n" + (i + 1) + ") Cancel");
    }

    public static void mainMenu (int daysLeft) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Days Left Until Election: " + daysLeft);
        System.out.println ();
        System.out.println (" _   _                      ");
        System.out.println ("| | | |                     ");
        System.out.println ("| |_| | ___  _ __ ___   ___ ");
        System.out.println ("|  _  |/ _ \\| '_ ` _ \\ / _ \\");
        System.out.println ("| | | | (_) | | | | | |  __/");
        System.out.println ("\\_| |_/\\___/|_| |_| |_|\\___|");
        System.out.println ("\nWhat do you want to do?");
        System.out.println ("\n1) Schedule an Event");
        System.out.println ("2) Check Progress");
        System.out.println ("3) Manage People in Campaign");
        System.out.println ("4) View Expenses");
        System.out.println ("5) Campaign Overview");
        System.out.println ("6) Continue on to the next day");
        System.out.println ("*********************************************************");
    }                                                

    public static void overview (Campaign c) {
        System.out.print ("\f");
        System.out.println (c);
        confirm();
    }
    
    public static void actionsList (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Choose an event to schedule");
        System.out.println ("(Note: Each event takes a different amount of time");
        System.out.println ("and different amounts of money.\n");
        System.out.println ("(Another note: This is the last point to decide not to");
        System.out.println ("run an event.)\n");
        String[] actions = c.getAvailable();
        int i;
        for (i = 0; i < c.getExperience(); i++)
            System.out.println ((i + 1) + ") " + actions[i]);
        System.out.println ("\n" + (i+1) + ") Cancel");
        System.out.println ("*********************************************************");
    }

    public static void progress (Campaign c) {
        System.out.print ("\f");
        System.out.println ("*********************************************************");
        System.out.println ("Your campaign researchers are working hard every day to ");
        System.out.print ("discover what the people in their next ");
        if (c.getType() == 1)
            System.out.println ("mayor.");
        else if (c.getType() == 2)
            System.out.println ("governor.");
        else if (c.getType() == 3)
            System.out.println ("president.");
        else
            System.out.println ("...um the program isn't working...or you misspelled something somewhere in some place ;-; YAY BUG FIXING!!!");
        System.out.println ("\nThey have created general categories for a politicians'");
        System.out.println ("traits and their appeals to certain aspects.");
        System.out.println ("\nEach category comes with a score, with a higher ");
        System.out.println ("score signifying that you're a good fit with that");
        System.out.println ("category.");
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Approval (Generally, are you doing good work, or bad?):");
        System.out.print ("\nScore: ");
        System.out.println (c.getPlayer().getScores()[0]);
        System.out.println ("\nResearcher Notes: It's good to have high approval");
        System.out.println ("ratings.");
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Credibility (Do people think you're honest and can");
        System.out.println ("they trust you do be a good leader?):");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[1]);
        System.out.println ("\nNotes: It's good to have people trust you.");
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Patriotism (How \"American\" do you seem to voters?):");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[2]);
        System.out.println ("\nNotes: In our opinion, " + targetMessage(target(c, 2)));
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Religosity (Do you seem very religious to voters?):");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[3]);
        System.out.println ("\nNotes: In our opinion, " + targetMessage(target(c, 3)));
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Tradition (Do you seem like an average politician");
        System.out.println ("i.e. do you uphold the status quo?");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[4]);
        System.out.println ("\nNotes: In our opinion, " + targetMessage(target(c, 4)));
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Populism (On the other hand, do voters see you");
        System.out.println ("as someone who will change things if elected?):");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[5]);
        System.out.println ("\nNotes: In our opinion, " + targetMessage(target(c, 5)));
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Working-Class (Do you support workers' rights");
        System.out.println ("and unions, etc.?):");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[6]);
        System.out.println ("\nNotes: In our opinion, " + targetMessage(target(c, 6)));
        confirm();

        System.out.println ("\f*********************************************************");
        System.out.println ("Pro-Business (Do you support businesses, both");
        System.out.println ("big and small?):");
        System.out.println ("\nScore: " + c.getPlayer().getScores()[7]);
        System.out.println ("\nNotes: In our opinion, " + targetMessage(target(c, 7)));     
        System.out.println ("*********************************************************\n");

        confirm();
    }

    private static void confirm() {
        System.out.println ("\nPress enter to continue.");
        scan.nextLine();
    }

    /**
     * Returns how far away the researchers *think* you are from the goal
     * @param c Campaign object
     * @param toCompare the specific stat you want to check
     * @return -3 if you're > 25 away (low)
     *         -2 if you're between 10-25 away (low)
     *         -1 if you're less than 10 away (low)
     *         0 if you're exact 
     *         1 if you're less than 10 away (high)
     *         2 if you're 10-25 away (high)
     *         3 if you're > 25 away (high)
     */
    private static int target (Campaign c, int toCompare) {
        int realTarget = c.getLocation().getTargets()[toCompare];
        int changedTarget = realTarget + ((int) (Math.random() * (2 * c.getError() + 1) - c.getError()));
        Politician player = c.getPlayer();
        int playerScore = player.getScores()[toCompare];
        if (changedTarget - playerScore > 25)
            return -3;
        else if (changedTarget - playerScore > 10 && changedTarget - playerScore <= 25)
            return -2;
        else if (changedTarget - playerScore > 0 && changedTarget - playerScore <= 10)
            return -1;
        else if (changedTarget == playerScore)
            return 0;
        else if (changedTarget - playerScore < -25)
            return 3;
        else if (changedTarget - playerScore >= -25 && changedTarget - playerScore < -10)
            return 2;
        else
            return 1;
    }

    /**
     * Returns a message hinting at what direction the player has to go
     * in terms of changing the specified value
     * @param x -3 to 3, given from target() 
     * @return a string with varying messages on what the player should do
     */
    private static String targetMessage (int x) {
        if (x == -3) {
            String result = "you are really fairing ";
            result += "\npoorly in this category, we recommend you step";
            result += "\nit up a lot.";
            return result;
        }
        else if (x == -2) {
            String result = "you're not doing too ";
            result += "\nwell in this category, we recommend you focus";
            result += "\nin this area a bit more.";
            return result;
        }
        else if (x == -1) {
            String result = "you're doing well here";
            result += "\nif you focus a little bit more here,";
            result += "\nthen you'll reach our target.";
            return result;
        }
        else if (x == 0) {
            String result = "according to our research,";
            result += "\nyou are doing perfectly!";
            return result;
        }
        else if (x == 1) {
            String result = "you're doing well here.";
            result += "\nHowever, we conclude that you are appealing";
            result += "\nto a few too many people in this area. If ";
            result += "\nyou reduce your focus here a little bit, you";
            result += "\nwill be set.";
            return result;
        }
        else if (x == 2) {
            String result = "you're not doing too ";
            result += "\nwell in this category; you're turning away";
            result += "\na lot more people that you're bringing in.";
            result += "\nFocus on this area quite a bit less.";
            return result;
        }
        else if (x == 3) {
            String result = "you're doing really ";
            result += "\nbadly in this area. It seems you are angering";
            result += "\na lot more people than you're appealing to.";
            result += "\nDon't focus on this area for the upcoming";
            result += "\nfew weeks.";
            return result;
        }
        else
            return "I AM ERROR";
    }

    
}