package zajecia14;

import java.util.ArrayList;

import zajecia12.Produkt;

public class InvoiceENG extends Invoice implements InvoiceI {
	private String code;
	
	public InvoiceENG(String numer, ArrayList<Produkt> produkty, String code) {
		super(numer, produkty);
		this.code = code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
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
