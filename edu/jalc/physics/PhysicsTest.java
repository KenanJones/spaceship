package edu.jalc.physics;

public class PhysicsTest{

  public static void main(String... args){
    testDirection();
    testVector();
    testMassiveObject();
  }

  public static void testDirection(){
    Direction d1 = new Direction(100);
    Direction d2 = new Direction(-100);
    Direction d3 = new Direction(370);
    Direction d4 = new Direction(-370);
    System.out.printf("%s %s %s %s%n",d1,d2,d3,d4);
  }

  public static void testVector(){
    Vector v1 = new Vector(10,10);
    Vector v2 = new Vector(10,370);
    Vector v3 = new Vector(-10,10);
    Vector v4 = new Vector(-10,-10);
    Vector v5 = new Vector(-10,-370);
    System.out.printf("%s %s %s %s %s%n",v1,v2,v3,v4,v5);
    System.out.println(v1 + " has components: " + v1.getX() + ", " + v1.getY());
    System.out.println(v1.add(v4));
    System.out.println(v2.times(2));
    System.out.println(v2.times(-2));
  }

  public static void testMassiveObject(){
    MassiveObject o1 = new MassiveObject(10,new Vector(10,45));
    System.out.println(o1);
    o1.applyForce(new Vector(100,90),1);
    System.out.println(o1);
  }

}
