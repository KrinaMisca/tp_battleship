package Modele;
import java.awt.Color;
import java.lang.reflect.Array;
import java.util.EventObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

import Vue.InterfaceGraphiqueBattleship;

public class Bateau extends InterfaceGraphiqueBattleship {
	private String nom;
	private int unites;
	private boolean enVie;
	 
	
	
	public Bateau(String nom, int unites) {
		this.nom = nom;
		this.unites = unites;
		enVie = true;
		
	}
	
	public boolean isEnVie() {
		return enVie;
		
	}
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
		
	}
	public int getPositionX(int PositionX) {
		return PositionX;
		
	}
public int getPositionY(int PositionY) {
		return PositionY;
	}
	
	public String getNom() {
		return nom;
	}
	public int getUnites() {
		return unites;
	}

	
	public void PlacerPatrouille(Bateau patrouille,ActionListener e) {
		 
         ((JButton)((EventObject) e).getSource()).setBackground(Color.blue);
		
		
		
		
		
	}
	Bateau patrouille = new Bateau("bateau patrouille", 2);
	Bateau sousMarin = new Bateau("sous-marin", 3 );
	Bateau destroyer = new Bateau("destroyer", 3);
	Bateau porteAvion = new Bateau("porte avion", 4);
}