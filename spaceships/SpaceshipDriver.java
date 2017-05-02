package spaceships;

public class SpaceshipDriver{
  public static void main(String... args){
    Spaceship ship = new Spaceship(10, new RocketEngine(10,10));
    System.out.println(ship.thrust(0,1));
    System.out.println(ship.thrust(0,1));
    System.out.println(ship.thrust(0,100));
    System.out.println(ship.thrust(0,10));
  }
}