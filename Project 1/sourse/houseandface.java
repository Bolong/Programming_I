import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;


public class houseandface extends JFrame {
	public houseandface(){setLocation(50, 50);   //set location 
	setResizable(false);  //make it not sizable
	setSize(500, 500);   //set frame size
	setVisible(true);

    }
	public void paint(Graphics g) {  //create a new Graphics2D object
		setBackground(Color.white); //set background
		setTitle("My house and face Project"); //set the title for frame
		Graphics2D g2 =(Graphics2D)g;
		BasicStroke bs = new BasicStroke(4,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND); //set line bold
		g2.setStroke(bs);
		Ellipse2D face = new Ellipse2D.Double(280, 100, 150, 150); //draw face
		g2.draw(face);
		Ellipse2D eye1 = new Ellipse2D.Double(310, 140, 30, 30); //draw left eye
		g2.draw(eye1);
		Ellipse2D eye2 = new Ellipse2D.Double(370, 140, 30, 30); //draw right eye
		g2.draw(eye2);
		Line2D nose1 = new Line2D.Double(353,160,340,190); //draw the oblique line
		g2.draw(nose1);
		Line2D nose2 = new Line2D.Double(340,190,350,190); //draw the horizontal line
		g2.draw(nose2);
		Arc2D arc=new Arc2D.Double(330,185,50,50,180,180,Arc2D.CHORD); //draw the mouth
	    g2.draw(arc);
	    Rectangle2D rect = new Rectangle2D.Double(40,350,160,100); //draw the house body
		g2.draw(rect);
		Line2D roof1 = new Line2D.Double(120,300,40,350); //left part of the roof
		g2.draw(roof1);
		Line2D roof2 = new Line2D.Double(120,300,200,350); //right part of the roof
		g2.draw(roof2);
		Rectangle2D window = new Rectangle2D.Double(60,370,40,40); //draw the window
		g2.draw(window);
		Rectangle2D door = new Rectangle2D.Double(130,390,40,60); //draw the door
		g2.draw(door);
	}
	public static void main(String[] args) {
		new houseandface();
	}
}
