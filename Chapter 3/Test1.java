/************************************************
 * Calculates student grades
 * Ojhan Ardalaj ands Jacob Huang
 * 9/13/16
 ***********************************************/

import java.util.*;

public class Test1 {
    public static void main (String [] args) {
        
        System.out.print ("\f");
        
        int total = 0, numGrades = 0, testScore = 0;
        double average = 0.0;
        boolean done = false;
        
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the grade of the first student. Enter -1 to Quit. ");
        testScore = scan.nextInt();
        
        while (testScore != -1) {
            System.out.print ("Enter the grade of the next student. Enter -1 to Quit. ");
            
            total += testScore;
            numGrades++;
            testScore = scan.nextInt();
        }
        
        if (numGrades != 0) {
            average = (double) total/numGrades;
            System.out.println ("You have entered " + numGrades + " tests for an average of "
                                + average + ".");
        }
        
        else
            System.out.println ("You entered no grades.");   
        
    }
}
            