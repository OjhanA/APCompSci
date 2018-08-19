
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card {
    private String face;
    private String suit;

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        switch (getFace()){
            case "Ace": return 3;
            case "King": return 2;
            case "Queen": return 2;
            case "Jack": return 2;
            default: return 1;
        }
    }

    public static boolean sameSuit(Card c1, Card c2) {
        if (c1.getSuit().equals(c2.getSuit()))
            return true;	
        else
            return false;
    }
}