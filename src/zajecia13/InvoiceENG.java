package zajecia13;

import java.util.ArrayList;

import zajecia12.Produkt;

public class InvoiceENG extends Invoice {
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
}
