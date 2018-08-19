/***************************************************************
 * Tester program to shuffle and deal a deck of Card objects
 * Can also play Blackjack
 * @author Ojhan Ardalan
 * November 29 2016
 ****************************************************************/
import java.util.*;
public class DeckOfCardsTest {
    public static void main (String[] args) {
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        boolean playerStay = false, dealerStay = false;
        String answer = "null";

        // put Card objects in random order
        // -----------------------------------------------------------
        // print all 52 Cards in the order in which they are dealt
        // -----------------------------------------------------------
        /*for (int i = 0; i < 13; i++) {
        // print method used for formatting output
        // print string (%) in a space of 20 characters (-20s)
        System.out.printf("%-20s%-20s%-20s%-20s\n",
        myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
        myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
        }
         */
        while (1==1) {
            playerStay = false;
            dealerStay = false;
            DeckOfCards myDeckOfCards = new DeckOfCards();
            myDeckOfCards.shuffle();

            System.out.print("You are about to play Blackjack. Press enter to play! ");
            scan.nextLine();
            System.out.println("\nThe dealer draws two cards. One of them is a " + myDeckOfCards.dealDealerCard());
            myDeckOfCards.dealDealerCard();
            System.out.println("\nYou drew a " + myDeckOfCards.dealPlayerCard() + " and a " + myDeckOfCards.dealPlayerCard());
            System.out.println("Your total score is " +myDeckOfCards.getPlayerValue());

            while (myDeckOfCards.getPlayerValue() < 21 && myDeckOfCards.getDealerValue() < 21) {
                if (playerStay == false) {
                    System.out.println("Would you like to \"hit\" or \"stay\" ");
                    answer = scan.nextLine();

                    while (!answer.equals("hit") && !answer.equals("h") && !answer.equals("stay") && !answer.equals("s") && playerStay ==false) {
                        System.out.print ("Please input a valid option. Would you like to \"hit\" or \"stay\" ");
                        answer = scan.nextLine();     
                    }
                }
                if (myDeckOfCards.getDealerValue() < 17) {
                    System.out.println("\nThe dealer drew a card");
                    myDeckOfCards.dealDealerCard();
                }
                else {
                    System.out.println("\nThe dealer stays");
                    dealerStay = true;
                }
                
                if (playerStay == false) {
                    if (answer.equals("hit") || answer.equals("h")) {
                        System.out.println("\nYou drew a " + myDeckOfCards.dealPlayerCard());
                        System.out.println("Your total score is " + myDeckOfCards.getPlayerValue());
                    }
                    else {
                        System.out.println("\nYou stay");
                        playerStay = true;
                    }
                }

                if (dealerStay == true && playerStay == true) 
                    break;
            }

            if (myDeckOfCards.getPlayerValue() == 21)
                System.out.println("\nYou got a blackjack! You win!");
            else if (myDeckOfCards.getPlayerValue() > 21 && myDeckOfCards.getDealerValue() > 21)
                System.out.println("You bust. The dealer also busts with a score of " + myDeckOfCards.getDealerValue() + " It's a tie.");
            else if (myDeckOfCards.getPlayerValue() > 21)
                System.out.println("\nYou bust. The dealer wins with a score of " + myDeckOfCards.getDealerValue() + ".");
            else if (myDeckOfCards.getDealerValue() == 21)
                System.out.println("\nThe dealer got a blackjack. You lose.");
            else if (myDeckOfCards.getDealerValue() > 21)
                System.out.println("\nThe dealer busts with a score of " + myDeckOfCards.getDealerValue()  + ". You win!");
            else if (myDeckOfCards.getPlayerValue() > myDeckOfCards.getDealerValue())
                System.out.println("\nThe dealer has a score " + myDeckOfCards.getDealerValue()+ "\nYour score is higher. You win!");
            else if (myDeckOfCards.getPlayerValue() < myDeckOfCards.getDealerValue())
                System.out.println("\nThe dealer has a score " + myDeckOfCards.getDealerValue() + "\nYour score is lower. You lose");
            else if (myDeckOfCards.getPlayerValue() == myDeckOfCards.getDealerValue())
                System.out.println("\nThe dealer has a score " + myDeckOfCards.getDealerValue() + " It's a tie");

            System.out.print("\nWould you like to play again? (y/n) ");
            answer = scan.nextLine();
            while (!answer.equals("no") && !answer.equals("yes") && !answer.equals("n") && !answer.equals("y")) {
                System.out.println ("Please input a valid option (y/n): ");
                answer = scan.nextLine();
            }
            if (answer.equals("no") || answer.equals("n")) 
                break;
            else
                System.out.print("\f");
        }
        System.out.println("\nThanks for playing!");
    }
}