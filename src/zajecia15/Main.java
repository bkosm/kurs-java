package zajecia15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		domowe1();
	}

	public static void przyklad1() {
		String path = "./baza.txt";
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(path));
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku!");

		} catch (IOException e) {
			System.out.println("Błąd operacji we-wy!");

		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Błąd operacji we-wy przy zamykaniu!");
				}
			}
		}
	}

	public static void przyklad2() {
		String path = "./baza.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void przyklad3() {
		String path = "./tekst2.txt";
		String text = "test1\n\ttest2\n";

		try {
			FileWriter fw = new FileWriter(path);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void zadanie1() {
		String readPath = "./baza.txt";
		String savePath = "./zapis.txt";

		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("678566");
		numbers.add("345674");

		ArrayList<String> names = new ArrayList<>();

		/* odczyt */
		try {
			BufferedReader br = new BufferedReader(new FileReader(readPath));
			String line = "";

			while ((line = br.readLine()) != null) {
				String[] record = line.split(";");
				String name = record[0];
				String number = record[1];

				if (numbers.contains(number)) {
					names.add(name);
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/* zapis */
		try {
			FileWriter fw = new FileWriter(savePath);

			for (String name : names) {
				fw.write(name + "\n");
			}

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void domowe1() {
		String readPath = "./baza.txt";
		String savePath = "./domowe.txt";

		String numbersToSearch = "22";

		try {
			FileReader fr = new FileReader(readPath);
			FileWriter fw = new FileWriter(savePath);

			int character = 0;

			while (character != -1) {
				String line = "";
				boolean isOk = true;
				boolean isOver = false;

				while ((character = fr.read()) != '\n') {
					line += (char) character;
					if (character == -1) {
						isOver = true;
						break;
					}
				}

				if (!isOver) {
					String[] record = line.split(";");

					for (int i = 0; i < numbersToSearch.length(); i++) {
						if (numbersToSearch.charAt(i) != record[1].charAt(i)) {
							isOk = false;
							break;
						}
					}

					if (isOk) {
						fw.write("nazwisko: " + record[0] + ", numer: " + record[1] + "\n");
					}
				}
			}

			System.out.println("Zrobione!");

			fr.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}