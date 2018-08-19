/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
import java.util.*;
public class AccountTest2 {
    public static void main(String[] args) {
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        int accounts = 0;
       

        System.out.print ("How many accounts will you be creating? ");
        accounts = scan.nextInt();

        for (int i = 1; i <= accounts; i++) {
            System.out.print("Enter the name of account # " + i + ": ");
            String name = scan.next();
            AccountProject2 acct = new AccountProject2(100, name);
            System.out.println(acct);
            System.out.println(AccountProject2.getNextNum());
            
            System.out.println();
        }

        System.out.println("End of program. Goodbye.");
    }
}