package edu.jalc.display;

import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.util.*;

public class Display extends JPanel{

   public Display(){

   }

   @Override
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(new BufferedImage(10,10,0),10,10,null);
      //g.drawLine(0,0,10,10);
   }
}
