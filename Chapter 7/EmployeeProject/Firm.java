package EmployeeProject;

/**
 * Demonstrates polymorphism via inheritance
 * @author Ojhan Ardalan 
 * @version 2/28/17
 */
public class Firm
{
    //-----------------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        System.out.println("\f");
        Staff personnel = new Staff();
        personnel.payday();
    }
}