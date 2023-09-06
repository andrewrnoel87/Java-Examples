import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {
	
	JFrame frame;                                                 // frame is going to be of type JFrame
	JLabel label;                                                 // label is going to be of type JLabel
	
	public static void main (String[] args) {
		TwoButtons gui = new TwoButtons ();                       // make a new TwoButtons object called gui
		gui.go();                                                 // do the go() method on the gui object
	} // close main
	
	public void go() {                                            // start defining the go() method
		frame = new JFrame();                                     // make a new JFrame called frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // stop running when the window is closed
		
		JButton labelButton = new JButton("Change Label");        // make a new JButton called labelButton
		labelButton.addActionListener(new LabelListener());       // attach ActionListener "LabelListener" to labelButton
		
		JButton colorButton = new JButton("Change Circle");       // make a new JButton called colorButton
		colorButton.addActionListener(new ColorListener());       // attach ActionListener "ColorListener" to colorButton
		
		label = new JLabel("I'm a label");                            // make a new JLabel called label
		MyDrawPanel drawPanel = new MyDrawPanel();                    // make a new MyDrawPanel called drawPanel
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);  // Adding our widgets to the frame
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);   //
		frame.getContentPane().add(BorderLayout.EAST, labelButton);   //
		frame.getContentPane().add(BorderLayout.WEST, label);         //  
		
		frame.setSize(300,300);                                       // set frame size to 300pixel x 300pixel
		frame.setVisible(true);                                       // make frame visible
		
	}                                                                 // close go()
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Ouch! ");                                  // do this on label when an action event is created
		}
	}                                                                // close inner class LabelListener
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();                                         // do this on frame when an action event is created
		}
	}                                                                // close inner class ColorListener
}                                                                    // close outer class TwoButtons