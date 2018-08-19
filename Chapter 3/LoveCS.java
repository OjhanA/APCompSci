
/****************************************************************
 * Uses a while loop to print messages a certain number of times 
 * @author Ojhan Ardalan
 * September 22
 ****************************************************************/
import java.util.*;

public class LoveCS {
    public static void main(String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);

        int limit;
        int count = 1;
        int sum = 0;

        System.out.print ("How many times do you want the message to be printed? ");
        limit = scan.nextInt();

        while (count <= limit){
            System.out.println(count +  " I love Computer Science!!");
            sum = sum + count;
            count++;
        }
        
        
        
        System.out.println ("Printed this message " + (count - 1) + " times. "
                            + "The sum of the numbers from 0 to " + (count - 1 )
                            + " is " + sum + ".");
    }
}
