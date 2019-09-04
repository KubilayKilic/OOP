import javax.swing.*;
import java.awt.*;

public class Snowman extends JApplet{

	public void init()
	{
		this.isBackgroundSet();
		this.setBackground(Color.red);
		//We will not use init here but usually initial assignments are
		//carried out here
	}
	public void paint(Graphics g)
	{
		final int MID=150;
		final int TOP=50;
		
		g.setColor(Color.blue);
		g.fillRect(0, 175, 300, 50);  //ground
		
		g.setColor(Color.yellow);    
		g.fillOval(-40, -40, 80, 50);   //sun
		
		g.setColor(Color.cyan);
		g.fillOval(MID-20, TOP, 40, 40);  //head
		g.fillOval(MID-35,TOP+35, 70, 50);  //upper torse
		g.fillOval(MID-50, TOP+80, 100, 60); //lower torse
		
		g.setColor(Color.black);
		g.fillOval(MID-10, TOP+10, 5, 5);  //left eye
		g.fillOval(MID+5, TOP+10, 5, 5);   //right eye
		
		g.drawArc(MID-10, TOP+10, 20, 10, 190, 160);  //smile
		g.drawLine(MID-25, TOP+60, MID-50, TOP+40);  //left arm
		g.drawLine(MID+25, TOP+60, MID+50, TOP+40);  //right arm
		
		g.drawLine(MID-20, TOP+5, MID+20, TOP+5);  //brim of hat
		g.fillOval(MID-15, TOP-20, 30, 25);        //hat
		
	}
}
