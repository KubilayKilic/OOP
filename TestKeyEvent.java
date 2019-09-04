import javax.swing.*;
import java.awt.*;
public class TestKeyEvent {

	public static void main(String s[])
	{
		JFrame jf=new JFrame("Testing key events");
		
		jf.setSize(400, 300);
		DirectionPanel dp=new DirectionPanel();
		jf.add(dp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
