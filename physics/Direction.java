package physics;

public class Direction{

  private int degrees;

  public Direction(int degrees){
    this.degrees = (degrees%360 + 360)%360;
  }

  public double getDegrees(){
    return this.degrees;
  }
}
