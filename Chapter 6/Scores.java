import java.util.*;
public class Scores {
    public static void main (String[] args) {
        int[] nums = {2, 4, 3, 5, 5};

        /**
        ArrayList<int> scores = new ArrayList<int>();
        scores.add (0,63);
        scores.add (1,99);
        scores.add (2,87);
        scores.add (3,83);
        scores.add (4,63);
        scores.add (5,89);

        }
        public static void removeMaxMin(ArrayList n) {
        int max = n.get(0), min = n.get(0);
        for (int i = 1; i < n; i++) {
        if (n.get(i) > max)
        max = n.get(i);
        if (n.get(i) < min)
        min = n.get(i);
        }
        for (int i = 0; i < n; i++) {
        }

         **/

    }

    public static boolean hasDuplicates(int[] nums) {
        boolean duplicates = false;
        for (int i = 0; i <nums.length -1; i++) {
            if (nums[i] == nums[i+1]){
                duplicates = true;
                return duplicates;
            }
        }
        return duplicates;
    }
}
