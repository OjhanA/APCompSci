/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
public class TransferProject {
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAccountNum = 1000;
    private static double transferAmount = 0;
    
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    
    /**
     * This constructor method takes in a balance, owner, and account number
     * @param initBal Initial balance
     * @param owner Owner of the account
     * @param number The account number
     */
    public TransferProject(double initBal, String owner, int number)
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
    public TransferProject(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = nextAccountNum++;
    }

    /**
     * This constructor method just takes an owner
     * @param owner Owner of the account
     */
    public TransferProject(String owner)
    {
        balance = 1000;
        name = owner;
        acctNum = nextAccountNum++;
    }
    
    /**
     * This method transfers money from one account into another
     * @param acct The account that the money will be transfered into
     * @param amount The amount of money that will be transfered
     */
    public void transfer(TransferProject acct, double amount) {
        balance -= amount;
        acct.deposit(amount);
        System.out.println("Transfered $" + amount + " from " + name + "'s account to " + acct.getName() + "'s account.");
    }
    
    /**
     * This static method transfers money from one account into another
     * @param acct1 The account that the money will be transfered from
     * @param acct2 The account that the money will be transfered into
     * @param amount The amount of money that will be transfered
     */
    public static void transfer(TransferProject acct1, TransferProject acct2, double amount) {
        transferAmount = amount;
        acct1.withdraw(transferAmount);
        acct2.deposit(transferAmount);
        System.out.println("Transfered $" + amount + " from " + acct1.getName() + "'s account to " + acct2.getName() + "'s account.");
    }
    
    /**
     * This methodgets the next account number
     * @return The next account number
     */
    public static String getNextNum() {
        return "Next id number is: " + nextAccountNum;
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
        if (balance >= amount) 
            balance -= amount;
        
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