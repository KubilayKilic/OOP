import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DirectionPanel extends JPanel {
	private final int WIDTH=300, HEIGHT=200;  //all constant variables
	private final int JUMP=10;
	private final int IMAGE_SIZE=30;
	
	private ImageIcon up, down,left,right,currentImage;
	private int x,y;
	
	public DirectionPanel()
	{
		this.addKeyListener(new DirectionListener());
		x=WIDTH/2;  y=HEIGHT/2;
		up=new ImageIcon("E:\\TuranKaraguler\\CE2\\up_arrow.gif");
		down=new ImageIcon("E:\\TuranKaraguler\\CE2\\down_arrow.gif");
		left=new ImageIcon("E:\\TuranKaraguler\\CE2\\left_arrow.gif");
		right=new ImageIcon("E:\\TuranKaraguler\\CE2\\right_arrow.gif");
		
		currentImage=up;
		setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setFocusable(true);
	}
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);  //for drawing stability 
    	currentImage.paintIcon(this,g,x,y);
    }
    private class DirectionListener implements KeyListener
    {
    	public void keyPressed(KeyEvent e)
    	{ 
    		switch(e.getKeyCode())
    		{
    		  case KeyEvent.VK_UP:
    			  currentImage=up;
    			  y=y-JUMP;
			  repaint();
    			  break;
    		  case KeyEvent.VK_DOWN:
    			  currentImage=down;
    			  y=y+JUMP;
    			  break;
    		  case KeyEvent.VK_LEFT:
    			  currentImage=left;
    			  x=x-JUMP;
		       repaint();
    			  break;
    		  case KeyEvent.VK_RIGHT:
    			  currentImage=right;
    			  x=x+JUMP;
			  repaint();
    			  break;
    		}
    	}
    	public void keyTyped(KeyEvent e){ }
    	public void keyReleased(KeyEvent e){ }
    }
}
