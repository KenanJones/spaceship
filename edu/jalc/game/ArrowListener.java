package edu.jalc.game;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ArrowListener implements KeyListener{

  private boolean[] keys;//up, down, left, right

  public ArrowListener(){
    this.keys = new boolean[4];
  }
  
  public void keyTyped(KeyEvent e) {
    try{
      this.keys[this.getArrow(e.getKeyCode())] = true;
    }catch(Exception ex){}
  }
  public void keyReleased(KeyEvent e) {
    try{
      this.keys[this.getArrow(e.getKeyCode())] = false;
    }catch(Exception ex){}
  }
  public void keyPressed(KeyEvent e) {}
  
  private int getArrow(int code){
    switch(code){
      case 37: return 2;
      case 38: return 0;
      case 39: return 3;
      case 40: return 1;
      default: return -1;
    }
  }
  
  public boolean up(){return this.keys[0];}
  public boolean down(){return this.keys[1];}
  public boolean left(){return this.keys[2];}
  public boolean right(){return this.keys[3];}
}