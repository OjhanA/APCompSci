/************************************************************
 * A program that computes the distance between two points
 * @author Ojhan Ardalan
 * September 3, 2016
 ************************************************************/

import java.util.Scanner;

public class Distance {
    public static void main (String[] args) {
        System.out.print ("\f");

        double x1, y1, x2, y2; // coordinates of two points
        double distance;       // distance between the points

        Scanner scan = new Scanner(System.in);

        // Read in the two points 
        System.out.print ("Enter the coordinates of the first point " +
            "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        distance = Math.sqrt(Math.pow ((x1-x2),2) + Math.pow ((y1-y2),2)); // Compute the distance

        System.out.println ("\nThe distance between the points (" + x1 + "," + y1 + ") and ("
            + x2 + "," + y2 + ") is " + distance);  // Print out the answer   

    }
}
