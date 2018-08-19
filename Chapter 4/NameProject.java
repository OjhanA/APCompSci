
/***************************************************************
 * Stores a person's first, middle, and last names
 * @author Ojhan Ardalan
 * October 20 2016
 ****************************************************************/
public class NameProject {
    private String first;
    private String middle;
    private String last; 

    public NameProject(String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String firstMiddleLast() {
        String firstMiddleLast = (first + " " + middle + " " + last);
        return firstMiddleLast;
    }

    public String lastFirstMiddle() {
        String lastFirstMiddle = (last + ", " + first + " " + middle);
        return lastFirstMiddle;	
    }

    public boolean equal(String n, String o) {
        String name = n;
        String otherName = o;
        if (name.equalsIgnoreCase(otherName))
            return true;
        else 
            return false;	
    }

    public String initials() {
        String i = (first.substring(0,1) + middle.substring(0,1) + last.substring(0,1));
        i = i.toUpperCase();
        return i;
    }

    public int length(){
        int l = (first.length() + middle.length() + last.length());
        return l;
    }
}