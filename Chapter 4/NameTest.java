/***************************************************************
 * Stores a person's first, middle, and last names
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
import java.util.*;
public class NameTest {
    public static void main(String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);
        String fml, first, middle, last;
        int sub;

        System.out.print ("Please enter the name of person #1 (first middle last): ");
        first = scan.next();
        middle = scan.next();
        last = scan.next();
        NameProject name1 = new NameProject(first, middle, last);

        System.out.print ("Please enter the name of person #2 (first middle last): ");
        first = scan.next();
        middle = scan.next();
        last = scan.next();
        NameProject name2 = new NameProject(first, middle, last);
        System.out.println();

        System.out.println (name1.firstMiddleLast());
        System.out.println (name1.lastFirstMiddle());
        System.out.println (name1.initials());
        System.out.println ("The name length is " + name1.length());
        System.out.println();

        System.out.println (name2.firstMiddleLast());
        System.out.println (name2.lastFirstMiddle());
        System.out.println (name2.initials());
        System.out.println ("The name length is " + name2.length());
        System.out.println();

        if (name1.equal(name1.firstMiddleLast(), name2.firstMiddleLast()))
            System.out.println ("Both names are the same");
        else
            System.out.println ("Both names are different");
    }
}