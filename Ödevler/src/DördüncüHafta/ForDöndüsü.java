package DördüncüHafta;

import java.util.Scanner;

public class ForDöndüsü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, j, sayi;
		
		System.out.println("Ucgenin Satir Sayisini Giriniz:");
		Scanner scanner = new Scanner(System.in);
		sayi = scanner.nextInt();
		int yildiz=1;
		for (i=0; i<sayi; i++) {
			for(j=0; j<yildiz; j++) {
				System.out.print("* ");
			}
		System.out.println("");
		yildiz++;
		}
	}

}
