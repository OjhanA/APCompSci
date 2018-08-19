/***************************************************************
 * 
 * @author Ojhan Ardalan & Jacob Huang
 * September 15
 ****************************************************************/
import java.util.*;
public class Test2 {
    public static void main (String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);
        String yesNo;
        int userVal;
        int even = 0;
        int odd = 0;

        System.out.println ("***** Odd or Even ******");
        System.out.print ("\nDo you want to enter an integer? y/n: ");
        yesNo = scan.next();

        while (yesNo.equalsIgnoreCase ("y")) {
            
            System.out.print ("Enter integer: ");
            userVal = scan.nextInt();
            
            if (userVal % 2 == 1) {
                odd++;
                System.out.println (userVal + " is odd.");
            }

            else {
                even++;
                System.out.println (userVal + " is even.");
            }
            
            System.out.print ("\nContinue? y/n ");
            yesNo = scan.next();
        }
        
        System.out.println ("You entered " + even + " even and " + odd + " odd numbers.");
        System.out.println ("\nGood Bye!");
    }
}