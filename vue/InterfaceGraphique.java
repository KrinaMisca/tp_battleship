package vue;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class InterfaceGraphique extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;



	
		public  InterfaceGraphique(String titre) {
			super("Battleship");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocation(0, 0);
			setSize(500, 500);
			
			JPanel jpanelbtn = new JPanel();
			jpanelbtn.setLayout(new GridLayout(9,9));
		
			String[] nomsBoutons = { "A1", "A2", "A3","A4","A5","A6","A7","A8","A9","B1", "B2","B3","B4","B5","B6","B7","B8","B9","C1", "C2", "C3","C4","C5","C6","C7","C8","C9","D1", "D2", "D3","D4","D5","D6","D7","D8","D9","E1", "E2", "E3","E4","E5","E6","E7","E8","E9","F1", "F2", "F3","F4","F5","F6","F7","F8","F9","G1", "G2", "G3","G4","G5","G6","G7","G8","G9","H1", "H2", "H3","H4","H5","H6","H7","H8","H9","I1", "I2", "I3","I4","I5","I6","I7","I8","I9"};
			for (String toto : nomsBoutons) {
				JButton bouton = new JButton(toto);
				bouton.addActionListener(this);
				bouton.setActionCommand(toto);
				jpanelbtn.add(bouton);
				
			}
			
			add(jpanelbtn);
			setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			
			
		
		}
		
		}
		
		 

