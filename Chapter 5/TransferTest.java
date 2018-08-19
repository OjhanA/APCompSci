/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
import java.util.*;
public class TransferTest {
    public static void main(String[] args) {
        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        int answer;
        boolean quit = false;
        
        TransferProject acct1 = new TransferProject("John");
        TransferProject acct2 = new TransferProject("Sally");
        
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println();
        while (quit == false) {
            System.out.print("1 - Transfer from John to Sally's account. \n2 - Transfer from Sally to John's account. "
                                + "\n3 - Test static transfer \n4 - Quit  \nEnter the number to choose an option from above: ");
            answer = scan.nextInt();
            System.out.println();
            if (answer == 1) {
                System.out.print("Enter the amount that will be transfered: ");
                acct1.transfer(acct2, scan.nextDouble());
                System.out.println();
            }
            if (answer == 2) {
                System.out.print("Enter the amount that will be transfered: ");
                acct2.transfer(acct1, scan.nextDouble());
                System.out.println();
            }
            if (answer == 3) {
                System.out.println("****** Testing static transfer method from John to Sally ****** ");
                System.out.print("Enter the amount that will be transfered: ");
                TransferProject.transfer(acct1, acct2, scan.nextDouble());
                System.out.println();
                
            }
            if (answer == 4) {
                quit = true;
                System.out.println();
            }
            
            
        }
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println();
        
        System.out.println("End of program. Goodbye.");
    }
}