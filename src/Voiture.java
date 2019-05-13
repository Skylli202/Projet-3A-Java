import java.time.LocalDate;

/**
 * 
 */

/**
 * @author Skylli | eg785934
 *
 */
public class Voiture {
	private String mMarque;
	private String mModel;
	private String mImmatriculation;
	private LocalDate mPremCirculation;
	
	public Voiture(String marque, String model, String immatriculation, LocalDate premCirculation) {
		super();
		this.mMarque = marque;
		this.mModel = model;
		this.mImmatriculation = immatriculation;
		this.mPremCirculation = premCirculation;
	}

	@Override
	public String toString() {
		return "" + mMarque + " " + mModel + " " + mImmatriculation +"";
////				"Marque : " + mMarque + ", Model : " + mModel + ", Immatriculation : " + mImmatriculation
//				+ ", PremCirculation : " + mPremCirculation + ".";
	}
}
