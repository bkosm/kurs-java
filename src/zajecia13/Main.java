package zajecia13;

import java.util.ArrayList;

import zajecia12.Produkt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("13");
		test();
	}

	public static void test() {
		Produkt p1 = new Produkt("Mleko", 1.99);
		Produkt p2 = new Produkt("Jajka", 2.49);
		Produkt p3 = new Produkt("Masło", 4.99);
		Produkt p4 = new Produkt("Chleb", 3.15);

		ArrayList<Produkt> lista1 = new ArrayList<>();
		lista1.add(p1);
		lista1.add(p2);

		ArrayList<Produkt> lista2 = new ArrayList<>();
		lista2.add(p3);
		lista2.add(p4);

		ArrayList<Produkt> lista3 = new ArrayList<>();
		lista3.add(p1);
		lista3.add(p3);
		lista3.add(p4);

		Invoice f1 = new Invoice("1/2020", lista2);
		InvoicePL f2 = new InvoicePL("2/2020", lista1, 9);
		f2.showDateToPay();

		ArrayList<InvoicePL> invoicesPL = new ArrayList<>();
		invoicesPL.add(f2);
		invoicesPL.add(f2);
		invoicesPL.add(f2);
		
		ClientPL clientpl = new ClientPL("Kosmala", invoicesPL);
		System.out.println(clientpl.vindicate());
	}

}