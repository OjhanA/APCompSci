/****************************************************************
 * Prints the number of odd, even, and zero digets
 * @author Ojhan Ardalan
 * September 26
 ****************************************************************/
import java.util.*;
public class OddEven {
    public static void main (String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);

        int zero = 0;
        int odd = 0;
        int even = 0;
        String areIs1, areIs2, areIs3, plural1, plural2, plural3;

        System.out.print ("Please enter a positive integer: ");
        int input = scan.nextInt();

        while (input > 0) {
            int number = input % 10;

            if (number == 0)
                zero++;
            else if (number % 2 == 1)
                odd++;
            else
                even++;

            input = input / 10;
        }
        
        if (even > 1 || even == 0)
            System.out.println("There are " + even + " even digits.");
        else
            System.out.println("There is " + even + " even digit.");
           
        if (odd > 1 || odd == 0)
            System.out.println("There are " + odd + " odd digits.");
        else
            System.out.println("There is " + odd + " odd digit.");
        
        if (zero > 1 || zero == 0)
            System.out.println("There are " + zero + " zero digits.");
        else
            System.out.println("There is " + zero + " zero digit.");
    }
}
