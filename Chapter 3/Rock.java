/***************************************************************
 * Play Rock, Paper, Scissors with the user  
 * @author Ojhan Ardalan
 * September 15
 ****************************************************************/
import java.util.Scanner;

public class Rock
{
    public static void main(String[] args)
    {
        System.out.print ("\f");
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number for computer play

        Scanner scan = new Scanner(System.in);

        System.out.print ("Pick a play: \"r\" for rock, \"p\" for paper, and \"s\" for scissors "); //Get player's play -- note that this is stored as a string
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase();  //Make player's play uppercase for ease of comparison

        while (!personPlay.equals("R") && !personPlay.equals("S") && !personPlay.equals("P")) {
            System.out.print ("Invalid play \nPick a play: \"r\" for rock, \"p\" for paper, and \"s\" for scissors "); //Get player's play -- note that this is stored as a string
            personPlay = scan.nextLine();
            personPlay = personPlay.toUpperCase();
        }

        computerInt = (int)(Math.random() * 3);//Generate computer's play (0,1,2). Use the Math.random() method

        //Translate computer's randomly generated play to string
        if (computerInt == 0)
            computerPlay = "R";
        else if (computerInt == 1)
            computerPlay = "P";
        else if (computerInt == 2)
            computerPlay = "S";
        //...  Fill in rest of code

        //See who won.  Use nested ifs instead of &&.

        if (personPlay.equals(computerPlay)){
            System.out.println ("The computer's play is " + computerPlay);
            System.out.println("It's a tie!");
        }
        else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")){
                System.out.println ("The computer's play is " + computerPlay);
                System.out.println("Rock crushes scissors.  You win!!");
            }
            else if (computerPlay.equals("P")){
                System.out.println ("The computer's play is " + computerPlay);
                System.out.println("Paper covers rock.  You lose!!");
            }
        }
        else if (personPlay.equals("S")) {
            if (computerPlay.equals("R")){
                System.out.println ("The computer's play is " + computerPlay);
                System.out.println("Rock crushes scissors.  You lose!!");
            }
            else if (computerPlay.equals("P")){
                System.out.println ("The computer's play is " + computerPlay);
                System.out.println("Scissors cut paper.  You win!!");
            }
        }
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println ("The computer's play is " + computerPlay);
                System.out.println("Paper covers rock.  You win!!");
            }
            else if (computerPlay.equals("S")) {
                System.out.println ("The computer's play is " + computerPlay);
                System.out.println("Scissors cut paper.  You lose!!");
            }
        }
        else
            System.out.println("Invalid input");

    }
}

//...  Fill in rest of code
