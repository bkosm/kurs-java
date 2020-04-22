package zajecia16;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		ProductLoader pl = new ProductLoader();
		
		List<Product> products = pl.loadProducts();
		Map<String, BigDecimal> prices = pl.loadPrices();
		
		Calculator c = new Calculator();
		c.saveResult(products, prices);
	}

}
