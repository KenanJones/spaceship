package edu.jalc.display;

import java.util.Random;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class BackgroundImage extends BufferedImage{
  
  private final int x, y;
  
  public BackgroundImage(int x, int y){
    super(x,y,BufferedImage.TYPE_BYTE_INDEXED);
    this.x = x; this.y = y;
    this.draw(this.createGraphics());
  }
  
  private void draw(Graphics g){
    Random r = new Random();
    for(int i =0; i < this.x*this.y/30; i++){
      int x = r.nextInt(this.getWidth()), y = r.nextInt(this.getHeight());
      g.drawLine(x,y,x,y);
    }
  }
}
