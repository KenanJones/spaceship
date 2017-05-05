package edu.jalc.spaceships;

public class Thruster{

  public final double maxForce;

  public Thruster(double force){
    this.maxForce = force;
  }
  
  public double thrust(double velocity){
    return this.maxForce;
  }

}