import javax.swing.*;

public class TestSlider {
	public static void main(String s[])
	{
		JFrame jf=new JFrame("Coloring Panel");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane();
		SliderColorPanel scp=new SliderColorPanel();
		jf.add(scp);
		
		jf.pack();
		jf.setVisible(true);
	}
}
