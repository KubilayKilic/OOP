import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderColorPanel extends JPanel {
	private JPanel controls, colorPanel;
	private JSlider rs,gs,bs;
	private JLabel rl,gl,bl;
	
	public SliderColorPanel() //This is our constructor function
	{
	  //we initially set all private members 	
		rs=new JSlider(JSlider.HORIZONTAL,0,255,0);
		rs.setMajorTickSpacing(50);
		rs.setMinorTickSpacing(10);
		rs.setPaintTicks(true);
		rs.setPaintLabels(true);
		rs.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		gs=new JSlider(JSlider.HORIZONTAL,0,255,0);
		gs.setMajorTickSpacing(50);
		gs.setMinorTickSpacing(10);
		gs.setPaintTicks(true);
		gs.setPaintLabels(true);
		gs.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		bs=new JSlider(JSlider.HORIZONTAL,0,255,0);
		bs.setMajorTickSpacing(50);
		bs.setMinorTickSpacing(10);
		bs.setPaintTicks(true);
		bs.setPaintLabels(true);
		bs.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		//now let us create label members
		rl=new JLabel("Red:     0");
		rl.setAlignmentX(Component.LEFT_ALIGNMENT);
		gl=new JLabel("Green:     0");
		gl.setAlignmentX(Component.LEFT_ALIGNMENT);
		bl=new JLabel("Blue:     0");
		bl.setAlignmentX(Component.LEFT_ALIGNMENT);
	//we first write our private class as interface	
		SliderListener listener=new SliderListener();
	//later this interface to be added onto each slider member	
		rs.addChangeListener(listener);
		gs.addChangeListener(listener);
		bs.addChangeListener(listener);
		
	//now let us create panel objects
		controls=new JPanel();
		BoxLayout layout =new BoxLayout(controls,BoxLayout.X_AXIS);
		controls.setLayout(layout);
		controls.add(rl); controls.add(rs);
		controls.add(Box.createRigidArea(new Dimension(0,20)));
		
		controls.add(gl); controls.add(gs);
		controls.add(Box.createRigidArea(new Dimension(0,20)));
		
		controls.add(bl); controls.add(bs);
		controls.add(Box.createRigidArea(new Dimension(0,20)));
		
		colorPanel=new JPanel();
		colorPanel.setPreferredSize(new Dimension(100,100));
		colorPanel.setBackground(new Color(0,0,0));
		
		//now finally we should add all controls onto the main panel
		add(controls); add(colorPanel);
	}
    private class SliderListener implements ChangeListener
    {
    	private int red,green,blue;  //values taken from the sliders
    	public void stateChanged(ChangeEvent e)
    	{
    		red=rs.getValue();
    		green=gs.getValue();
    		blue=bs.getValue();
    		
    		rl.setText("Red:      "+red);
    		gl.setText("Green:     "+green);
    		bl.setText("Blue:      "+blue);
    		colorPanel.setBackground(new Color(red,green,blue));
    	}
    }
    
}
