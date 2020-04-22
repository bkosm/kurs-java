package zajecia16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductLoader {
	private final String PRODUCT_PATH = "./produkty.txt";
	private final String PRICE_PATH = "./ceny.txt";
	
	public ProductLoader() { }
	
	public List<Product> loadProducts() {
		List<Product> products = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(PRODUCT_PATH))) {
			
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] temp = line.split(";");
				String name = temp[0];
				int num = Integer.parseInt(temp[1]);
				
				products.add(new Product(name, num));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	public Map<String, BigDecimal> loadPrices() {
		Map<String, BigDecimal> prices = new HashMap<String, BigDecimal>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(PRICE_PATH))) {
			
			String line = "";
			while((line = br.readLine()) != null) {
				String[] temp = line.split(";");
				String name = temp[0];
				BigDecimal price = new BigDecimal(temp[1]);
				
				prices.put(name, price);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return prices;
	}
}
