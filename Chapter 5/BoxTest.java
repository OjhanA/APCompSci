
/**
 * Write a description of class BoxTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxTest {
    public static void main (String[] args) {
        System.out.print ("\f");
        
        Box[] boxes = new Box[4];
        boxes[0] = new Box (3, 4, 6.6);
        boxes[1] = new Box (5);
        boxes[2] = new Box (2, 9, 4);
        boxes[3] = new Box (3);

        System.out.println (boxes[0]);
        System.out.println();
        System.out.println (boxes[1]);
        System.out.println();
        System.out.println (boxes[2]);
        System.out.println();
        System.out.println (boxes[3]);
    }
}