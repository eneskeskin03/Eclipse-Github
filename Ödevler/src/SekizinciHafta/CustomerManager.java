package SekizinciHafta;
import java.util.Scanner;

/**
 * @author ENES
 * 14 Kas 2022
 * CustomerManager.java
 * Abstract
 * @version 0.0.0.2
 */

public class CustomerManager {

	static BasePhoneManager basePhoneManager; 	

	public static void SelectPhone() {
		int whichPhone;
		Scanner scanner = new Scanner(System.in);
	    whichPhone = scanner.nextInt();
		
		switch(whichPhone) {
		
		case 1 -> {
			basePhoneManager.phone1();
		}
		case 2 -> {		
			basePhoneManager.phone2();	
		}
		case 3 -> {
			basePhoneManager.phone3();
		}
		default -> System.out.println("Hatali Giris Yaptiniz! Lutfen Seceneklerden Birini Seciniz.");
		}
	}	
}
