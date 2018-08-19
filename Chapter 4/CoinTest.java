/***************************************************************
 * Find the length of the longest run of heads in 100 flips of the coin.
 * @author Ojhan Ardalan
 * October 4 20
 ****************************************************************/

public class CoinTest {
    public static void main (String[] args) {
        System.out.print ("\f");
        final int FLIPS = 10; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        Coin coin1 = new Coin(); // Create a coin object

        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++) {	
            coin1.flip(); // Flip the coin & print the result
            System.out.println (coin1.toString());
            if (coin1.isHeads()) // Update the run information
                currentRun++;
            else
                currentRun = 0;
            if (currentRun > maxRun)
                maxRun = currentRun;
        }

        System.out.println ("The maximum run of HEADS was " + maxRun);// Print the results

    }
}
