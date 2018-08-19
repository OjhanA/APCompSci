import java.util.*;
/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box {
    private double length = 0, width = 0, height = 0, volume = 0, surfaceArea = 0;
    private int id;
    private static int staticId = 1;
    
    /** 
     * @param l - length
     * @param w - width
     * @param h - height
     */
    public Box (double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        volume = l * w * h;
        surfaceArea = 2 * (w*l+h*l+h*w);
        id = staticId++;
        
    }

    public Box (double l){
        length = l;
        width = l;
        height = l;
        surfaceArea = 6 * l * l;
        volume = l * l * l;
        id = staticId++;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public String toString() {
        return "Box " + id + ": \nDimensions: " + length + " x " + width + " x " + height + "\nSurface area: " + getSurfaceArea() + "\nVolume: " + getVolume();

    }

    @Override
    public boolean equals (Object o) {
        if (o instanceof Box)
            return (Math.abs(((Box)o).getVolume() - getVolume()) < .000001);
        else {
            System.out.println("NOT A BOX OBJECT");
            return false;
        }
    }	

}