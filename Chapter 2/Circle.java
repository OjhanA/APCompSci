/*********************************************************
 * Class for CircleTest
 * @author Ojhan Ardalan
 * August 30, 2016
 ********************************************************/

public class Circle {
  private double radius;

  public Circle(double r) {
    radius = r;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
  
  public double getCircumference() {
    return 2 * radius * Math.PI;
  }
}
