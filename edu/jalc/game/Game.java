package edu.jalc.game;

import javax.swing.*;
import edu.jalc.display.Display;

public class Game{

  private JFrame frame;
  private Display display;
  
  public Game(int x, int y){
    this.display = new Display(x,y);
    buildFrame();
    frame.setVisible(true);
  }
  
  private void buildFrame(){
    this.frame = new JFrame();
    frame.setLocation(100,100);
    frame.setSize(800,800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(this.display);
  }

}