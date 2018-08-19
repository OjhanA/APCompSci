
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student {
    private String name;
    private int id;
    private double test1, test2, test3;
    private
    static int numCounter = 1000;

    public Student (String n, double t1, double t2, double t3) {
        name = n;
        test1 = t1;
        test2 = t2;
        test3 = t3;
        id = numCounter++;
    }

    public int getId() {
        return id;
    }

    public String  getName() {
        return name;
    }

    public double getAverage() {
        return (test1 + test2 + test3)/3;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + "\nTest 1: " + test1 + "\nTest 2: " + test2 + "\nTest 3: " + test3 + "\nAverage: " + getAverage();
    }
}