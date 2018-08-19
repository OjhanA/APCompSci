import java.util.*;
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public User (String f, String l, String e, String p) {
        firstName = f;
        lastName = l;
        email = e;
        password = p;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public void setEmail(String e) {
        email = e;
    }

    public void setPassword(String p) {
        int length = p.length();
        int current;
        boolean lowercase = false, uppercase = false, num = false, special = false;
        
        for (int i = 0; i < length; i++) {
            current = ((int) p.charAt(i));
            
            if (current >= 97 && current <= 122)
                lowercase = true;
                
            if (current >= 65 && current <= 90)
                uppercase = true;
        
            if (current >= 48 && current <= 57)
                num = true;
            
            if (current == 33 || current == 40 || current == 94 || current == 42 || current >= 35 && current <= 38)
                special = true;
            
            }
            
        if (!lowercase || !uppercase || !num || !special)
            System.out.println ("Invalid password.");
            
        else {
            password = p;
            System.out.println ("Your password is " + password);
        }
    }

    public String getPassword() {
        return "Your password is " + password;
    }
    
    
    public String toString() {
        return (firstName + " " + lastName + "\nEmail: " + email + "\nPW: " + password);
    }
}