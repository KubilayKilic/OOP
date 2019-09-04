import javax.swing.*;

public class TestRebound {
	public static void main(String a[])
	{
		JFrame jf=new JFrame("Rebounding an Object");
		
		jf.add(new ReboundPanel());
		jf.pack();
		jf.setVisible(true);
		
	}
}
