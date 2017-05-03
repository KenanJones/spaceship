package edu.jalc.physics;

public class Direction{

  private double degrees;

  public Direction(double degrees){
    this.degrees = (degrees%360 + 360)%360;
  }

  public double degrees(){
    return this.degrees;
  }

  public String toString(){
    return this.degrees + " degrees";
  }
}
