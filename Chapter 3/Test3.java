
import java.util.*;
public class Test3 {
    public static void main (String[] args) {
        int size=5;
        for(int x=0; x<=size; x++) {
            for(int y=x; y<size; y++)
            System.out.print(" ");
            for(int z=x; z>=0; z--)
                System.out.print("#");
            System.out.println();
        }

    }
}

