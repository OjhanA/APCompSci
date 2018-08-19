/***********************************************************************
 * Program to deminstrate the difference betweenadding and concatenating
 * @author Ojhan Ardalan
 * August 23, 2016
 ***********************************************************************/

public class PlusTest
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
        System.out.println ("This is a long string that is the " +
            "concatenation of two shorter strings.");

        System.out.println ("The first computer was invented about " + 55 +
            " years ago.");
        // There should be a space between about and ", and with " and year

        System.out.println ("8 plus 5 is " + 8 + 5);
        /* Printed "8 plust 5 is 85"
         * B. If at least one operand is a string the other operand is converted to a
         * string and + is the concatenation operator.
         * The string text converts the 8 into string, and then the 8 converts 
         * the 5 into string
         */
        System.out.println ("8 plus 5 is " + (8 + 5));
        /* Printed "8 plust 5 is 13"
         * C:If an expression contains more than one operation expressions inside 
         * parentheses are evaluated first. If there are no parentheses the 
         * expression is evaluated left to right.
         * The opperands are in parentheses so they are not converted and
         * just add with eachother
         */
        System.out.println (8 + 5 + " equals 8 plus 5.");
        /* Printed "13 equals 8 plus 5"
         * A. If both operands are numbers + is treated as ordinary addition. 
         * (NOTE: in the expression a + b the a and b are called the operands.)
         * The operands are read from left to right, so the first to operands
         * are numbers and is used for addition
         */
    }
}

