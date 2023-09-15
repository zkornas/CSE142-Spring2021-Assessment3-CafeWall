import java.awt.*;

public class Doodle {
   public static void main (String[] args) {
      DrawingPanel panel = new DrawingPanel(600, 450);
      panel.setBackground(Color.CYAN);
      Graphics g = panel.getGraphics();
      
      g.setColor(Color.GREEN);
      g.fillRect(0, 350, 600, 350);
      g.setColor(Color.YELLOW);
      g.fillOval(525, -75, 150, 150);
      g.setColor(Color.ORANGE);
      g.fillRect(400, 275, 100, 100);
      g.setColor(Color.RED);
      g.drawLine(400, 275, 500, 275);
      g.drawLine(400, 275, 450, 225);
      g.drawLine(500, 275, 450, 225);
      g.setColor(Color.BLACK);
      g.fillRect(435, 325, 30, 50);
      g.setColor(Color.ORANGE);
      g.fillRect(95, 245, 20, 130);
      g.setColor(Color.GREEN);
      g.fillOval(65, 225, 40, 40);
      g.fillOval(85, 245, 40, 40);
      g.fillOval(105, 225, 40, 40);
      g.fillOval(85, 205, 40, 40);
      for (int i = 1; i <= 50; i++) {
         g.setColor(Color.RED);
         g.drawLine(450 - i, 225 + i, 450 + i, 225 + i);
      }
   }
}
