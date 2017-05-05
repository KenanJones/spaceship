package edu.jalc.display;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.util.ArrayList;

public class Display extends JPanel{
   
  private BufferedImage background;
  private final int xSize, ySize;
  private ArrayList<Paintable> displayThings;
   
  public Display(int x, int y){
    this.xSize = x;
    this.ySize = y;
    this.background = new BackgroundImage(xSize,ySize);
    this.displayThings = new ArrayList<>();
  }

  public Display add(Paintable p){
    this.displayThings.add(p);
  }

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(background,0,0,null);
    displayThings.asList().iterator().forEach(Paintable p){
      p.paint(g);
    }
  }
  
  public static void main(String... args){
    JFrame frame = new JFrame();
    Display display = new Display(800,800);
    frame.setLocation(100,100);
    frame.setSize(display.xSize,display.ySize);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(display);
    frame.setVisible(true);
    display.repaint();
  }
}
