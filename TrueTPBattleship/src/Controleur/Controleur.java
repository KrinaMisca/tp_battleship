package Controleur;

import java.awt.Color;

import javax.swing.JButton;

import modele.Bateau;
import vue.InterfaceGraphique;

public class Controleur {

	private InterfaceGraphique vue;

	private Bateau bateau;
	private Bateau patrouille;
	

	
	

	public void setVue(InterfaceGraphique vue) {
		this.vue = vue;
	}

	public void setBateau(Bateau bateau) {
		this.bateau = bateau;
	
	}
	public void setPatrouille(Bateau patrouille) {
		this.patrouille = patrouille;
	}

	

	public String retournerIndice(int i) {
		String temps = vue.getNomsBoutons()[i];

		return temps;
	}

	public void actionBateau() {
		JButton btn = vue.getButton();
		String test = btn.getActionCommand();

		for (String tst : bateau.getPosition()) {
			if (tst.equals(test)) {
				btn.setBackground(Color.RED);
			}
			else {
				btn.setBackground(Color.BLUE);
			}
		
		}
		
	}
	public void actionPatrouille() {
		JButton btn = vue.getButton();
		String test = btn.getActionCommand();

		for (String tst1 : patrouille.getPosition()) {
			if (tst1.equals(test)) {
				btn.setBackground(Color.RED);
			}
			else {
				btn.setBackground(Color.BLUE);
			}
		
		}
		
	}

}

