/**
 * Runs all the subclasses of action
 * @author Jacob
 * @version 2/23
 */ 

import java.util.Scanner;

public class PlayAction {

    /**
     * Runs every set of choices in the specified action
     * @param a any of the available actions
     */
    public static int run (Action a, Campaign c) {
        Scanner scan = new Scanner (System.in);
        boolean ask = true;
        int subChoices = 0;
        int decision = 0;

        for (int i = 1; i <= a.numChoices(); i++) {
            
            while (ask) {
                System.out.print (a);
                System.out.println ("\fWhat action would you like to take?: ");
                String choice = getSummary(i, a);
                System.out.println (choice);
                subChoices += numSubChoices(choice);

                decision = scan.nextInt();
                if (decision > subChoices - numSubChoices(choice) && decision <= subChoices)
                    ask = false;

            }

            switch (decision) {
                case 1: a.result1();
                break;
                case 2: a.result2();
                break;
                case 3: a.result3();
                break;
                case 4: a.result4();
                break;
                case 5: a.result5();
                break;
                default: System.out.println ("This message should never be seen b/c the previous if statement"); 
            }
        }
        
        int result = a.finalResult();
        if (result == 1)
            c.addAction (a);
        confirm();
        return result;
    }

    /**
     * Method to return the number of subchoices within a choice
     * @param s the String returned by the Action method numChoices()
     * @return the number of subchoices in the choice
     */
    private static int numSubChoices (String s) {
        int times = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\n')
                times++;
        }

        return times;
    }
    
    /**
     * Method to get the correct String for each situation
     * @param x path # / choice # / option # for this action
     * @param a Action of choice
     * @return the formatted string with the options the user can choose
     */
    private static String getSummary (int x, Action a) {
        switch (x) {
            case 1: return a.choice1();            
            case 2: return a.choice2();            
            case 3: return a.choice3();            
            case 4: return a.choice4();            
            case 5: return a.choice5();            
            default: return "";
        }
    }
    
    /**
     * Makes the user press enter to continue
     */
    private static void confirm() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("\nPress enter to continue.");
        scan.nextLine();
    }
}