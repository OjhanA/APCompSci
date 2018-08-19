import java.util.*;
public class UserTest {
    public static void main (String[] args){
        System.out.print ("\f");
        
        Scanner scan = new Scanner(System.in);
        User u1 = new User();
        User u2 = new User("Nathan", "Vardas", "walrus", "123");
        
        System.out.print("Enter your first name: ");
        u1.setFirstName(scan.nextLine());
        
        System.out.print("Enter your last name: ");
        u1.setLastName(scan.nextLine());
        
        System.out.print("Enter your email name: ");
        u1.setEmail(scan.nextLine());
        
        System.out.print("Enter your password name: ");
        u1.setPassword(scan.nextLine());

        System.out.println(u1.toString());
        
    }
}
