package garbage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 */

/**
 * @author Skylli | eg785934
 *
 */
public class LocalDateExemple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LocalDateExemple.java exec...");

		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Date et heure courante : " + currentTime);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate date1 = LocalDate.parse("1997-10-17");
		String str = date1.format(format);
		System.out.println("Date courante : " + str);
		
		LocalDate date2 = LocalDate.parse("25 09 2001", format);
		System.out.println("Date2 : " + date2);
		
		LocalDate localDate = LocalDate.now();//For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String formattedString = localDate.format(format);
		System.out.println("Date formater : " + formattedString);

	}

}
