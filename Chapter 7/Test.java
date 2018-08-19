
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Test {

    public static void main(String[] args) {
        System.out.print("\f");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(5);

        System.out.println(numCount(list, 3));

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hello");
        list2.add("how");
        list2.add("hello");
        list2.add("goodbye");


    }

    public static int numCount (ArrayList<Integer> rayList, int num) {
        int amount = 0;
        for (int i = 0; i < rayList.size(); i++) {
            if (rayList.get(i) == num)
                amount++;
        }
        return amount;
    }

    public void removeString(ArrayList<String> rayList, String firstLetter) {
        for (int i = 0; i < rayList.size(); i++) {
            if (rayList.get(i).substring(0,1).equalsIgnoreCase(firstLetter))
                rayList.remove(i);
        }
    }

    public static int numInArray(String[] a, String s) {
        int amount = 0;
        for (int i = 0; i <a.length; i++){
            if (a[i].equals(s))	
                amount++;
        }
        return amount;
    }

    public double arrayAverage(int[] a, int elements) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        total = total/ elements;
        return total;
    }
}

        