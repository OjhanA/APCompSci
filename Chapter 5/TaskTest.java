/*******************************************************
 * A Bank account class.
 * @author Ojhan Ardalan
 * January 12 2017
 *******************************************************/
public class TaskTest {
    public static void main(String[] args) {
        System.out.print("\f");

        Task t1 = new Task("Eat");
        Task t2 = new Task("Sleep");
        Task t3 = new Task("Finish APCS programs");
        Task t4 = new Task("Exercise");
        Task t5 = new Task("Watch TV");

        t1.setPriority(3);
        t2.setPriority(Priority.MIN_PRIORITY);
        t3.setPriority(7);
        t4.setPriority(Priority.MED_PRIORITY);
        t5.setPriority(Priority.MAX_PRIORITY);

        System.out.println(t1);
        System.out.println();
        System.out.println(t2);
        System.out.println();
        System.out.println(t3);
        System.out.println();
        System.out.println(t4);
        System.out.println();
        System.out.println(t5);
        System.out.println();
        
        
        comparePriorities(t1, t2);
        comparePriorities(t1, t3);
        comparePriorities(t1, t4);
    }

    public static void comparePriorities(Task t1, Task t2) {
        if (t1.compareTo(t2) > 0)
            System.out.println(t1.getName() + " has a higher priority than " + t2.getName());
        if (t1.compareTo(t2) == 0)
            System.out.println(t1.getName() + " has an equal priority to " + t2.getName());
        if (t1.compareTo(t2) < 0)
            System.out.println(t1.getName() + " has a lower priority than " + t2.getName());

    }
}
        