package zajecia24;

public class StringValidator {

	static boolean isInteger(String text) {
		if (text.matches("^(-?[1-9][0-9]*|0)$")) {
			
			try {
				Integer.valueOf(text);
				return true;
				
			} catch (NumberFormatException e) {
				return false;
			}
			
		}
		
		return false;
	}
	
	static boolean isDouble(String text) {
		return text.matches("^(-?[1-9][0-9]*|0)\\.[0-9]*$");
	}
	
	static boolean isJSON(String text) {
		return false;
	}
}
