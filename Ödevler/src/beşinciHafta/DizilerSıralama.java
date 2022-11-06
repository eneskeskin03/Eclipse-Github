package beşinciHafta;

import java.util.Scanner;

public class DizilerSıralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bu Program Kullanicidan Alinan Sayilari Siralamak Icindir.\n" +
										    "Lutfen 10 Adet Sayi Giriniz.");
		Scanner scan = new Scanner(System.in);
		
		int gecici;
		int [] dizi = new int [10];
		
		for (int i=0;  i<10; i++) {
			 System.out.println("Lutfen " + (i+1) + ". Sayiyi Giriniz.");
			 dizi[i] = scan.nextInt();
			 for (int k=0; k<i; k++) {
				 while (dizi[i] == dizi[k]) {	
					 System.out.println("Daha Once Girdiginiz Sayinin Aynisini Girdiniz Lutfen " + (i+1) + ". Sayiyi Tekrar Giriniz."); 
					 dizi[i] = scan.nextInt();	 
				 }
			 }
		}
		
		 System.out.println("Girilen Sayilarin Kucukten Buyuge Siralamasi Su Sekildedir:");
		for (int i=0; i<9; i++) {
			for (int j=i+1; j<10; j++) {
				if (dizi[j] < dizi[i]) {
					gecici = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = gecici;
				}
			}
		}
		for (int i=0; i<10; i++) {
			 System.out.println("Girilen " + (i+1) + ". Sayi:" + dizi[i]);
													
		}
	}
}





