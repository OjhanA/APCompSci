 
//package Finch;
import java.util.*;
public class Finch2{
    static ArrayList<String> simon = new ArrayList<String>();

    public static  boolean moveCorrect(String move){
        if( move.equalsIgnoreCase(simon.get(simon.size()-1)))

            return true;
        else
            return false;
    }
}