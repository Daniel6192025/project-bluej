
/**
 * Write a description of class Hendecagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hendecagon implements Shape
{
  private String color;
  private double sideLength;
  
  public Hendecagon(double sideLength, String color){
      this.sideLength = sideLength;
      this.color = color;
  }
  
  public String getColor() {
      return this.color;
  }
  
  public double getLength(){
      return this.sideLength;
  }
  
  public double getArea(){
      double squared = Math.pow(this.sideLength, 2);
      double degs = 3.490075;
      double rads = Math.toRadians(degs);
      return 11/4 * 1/Math.tan(rads) * Math.PI/11 * squared;
  }
  
  public double getPerimeter(){
      return this.sideLength * 11;
  }
}
