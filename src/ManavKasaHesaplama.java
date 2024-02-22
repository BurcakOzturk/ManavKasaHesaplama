import java.util.Scanner;
public class ManavKasaHesaplama {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		        double toplam = 0, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
				
				System.out.print("armut kaç kilo : ");
				double armutKilo = inp.nextDouble();				
				
				
				System.out.print("elma kaç kilo : ");
				double elmaKilo = inp.nextDouble();
				
				
				System.out.print("domates kaç kilo : ");
				double domatesKilo = inp.nextDouble();
				
				
				System.out.print("muz kaç kilo : ");
				double muzKilo = inp.nextDouble();
				
				System.out.print("patlıcan kaç kilo : ");
				double patlicanKilo = inp.nextDouble();
				
				toplam += (armut*armutKilo);
				toplam += (elma*elmaKilo);
				toplam += (domates*domatesKilo);
				toplam += (muz*muzKilo);
			    toplam += (patlican*patlicanKilo);
			    
			    System.out.println("Toplam Tutar :" + toplam+"TL");
		
				

	}

}
