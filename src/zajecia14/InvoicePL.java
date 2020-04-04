package zajecia14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import zajecia12.Produkt;

public class InvoicePL extends Invoice implements InvoiceI {
	private final DateFormat dateformat = new SimpleDateFormat("yyyy|dd|MM HH:mm:ss");
	private int daysToPay;
	static double TRANSPORT_PRICE = 12.00;
	
	public InvoicePL(String numer, ArrayList<Produkt> produkty, int daysToPay) {
		super(numer, produkty);
		this.daysToPay = daysToPay;		
	}

	public int getDaysToPay() {
		return daysToPay;
	}

	public void setDaysToPay(int daysToPay) {
		this.daysToPay = daysToPay;
	}
	
	public void showDateToPay() {
		Date date = super.getData();
		
		System.out.println("Data początkowa:");
		System.out.println(this.dateformat.format(date));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, this.daysToPay);
		
		Date deadline = cal.getTime();
		System.out.println("Data końcowa:");
		System.out.println(this.dateformat.format(deadline));
	}
	
	@Override
	public int productNum() {
		ArrayList<Produkt> lista = super.getProdukty();
		return lista.size();
	}
	@Override
	public double totalPrice() {
		ArrayList<Produkt> lista = super.getProdukty();
		
		double suma = 0.0;
		for (Produkt p : lista) {
			suma += p.getCena();
		}
		suma += TRANSPORT_PRICE;
			
		return suma;
	}
	@Override
	public void showNames() {
		ArrayList<Produkt> lista = super.getProdukty();
		for (Produkt p : lista) {
			System.out.println(p.getNazwa());
		}
	}
}
