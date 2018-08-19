/***************************************************************
 * Program that acts like a bank account
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
import java.text.NumberFormat;
public class ManageAccounts
{
    public static void main(String[] args)
    {
        System.out.print ("\f");
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        Account acct1, acct2;

        //create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);

        //create account2 for Joe with $500
        acct2 = new Account (500, "Joe", 1112);

        //deposit $100 to Joe's account
        acct2.deposit(100);

        //print Joe's new balance (use getBalance())
        System.out.println (acct2.getBalance());
        System.out.println ();

        //withdraw $1000 from Joe�s account
        acct2.withdraw(1000);

        //withdraw $50 from Sally's account
        acct1.withdraw(50);

        //print Sally's new balance (use getBalance())
        System.out.println (acct1.getBalance());
        System.out.println ();

        //charge fees to both accounts
        System.out.println (acct1.chargeFee());
        System.out.println ();
        System.out.println (acct2.chargeFee());
        System.out.println ();
        
        //change the name on Joe's account to Joseph
        acct2.changeName("Joeseph");

        //print summary for both accounts
        System.out.println (acct1.toString());
        System.out.println ();
        System.out.println (acct2.toString());
    }
}
