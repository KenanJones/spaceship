package edu.jalc.spaceships;

import edu.jalc.physics.*;
import edu.jalc.display.Paintable;

public class Spaceship extends MassiveObject implements Paintable{

  private Thruster thruster;

  public Spaceship(double mass, Thruster thruster){
    super(mass,new Vector(0,0));
    this.thruster = thruster;
  }

  public Spaceship thrust(double direction, double time){
    this.applyForce(new Vector(this.thruster.thrust(this.velocity().magnitude()), direction), time);
    return this;
  }

  public void paint(Graphics g){
    double x = this.location().getX();
    double y = this.location().getY();
  }

  public String toString(){
    return "Spaceship traveling at " + this.velocity();
  }

}
