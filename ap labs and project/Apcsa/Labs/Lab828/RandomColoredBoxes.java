//� A+ Computer Science
// www.apluscompsci.com

//for loop example with graphics

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class RandomColoredBoxes extends Canvas
{
   public RandomColoredBoxes()
   {
      setBackground(Color.white);
   }

   public void paint(Graphics window)
   {
      for(int run=50; run<=360; run+=20)
      {
			window.setColor(new Color((int)(Math.random()*2554),(int)(Math.random()*26),(int)(Math.random()*226)));
			
			for(int i=0; i<20000000;i++){ }  //pauses for a second
			
			window.fillRect( run, run, 100, run/3);
      }
   }
}