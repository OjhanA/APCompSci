/***************************************************************
 * Allows to user to order a pizza 
 * @author Ojhan Ardalan
 * September 22
 ****************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;


public class PizzaOrder
{
    public static void main (String [] args)
    {
        System.out.print ("\f");
        //Create a Scanner object to read input
        Scanner scan = new Scanner (System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        String firstName;                   //user's first name
        boolean discount = false;           //flag, true if user is eligible for discount
        int inches;                         //size of the pizza
        char crustType;                     //code for type of crust
        String crust = "Hand-tossed";       //name of crust
        double cost = 12.99;                //cost of the pizza
        final double TAX_RATE = .08;        //sales tax rate
        double tax;                         //amount of tax
        char choice;                        //user's choice
        String input;                       //user input
        String toppings = "Cheese ";        //list of toppings
        int numberOfToppings = 0;           //number of toppings

        //prompt user and get first name
        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();

        //determine if user is eligible for discount by
        //having the same first name as one of the owners

        if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike"))
        {
            discount = true;
        }

        //prompt user and get pizza size choice
        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = scan.nextInt();
        if (inches == 10)
            cost = 10.99;
        else if (inches == 12)
            cost = 12.99;
        else if (inches == 14)
            cost = 10.99;
        else if (inches == 16)
            cost = 12.99;
        else { 
            inches = 12;
            System.out.println ("You didn't choose a valid option. We will "
                + "just assume you wanted 12 inches");
        }
        //set price and size of pizza ordered using "if" statements

        //prompt user and get crust choice, store first character   of
        //input string into a primitive type "char" variable.
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
            "(D) Deep-dish (enter H, T, or D): ");
        input = scan.next();
        crustType = input.charAt(0);
        if (crustType == 'h')
            crust = "Hand-tossed";
        else if (crustType == 't')
            crust = "Thin-Crust";
        else if (crustType == 'd')
            crust = "Deep-dish";
        

        //set user's crust choice on pizza ordered
        //ADD LINES FOR TASK #2
        
        //prompt user and get topping choices one at a time
        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each,"
            +" choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        //if topping is desired,
        //add to topping list and number of toppings
        System.out.print("Do you want Pepperoni?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }
        
        System.out.print("Do you want Sausage?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }
        
        System.out.print("Do you want Onion?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";
        }
        
        System.out.print("Do you want Mushroom?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushroom ";
        }

        //prompt user for Sausage, Onion and Mushroom choices

        //add additional toppings cost to cost of pizza
        cost = cost + (1.25*numberOfToppings);

        //display order confirmation
        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        //apply discount if user is elibible
        //ADD LINES FOR TASK #3 HERE
        if (discount == true){
            System.out.println ("You are eligible for a $2.00 discount!");
            cost = cost - 2;
        }
            
            

        //EDIT PROGRAM FOR TASK #4
        //SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
        System.out.println("The cost of your order is: " + money.format(cost));

        //calculate and display tax and total cost
        tax = cost * TAX_RATE;
        System.out.println("The tax is: " + money.format(tax));
        System.out.println("The total due is: " + money.format(tax+cost));

        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}