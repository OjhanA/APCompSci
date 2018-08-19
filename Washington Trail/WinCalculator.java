/**
 * Uses City/State/etc. demographic info and candidates' scores to determine a winner; minor RNG involved
 * @author Jacob Huang
 * @version 2/18/17 late night edition
 */

import java.util.Scanner;

public class WinCalculator {

    /**
     * Method, given the election location and 2 politicians, that determines a winner based on popular vote, 
     * which is additionally calculated by a random voter turnout, which is different from population, and
     * hopefully is fairly realistic
     * @param place location of election
     * @param pol1 1st politician
     * @param pol2 2nd politician
     * @param c player campaign
     * @return 1 if player wins
     *         -1 if player loses
     *         + number = # electoral votes for player/pol1
     *         |- number | = # electoral votes for opponent/pol2
     */
    public static int getWinner (City place, Politician pol1, Politician pol2, Campaign c) {
        int[] targets = place.getTargets();
        int[] p1 = pol1.getScores();
        int[] p2 = pol2.getScores();

        double urbanEffect = -4 + (100 - place.getUrban()) / 12.5;
        double ethnicEffect = -4 + (100 - place.getEthnic()) / 12.5;
        double economicEffect = -4 + place.getEconomic() / 12.5;
        double changeEffect = -4 + place.getChange() / 12.5;
        double totalEffect = urbanEffect + ethnicEffect + economicEffect + changeEffect;
        long numVoters = (long) ((Math.random() * 11 + 60 + totalEffect) / 100 * 0.7 * place.getPopulation());

        double[] weights = new double[8];
        weights[0] = 20 - (0.4 * (0.2 * place.getChange()));
        weights[1] = 10 - (0.2 * (0.2 * place.getChange()));  //this is the place for candidate's demographics to hurt
        weights[2] = 7.5 + (urbanEffect + ethnicEffect) / 2;
        weights[3] = 12.5 + (3 * ethnicEffect + urbanEffect) / 4;
        weights[4] = 10 - changeEffect;
        weights[5] = 10 + changeEffect + (Math.random() * 2 - 1);
        weights[6] = 15 - (3 * economicEffect + ethnicEffect + 2 * urbanEffect) / 6;
        weights[7] = 15 + (2 * economicEffect +- urbanEffect) / 3;

        double totalWeight = 0; //which isn't 100% because I'm am idiot (shrug)
        for (double d : weights)
            totalWeight += d;

        double weightP1 = 0;
        double weightP2 = 0;

        for (int i = 0; i < 2; i++) {
            int error1 = Math.abs(p1[i] - targets[i]);
            int error2 = Math.abs(p2[i] = targets[i]);
            double totalError = error1 + error2;

            weightP1 += (error2 / totalError) + weights[i];
            weightP2 += (error1 / totalError) + weights[i];
        }

        for (int i = 2; i < 8; i++) {
            int error1 = Math.abs(p1[i] - targets[i]);
            int error2 = Math.abs(p2[i] - targets[i]);

            if (error1 != error2) {
                if (error1 < error2)
                    weightP1 += 0.4 * weights[i];
                else if (error1 > error2)
                    weightP2 += 0.4 * weights[i];

                double totalError = error1 + error2;
                weightP1 += (error2 / totalError) * 0.6 * weights[i];
                weightP2 += (error1 / totalError) * 0.6 * weights[i];
            }

            else {
                weightP1 += 0.5 * weights[i];
                weightP2 += 0.5 * weights[i];
            }
        }

        long votes1 = (long) ((weightP1 / totalWeight) * numVoters);
        long votes2 = (long) ((weightP2 / totalWeight) * numVoters);
        if (votes1 == votes2)
            votes1++;

        Politician winner;
        if (votes1 > votes2)
            winner = pol1;
        else
            winner = pol2;

        /*
        System.out.print ("Weights: ");
        for (double d : weights)
        System.out.print (d + " ");
        System.out.println ("\nTotal Weight: " + totalWeight + "\n");
        System.out.print ("Targets: ");
        for (int i : targets)
        System.out.print (i + " ");
        System.out.println ("\n");
         */
        if (c.getType() < 3) {
            System.out.println ("\fHere are the final results:");
            confirm();
            System.out.println ("\f" + pol1.getName() + ", at the end of the polling in " + place.getName() + ",");
            System.out.println ("has received " + votes1 + " votes!");
            confirm();
            System.out.println ("\f" + pol2.getName() + ", on the other hand, has received");
            System.out.println (votes2 + " votes!\n");
        }

        System.out.print (winner.getName() + " is the winner");
        if (c.getType() == 3)
            System.out.print (" and receives " + ((State) place).getElectoral() + " electoral votes");
        System.out.println ("!\n");
        if (pol1 == winner)
            System.out.println ("Congratulations!");
        else 
            System.out.println ("Better luck next time.");

        confirm();
            
        if (c.getType() == 3)
            if (pol1 == winner) 
                return ((State) place).getElectoral();
            else
                return -((State) place).getElectoral();
        else {
            if (pol1 == winner)
                return 1;
            else 
                return -1;
        }
    }

    private static void confirm() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("\nPress enter to continue.");
        scan.nextLine();
    }
}