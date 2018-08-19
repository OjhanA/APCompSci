import java.util.*;
public class Integers {
    public static void main (String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);
        /*
        System.out.print("How many integers to enter?: ");
        int nums = scan.nextInt();

        int[] numbers = new int [nums];
        for (int i = 0; i < nums; i++) {
        System.out.print("Integer #" + (i+1) + ": ");
        numbers[i] = scan.nextInt();
        }
        System.out.println();
        int small = numbers[0];
        int integer = 1;

        for (int i = 0; i < nums; i++){
        if (small > numbers[i]) {
        small = numbers[i];
        integer = i + 1;
        }
        }

        System.out.println("The smallest number you entered was in integer #" + integer 
        + " which had a value of " + small);

        if ( hasNegative(numbers)) 
        System.out.println("There is a negative");
        else
        System.out.println("There is not a negative");

        System.out.println("\nGoodbye!");

        int[] test = {1, 2, 3};
        printArray(makeEnds(test));
        */
       
       
    }

    public static void printArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print("[" + n[i] + "]");
        }        
        System.out.println();
    }

    public static void reverseArray(int[] n) {
        int t = n[0];
        for (int i =0; i < n.length; i++) {
            t = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = t;
        }
    }

    public static boolean hasNegative(int[] n) {
        for (int x : n) {
            if (x < 0)
                return true;
        }
        return false;
    }

    public static int[] makeEnds(int[] n) {
        int[] temp = new int[2];
        temp[0] = n[0];
        temp[1] = n[n.length - 1];
        return temp;
    }
}
