//package Finch;  
import java.util.*;
import java.util.Scanner;
public class Finch{

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        //ArrayList<String> simon = new ArrayList<String>();
        int nextMove = (int)(Math.random() * 4);
        String say;
        String move;
        if (nextMove == 0)
            say = "up";
        else if (nextMove == 1)
            say = "down";
        else if (nextMove == 2)
            say = "left";
        else 
            say = "right";
        Finch2.simon.add(say);
        System.out.println("Simon says: " + say);
        move = scan.next();

        while (Finch2.moveCorrect(move) == true){
            nextMove = (int)(Math.random() * 4);
            if (nextMove == 0)
                say = "up";
            else if (nextMove == 1)
                say = "down";
            else if (nextMove == 2)
                say = "left";
            else 
                say = "right";
            Finch2.simon.add(say);
            for(int i = 0; i < Finch2.simon.size();i++)
                System.out.println("Simon says: " + Finch2.simon.get(i));
            move = scan.next();
            Finch2.moveCorrect(move);

        }
    }

    /*
    public static boolean moveCorrect(String move){
    if( s.equlasIgnoreCase(simon.get(0)))
    return true;
    else
    return false;
    }
     */

}