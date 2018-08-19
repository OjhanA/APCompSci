/***************************************************************
 * Models a band booster
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/

public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String n) {
        name = n;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int b) {
        boxesSold += b;
    }

    public String toString() {
        return (name + " sold " + boxesSold + " boxes.");
    }
}