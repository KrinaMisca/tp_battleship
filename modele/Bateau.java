package modele;

import java.lang.reflect.Array;

public class Bateau {
	private String nom;
	private int unites;
	private Array[] position;
	
	public Bateau(String nom, int unites) {
		this.nom = nom;
		this.unites = unites;
	}
}
