/*package Modele;

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

	public String getNom() {
		return nom;

	}

	public int getUnites() {
		return unites;

	}

	Bateau patrouille = new Bateau("bateau patrouille", 2);
	Bateau sousMarin = new Bateau("sous-marin", 3);
	Bateau destroyer = new Bateau("destroyer", 3);
	Bateau porteAvion = new Bateau("porte avion", 4);

	public void PlacerPatrouille(Bateau patrouille, ActionListener e) {
		
		getIndex();
		
		

	}

	}*/

package Modele;

import Tools.*;

import Vue.InterfaceGraphiqueBattleship;

import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class Bateau<index> extends InterfaceGraphiqueBattleship {

	private final int NBCASSES_PORTE_AVION = 4;
	private final int NBCASSES_DESTROYER = 3;
	private final int NBCASSES_SOUS_MARIN = 3;
	private final int NBCASSES_BATEAU_PATROUILLE = 3;

	private TypeDeBateau typeDeBateau;
	private int nbCaseBateau;
	private ArrayList<Integer> tabIndiceBateau;
	private int bateauVie;
	private boolean isBateauMort;
	private boolean isVertical;
	private boolean isHorizontal;

	//
	public enum TypeDeBateau {
		PORTE_AVION("porte avion"), DESTROYER("Destroyer"), SOUS_MARIN("sous marin"), BATEAU_PATROUILLE(
				"bateau patrouille");

		private String nomBateau;

		private TypeDeBateau(String boatName) {
			this.nomBateau = boatName;
		}

		@Override
		public String toString() {
			return nomBateau;
		}
	}

	/*
	 ** IMPORTANT** Il faut créer un tableau selon le nombre de case du bateau,et
	 * chaque case de ce tableau se fera randomiser un index selon les contrainte
	 * qui vont etre implanmentées plus tard,il faut donc trouver une facon de
	 * randomiser cet index la
	 */

	public Bateau(TypeDeBateau typeOfBoat) {

		this.typeDeBateau = typeOfBoat;

		switch (typeOfBoat) {

		case PORTE_AVION:

			nbCaseBateau = NBCASSES_PORTE_AVION;

			bateauVie = nbCaseBateau;
			break;
		case DESTROYER:
			nbCaseBateau = NBCASSES_DESTROYER;
			bateauVie = nbCaseBateau;
			break;
		case SOUS_MARIN:
			nbCaseBateau = NBCASSES_SOUS_MARIN;

			bateauVie = nbCaseBateau;
			break;
		case BATEAU_PATROUILLE:
			nbCaseBateau = NBCASSES_BATEAU_PATROUILLE;

			bateauVie = nbCaseBateau;
			break;
		}

		isBateauMort = false;

	}

	/*
	 * int tabIndiceBateau = getIndex();
	 * 
	 * for (int i = 0; i < this.(); i++) { tabIndiceBateau.add(-1); } }
	 */
	// getter-setter

	public TypeDeBateau getTypeDeBateau() {
		return typeDeBateau;
	}

	public boolean isVertical() {
		return isVertical;
	}

	public void setVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}

	public int getNbCaseBateau() {
		return nbCaseBateau;
	}

	public void setNbCaseBateau(int nbCaseBateau) {
		this.nbCaseBateau = nbCaseBateau;
	}

	public ArrayList<Integer> getTabIndiceBateau() {
		return tabIndiceBateau;
	}

	public void setTabIndiceBateau(ArrayList<Integer> tabIndiceBateau) {
		this.tabIndiceBateau = tabIndiceBateau;
	}

	public boolean isBateauMort() {
		return isBateauMort;
	}

	public void setBateauMort(boolean mortBateau) {
		this.isBateauMort = mortBateau;
	}

	public int getVieBateau() {
		return bateauVie;
	}

	public void setVieBateau(int vieBateau) {
		this.bateauVie = vieBateau;
	}

	public void perteVieBoat() {
		if (this.bateauVie > 0) {
			this.bateauVie -= 1;
		}
	}

	public boolean testMortBoat() {
		if (this.getVieBateau() == 0) {
			return true;
		}
		return false;
	}

}