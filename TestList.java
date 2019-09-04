import javax.swing.*;
import java.awt.*;

public class TestList {
	public static void main(String a[]) {
		JFrame jf=new JFrame("Selecting Picture");
		jf.setPreferredSize(new Dimension(500,300));
		
		JLabel imageLabel=new JLabel();
		JPanel imagePanel=new JPanel();
		
		imagePanel.add(imageLabel);
		imagePanel.setBackground(Color.CYAN);
		
		MyArray ma=new MyArray(imageLabel);
		JSplitPane jps=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,ma,imagePanel);
		
		jf.getContentPane().add(jps);
		jf.pack();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
