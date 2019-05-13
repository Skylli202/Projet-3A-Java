import java.time.LocalDate;

import GUI.MainWindow;

/**
 * 
 */

/**
 * @author Skylli | eg785934
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main.java exec...");
		
		MainWindow mainwindow = new MainWindow();

		Voiture voiture1 = new Voiture("BMW", "M3", "EE-001-EE", LocalDate.parse("2018-01-01"));
		Voiture voiture2 = new Voiture("Volvo", "xc70", "AA-002-AA", LocalDate.parse("2018-01-01"));
		Voiture voiture3 = new Voiture("Renault", "Twingo", "EE-003-EE", LocalDate.parse("2018-01-01"));
		System.out.println("Voiture1 : " + voiture1);
		
		ParcAutoVoiture parc1 = new ParcAutoVoiture("Skylli Garage");
		
	}

}
