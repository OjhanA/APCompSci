/***************************************************************
 * Play a game where the user guesses a number from 1 to 10
 * @author Ojhan Ardalan
 * September 26
 ****************************************************************/

import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args) {
        System.out.print ("\f");

        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int high = 0, low = 0, total = 0;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        numToGuess = (int) (Math.random() * 9) + 1; //randomly generate the number to guess

        System.out.print ("I'm thinking of a number!! \nEnter your guess: ");//print message asking user to enter a guess
        guess = scan.nextInt(); //read in guess

        while ( guess != numToGuess )  //keep going as long as the guess is wrong
        {
            if (guess > numToGuess) {//print message saying guess is wrong
                System.out.println ("Too high, guess again: ");
                guess = scan.nextInt(); //get another guess from the user
                high++;
            }
            else {
                System.out.println ("Too low, guess again: ");
                guess = scan.nextInt();
                low++;
            }
            total++;
        }
        if (total == 1)
            System.out.println ("You got it, after only " + total + " guess!!"); //print message saying guess is right
        else
            System.out.println ("You got it, after only " + total + " guesses!!");
        if (high == 1)
            System.out.println (high + " guess was too high.");
        else
            System.out.println (high + " guesses were too high.");
        if (low == 1)
            System.out.println (low + " guess was too low.");
        else
            System.out.println (low + " guesses were too low.");
    }
}
