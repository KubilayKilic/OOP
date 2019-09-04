import javax.swing.*;
import java.awt.*;
public class TestMouseAdapter {
    public static void main(String s[])
    {
    	JFrame jf=new JFrame("Using Adapter");
    	jf.setSize(400, 300);
    	jf.setBackground(Color.yellow);
    	
    	//now let us create an object of ConnectLine class
    	ConnectLine cl=new ConnectLine();
    	jf.add(cl);
    	
    	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jf.setVisible(true);
    }
}
