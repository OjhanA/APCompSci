/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
public class AccountTest {
    public static void main(String[] args) {
        System.out.print("\f");
        
        Account acct1 = new Account(1000, "John", 1234);
        Account acct2 = new Account("Sally");
        Account acct3 = new Account(5500, "Tommy");
        
        acct1.deposit(100);
        acct1.withdraw(500);
        System.out.println(acct1);
        System.out.println(); 
        
        acct2.deposit(5000);
        acct2.withdraw(150,2.50);
        acct2.withdraw(5000);
        System.out.println(acct2);
        System.out.println(); 
        
        acct3.withdraw(5500);
        System.out.println(acct3);
    }
}