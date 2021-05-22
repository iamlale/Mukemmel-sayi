import java.util.Scanner;
public class mukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int sayi=input.nextInt();
		int sum=0;
		
		
		for (int i=1; i<sayi; i++) {
			if (sayi%i==0) {
				sum+=i;
			}
		}
		if (sum==sayi) {
			System.out.println("mukkkkemmel bir sayi");
		}
		else {
			System.out.println("uzgunum mukemmel bir sayi degilsin..");
		}

	}

}
