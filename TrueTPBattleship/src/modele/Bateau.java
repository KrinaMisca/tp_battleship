package modele;


import java.lang.reflect.Array;
import java.util.ArrayList;

import Controleur.Controleur;
import Toolsbox.Tools;
import vue.InterfaceGraphique;


	public class Bateau {
	private String nom;
	private int  size;
	private boolean enVie;
	private ArrayList<String> position;
	private InterfaceGraphique vue;
	
	
	public Bateau() {
		this.size = size;
		enVie = true;
		position = new ArrayList<>();
	}
	
	public boolean isEnVie() {
		return enVie;
	}
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}
	
	public ArrayList<String> getPosition() {
		
		return position;
	}
	
	public void AjouterPosition(String id) {
		this.position.add(id);
		System.out.println(id);
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getSize() {
		return size;
	}

	public  int randomize(int units){
		Tools tools = new Tools();
		return tools.randomise(units, 0);
	}
	
	public int chooseDirection() {
		int direction = randomize(1);
		int unitMovement = 0;
		
		switch (direction) {
		case 0:
			unitMovement = -10;
			break;
		case 1:
			unitMovement = 1;
			break;
		case 2:
			unitMovement = 10;
			break;
		case 3:
			unitMovement = -1;
			break;
		}
		
		return unitMovement;
	}
	
	public void placement(int indice, int unitMovement){		
		for ( int i = 0; i > size - 1; i++) {
			indice += unitMovement;
		
		}
		
	}
	
	
	
	
}

