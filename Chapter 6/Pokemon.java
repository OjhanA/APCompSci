import java.util.*;
public class Pokemon {
    public static void main (String[] args) {
        System.out.print ("\f");
        Scanner scan = new Scanner(System.in);

        String[] info = new String[3]; //Creates array containing player's info
        System.out.print("Welcome to the world of Pokemon! \nWhat is your name?: ");
        info[0] = scan.nextLine(); //saves the player's name
        System.out.print("Hello " + info[0] + ", are you a boy or a girl?: " );
        String boyGirl = scan.nextLine(); 
        while (!boyGirl.equalsIgnoreCase("boy") && !boyGirl.equalsIgnoreCase("girl")) { //makes sure player inputs a valid gender
            System.out.print ("Please input a valid gender: ");
            boyGirl = scan.nextLine();
        }
        info[1] = boyGirl; //saves the players gender

        //System.out.println ("To check your information at any time, type \"info\"");
        ArrayList<String> pokemon = new ArrayList<String>(); //Creates array list for the player's pokemon
        System.out.println("Type \"pokemon\" to check how many pokemon you have. Currently, you have " 
            + "none. \nChose a location and go find some pokemon. (forest) ");
        String answer = "null"; //filler until the player inputs an answer
        while (!answer.equals("stop")){ //will continue to loop until the player types "stop"
            answer = scan.nextLine();
            if (answer.equals("pokemon"))
                System.out.println(checkPokemon(pokemon)); //calls checkPokemon method
            else if (answer.equals("forest"))
                pokemon = goToForest(pokemon); //calls goToForest method
            else if (answer.equals("stop"))
                System.out.println ("Goodbye!"); //stops the loop and the program
            else
                System.out.println ("Please enter a valid option!"); //makes sure the player inputs a valid option
        }
    }

    public static String printInfo(String[] i) { //prints the players info
        return "Name: " + i[0] + " Gender: " + i[1];
    }

    public static String checkPokemon(ArrayList<String> c) { //prints the list of pokemon the player has
        if (c.size() == 0) 
            return "You have no pokemon"; //will display this if player has no pokemon
        else {
            String poke = "Pokemon: ";
            for (int i = 0; i < c.size(); i++) { //for loop that loops through the whole array list listing every pokemon the player has 
                poke = poke + "\nPokemon # " + (i+1) + " is " + c.get(i);
            }
            return poke; //returns the list of pokemon the player has
        }
    }

    public static ArrayList<String> goToForest(ArrayList<String> pokemonForest) { //if the player decides to go to the forest
        Scanner scan = new Scanner(System.in);
        System.out.println("You are now in the forest! \nYou run into a wild Caterpie, what do you do? (catch)");
        if (scan.nextLine().equals("catch")) {
            if (catchChance()) { //if the random generator is true, pokemon will be caught
                System.out.println("You caught Caterpie! \nYou run home with excitement. Where would you like to go now? (forest)");
                pokemonForest.add(pokemonForest.size(),"Caterpie"); //adds Caterpie to the array list of pokemon
                return pokemonForest;
            }
            else { //if the random generator is fale, the pokemon will run away
                System.out.println("Caterpie got away... \nYou walk home in disapointment... Where would you like to go now? (forest)");
                return pokemonForest;
            }
        }
        return pokemonForest;
    }

    public static boolean catchChance() { //random generator that determins catch chance
        int chance = (int) (Math.random() * 2); //50% chance to produce 1 or 0
        if (chance == 1) //if its 1 it will return true
            return true;
        else
            return false; //if its 0 it will return falase
    }
}
