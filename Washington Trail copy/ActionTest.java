import java.util.ArrayList;
public class ActionTest {
    public static void main (String[] args) {
        City test = new City ("Anytown", "A random town", 10000, 40, 70, 50);
        Politician p = new Politician (Names.getFemale(), "Test Subject");
        Campaign c = new Campaign ("Campaign", "Test Campaign", p, new ArrayList<Ally>(), 3, new ArrayList<Staff>(),
                                   1000000, 5000, test, "Mayoral", 25);
        Rally r = new Rally (c);
        
        PlayAction.run(r, c);
    }
}