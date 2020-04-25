package zajecia18;

import javax.swing.JLabel;

public class ButtonLogicService {

	public ButtonLogicService() { }

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
}
