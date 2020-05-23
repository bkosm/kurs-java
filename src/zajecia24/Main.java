package zajecia24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		example2();
	}

	static void example1() {
		Pattern p = Pattern.compile("[0-9]{3}:([A-Za-z]*).*");

		Matcher m2 = p.matcher("523:CostTamX3x234x");

		if (m2.matches()) {
			System.out.println(m2.group(1));
		}

		System.out.println(m2.matches());

		// jeśli chcemy tylko sprawdzać to:
		// lepiej
		Pattern.matches("[0-9]{3}", "123");

		// jeszcze lepiej
		String text = "123";

		if (text.matches("[0-9]{3}")) {
			System.out.println("ok");
		}
	}

	static void example2() {
		String regex = "\\{(\\s*\".*\"\\s*:\\s*((-?[1-9][0-9]*|0)(\\.[0-9]*)?|\".*\"),)*(\\s*\".*\"\\s*:\\s*((-?[1-9][0-9]*|0)(\\.[0-9]*)?|\".*\"))\\s*\\}";
		String data = "{\"glossary\": 2,\"name\" : \"Bartosz\",\"age\": 12}";
		
		System.out.println(Pattern.matches(regex, data));
		
	}

	// https://json.org/example.html
	static void example3() {
		String data1 = "-212551233253";

		if (StringValidator.isInteger(data1)) {
			System.out.println(Integer.valueOf(data1));
		} else {
			System.out.println("To nie jest prawidłowy integer");
		}

		String data2 = "-12.124";

		if (StringValidator.isDouble(data2)) {
			System.out.println(2 * Double.valueOf(data2));
		}

	}
}
