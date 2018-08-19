import java.util.Scanner;
public class ShopTest{
  public static void main(String[] args){
      System.out.println("\f");
      String answer;
      String item;
      int quantity= 0;
      double price = 0;

      Scanner scan = new Scanner(System.in);

      int capacity = 0;
      ShoppingCart safeway = new ShoppingCart();
      System.out.print("Would you like to shop at Safeway?(y or n): ");
      answer = scan.nextLine();
      if (answer.equalsIgnoreCase("y")){
          while(capacity <= 5){
              if (answer.equalsIgnoreCase("y")){
                  System.out.print("Item: ");
                  scan.useDelimiter("\n");
                  item = scan.next();

                  scan.useDelimiter("\n");
                  System.out.print("How many?: ");
                  quantity = scan.nextInt();

                  System.out.print("What's the price?: ");
                  price = scan.nextDouble();

                  safeway.addToCart(item, price, quantity);
              }
              capacity++;

              System.out.print("Another item?: ");
              answer = scan.next();
              if(answer.equalsIgnoreCase("n")){
                  capacity = 10;
              }

          }
      }
          System.out.print(safeway);

      }
  }