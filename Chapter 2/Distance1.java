import java.util.Scanner;

public class Distance1{ 
    public static void main (String[] args){
        System.out.print ("\f");
        
        Scanner scan = new Scanner(System.in);
        double x1, x2, y1, y2;
        double dist;

        System.out.print ("Enter the x-value of the first point: ");
        x1 = scan.nextDouble();

        System.out.print ("\nEnter the y-value of the first point: ");
        y1 = scan.nextDouble();

        System.out.print ("\nEnter the x-value of the second point: ");
        x2 = scan.nextDouble();

        System.out.print ("\nEnter the y-value of the second point: ");
        y2 = scan.nextDouble();

        dist = Math.sqrt(Math.pow ((x1-x2),2) + Math.pow ((y1-y2),2));
        System.out.println ("\nThe distance between the points (" + x1 + "," + y1 + ") and ("
            + x2 + "," + y2 + ") is " + dist);
    }
}

        