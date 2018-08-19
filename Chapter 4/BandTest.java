/***************************************************************
 * Models a band booster
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
import java.util.*;
public class BandTest {
    public static void main(String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);

        System.out.print ("Please enter the name of the band booster: ");
        BandBooster boost1 = new BandBooster(scan.nextLine());
        System.out.print ("Please enter the name of the band booster: ");
        BandBooster boost2 = new BandBooster(scan.nextLine());
        
        System.out.println();

        System.out.print ("Enter the number of boxes sold by " + boost1.getName() + " for week 1: ");
        boost1.updateSales(scan.nextInt());
        System.out.print ("Enter the number of boxes sold by " + boost1.getName() + " for week 2: ");
        boost1.updateSales(scan.nextInt());
        System.out.print ("Enter the number of boxes sold by " + boost1.getName() + " for week 3: ");
        boost1.updateSales(scan.nextInt());
        
        System.out.println();

        System.out.print ("Enter the number of boxes sold by " + boost2.getName() + " for week 1: ");
        boost2.updateSales(scan.nextInt());
        System.out.print ("Enter the number of boxes sold by " + boost2.getName() + " for week 2: ");
        boost2.updateSales(scan.nextInt());
        System.out.print ("Enter the number of boxes sold by " + boost2.getName() + " for week 3: ");
        boost2.updateSales(scan.nextInt());
        
        System.out.println();

        System.out.println (boost1.toString());
        System.out.println (boost2.toString());	
    }
}