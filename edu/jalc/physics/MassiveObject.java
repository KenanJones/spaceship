package edu.jalc.physics;

public class MassiveObject{

  public final double mass;
  private Vector velocity;
  private Point location;

  public MassiveObject(double mass, Vector velocity){
    this.mass = mass;
    this.velocity = velocity;
    this.location = new Point();
  }

  public Point location(){return this.location;}
  public Vector velocity(){return this.velocity;}

  public void applyForce(Vector force, double time){
    Vector change = new Vector(force.magnitude()*time/this.mass,force.degrees());
    this.velocity = velocity.add(change);
  }

  public void move(){
    location.setX(location.getX() + velocity.getX());
    location.setY(location.getY() + velocity.getY());
  }

  public String toString(){
    return "Object of mass " + mass + " moving at " + velocity;
  }
}
