package zajecia18;

import java.util.Map;

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
		//String += "ok"; 
	}
}
