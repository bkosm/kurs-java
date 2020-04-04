package zajecia14;

import java.util.ArrayList;

import zajecia12.Produkt;

public class Main {

	public static void main(String[] args) {

		Prostokat p1 = new Prostokat(10.0, 4.0);
		Trojkat t1 = new Trojkat(1.0, 4.0, 4.0);
		Kwadrat k1 = new Kwadrat(12.2);
		
		System.out.println(p1.pole());
		System.out.println(p1.obwod());
		
		System.out.println(t1.pole());
		System.out.println(t1.obwod());
		
		System.out.println(k1.pole());
		System.out.println(k1.obwod());
		
	}
	
	public static void przyklad1() {
		ArrayList<Produkt> produkty = new ArrayList<Produkt>();
		produkty.add(new Produkt("chleb", 2.0));
		produkty.add(new Produkt("mleko", 3.0));

		Invoice faktura1 = new InvoicePL("1", produkty, 20);
		Invoice faktura2 = new InvoiceENG("21", produkty, "xxx");
		
		System.out.println(faktura1.totalPrice());
		System.out.println(faktura2.totalPrice());

		System.out.println("ok");
	}

}
