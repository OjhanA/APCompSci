/****************************************************
 * Finds the number of digits in a positive integer.
 * @author 
 * @version 3/20/17
 ****************************************************/
import java.util.Scanner;  
public class DigitPlay {  
    public static void main (String[] args) { 
        System.out.print("\f");
        int num;    //a number  
        Scanner scan = new Scanner(System.in);    
        System.out.print("Please enter a positive integer: ");
        num = scan.nextInt (); 
        if (num <= 0)     
            System.out.println ( num + " isn't positive -- start over!!"); 
        else       {   // Call numDigits to find the number of digits in the number  
            // Print the number returned from numDigits   
            System.out.println ("\nThe number " + num + " contains " + numDigits(num) + " digits and has a sum of " + sumDigits(num));  
            System.out.println ();    
        }  
        // add loop to prompt user for identification numbers to check. 
        // use the following id num’s as test data: 
        // 3429072 --- error  
        // 1800237 --- ok  
        // 88231256 --- ok  
        // 3180012 --- error
        System.out.print("Enter an identification number to check: ");
        num = scan.nextInt();
        while (num != -1) {
          if (sumDigits(num)%7 == 0)
                System.out.println("ok!");
            else
                System.out.println("error");
            System.out.print("Enter an identification number to check (type -1 to exit): ");
            num = scan.nextInt();
        }
        System.out.println("Goodbye");

    }  
    // -----------------------------------------------------------   
    //  Recursively counts the digits in a positive integer    
    // -----------------------------------------------------------   
    public static int numDigits(int num) { 
        if (num < 10)    
            return (1);
        else     
            return (1 + numDigits(num/10));   
    } 

    public static int sumDigits(int num) {
        if (num < 10)
            return num%10;
        else
            return (num%10 + sumDigits(num/10));
    }
}