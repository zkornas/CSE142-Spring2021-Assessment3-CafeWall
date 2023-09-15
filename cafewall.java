// Zacharia Kornas
// 04.20.2021
// CSE 142 Section AX
// TA: Paul George Druta
// Take-home Assessment #3: CafeWall
//
// This program produces the Cafe Wall illusion
// and allows for customizable rows, grids, and mortar

import java.awt.*;

public class CafeWall {
   public static final int MORTAR = 2; // Used to change the mortar between rows in grids
                                       // Can be >= 0

   public static void main(String[] args) {
      // Creates the drawing panel of a specified size
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.GRAY);
      // Creates a "pen" to draw our design
      Graphics g = panel.getGraphics();
      
      row(g, 0, 0, 20, 4);
      row(g, 50, 70, 30, 5);
      grid(g, 400, 20, 35, 2, 35);
      grid(g, 10, 150, 25, 4, 0);
      grid(g, 250, 200, 25, 3, 10);
      grid(g, 425, 180, 20, 5, 10);
   }
   
   // Creates grid of black boxes with blue Xs and white boxes
   // by using the "row" method
   // Parameters
   //    g - the "pen" tool used to draw in drawing panel
   //    x - x-cordinate for top left corner of row
   //    y - y-cordinate for top left corner of row 
   //    size - width/height of the individual boxes 
   //    pair - number of black boxes with blue X and white boxs
   //    offset - number of pixels to offset every other line
   public static void grid(Graphics g, int x, int y, int size, 
                           int pair, int offset) {
      for (int i = 1; i <= pair; i++) {
         row(g, x, i * (2 * (size + MORTAR)) + (y - (2 * size) - (2 * MORTAR)), size, pair);
         row(g, x + offset, i * (2 * (size + MORTAR)) + (y - size - MORTAR), size, pair);
      }
   }
   
   // Creates a row of black boxes with blue Xs and white boxes
   // Parameters
   //    g - the "pen" tool used to draw in drawing panel
   //    x - x-cordinate for top left corner of row
   //    y - y-cordinate for top left corner of row 
   //    size - width/height of the individual boxes 
   //    pair - number of black boxes with blue X and white boxs
   public static void row(Graphics g, int x, int y, int size, int pair) {
      for (int i = 1; i <= pair; i++) {
         g.setColor(Color.BLACK);
         g.fillRect(i * (size * 2) + (x - (size * 2)), y, size, size);
         g.setColor(Color.BLUE);
         g.drawLine(i * (size * 2) + (x - (size * 2)), y, i * (size * 2) + (x - size), y + size);
         g.drawLine(i * (size * 2) + (x - size), y, i * (size * 2) + (x - (size * 2)), y + size);
         g.setColor(Color.WHITE);
         g.fillRect(i * (size * 2) + (x - size), y, size, size);
      }
   }
}
