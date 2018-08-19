
/**
 * Write a description of class MyFinch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class MyFinch
{
    public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      while (!myFinch.isBeakUp())
      {
          if (myFinch.isObstacle())
          {
              myFinch.buzz(200,1000);
              myFinch.sleep(1000);
              myFinch.saySomething("excuse me");
              myFinch.setLED(255,0,0,1000);
              myFinch.setWheelVelocities(-100,100,1000);
              
            }
        }
      // Write some code here!
  //   for (int x = 0; x < 400; x+=10)
    //  {myFinch.buzz(x,1000);
      //myFinch.sleep(1000);}

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
}
