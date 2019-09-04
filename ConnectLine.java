import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * This program replaces mouseListener interface mouseAdapter class.
 * By doing this, we avoid to include all empty methods of Listener
 * interface.
 */
public class ConnectLine extends JPanel {
    private int x1=0,y1=0,x2=50,y2=50;
    
    public ConnectLine()
    {
    	this.addMouseListener(new myTemp());
    	this.setBackground(Color.yellow);
    }
    public void paintComponent(Graphics g)
    {
       g.setColor(Color.blue);
       g.drawLine(x1, y1, x2, y2);	
    }
    private class myTemp extends MouseAdapter
    {
    	public void mouseClicked(MouseEvent e)
    	{
    		x1=x2;  y1=y2;
    		x2=e.getX();
    		y2=e.getY();
    		repaint();
    	}
    }
}
