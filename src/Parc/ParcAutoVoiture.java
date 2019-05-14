package Parc;
import java.util.ArrayList;

import Vehicule.Voiture;

/**
 * 
 */

/**
 * @author Skylli | eg785934
 *
 */
public class ParcAutoVoiture {
	private ArrayList<Voiture> listVoiture = new ArrayList();
	private String nom;
	// Ajout d'un historique
	
	public ParcAutoVoiture(String nom) {
		this.nom = nom;
	}
	
	public void ajoutVoiture(Voiture v) {
		this.listVoiture.add(v);
	}
	
	public void retraitVoiture(Voiture v) {
		this.listVoiture.remove(v);
	}
	
	public boolean contains(Voiture v) {
		return listVoiture.contains(v);
	}
}
