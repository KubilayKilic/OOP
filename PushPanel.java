import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PushPanel extends JPanel {
   private int count;
   private JButton jb1;
   private JLabel jl1;
   
   public PushPanel()
   {
	   count=0;
	   jb1=new JButton("Click me");
	   jl1=new JLabel("-----");
	   jb1.addActionListener(new myTemp());
	   this.add(jb1);
	   add(jl1);
	   this.setPreferredSize(new Dimension(250,200));
	   this.setBackground(Color.yellow);
   }
   private class myTemp implements ActionListener{
         public void actionPerformed(ActionEvent a) {
	         count++;
	         jl1.setText(count+" Puhes");
   }
   
}
}