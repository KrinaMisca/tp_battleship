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

public class InterfaceStartMenu extends JFrame implements ActionListener, InterfaceGraphiqueInterface  {
	
	
			
	
	private static final long serialVersionUID = 1L;

	public  InterfaceStartMenu(String titre) {
		super("Battleship");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(0, 0);
		setSize(500, 500);
		setVisible(true);
		JPanel jpanelbtn1 = new JPanel();
		
		
		

		String[] nomsBoutons = { "Jouer contre l'IA (Computer)" , "Joueur vs Joueur","Quitter" };
		for (String toto : nomsBoutons) {
			JButton bouton = new JButton(toto);
			bouton.addActionListener(this);
			bouton.setActionCommand(toto);
			jpanelbtn1.add(bouton);
			
		}
		
		add(jpanelbtn1);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent a ) {
		JButton btn = (JButton) (a.getSource());
		
		
		if(a.getSource()==btn)
	    {
	        InterfaceGraphique ig = new InterfaceGraphique("Battleship");    
	        dispose();  
	     }
	   
		String txt = btn.getActionCommand();
		switch (txt) {
		case "Jouer contre l'IA (Computer)" :
			joueurVsComputer();
			break;
		case "Joueur vs Joueur": 
			JoueurVsJoueur();
			break;
		case "Quitter": 
		dispose();
		
		}

	}
		
	


	

	
	public void joueurVsComputer() {
		
				 
		
	}

	@Override
	public void JoueurVsJoueur() {
		
		
		InterfaceGraphique ig1 = new InterfaceGraphique("Player1");
		ig1.setLocation(400, 400);
		
		
		
		
	}

	@Override
	public void quitter() {
		// TODO Auto-generated method stub
		
	}

	
	

	


		
	}		
	



	

	
