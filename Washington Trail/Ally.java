/**
 * Special kind of politician who gives strategic stat boosts/drops to the player
 * @author Jacob
 * @version 2/24
 */

public class Ally extends Person {
    private int[] boost;
    
    /**
     * Gives allies arbitrary stats, but then also gives boosts to certain Politician categories
     * @param n name
     * @param d description
     * @param a approval boost
     * @param c credibility boost
     * @param pat patriotism boost
     * @param rel religion boost
     * @param t tradition boost
     * @param pop populist boost
     * @param u unions boost
     * @param w wallSt boost
     */
    public Ally (String n, String d, int a, int c, int pat, int rel, int t, int pop, int u, int w) {
        super (n, d, 0);
        boost = new int[8];
        boost[0] = a;
        boost[1] = c;
        boost[2] = pat;
        boost[3] = rel;
        boost[4] = t;
        boost[5] = pop;
        boost[6] = u;
        boost[7] = w;
    }
    
    public int[] getBoosts () {
        return boost;
    }
}