/************************************************************
 * A program that simulates the rolling of a pair of dice
 * @author Ojhan Ardalan
 * September 3, 2016
 ************************************************************/
import java.util.Scanner;

public class Dice {
  public static void main (String[] args) {
      System.out.print ("\f");
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print ("Press enter to roll the dice ");
      scan.nextLine();
      
      int dice1 = (int) (Math.random() * 6) + 1;
      int dice2 = (int) (Math.random() * 6) + 1;
      int sum = dice1 + dice2;
      
      System.out.print ("The first die rolled: " + dice1 + "\nThe second die rolled: " + dice2
                        + "\nThe sum of the dice is: " + sum);
    }
}
