/***************************************************************
 * Program that keeps track of grades for students
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
import java.util.Scanner;

public class Student
{
    private String name; 
    private double test1, test2;  //declare instance data 
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------'
    public Student(String studentName) {
        name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades() {
        System.out.print ("Enter " + name + ("'s score for test 1: ")); //add body of inputGrades
        test1 = scan.nextDouble();
        System.out.print ("Enter " + name + ("'s score for test 2: ")); //add body of inputGrades
        test2 = scan.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public String getAverage() {
        double average;//add body of getAverage
        average = ((test1 + test2) / 2);
        return ("The average is: " + average);
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String getName() {
        return name;//add body of printName
    }

    public String toString() {
        return ("Name: " + name + ", Test 1: " + test1 + ", Test 2: " + test2);

    }
}
