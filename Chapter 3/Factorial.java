/***************************************************************
 * Prints the factorial of a non negative integer
 * @author Ojhan Ardalan
 * September 26
 ****************************************************************/
import java.util.*;
public class Factorial {
    public static void main (String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);

        int val = 1;
        System.out.print ("Enter a non-negative integer: ");
        int input = scan.nextInt();

        while (input < 0) {
            System.out.print ("You entered a negative number. Try again: ");
            input = scan.nextInt();
        }

        while (input > 0) {
            val = val * input;
            input--;
        }
        System.out.println("The factorial is: " + val);
    }
}