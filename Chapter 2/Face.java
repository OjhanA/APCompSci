/***************************************************************
 * Purpose: Draws a picture of my face
 * @author Ojhan Ardalan
 * September 4 2016
 ***************************************************************/
import java.awt.*;
import java.applet.Applet;

public class Face extends Applet {
    public void paint(Graphics page) {
        Color skin = new Color(245, 185, 158);
        Color eye = new Color(100, 25, 5);

        //face and ears
        page.setColor (skin);
        page.fillOval(227, 100, 50, 70);
        page.fillOval(43, 100, 50, 70);
        page.fillOval(60, 60, 200, 205);

        //eyes
        page.setColor (Color.white);
        page.fillOval(90, 120, 50, 25);
        page.fillOval(190, 120, 50, 25);
        page.setColor (eye);
        page.fillOval(110, 123, 17, 17);
        page.fillOval(210, 123, 17, 17);
        page.setColor (Color.black);
        page.fillOval(112, 125, 13, 13);
        page.fillOval(212, 125, 13, 13);

        //hair
        int [] x = {80,100,220,240};
        int [] y = {95,40,40,95};
        page.setColor (Color.black);
        page.fillPolygon(x, y, 4); 

        page.drawArc(165, 115, 10, 50, 270, 90);
        page.drawLine(110, 187, 205, 187);
        page.drawArc(110, 150, 95, 75, 0, -180);
    }
}