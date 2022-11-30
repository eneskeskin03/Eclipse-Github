package SekizinciHafta;
import java.util.Scanner;

/**
 * @author ENES
 * 14 Kas 2022
 * Main.java
 * Abstract
 * @version 0.0.0.2
 */

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		CustomerManager BasePhoneManager;

		  	System.out.println("-------------------\n-> Online Telefon Satis Sistemine Hos Geldiniz \n-------------------");
	        System.out.println("-------------------\n-> Hangi Marka Telefon Almak Istiyorsunuz? \n-------------------");
	        System.out.println("-> Samsung icin 1'i ");
	        System.out.println("-> Apple icin 2'yi ");
	        System.out.println("-> Huawei icin 3'u secebilirsiniz ");
	      
	        int secenek;
	        Scanner scanner = new Scanner(System.in);
	    	secenek = scanner.nextInt();
	    	
	    	switch(secenek){
	    	case 1 -> {
	    		System.out.println("----> Samsung Marka Telefon Modelleri Icin Yonlendiriliyorsunuz... ");
	    		CustomerManager.basePhoneManager = new SamsungPhoneManager("String","String", "String", "Sting");
	    		CustomerManager.SelectPhone();
	    	}	    	
	    	case 2 -> {
	    		System.out.println("----> Apple Marka Telefon Modelleri Icin Yonlendiriliyorsunuz... ");
	    		CustomerManager.basePhoneManager = new ApplePhoneManager("String","String", "String", "Sting");
	    		CustomerManager.SelectPhone();	    		
	    	 }
	    	case 3 -> {
	    		System.out.println("----> Huawei Marka Telefon Modelleri Icin Yonlendiriliyorsunuz... ");
	    		CustomerManager.basePhoneManager = new HuaweiPhoneManager("String","String", "String", "Sting");
	    		CustomerManager.SelectPhone();
	    	}
	    }
	}
}
