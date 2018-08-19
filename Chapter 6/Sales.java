/***************************************************************
 * Reads in and stores sales for each of 5 salespeople. Displays
 * sales entered by salesperson id and total sales for all salespeople.
 * @author Ojhan Ardalan
 * November 3 2016
 ****************************************************************/
import java.util.Scanner;
public class Sales{
    public static void main(String[] args){
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);
        int sum, num;
        int max = 0, min = 0;
        
        
        System.out.print ("How many salespeople are there? ");
        int[] sales = new int[scan.nextInt()];
        
        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > sales[max]) {
                max = i;
            }
            if (sales[i] < sales[min]){
                min = i;
            }
                
        }
        
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + (i + 1) + "\t\t\t" + sales[i]);
            sum += sales[i];
        }
        
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sales: " + (double) sum / sales.length);
        System.out.println("Salesperson " + (max + 1) + " had the highest sale with $" + sales[max]);
        System.out.println("Salesperson " + (min + 1) + " had the lowest sale with $" + sales[min]);
    }
}


