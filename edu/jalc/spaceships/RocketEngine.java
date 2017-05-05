package edu.jalc.spaceships;

public class RocketEngine extends Thruster{

  public final double maxSpeed;

  public RocketEngine(double force, double speed){
    super(force);
    this.maxSpeed = speed;
  }
  
  public double thrust(double velocity){
    return this.maxForce *(1-velocity/this.maxSpeed);
  }

}
