package edu.jalc.spaceships;

import edu.jalc.physics.*;

public class Spaceship extends MassiveObject{

  private Thruster thruster;

  public Spaceship(double mass, Thruster thruster){
    super(mass,new Vector(0,0));
    this.thruster = thruster;
  }

  public Spaceship thrust(double direction, double time){
    this.applyForce(new Vector(this.thruster.thrust(this.velocity().magnitude()), direction), time);
    return this;
  }

  public String toString(){
    return "Spaceship traveling at " + this.velocity();
  }

}
