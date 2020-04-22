package zajecia16;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Calculator {
	private final String SAVE_PATH = "./rachunki.txt";
	private final SimpleDateFormat FORMAT = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
	
	public Calculator() { }
	
	BigDecimal sumProducts(List<Product> products, Map<String, BigDecimal> prices) {
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal mul = BigDecimal.ZERO;
		
		for (Product p : products) {
			BigDecimal price = prices.get(p.getName());
			int num = p.getNum();
			
			mul = price.multiply(new BigDecimal(num));
			sum = sum.add(mul);
		}
		
		return sum;
	}
	
	public void saveResult(List<Product> products, Map<String, BigDecimal> prices) {
		BigDecimal result = this.sumProducts(products, prices);
		String date = FORMAT.format(new Date());
		String line = date + " Total: " + result.toString() + " zł\n";
		
		try (FileWriter fw = new FileWriter(SAVE_PATH, true)) {
			fw.write(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Results updated at " + date);
	}
}
