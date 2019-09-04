import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class MyArray extends JPanel {
	private JLabel label;
	private JList list;
	
	public MyArray(JLabel imageLabel) {
		String picture1, picture2;
		picture1="eclipse_update_120.jpg";
		picture2="background.jpg";
		String [] fileNames= {picture1,picture2};
		list=new JList(fileNames);
		//now let us add and interface to list object
		list.addListSelectionListener(new Temp());
		this.add(list);
		this.setPreferredSize(new Dimension(400,300));
	}
	private class Temp implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent e) {
			if(list.isSelectionEmpty())
				label.setIcon(null);
			else
			{
				String fileName=(String)list.getSelectedValue();
				System.out.println(fileName);
				ImageIcon image=new ImageIcon(fileName);
				label.setIcon(image);
			}
		}
	}
}
