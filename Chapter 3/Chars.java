/****************************************************************
 * Prints a string of characters one character per line 
 * @author Ojhan Ardalan
 * September 22
 ****************************************************************/
import java.util.*;
public class Chars {
    public static void main (String[] args){
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);
        System.out.print ("Please enter a string of characters: ");
        String s = scan.nextLine();

        for (int value = 0; value < s.length(); value++) {
            System.out.print(s.charAt(value));
            System.out.println();
        }
    }
}

