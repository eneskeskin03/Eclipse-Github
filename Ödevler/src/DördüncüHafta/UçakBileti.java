package DördüncüHafta;

import java.util.Scanner;

public class UçakBileti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Uçak bilet fiyatı hesaplayan uygulama
 		 *	kullanıcıdan nereden nereye gitmek istediği bilgisini alalım
		 *	ve secenekler halinde bu opsiyonu sunalım 
		 *	5 tane seceneğimiz olsun ve ayrıca gidiş-dönüş veya tek yön seçeneğini kullanıcıdan almamız gerekiyor 
		 *	Ankara - İstanbul  (400 km )
		 *	İstanbul - Antalya ( 600 km)
		 *	Ankara - Van    (850 km)
		 *	İzmir - Gaziantep (1200 km)
		 *	Çanakkale - Tokat ( 1000km)
		 *	km başına birim fiyatı 20 TL
		 *	secilen mesafe için biletFiyati değişkenimize km*tutar hesaplanacak
		 *	eğer aşağıdaki koşulların hangisine giriyorsa indirim tutarları hesaplanacak
		 *	indirimTutari degişkeniz olacak 
  		 *	gidiş- dönüş bilet alınacak olursa ekstra %20 indirim yapılacak
  		 *	gidiş dönüş hesaplama koşuluna girerse bilet fiyatının indirimi yapıldıktan sonra 2 ile çarpılacak  
 		 *	12 yaşından küçük ise toplam fiyata % 50 indirim yapılacak
  		 *	12 - 24 yaş arası ise   % 10 indirim yapılacak
  		 *	65 yaşından büyük ise % 30 indirim yapılacak
  		 *	bu koşullarda uçak bilet fiyatı hesaplayan programı yazınız
		 * */
		
		System.out.println("Bu Program Ucak Bileti Fiyatini Hesaplamak Icindir.\n" +
						   "Ucus Secenekleri Asagida Mevcuttur. \n" +		   
						   "Lutfen Asagidaki Seceneklerden Seyehat Etmek Istediginizi Seciniz.\n" +
						   "1 = Ankara Istanbul Arasi.\n" +
						   "2 = Istanbul Antalya Arasi.\n" +
						   "3 = Ankara Van Arasi.\n" +
						   "4 = Izmir Gaziantep Arasi.\n" +
						   "5 = Canakkale Tokat Arasi.");
		
		Scanner scanner = new Scanner(System.in);
		int secenek = scanner.nextInt();
		
		while (true) {
		if (secenek < 1 || secenek > 5 ) {
			System.out.println("Hatali Giris Yaptiniz! Lutfen 1 ile 5 Arasindaki Seceneklerden Birini Seciniz.");
		secenek = scanner.nextInt();
		}break;
	}
		
		int birimFiyati, biletFiyati;
		int sonBiletFiyati;
		birimFiyati = 20;
		
		int mesafe1 = 400;
		int mesafe2 = 600;
		int mesafe3 = 850;
		int mesafe4 = 1200;
		int mesafe5 = 1000;
		
		
		if (secenek == 1) {
			biletFiyati = birimFiyati*mesafe1;
		}else if (secenek == 2) {
			biletFiyati = birimFiyati*mesafe2;
		}else if (secenek == 3) {
			biletFiyati = birimFiyati*mesafe3;
		}else if (secenek == 4) {
			biletFiyati = birimFiyati*mesafe4;
		}else  {
			biletFiyati = birimFiyati*mesafe5;
		}
			
		System.out.println("Lutfen Asagidaki Ucus Seceneklerinden Birini Seciniz.\n" +
				   "1 = Tek Yon Gidis.\n" +
				   "2 = Gidis - Donus.(%20 Indirimli)");
		Scanner scanner1 = new Scanner(System.in);
		int gidisDonus = scanner1.nextInt();
		while (true) {
		if (gidisDonus < 1 || gidisDonus > 2 ) {
			System.out.println("Hatali Giris Yaptiniz! Lutfen 1 ile 2 Arasindaki Seceneklerden Birini Seciniz.");
			gidisDonus = scanner1.nextInt();
			}break;
		}
				
		System.out.println("Lutfen Yasinizi Giriniz" );
		Scanner scanner2 = new Scanner(System.in);
		int yas = scanner2.nextInt(); 
		
		if (gidisDonus == 2) {
			System.out.println("Bilet Fiyati:" + biletFiyati);
			System.out.println("Gidis Donus Bilet Fiyati:" + biletFiyati*2);
			sonBiletFiyati = (int) ((biletFiyati*0.8)*2);
		System.out.println("%20 Indirimli Bilet Fiyati:" + sonBiletFiyati);
		
		if (yas < 12 && yas >= 0) {
			int sonBiletFiyati1 = (int) (sonBiletFiyati*0.50);
			System.out.println("%20 + &50 Indirimli Bilet Fiyati:" + sonBiletFiyati1 );
		}else if (yas <= 24) {
			 int sonBiletFiyati2 = (int) (sonBiletFiyati*0.90);
			 System.out.println("%20 + &10 Indirimli Bilet Fiyati:" + sonBiletFiyati2 );
		}else if (yas >= 65) {
			 int sonBiletFiyati3 = (int) (sonBiletFiyati*0.70);
			 System.out.println("%20 + &30 Indirimli Bilet Fiyati:" + sonBiletFiyati3 );
		}
	}
		else {
			System.out.println("Bilet Fiyati:" + biletFiyati);
		
			if (yas < 12 && yas >= 0) {
				int biletFiyati1 = (int) (biletFiyati *0.50);
				System.out.println("&50 Indirimli Bilet Fiyati:" + biletFiyati1 );
			}else if (yas <= 24) {
				int biletFiyati2 = (int) (biletFiyati *0.90);
				System.out.println("&10 Indirimli Bilet Fiyati:" + biletFiyati2 );
			}else if (yas >= 65) {
				int biletFiyati3 = (int) (biletFiyati *0.70);
				System.out.println("&30 Indirimli Bilet Fiyati:" + biletFiyati3);
			}
		}
	}
}
