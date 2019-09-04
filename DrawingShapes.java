import javax.swing.*;
import java.awt.*;
/*
 * Applets are client side java programs which may be uploaded by browsers. Usually they
 * are used for drawing, and some paying games purposes. They have 4 functions as init(),
 *  start(),run(), paint(). Any one of them is enough to run the applet. Applets can be
 *  uploaded inside an HTML file with applet tag.
 *  <HTML>
 *    <HEAD>
 *      <Applet code="DrawingShapes.class">
 *      </Applet>
 *     </Head>
 *    </HTML>
 */
public class DrawingShapes extends JApplet {
  public void paint(Graphics g){
	  g.setColor(Color.blue);
	  g.drawLine(0, 0, 200, 150);
	  
	  g.setColor(Color.red);
	  g.drawRect(0, 0, 300, 250);
	  
	  g.setColor(Color.GREEN);
	  g.drawOval(200, 200, 300, 300);
  }
}
