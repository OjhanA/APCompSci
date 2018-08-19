/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
public class Account {
    private double balance;
    private String name;
    private int acctNum;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    /**
     * This constructor method takes in a balance, owner, and account number
     * @param initBal Initial balance
     * @param owner Owner of the account
     * @param number The account number
     */
    public Account(double initBal, String owner, int number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    /**
     * This constructor method takes in a balance, and an owner
     * @param initBal Initial balance
     * @param owner Owner of the account
     */
    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = (int)(Math.random() * 9000) + 1000;
    }

    /**
     * This constructor method just takes an owner
     * @param owner Owner of the account
     */
    public Account(String owner)
    {
        balance = 0;
        name = owner;
        acctNum = (int)(Math.random() * 9000) + 1000;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    /**
     * This method will withdraw money from an account
     * @param amount Amount of money that will be withdrawed
     */
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from " + name + "'s account. New balance is $" + balance);
        }
        else
            System.out.println("Insufficient funds");
    }

    /**
     * This method will withdraw money plus a fee from an account
     * @param amount Amount of money that will be withdrawed
     * @param fee The fee charged for withdrawing money
     */
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount + fee) {
            balance -= amount + fee;
            System.out.println("Withdraw $" + amount + " plus $" + fee + " fee from " + name + "'s account. New balance is $" + balance);
        }
        else
            System.out.println("Insufficient funds");
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    /**
     * This method will deposit money into an account
     * @param amount Amount of money that will be deposited
     */
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposted $" + amount);
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    /**
     * This method gets the balance of an account
     * @return The amount of money in an account
     */
    public double getBalance()
    {
        return balance;
    }
    //----------------------------------------------
    // Returns account name.
    //----------------------------------------------
    /**
     * This method gets the name of owner of the account
     * @return The account holder's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * This method will return the info of the account
     * @return The name, account number, and balance
     */
    public String toString() {
        return name + "'s account number is " + acctNum + ". Balance is $" + balance + ".";

    }
}