import java.applet.Applet; 
import java.awt.*;
public class LineUp extends Applet {
    private final int APPLET_WIDTH = 400; 
    private final int APPLET_HEIGHT = 150;
    private final int HEIGHT_MIN = 100; 
    private final int VARIANCE = 40;
    private StickFigure figure1, figure2, figure3, figure4, figure5;
    public void init () {
        int h1, h2, h3, h4, h5;  
        h1 = HEIGHT_MIN + (((int) (Math.random() * VARIANCE)) +1); 
        h2 = HEIGHT_MIN + (((int) (Math.random() * VARIANCE)) +1); 
        h3 = HEIGHT_MIN + (((int) (Math.random() * VARIANCE)) +1); 
        h4 = HEIGHT_MIN + (((int) (Math.random() * VARIANCE)) +1); 
        h5 = HEIGHT_MIN + (((int) (Math.random() * VARIANCE)) +1); 
        figure1 = new StickFigure (100, 150, Color.red, h1); 
        figure2 = new StickFigure (150, 150, Color.cyan, h2); 
        figure3 = new StickFigure (200, 150, Color.green, h3);
        figure4 = new StickFigure (250, 150, Color.yellow, h4);
        figure5 = new StickFigure (300, 150, Color.blue, h5);

        setBackground (Color.black); 

        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }

    public void paint (Graphics page) { 
        figure1.draw (page); 
        figure2.draw (page); 
        figure3.draw (page); 
        figure4.draw (page); 
        figure5.draw (page);
    }

}