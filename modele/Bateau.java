package modele;

import java.lang.reflect.Array;

public class Bateau {
	private String nom;
	private int unites;
	private Array[] position;
	
	public Bateau(String nom, int unites) {
		Bateau bateau1 = new Bateau("bateau patrouille", 2);
		Bateau bateau2 = new Bateau("sous-marin", 3);
		Bateau bateau3 = new Bateau("destroyer", 3);
		Bateau bateau4 = new Bateau("porte avion", 4);
	}
}
