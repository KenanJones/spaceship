package edu.jalc.physics;

public class MassiveObject{

  private double mass;
  private Vector velocity;

  public MassiveObject(double mass, Vector velocity){
    this.mass = mass;
    this.velocity = velocity;
  }

  public double mass(){return this.mass;}
  public Vector velocity(){return this.velocity;}

  public void applyForce(Vector force, double time){
    Vector change = new Vector(force.magnitude()*time/this.mass,force.degrees());
    this.velocity = velocity.add(change);
  }

  public String toString(){
    return "Object of mass " + mass + " moving at " + velocity;
  }
}
