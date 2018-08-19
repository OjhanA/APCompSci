/******************************************************************************
 * Outputs the radius and circumference of a circle when the radius is inputed
 * @author Ojhan Ardalan
 * September 1, 2016
 *****************************************************************************/
import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        System.out.print ("\f");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius for circle 1: ");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);
        double area = circle1.getArea();
        double circumference = circle1.getCircumference();
        System.out.println("For Circle 1, the radius = " + r + ", the area = " + area + ", and the"
                           + " circumference = " + circumference + ".");
        
        System.out.print("Enter the radius for circle 2: ");
        r = scan.nextDouble();
        Circle circle2 = new Circle(r);
        
        area = circle2.getArea();
        circumference = circle2.getCircumference();
        System.out.println("For Circle 2, the radius = " + r + ", the area = " + area + ", and the"
                           + " circumference = " + circumference + ".");
                           
    }
}

