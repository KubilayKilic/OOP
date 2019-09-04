import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//This program will move a picture an image inside a panel
//When the size of panel is reached, the object will rebound from the edges
public class ReboundPanel extends JPanel {
	private final int WIDTH=400, HEIGHT=400;
	private final int DELAY=120, IMAGE_SIZE=40;
	
	private ImageIcon face;
	private Timer t;
	private int x,y, moveX,moveY;
	
	public ReboundPanel()
	{
		t=new Timer(DELAY, new ReboundListener());
		face=new ImageIcon("strawberry.jpg");
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setBackground(Color.yellow);
		
		x=0; y=100;
		moveX=moveY=5;
		t.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  //more stable application
		g.setColor(Color.red);
//		g.drawRect(x, y, moveX, moveY);
		
	face.paintIcon(this, g, x, y);
	}
	private class ReboundListener implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{
		   x=x+moveX; y=y+moveY;
		   
		   if(x<=0  || x>=WIDTH)
			    moveX=moveX*(-1);
		   if(y<=0   || y>=IMAGE_SIZE)
			   moveY=-1*moveY;
		   
		   repaint();  //Redraw the image or object with new values
		}
	}
	

}
