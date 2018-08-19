/***************************************************************
* Purpose: Determine how much paint is needed to paint the walls of a room given its length, width, and height
* @author Ojhan Ardalan
* September 4 2016
***************************************************************/
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        System.out.print ("\f");
        
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length, width, height, door, window; //declare integers length, width, and height;
        double totalSqFt, paintNeeded; //declare double totalSqFt, declare double paintNeeded;
        Scanner scan = new Scanner (System.in); //declare and initialize Scanner object

        System.out.print ("What is the length of the room? ");  //Prompt for and read in the length of the room
        length = scan.nextInt ();
        System.out.print ("What is the width of the room? "); //Prompt for and read in the width of the room
        width = scan.nextInt (); 
        System.out.print ("What is the height of the room? ");  //Prompt for and read in the height of the room
        height = scan.nextInt ();
        
        System.out.print ("How many doors are there? ");
        door = scan.nextInt();
        System.out.print ("How many windows are there? ");
        window = scan.nextInt();
        
        totalSqFt = ((length * height * 2) + (width * height * 2)) - (20 * door) - (15 * window);
        //Compute the total square feet to be painted--think about the dimensions of each wall                                                                                     //about the dimensions of each wall

        paintNeeded = totalSqFt / COVERAGE; //Compute the amount of paint needed
        System.out.println ("The length is: " + length + "\nThe width is: " + width + "\nThe height is: " 
                            + height + "\nThe number of doors is: " + door + "\nThe number of windows is: " 
                            + window + "\nThe gallons of paint needed is: " + paintNeeded );
                            //Print the length, width, and height of the room 
                            //and the number of gallons of paint needed.
    }
}
