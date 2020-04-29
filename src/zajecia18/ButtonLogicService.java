package zajecia18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonLogicService {
	private String savePath;

	public ButtonLogicService(String path) {
		savePath = path;
	}

	public String backspaceCode(String code, JLabel label) {
		if (!code.equals("")) {
			code = code.substring(0, code.length() - 1);

			if (code.equals("")) {
				label.setText("Podaj kod");
			} else {
				label.setText(code);
			}
		}

		return code;
	}

	public int plusQuantity(int quantity, JLabel label) {
		if (quantity < 10) {
			quantity++;
			label.setText(String.valueOf(quantity));
		}

		return quantity;
	}

	public int minusQuantity(int quantity, JLabel label) {
		if (quantity > 1) {
			quantity--;
			label.setText(String.valueOf(quantity));
		}

		return quantity;
	}

	public void printBill(Map<String, Integer> map) {
		StringBuilder sb = new StringBuilder();

		for (Map.Entry<String, Integer> i : map.entrySet()) {
			sb.append(i.getKey());
			sb.append(";");
			sb.append(i.getValue());
			sb.append("\n");
		}

		try (FileWriter fw = new FileWriter(savePath)) {
			fw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		map.clear();
	}

	public int findButtonNum(Object source, List<JButton> numbers) {
		int num = 0;

		for (int i = 0; i < numbers.size(); i++) {
			if (source == numbers.get(i)) {
				num = i + 1;
				break;
			}
		}
		
		if (num == 10) {
			num = 0;
		}

		return num;
	}

	public String addNumToCode(int num, String codeValue, JLabel code) {
		if (codeValue.length() < 10) {
			codeValue += String.valueOf(num);
			code.setText(codeValue);
		}
		
		return codeValue;
	}
}
