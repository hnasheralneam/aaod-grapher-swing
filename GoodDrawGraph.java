import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class GoodDrawGraph {
   public Coordinate xyStart() {
      return null;
   }

   public double xRange() {
      return 0.0D;
   }

   public double yRange() {
      return 0.0D;
   }

   public Coordinate getPoint(int pointNum) {
      return null;
   }

   public JPanel drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh) {
      Coordinate start = this.xyStart();
      double yRange = this.yRange();
      double xRange = this.xRange();
      ArrayList<Coordinate> coords = new ArrayList();
      int i = 0;

      for (Coordinate point = this.getPoint(i); point != null; point = this.getPoint(i)) {
         ++i;
         if (point != null) {
            double xPixel = (double) xPixelStart + (point.getX() - start.getX()) * ((double) pixelsWide / xRange);
            double yPixel = (double) yPixelStart
                  + (start.getY() + yRange - point.getY()) * ((double) pixelsHigh / yRange);
            coords.add(new Coordinate(xPixel, yPixel, point.drawFrom(), point.drawTo()));
         }
      }

      int yAxis = xPixelStart - (int) (start.getX() * ((double) pixelsWide / xRange));
      int xAxis = yPixelStart + (int) ((start.getY() + yRange) * ((double) pixelsHigh / yRange));
      JFrame frame = new JFrame("Grapher");
      Coordinate[] temp = new Coordinate[0];
      GoodDrawGraph.GrapherPanel panel = new GoodDrawGraph.GrapherPanel((Coordinate[]) coords.toArray(temp),
            pixelsWide, pixelsHigh, xAxis, yAxis);
      Dimension size = new Dimension(pixelsWide, pixelsHigh);
      panel.setPreferredSize(size);
      panel.setMinimumSize(size);
      panel.setMaximumSize(size);
      frame.add(panel);
      frame.setDefaultCloseOperation(3);
      frame.pack();
      frame.setResizable(false);
      Dimension d = frame.getToolkit().getScreenSize();
      Dimension me = frame.getSize();
      frame.setLocation(d.width / 2 - me.width / 2, d.height / 2 - me.height / 2);
      frame.setVisible(true);
      return panel;
   }

   class GrapherPanel extends JPanel {
      private static final long serialVersionUID = 7875070179825440571L;
      Coordinate[] coords;
      int pixelsWide;
      int pixelsHigh;
      int xAxis;
      int yAxis;

      GrapherPanel(Coordinate[] coords, int pixelsWide, int pixelsHigh, int xAxis, int yAxis) {
         this.coords = coords;
         this.pixelsWide = pixelsWide;
         this.pixelsHigh = pixelsHigh;
         this.xAxis = xAxis;
         this.yAxis = yAxis;
      }

      public void paint(Graphics g) {
         if (this.xAxis > 0 && this.xAxis < this.pixelsHigh) {
            g.setColor(Color.GREEN);
            g.drawLine(0, this.xAxis, this.pixelsWide, this.xAxis);
         }

         if (this.yAxis > 0 && this.yAxis < this.pixelsHigh) {
            g.setColor(Color.GREEN);
            g.drawLine(this.yAxis, 0, this.yAxis, this.pixelsHigh);
         }

         g.setColor(Color.BLACK);

         for (int i = 1; i < this.coords.length; ++i) {
            if (this.coords[i].drawTo()) {
               double x2 = this.coords[i].getX();
               double y2 = this.coords[i].getY();
               double x1;
               double y1;
               if (i == 0) {
                  x1 = this.coords[i].getX();
                  y1 = this.coords[i].getY();
               } else if (this.coords[i - 1].drawFrom()) {
                  x1 = this.coords[i - 1].getX();
                  y1 = this.coords[i - 1].getY();
               } else {
                  x1 = x2;
                  y1 = y2;
               }

               if (this.coords[i].drawTo() && this.coords[i - 1].drawFrom()) {
                  g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
               }
            }
         }

      }
   }
}