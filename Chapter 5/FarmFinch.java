/**********************************************
 *This class makes animal sounds and movements.
 * 
 * @Gary Enea, Ojhan Ardalan
 * @version 1/31/17
 **********************************************/
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class FarmFinch
{
    public static Finch myFinch = new Finch();
    public static void main(final String[] args)
    {
        playAnimal("Duck");
        playAnimal("Cow");
        playAnimal("Horse");
        playAnimal("Sheep");

        myFinch.quit();
        System.exit(0);
    }

    public static boolean playAnimal(String a)
    {
        if (a.equals("Duck"))
        {
            duck();
            return true;
        }
        else if (a.equals("Cow"))
        {
            cow();
            return true;
        }
        else if (a.equals("Horse"))
        {
            horse();
            return true;
        }
        else if (a.equals("Sheep"))
        {
            sheep();
            return true;
        }
        else 
            return false;
    }

    public static void duck()
    {
        myFinch.saySomething("i am a duck QUACK QUACK");
        myFinch.setLED(173, 255, 47);
        for (int i = 0; i < 5; i++){
            myFinch.setWheelVelocities(100, 0, 500);
            myFinch.setWheelVelocities(0, 100, 500);
        }
        // Add code to make the finch behave like a duck.
    }

    public static void cow()
    {
        myFinch.saySomething("COCKLE DOODLE DOO THE COW SAYS MOO");
        myFinch.setLED(77, 26, 0);
        for (int i = 0; i < 5; i++){
            myFinch.setWheelVelocities(100, 100, 500);
            myFinch.setWheelVelocities(0, 100, 500);
            myFinch.setWheelVelocities(100, 0, 500);
            myFinch.saySomething("MOO");
            myFinch.setWheelVelocities(100, 100, 500);
        }

        // Add code to make the finch behave like a duck.
    }

    public static void horse()
    {
        myFinch.saySomething("NEIGH I AM A HORSE");
        myFinch.setLED(242, 242 , 242);
        for (int i = 0; i < 5; i++){
            myFinch.setWheelVelocities(200, 200, 1000);
            myFinch.saySomething("NEIGH");

        }

        // Add code to make the finch behave like a duck.
    }

    public static void sheep()
    {
        myFinch.saySomething("BAH BAH BAH BAH BAH BAH BABABRA ANN");
        myFinch.setLED(153, 51, 0);

        for (int i = 0; i < 5; i++){
            myFinch.setWheelVelocities(50, 50, 1000);
            myFinch.sleep(400);
            myFinch.saySomething("BAH BAH BAH");

        }

        // Add code to make the finch behave like a duck.
    }

}