import javax.swing.*;

public class TestPush {
	public static void main(String s[]) {
		JFrame jf=new JFrame("Counter");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PushPanel pp=new PushPanel();
		jf.add(pp);
		jf.pack();
		jf.setVisible(true);
	}
}
