/**
 * A class with famous politicians who can endorse the player at special times and give stat changes
 * @author Jacob
 * @version 2/24
 */

public class AllyList {
    private static Ally[] democrat =
                    {new Ally ("Bernie Sanders", "Senator, I - Vermont", 0, 1, -2, -2, 2, 4, 4, -5),
                     new Ally ("Joe Biden", "Former Vice President", 3, 2, 1, 0, 1, 0, 1, 1),
                     new Ally ("John Kerry", "Former presidential candidate and Secretary of State", 2, 1, 4, 1, 
                               0, 0, 1, 2),
                     new Ally ("Al Gore", "Former presidential candidate", 0, 0, 2, 1, 1, 0, 2, 0),
                     new Ally ("Bill Clinton", "42nd US President", 3, 0, 0, 0, 2, -1, 2, 2),
                     new Ally ("Hillary Clinton", "Former presidential candidate and US Senator", -2, 2, 0, 1, 3, 
                               -1, 2, 2),
                     new Ally ("Dianne Feinstein", "Senator, D - California", 1, 1, 0, 0, 2, 0, 2, 1),
                     new Ally ("Chuck Schumer", "Senator, D - New York", 2, 1, 2, 0, 3, 0, 2, -2),
                     new Ally ("Elizabeth Warren", "Senator, D - Massachusetts", 1, 1, -2, 0, -3, 3, 3, -3),
                     new Ally ("Jimmy Carter", "39th US President", 2, 3, 3, 2, 1, 0, 1, 0)
                    };
                    
    private static Ally[] republican =
                    {new Ally ("Marco Rubio", "Senator, R - Florida", 1, 1, 2, 2, 2, 0, -1, 0),
                     new Ally ("John McCain", "Senator, R - Arizona", 1, 1, 4, 1, 2, -4, -3, 3),
                     new Ally ("Orrin Hatch", "Senator, R - Utah", 0, 0, 1, 4, 2, -1, -2, 1),
                     new Ally ("George H.W. Bush", "41st US President", 1, 1, 3, 2, 2, -1, -1, 0),
                     new Ally ("George W. Bush", "43rd US President", 1, 1, 3, 2, 2, -1, -1, 0),
                     new Ally ("John Kasich", "Governor, R - Ohio", 1, 1, 1, 2, 2, -2, -2, 1),
                     new Ally ("Ted Cruz", "Senator, R - Texas", -1, -1, 3, 3, -2, 2, -2, -1),
                     new Ally ("Sarah Palin", "Former Alaska Governor and vice presidential nominee " +
                               "(who can see Russia from her house)", -2, -2, 2, 2, -2, 3, -3, 3), 
                     new Ally ("Newt Gingrich", "Former Speaker of the House", -1, -1, 2, 2, 0, -1, -3, 2)
                    };
                     
    private static Ally[] celebrity = 
                    {new Ally ("Arnold Schwarzenegger", "Reality star and former California Governor", 
                                0, -1, 2, 1, -2, 1, -2, 2),
                     new Ally ("Oprah Winfrey", "No description needed, she's Oprah...", 3, 3, 0, 2, 0, 0, 1, 1),
                     new Ally ("Tom Cruise", "Devout Scientologist and honestly kind of a nut-case...\noh \"" +
                               "he's also an actor\" is something that people say about him", -2, -2, 2, 4, -2, 
                               0, 0, 2),
                     new Ally ("Tom Hanks", "Actor, apparently he did some stuff that one time", 1, 1, 1, 1, 
                               0, 0, 0, 1),
                     new Ally ("Morgan Freeman", "Actor, his voice is literally magical", 2, 1, 1, 1, 0, 0, 0, 0),
                     new Ally ("Adele", "Singer, she's not even American, \nbut that never stops politicians" + 
                               " ¯\\_(ツ)_/¯", 1, 1, -1, 0, 0, 0, 0, 0),
                     new Ally ("Bill Murray", "Actor, devout Cubs fan, he's probably in that one movie \nthat " +
                               "you always like to watch", 1, 0, 2, 1, 0, 1, 1, 0),
                     new Ally ("Larry the Cable Guy", "Apparently he's into politics, or maybe not...", 0, -2, 3, 
                               2, 0, 2, 0, 0),
                     new Ally ("Justin Bieber", "Apparently he cares about politics?", 0, -2, -1, -2, -1, 0, 0, 0),
                     new Ally ("Lindsey Lohan", "Apparently she's not in either prison or a hospital", 0, -1, 0, -2,
                               0, 0, 0, 0),
                     new Ally ("Kanye West", "Future presidential candidate, wants to get a head start", -2, -2, 
                               2, -1, -3, 3, 0, 1),
                     new Ally ("Kim Kardashian", "She's the famous-for-doing-absolutely-nothing-\ninteresting-" +
                               "and/or-useful-yet-famous-nonetheless type of person", -1, -2, 0, -1, -1, 0, 0, 0)
                    };
                    
    /**
     * Method that gives a random Democrat ally
     * @return random Democrat ally
     */
    public static Ally getRandomDem () {
        return democrat[(int) (Math.random() * democrat.length)];
    }                
    
    /**
     * Method that gives a random Republican ally
     * @return random Republican ally
     */
    public static Ally getRandomRep () {
        return republican[(int) (Math.random() * republican.length)];
    }
    
    /**
     * Method that gives a random CElebrity ally
     * @return random celebrity ally
     */
    public static Ally getRandomCeleb () {
        return celebrity[(int) (Math.random() * celebrity.length)];
    }
}
                            
                            
    