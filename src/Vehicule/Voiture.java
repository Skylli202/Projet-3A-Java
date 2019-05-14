package Vehicule;
import java.time.LocalDate;

/**
 * 
 */

/**
 * @author Skylli | eg785934
 *
 */
public class Voiture extends Vehicule {
	private String mMarque;
	private String mModel;
	private LocalDate mPremCirculation;
	
	public Voiture(String marque, String model, String immatriculation, LocalDate premCirculation) {
		super(immatriculation);
		this.mMarque = marque;
		this.mModel = model;
		this.mPremCirculation = premCirculation;
	}
	
	public Voiture () {
		super("AA-000-AA");
		this.mMarque = "Default";
		this.mModel =  "Default";
		this.mPremCirculation = LocalDate.now();
	}

	@Override
	public String toString() {
		return "" + mMarque + " " + mModel + " " + mImmatriculation +"";
	}
}
