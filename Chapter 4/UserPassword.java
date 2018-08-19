/***************************************************************
 * Passwords
 * @author Ojhan Ardalan and Jacob Huang
 * October 10 2016
 ****************************************************************/

import java.util.Scanner;

public class UserPassword {

    public static void main(String[] args) {

        System.out.print("\f");
        Scanner scan = new Scanner(System.in);
        User u1 = new User();
        String pass;
        boolean a;

        System.out.print ("Enter your password. \nRequires 1 lowercase, 1 uppercase, 1 number " +
                          "and 1 special character (!@#$%^&*): ");                  

        u1.setPassword(scan.nextLine());

    }
}

         