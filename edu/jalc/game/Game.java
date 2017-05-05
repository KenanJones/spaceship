package edu.jalc.game;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.Timer;
import edu.jalc.display.Display;
import edu.jalc.spaceships.Spaceship;
import edu.jalc.spaceships.Thruster;

public class Game implements ActionListener{

  private JFrame frame;
  private Display display;
  private ArrowListener listener;
  private Spaceship ship;
  
  public Game(int x, int y){
    this.display = new Display(x,y);
    this.listener = new ArrowListener();
    this.ship = new Spaceship(10,new Thruster(10));
    buildFrame();
    frame.setVisible(true);
    new Timer(10,this).start();
  }
  
  private void buildFrame(){
    this.frame = new JFrame();
    frame.setLocation(100,100);
    frame.setSize(800,800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextField field = new JTextField();
    field.addKeyListener(this.listener);
    frame.add(field);
    frame.add(this.display);
  }
  
  public static void main(String... args){
    Game game = new Game(800,800);
  }
  
  public void actionPerformed(ActionEvent evt){
    this.ship.thrust(90,0.01);
    this.display.repaint();
    //this.display.getGraphics();
  }

}