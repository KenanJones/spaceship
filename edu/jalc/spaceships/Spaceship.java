package edu.jalc.spaceships;

import edu.jalc.physics.*;

public class Spaceship extends MassiveObject{

  private RocketEngine engine;

  public Spaceship(double mass, RocketEngine engine){
    super(mass,new Vector(0,0));
    this.engine = engine;
  }

  public Spaceship thrust(double direction, double time){
    this.applyForce(new Vector(this.engine.maxForce *
      (1-this.velocity().magnitude()/this.engine.maxSpeed), direction), time);
    return this;
  }

  public String toString(){
    return "Spaceship traveling at " + this.velocity();
  }

}
