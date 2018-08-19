/***************************************************************
 * Reads an integer and prints out that many powers of 2
 * @author Ojhan Ardalan
 * September 26
 ****************************************************************/
import java.util.Scanner;

public class PowersOf2 {
    public static void main(String[] args) {
        System.out.print ("\f");
        
        long numPowersOf2;        //How many powers of 2 to compute
        long nextPowerOf2 = 1;    //Current power of 2
        long exponent = 0;            //Exponent for current power of 2 -- this
                                 //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);

        System.out.print("How many powers of 2 would you like printed? ");
        numPowersOf2 = scan.nextLong();

        //print a message saying how many powers of 2 will be printed
        //initialize exponent -- the first thing printed is 2 to the what?
        System.out.println ("Here are the first " + numPowersOf2 + " powers of 2: ");

        while (exponent < numPowersOf2 )
        {
            System.out.println ("2^" + exponent + " = " + nextPowerOf2); //print out current power of 2

            nextPowerOf2 *= 2;//find next power of 2 -- how do you get this from the last one?

            exponent++; //increment exponent

        }
    }
}
