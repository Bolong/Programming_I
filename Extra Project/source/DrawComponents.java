import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

/**
 * This component displays a house and a smile that can be moved.
 */
public class DrawComponents extends JComponent {

	private BasicStroke bs;
	private Ellipse2D face;
	private Ellipse2D eye1;
	private Ellipse2D eye2;
	private Line2D nose1;
	private Line2D nose2;
	private Arc2D arc;
	private Rectangle2D rect;
	private Line2D roof1;
	private Line2D roof2;
	private Rectangle2D window;
	private Rectangle2D door;
	public int xpos = 0;

	public DrawComponents() {
		// The rectangle that the paint method draws
		bs = new BasicStroke(4, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND); // set line bold
		face = new Ellipse2D.Double(); // draw face
		eye1 = new Ellipse2D.Double(); // draw left eye
		eye2 = new Ellipse2D.Double(); // draw right eye
		nose1 = new Line2D.Double(); // draw the oblique line
		nose2 = new Line2D.Double(); // draw the horizontal line
		arc = new Arc2D.Double(); // draw the mouth
		rect = new Rectangle2D.Double(); // draw the house body
		roof1 = new Line2D.Double(); // left part of the roof
		roof2 = new Line2D.Double(); // right part of the roof
		window = new Rectangle2D.Double(); // draw the window
		door = new Rectangle2D.Double(); // draw the door		
		setComponents(0);		
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		setBackground(Color.white); // set background
		g2.setStroke(bs);
		g2.draw(face);
		g2.draw(eye1);
		g2.draw(eye2);
		g2.draw(nose1);
		g2.draw(nose2);
		g2.draw(arc);
		g2.draw(rect);
		g2.draw(roof1);
		g2.draw(roof2);
		g2.draw(window);
		g2.draw(door);
	}

	/**
	 * Moves the components by a given amount.
	 * 
	 * @param dx
	 *            the amount to move in the x-direction
	 */
	public void moveBy(int dx) {
		setComponents(xpos);
		xpos = xpos + dx;
		repaint();
	}
	
	/**
	 * Set location of the components.
	 * 
	 * @param x
	 *            the amount to move in the x-direction
	 */
	public void setComponents(int x) {
		face.setFrame(280 + x, 100, 150, 150);
		eye1.setFrame(310 + x, 140, 30, 30);
		eye2.setFrame(370 + x, 140, 30, 30);
		nose1.setLine(353 + x, 160, 340 + xpos, 190);
		nose2.setLine(340 + x, 190, 350 + xpos, 190);
		arc.setFrame(330 + x, 185, 50, 50);
		arc.setAngleStart(180);
		arc.setAngleExtent(180);
		arc.setArcType(Arc2D.CHORD);
		rect.setFrame(40 + x, 350, 160, 100);
		roof1.setLine(120 + x, 300, 40 + xpos, 350);
		roof2.setLine(120 + x, 300, 200 + xpos, 350);
		window.setFrame(60 + x, 370, 40, 40);
		door.setFrame(130 + x, 390, 40, 60);
	}	
}