import java.util.Scanner;
public class ShopTest2{
    public static void main(String[] args){
        System.out.println("\f");
        String answer, item;
        int quantity= 0;
        double price = 0;

        Scanner scan = new Scanner(System.in);

        ShoppingCart2 safeway = new ShoppingCart2();
        System.out.print("Would you like to shop at Safeway?(y or n): ");
        answer = scan.nextLine();

        while(answer.equalsIgnoreCase("y")){

            System.out.print("Item: ");
            scan.useDelimiter("\n");
            item = scan.next();

            scan.useDelimiter("\n");
            System.out.print("How many?: ");
            quantity = scan.nextInt();

            System.out.print("What's the price?: ");
            price = scan.nextDouble();

            safeway.addToCart(item, price, quantity);


            System.out.print("Another item?: ");
            answer = scan.next();

        }

        System.out.print(safeway);

    }
}