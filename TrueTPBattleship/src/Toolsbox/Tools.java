package Toolsbox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tools {
	
	public int randomise(int max, int min)
	{
		int valRand = Math.round((float) Math.random() * max) + min;
		return valRand;
	}
	
	public JPanel createTextField(String labelValue,int textFieldSize)
	{
		JPanel panel = new JPanel();
		JLabel nom1 = new JLabel(labelValue);
		JTextField jTextField = new JTextField(textFieldSize);
		
		panel.add(nom1);
		panel.add(jTextField);
		
		return panel;
	}
	
	public JFrame createFrame(String titre,int locationX,int locationY,int sizeX,int sizeY)
	{
		JFrame frame = new JFrame(titre);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(locationX,locationY);
		frame.setSize(sizeX,sizeY);
		
		frame.setVisible(true);
		return frame;
	}
}
