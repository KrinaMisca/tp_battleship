package Principale;

import javax.swing.JPanel;

import Controleur.Controleur;
import modele.Bateau;
import vue.InterfaceGraphique;
import vue.InterfaceGraphiqueInterface;
import vue.InterfaceStartMenu;

public class Principale {
	public static void main(String[] args) {

		new InterfaceStartMenu("Battleship");

		InterfaceGraphique ig = new InterfaceGraphique("Battleship");
		Bateau b = new Bateau();
		Bateau p = new Bateau();
		
		
	
		Controleur c = new Controleur();

		


		c.setVue(ig);
		c.setBateau(b);
		c.setPatrouille(p);
		
	

		ig.setControleur(c);

		b.AjouterPosition(c.retournerIndice(b.randomize(99)));
		p.AjouterPosition(c.retournerIndice(p.randomize(99)));
		
		
		
		
		
	

	}

}
