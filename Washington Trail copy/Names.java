/**
 * A list of random names
 * @author Ojhan Ardalan
 * @version 2/18/19
 */

public class Names {
    
    public static String firstName;
    public static String lastName;

    static String[] maleNames = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", 
            "Christopher", "Matthew", "Daniel", "Anthony", "Donald", "Mark", "Paul", "Steven", "George", "Kenneth", "Gary", "Justin", 
            "Philip", "Vincent", "Gabriel", "Bobby", "Johnny", "Howard", "Randy", "Harry", "Russell", "Noah", "Juan", "Dylan", 
            "Eugene", "Jordan", "Roy", "Ralph", "Bryan", "Bruce", "Billy", "Austin", "Terry", "Ojhan", "Francisco", "Calvin", "Frederick"};

    static String[] femaleNames = {"Mary", "Barbara", "Jennifer", "Elizabeth", "Linda", "Susan", "Jessica", "Margaret", "Sarah", "Karen", 
            "Nancy", "Betty", "Dorothy", "Lisa", "Sandra", "Ashley", "Kimberly", "Carol", "Michelle", "Emily", "Helen", "Amanda", 
            "Melissa", "Deborah", "Connie", "Laura", "Rebecca", "Sharon", "Cynthia", "Amy", "Anna", "Brenda", "Katherine", "Nicole", 
            "Christine", "Samantha", "Rachel", "Maria", "Justine", "Lauren", "Alice", "Megan", "Gloria", "Julia", "Tiffany", "Stephanie"};

    static String[] lastNames = {"Smith", "Johnson", "Murphy", "Martin", "Brown", "Lee", "Rodríguez", "Diaz", "Jones", "Miller", 
            "Davis", "Garcia", "Martinez", "Anderson", "Taylor", "White", "Harris", "Robinson", "Nelson", "Green", "Wright", "Adams", 
            "Washington", "Jackson", "Jefferson", "Monroe", "Molotov", "Ribbentrop", "Douglass", "Roosevelt", "Arthur", "Edwards", "Wood", "Black", 
            "Morris", "Nguyen", "Rivera", "Cook", "Morgan", "Reiter", "Thompson", "Ardalan", "Davidson", "Kennedy", "Bush", "Peterson"}; 

    /**
     * Returns a random male first name
     * @return male first name
     */
    public static String getMale() {
        return maleNames[(int)(Math.random() * 47)];
    }
    
    /**
     * Returns a random female first name
     * @return female first name
     */
    public static String getFemale() {
        return femaleNames[(int)(Math.random() * 46)];
    }
    
    /**
     * Returns a random last name
     * @return last name
     */
    public static String getLast() {
        return lastNames[(int)(Math.random() * 46)];
    }

}