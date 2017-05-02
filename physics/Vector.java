package physics;

public class Vector{

  private double magnitude;
  private Direction direction;

  public Vector(double mag, double dir){
    this.magnitude = Math.abs(mag);
    this.direction = new Direction(((mag>0)?0:-180) + dir);
  }
  
  public double magnitude(){
    return this.magnitude;
  }
  public double degrees(){
    return this.direction.degrees();
  }

  public double getX(){
    return this.magnitude * Math.cos(this.direction.degrees()*Math.PI/180);
  }
  public double getY(){
    return this.magnitude * Math.sin(this.direction.degrees()*Math.PI/180);
  }
  
  public Vector add(Vector v){
    double x = this.getX()+v.getX();
    double y = this.getY()+v.getY();
    return new Vector(Math.sqrt(x*x + y*y), Math.atan(y/x)*180/Math.PI);
  }
  
  public Vector times(double x){
    return new Vector(this.magnitude*x,this.direction.degrees());
  }
  
  public String toString(){
    return "Vector: " + magnitude + " @ " + direction;
  }
}
