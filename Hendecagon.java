
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
  private double degs;
  
  public Hendecagon(double sideLength, String Color, double degs){
      this.sideLength = sideLength;
      this.color = color;
      this.degs = degs;
  }
  
  public String getColor() {
      return this.color;
  }
  
  public double getLength(){
      return this.sideLength;
  }
  
  public double getDegs(){
      return this.degs;
  }
  
  public double getArea(){
      double squared = Math.pow(this.sideLength, 2);
      double rads = Math.toRadians(this.degs);
      return 11/4 * squared * 1.0/Math.tan(rads) * 3.14/11;
  }
  
  public double getPerimeter(){
      return this.sideLength * 11;
  }
}
