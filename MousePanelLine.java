/*
 * This program draws line from an initial point to the point of mouse clicked
 * location
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MousePanelLine extends JPanel implements MouseListener {
	private int x1,y1,x2,y2;
	public MousePanelLine()
	{
		super();  //calls upper class (JPanel) constructor
		x1=50; y1=50;  x2=100; y2=100;
		add(this);   //class level interface implementation
	}
    public void paintComponent(Graphics g)
    {
    	//Draw a line between x1,y1 and x2,y2 points
    	g.drawLine(x1, y1, x2, y2);
    }
    public void mouseClicked(MouseEvent e)
    {
    	x1=x2;  y1=y2;  //second points are assigned to the initial points 
    	x2=e.getX();  y2=e.getY();  //second point gets its value from mouse location
    	repaint();   //paintComponent method recalled
    }
    /*
     * The following MouseListener interface methods need to be included 
     * (event not used) but left empty
     */
    public void mouseReleased(MouseEvent e){ }
    public void mouseExited(MouseEvent e){ }
    public void mousePressed(MouseEvent e){ }
    public void mouseEntered(MouseEvent e){ }
    
    public static void main(String a[])
    {
    	JFrame jf=new JFrame("Drawing Lines");
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jf.setSize(300, 300);
    	
    	MousePanelLine mpl=new MousePanelLine();
    	jf.setContentPane(mpl);
    	jf.setVisible(true);
    }
}
