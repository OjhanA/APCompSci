/***************************************************************
 * Divides 2 numbers
 * @author Ojhan Ardalan
 * September 26
 ****************************************************************/

import javax.swing.*;

public class DivideTwoGui {
    public static void main(String[] args) {
        String input;
        JOptionPane.showMessageDialog(null, "This program divides two numbers.");
        input = JOptionPane.showInputDialog("Enter the numerator:");
        int numerator = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter the denominator:");
        int denominator = Integer.parseInt(input);
        if (denominator != 0){
            JOptionPane.showMessageDialog(null, numerator + "/" + denominator + " = " +
                (double) numerator/denominator);
            System.exit(0);
        }
        else 
            JOptionPane.showMessageDialog(null, "Zero is not allowed in the denominator");
            
    }
}