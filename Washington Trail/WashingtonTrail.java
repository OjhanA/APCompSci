/**
 * Main method/Game
 * @author Jacob + Ojhan
 * @version 2/21/17
 */

import java.util.Scanner;
import java.util.ArrayList;

public class WashingtonTrail {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        IPod music = new IPod();
        music.addSong ("Anthem.mp3");
        music.addSong ("Jumper.mp3");
        music.addSong ("WiiMenu.mp3");
        music.addSong ("GustyGarden.mp3");
        music.addSong ("BeedleTheme.mp3");
        music.addSong ("ZeldaSS.mp3");
        music.addSong ("CrimsonLoftwing.mp3");
        music.addSong ("Enguarde.mp3");
        music.addSong ("AngryAztec.mp3");
        music.addSong ("AstralObservatory.mp3");
        int currentSong = 0;
        music.playSong(currentSong);

        Menus.title();
        Menus.about();
        music.stopSong (currentSong);
        currentSong = 1;
        music.playSong (currentSong);

        System.out.println ("\fFirst, what's your name?");
        String name = scan.nextLine();
        System.out.println ("\nNow, is there anything else you want to say before getting started?");
        String words = scan.nextLine();

        if (words.equals ("SpeedFrog"))
            System.out.println ("Welcome Mr. (or Mrs. idk ¯\\_(ツ)_/¯) President");

        Politician player = new Politician (name, words);

        //Tutorial Begins

        City firstPlace = new City ("Anytown", "A small town in the US, perfect place for a beginning " +
                "politician", random(1000, 20000), random(100), random(100),
                random(100));

        System.out.println ("\fTo begin, you have decided to campaign in Anytown, USA: a " +
            "small town in the US perfect for a novice politician.\n");
        System.out.println ("But first, you need people to help you out. Here are 3 locals who are " +
            "willing to help you out for cheap:");

        Staff staff1 = new Staff (Names.getMale() + " " + Names.getLast(), "Press Secretary", 40, 0, 4, 1);
        Staff staff2 = new Staff (Names.getFemale() + " " + Names.getLast(), "Primary Researcher", 40, 3, 0, 1);
        Staff staff3 = new Staff (Names.getFemale() + " " + Names.getLast(), "Fundraising Director", 40, 0, 0, 1.5);

        System.out.println ("\n\t\t" + staff1.getName());
        System.out.println ("\t\t" + staff2.getName());
        System.out.println ("\t\t" + staff3.getName());
        confirm();

        System.out.println ("\fSpeaking of money, you have also decided to start with an initial budget of $1000 a day.");
        System.out.println ("Your daily budget is used to pay for campaign events and campaign staff members.");
        System.out.println ("\nFinally, every good campaign has a catchy slogan. What will yours be?");
        String slogan = scan.nextLine();

        Campaign camp = new Campaign (name + "'s Campaign", slogan, player, new ArrayList<Ally>(), 3, 
                new ArrayList<Staff>(), 1000, 0, firstPlace, "Mayoral", 25);

        camp.addStaff(staff1);
        camp.addStaff(staff2);
        camp.addStaff(staff3);

        String nameOpp = Names.getFemale();
        if (Math.random() < 0.5)
            nameOpp = Names.getMale();
        nameOpp += " " + Names.getLast();

        Politician opponent = new Politician (nameOpp, "Anytown mayoral candidate", 0, 0, 0, 0, 0, 0, 0, 0);

        System.out.println ("\fGreat! Your campaign is all set up. Looks like you'll be running against\n" + opponent.getName() +
            ", who is also a new politician. Looks like this first campaign will be a piece of cake.");

        System.out.println ("\nLet's get started!");

        //Tutorial Ends

        //Big giant continuous loop begins! :D

        while (camp.getType() != 0 && camp.getType() <= 3) {

            //Menu Loops Begins
            int daysLeft = 20;
            if (camp.getType() == 2)
                daysLeft = 120; 
            else if (camp.getType() == 3)
                daysLeft = 700;

            int currentDay = daysLeft + 1;
            ArrayList<Staff> potentialStaff = new ArrayList<Staff>();
            ArrayList<Ally> potentialAlly = new ArrayList<Ally>();
            int menuType = 1;

            /* Music changes every 5 days
             * 
             * Menus: 
             * 1 = main
             * 
             * 2 = action
             * 3 = progress
             * 4 = choose person type
             * 5 = expenses
             * 
             * 6 = Manage staff
             * 7 = View staff
             * 8 = Add staff
             * 9 = remove staff
             * 
             * 10 = Manage Allies
             * 11 = View Allies
             * 12 = Add Allies
             * 13 = Remove Allies
             * 
             * 14 = Overview
             * 
             * For Actions, the user will choose one from the menu, then it wlil run immediately 
             * Then, it will be put into the Actions array in Campaign, then removed once duration = 0
             * 
             * NOTES:
             * At beginning of new type of campaign, change ally limit and campaign experience
             */

            while (daysLeft > 0) {
                if (currentDay != daysLeft) {
                    potentialStaff = createRandomStaff (camp.getAllyLimit());
                    potentialAlly = createRandomAlly (camp.getAllyLimit());

                    if (daysLeft % 2 == 0) {
                        music.stopSong(currentSong);
                        currentSong = random (1, music.getLength() - 1);
                        music.playSong (currentSong);
                    }

                    if (daysLeft == 1) {
                        music.stopSong(currentSong);
                        currentSong = 0;
                        music.playSong (currentSong);
                    }

                    currentDay = daysLeft;
                }

                if (menuType == 1) {
                    Menus.mainMenu(daysLeft);
                    int menuTemp = scan.nextInt();
                    if (menuTemp == 1)
                        menuType = 2;
                    else if (menuTemp == 2)
                        menuType = 3;
                    else if (menuTemp == 3)
                        menuType = 4;
                    else if (menuTemp == 4)
                        menuType = 5;
                    else if (menuTemp == 5)
                        menuType = 14;
                    else if (menuTemp == 6) {
                        for (int i = 0; i < camp.getActions().size(); i++) {
                            camp.getActions().get(i).changeDuration();  
                            if (camp.getActions().get(i).getDuration() <= 0)
                                camp.removeAction(i);
                        }
                        daysLeft--;
                    }
                }

                else if (menuType == 2) {
                    Menus.actionsList(camp);
                    int menuTemp = scan.nextInt();
                    if (menuTemp > camp.getExperience() + 1)
                        menuTemp = -1;
                    if (menuTemp == camp.getExperience() + 1)
                        menuType = 1;

                    else if (menuTemp == 1) {
                        if (usable("Rally", camp)) {
                            int temp = PlayAction.run(new Rally (camp), camp);
                            if (temp == 1) {
                                menuType = 1;
                                daysLeft--;
                            }
                        }
                        else {
                            System.out.println ("You already have a rally planned.");
                            confirm();
                        }

                    }

                    else if (menuTemp == 2) {
                        if (usable("Advertisement", camp)) {
                            int temp = PlayAction.run(new Advertisement (camp), camp);
                            if (temp == 1) {
                                menuType = 1;
                                daysLeft--;
                            }
                        }
                        else {
                            System.out.println ("You already have an advertisement playing.");
                            confirm();
                        }

                    }

                }

                else if (menuType == 3) {
                    Menus.progress(camp);
                    menuType = 1;
                }

                else if (menuType == 4) {
                    Menus.peopleMenu();
                    int menuTemp = scan.nextInt();
                    if (menuTemp == 1)
                        menuType = 6;
                    else if (menuTemp == 2)
                        menuType = 10;
                    else if (menuTemp == 3)
                        menuType = 1;
                }

                else if (menuType == 5) {
                    Menus.expenses(camp);
                    menuType = 1;
                }

                else if (menuType == 6) {
                    Menus.staffMenu();
                    int menuTemp = scan.nextInt();
                    if (menuTemp == 1)
                        menuType = 7;
                    else if (menuTemp == 2)
                        menuType = 8;
                    else if (menuTemp == 3)
                        menuType = 9;
                    else if (menuTemp == 4)
                        menuType = 4;
                }

                else if (menuType == 7) {
                    Menus.viewStaff(camp);
                    menuType = 6;
                }

                else if (menuType == 8) {
                    Menus.addStaff(camp, potentialStaff);
                    int temp = scan.nextInt();
                    int initMoney = camp.getMoney();
                    if (temp > 0 && temp <= potentialStaff.size()) {
                        camp.addStaff (potentialStaff.get(temp - 1));
                        int finalMoney = camp.getMoney();
                        if (initMoney != finalMoney) {
                            daysLeft--;
                            menuType = 1;
                        }
                        else {
                            confirm();
                            menuType = 6;
                        }
                    }
                    else if (temp == potentialStaff.size() + 1)
                        menuType = 6;                
                }

                else if (menuType == 9) {
                    Menus.removeStaff(camp);
                    int temp = scan.nextInt();
                    if (temp > 0 && temp <= camp.getStaff().size()) {
                        camp.removeStaff (temp - 1);
                        menuType = 6;
                    }
                    if (temp == camp.getStaff().size() + 1)
                        menuType = 6;
                }

                else if (menuType == 10) {
                    Menus.allyMenu(camp);
                    int temp = scan.nextInt();
                    if (temp == 1)
                        menuType = 11;
                    if (temp == 2)
                        if (camp.getAllies().size() == camp.getAllyLimit()) {
                            System.out.println ("\nYou already have the maximum number of allies!");
                            menuType = 4;
                            confirm();
                        }
                        else
                            menuType = 12;
                    if (temp == 3)
                        menuType = 13;
                    if (temp == 4)
                        menuType = 4;
                }

                else if (menuType == 11) {
                    Menus.viewAllies(camp);
                    menuType = 10;
                }

                else if (menuType == 12) {
                    Menus.addAllies(camp, potentialAlly);
                    int temp = scan.nextInt();
                    if (temp > 0 && temp <= potentialAlly.size()) {
                        camp.addAlly (potentialAlly.get(temp - 1));
                        daysLeft--;
                        menuType = 1;
                    }
                    else if (temp == potentialAlly.size() + 1)
                        menuType = 10;
                }

                else if (menuType == 13) {
                    Menus.removeAllies(camp);
                    int temp = scan.nextInt();
                    if (temp > 0 && temp <= camp.getAllies().size()) {
                        camp.removeAlly (temp - 1);
                        menuType = 10;
                    }
                    else if (temp == camp.getAllies().size() + 1)
                        menuType = 10;
                }

                else if (menuType == 14) {
                    Menus.overview(camp);
                    menuType = 1;
                }
            }

            System.out.println ("\fIt's now the BIG day: Election Day!");
            System.out.println ("It's time to see if all your hard work paid off.");
            confirm();
            int playerE = 0;
            int opponentE = 0;
            Politician winner = player;
            FiftyStates all = new FiftyStates();

            if (camp.getType() < 3) {
                int result = WinCalculator.getWinner (camp.getLocation(), player, opponent, camp);
                if (result == -1) {
                    System.out.println ("Thanks for playing our game! Hope you had fun!");
                    System.exit(0);
                }
            }

            else if (camp.getType() == 3) {
                for (int i = 0; i < 51; i++) {
                    int temp = WinCalculator.getWinner (all.getState(i), player, opponent, camp);
                    if (temp > 0)
                        playerE += temp;
                    else
                        opponentE -= temp;
                }

                if (playerE == opponentE) {
                    playerE += 1;
                    opponentE -= 1;
                }
                if (playerE < opponentE) 
                    winner = opponent;

                System.out.print ("That means...");
                if (winner == player) {
                    System.out.println ("with " + playerE + " electoral votes, " + player.getName());
                    System.out.println ("is the winner! Congratulations!");
                }
                else { 
                    System.out.println ("with " + opponentE + " electoral votes, " + opponent.getName());
                    System.out.println ("is the winner! Better luck next time.");
                    System.out.println ("Thanks for playing our game a ton, hope you had fun!");
                    System.exit(0);
                }
            }

            if (camp.getType() == 3) {
                System.out.println ("WAOW you beat our game!!! You deserve a prize!");
                System.out.println ("...ok here's a cheat: type in \"SpeedFrog\" in the");
                System.out.println ("beginning of the game when it asks you if you have ");
                System.out.println ("anything to say for a surprise!");
                System.out.println ("\nPress enter to finish.");
                scan.nextLine();
                break;
            }

            else {
                System.out.println ("It's not over yet! What would you like to run for now?:");
                System.out.println ("1) Mayor");
                System.out.println ("2) Governor (of a random state)");
                System.out.println ("3) President of the United States\n");
                int choice = scan.nextInt();
                if (choice == 1) {
                    camp.changeType ("Mayoral");
                    camp.changeAllyLimit (2);
                    camp.changeExperience(1);
                    camp.changeLocation (new City ("Anytown", "A small town in the US", random(1000, 20000), random(100), 
                            random(100), random(100)));
                    camp.changeBudget (2 * camp.getBudget());
                    for (int i = 0; i < camp.getActions().size(); i++) {
                        camp.getActions().remove(i);
                        i--;
                    }

                    String nombre = "";
                    if (Math.random() > 0.5)
                        nombre += Names.getMale();
                    else
                        nombre += Names.getFemale();
                    nombre += Names.getLast();

                    opponent = new Politician (nombre, "Anytown mayoral candidate", random(100), random(100), 
                        random(100), random(100), random(100), random(100), random(100), random(100));
                }
                else if (choice == 2) {
                    camp.changeType ("Gubernatorial");
                    camp.changeAllyLimit (5);
                    camp.changeExperience(2);
                    camp.changeLocation (all.getRandomState());
                    camp.changeBudget (4 * camp.getBudget());

                    for (int i = 0; i < camp.getActions().size(); i++) {
                        camp.getActions().remove(i);
                        i--;
                    }

                    String nombre = "";
                    if (Math.random() > 0.5)
                        nombre += Names.getMale();
                    else
                        nombre += Names.getFemale();
                    nombre += Names.getLast();

                    int[] stats = {0, 0, 0, 0, 0, 0, 0, 0};
                    for (int i = 0; i < 8; i++) {
                        int[] targets = camp.getLocation().getTargets();
                        switch (i) {
                            case 0: stats[0] = targets[0] + random(-10, 10);
                            break;
                            case 1: stats[1] = targets[1] + random(-10, 10);
                            break;
                            case 2: stats[2] = targets[2] + random(-10, 10);
                            break;
                            case 3: stats[3] = targets[3] + random(-10, 10);
                            break;
                            case 4: stats[4] = targets[4] + random(-10, 10);
                            break;
                            case 5: stats[5] = targets[5] + random(-10, 10);
                            break;
                            case 6: stats[6] = targets[6] + random(-10, 10);
                            break;
                            case 7: stats[7] = targets[7] + random(-10, 10);
                            break;
                        }
                    }

                    for (int i = 0; i < 8; i++) {
                        if (stats[i] < 0) 
                            stats[i] = 0;
                        else if (stats[i] > 100)
                            stats[i] = 100;
                    }

                    opponent = new Politician (nombre, "Candidate for governor of " + camp.getLocation().getName(),
                        stats[0], stats[1], stats[2], stats[3], stats[4], stats[5], stats[6], 
                        stats[7]);

                    System.out.println ("\fLooks like you decided to run in " + camp.getLocation().getName() + ".");
                    System.out.println ("Better get to work!");
                    System.out.println ("Your opponent is " + opponent.getName() + ".");
                    confirm();
                }
                else {
                    camp.changeType ("Presidential");
                    camp.changeAllyLimit (7);
                    camp.changeExperience(10);
                    camp.changeLocation (new State ("United States of America", "The best country in the world", 
                            318000000, 50, 50, 50, 538));
                    camp.changeBudget (10 * camp.getBudget());

                    for (int i = 0; i < camp.getActions().size(); i++) {
                        camp.getActions().remove(i);
                        i--;
                    }

                    String nombre = "";
                    if (Math.random() > 0.5)
                        nombre += Names.getMale();
                    else
                        nombre += Names.getFemale();
                    nombre += Names.getLast();
                    opponent = new Politician (nombre, "Presidential Candidate", random(100), random(100), 
                        random(100), random(100), random(100), random(100), random(100), random(100));

                    System.out.println ("Your opponent is " + opponent.getName() + ".");
                    confirm();
                    System.out.println ("\fProgrammer Note: Do to time constraints, you will NOT be able to receive");
                    System.out.println ("any hints for the direction your stats need to go in...sorry.");
                    System.out.println ("That means that hiring researchers will be completely useless...");
                    System.out.println ("And this version of the game is really dumb/difficult...sorry again");
                    System.out.println ("If I haven't mentioned it enough, I'm truly sorry.");
                    confirm();
                }
            }
        }

    }

    /**
     * Gives a random number between 0 and the specified number
     * @param high max range for random number
     * @return random int in specified range
     */
    private static int random (int high) {
        return (int) (Math.random() * (high + 1));
    }

    /**
     * Gives a random number between one specified number and another number
     * @param low lower bound for the range of the number
     * @param high max range for random number
     * @return random int in specified range
     */
    private static int random (int low, int high) {
        return (int) (Math.random() * (high - low + 1) + low);
    }

    /**
     * Makes the user press enter to continue
     */
    private static void confirm() {
        Scanner scan = new Scanner (System.in);
        System.out.println ("\nPress enter to continue.");
        scan.nextLine();
    }

    /**
     * Checks to see if the campaign already has the specified type of event planned
     * @param n Action name
     * @param c campaign object
     * @return true if the campaign has the specified action type already
     */
    private static boolean usable(String n, Campaign c) {
        ArrayList<Action> events = c.getActions();
        for (int i = 0; i < events.size(); i++) {
            if (n.equalsIgnoreCase(events.get(i).getName()))
                return false;
        }
        return true;
    }

    private static ArrayList<Staff> createRandomStaff (int x) {        
        ArrayList<Staff> persons = new ArrayList<Staff>();
        for (int i = 0; i < x; i++) {
            String name = "";
            if (Math.random() < 0.5)
                name += Names.getMale() + " " + Names.getLast();
            else
                name += Names.getFemale() + " " + Names.getLast();

            String occupation = "";
            int wages = (int) (Math.random() * 60 + 60);
            int first = 0;
            int second = 0;
            double third = 1;
            int number = (int) (Math.random() * 3);
            if (number == 0) {
                occupation += "Press Secretary";
                second = (int) (Math.random() * 5 + 3);
            }
            else if (number == 1) {
                occupation += "Researcher";
                first = (int) (Math.random() * 3 + 3);
            }
            else if (number == 2) {
                occupation += "Fundraiser";
                third = (Math.random() * 0.4 + 1);
            }
            persons.add(new Staff (name, occupation, wages, first, second, third));
        }
        return persons;
    }

    private static ArrayList<Ally> createRandomAlly (int x) {        
        ArrayList<Ally> persons = new ArrayList<Ally>();
        for (int i = 0; i < x; i++) {
            String name = "";
            if (Math.random() < 0.5)
                name += Names.getMale() + " " + Names.getLast();
            else
                name += Names.getFemale() + " " + Names.getLast();

            String description = "A very important person";
            int zero, one, two, three, four, five, six, seven;
            zero = 0;
            one = 0;
            two = 0;
            three = 0;
            four = 0;
            five = 0;
            six = 0;
            seven = 0;
            int buff = random(7);
            int nerf = buff;
            while (nerf == buff)
                nerf = random(7);

            switch (buff) {
                case 0: zero = 2;
                break;
                case 1: one = 2;
                break;
                case 2: two = 2;
                break;
                case 3: three = 2;
                break;
                case 4: four = 2;
                break;
                case 5: five = 2;
                break;
                case 6: six = 2;
                break;
                case 7: seven = 2;
                break;
                default: zero = 1;
            }

            switch (nerf) {
                case 0: zero = -2;
                break;
                case 1: one = -2;
                break;
                case 2: two = -2;
                break;
                case 3: three = -2;
                break;
                case 4: four = -2;
                break;
                case 5: five = -2;
                break;
                case 6: six = -2;
                break;
                case 7: seven = -2;
                break;
                default: one = -1;
            }
            Ally temp = new Ally (name, description, zero, one, two, three, four, five, six, seven);
            persons.add(temp);
        }
        return persons;
    }

}