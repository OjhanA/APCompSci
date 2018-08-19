/***************************************************************
 * Code that acts like a bank account
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
import java.text.NumberFormat;
public class Account
{
    NumberFormat money = NumberFormat.getCurrencyInstance();
    private double balance;
    private String name;
    private long acctNum;
    
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public String getBalance()
    {
        return (name + "'s balance: " + money.format(balance));
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return ("Account Summary for " + name + "\nAccount number: " + acctNum 
            + "\nBalance: " + money.format(balance));
    }

    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public String chargeFee()
    {
        balance = balance - 10;
        return ("Service fee charged. " + name + "'s balance " + money.format(balance));
    }
    //----------------------------------------------
    // Changes the name on the account 
    //----------------------------------------------
    public void changeName(String newName) 
    {
        name = newName;
    }

}
