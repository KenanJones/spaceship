package edu.jalc.physics;

public class Point{

  private double x, y;

  public Point(){x=0;y=0;}
  public Point(Point p){
    this.x = p.x();
    this.y = p.y();  
  }
  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  public double x(){return this.x;}
  public double y(){return this.y;}

  public void setX(double x){this.x = x;}
  public void setY(double y){this.y = y;}
}
