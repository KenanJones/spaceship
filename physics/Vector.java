package physics;

public class Vector{

  private double magnitude;
  private Direction direction;

  public Vector(double mag, double dir){
    this.magnitude = Math.abs(mag);
    this.direction = new Direction(dir + mag>0?0:-180);
  }

  public double getX(){
    return this.magnitude * Math.cos(this.direction);
  }
  public double getY(){
    return this.magnitude * Math.sin(this.direction);
  }
}
