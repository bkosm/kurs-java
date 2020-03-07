package zajecia13;

import java.util.List;

public class ClientPL extends Client {
	public List<InvoicePL> invoices;
	
	public ClientPL(String surname, List<InvoicePL> list) {
		super(surname);
		this.invoices = list;
	}
	
	@Override
	public String getSurname() {
		return "PL_" + super.getSurname();
	}

	public List<InvoicePL> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<InvoicePL> invoices) {
		this.invoices = invoices;
	}
	
	public String vindicate() {
		return "Klient: " + this.getSurname() + ", ilość faktur: " + invoices.size();
	}
}
