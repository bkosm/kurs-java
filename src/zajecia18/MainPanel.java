package zajecia18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener {

	private List<JButton> numbers;
	private JButton plus;
	private JButton minus;
	private JButton backspace;
	private JButton clean;
	private JButton add;
	private JButton print;

	private String codeValue;
	private int quantityValue;

	private JLabel quantity;
	private JLabel code;

	private ButtonLogicService buttonService;
	private Map<String, Integer> map;

	public MainPanel() {
		codeValue = "";
		quantityValue = 1;
		buttonService = new ButtonLogicService("./bill.txt");

		map = new LinkedHashMap<>();
		numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int number = i + 1;
			int positionX = 0;
			int positionY = 0;
			String text = String.valueOf(number);

			if (i < 3) {
				positionX = i * 65;
				positionY = 60;

			} else if (i < 6) {
				int k = i - 3;
				positionX = k * 65;
				positionY = 110;

			} else if (i < 9) {
				int k = i - 6;
				positionX = k * 65;
				positionY = 160;

			} else {
				positionX = 0;
				positionY = 210;
				text = "0";
			}

			JButton button = new JButton(text);
			button.addActionListener(this);
			button.setBounds(positionX, positionY, 60, 40);

			numbers.add(button);
			this.add(button);
		}

		clean = new JButton("Clean");
		clean.setBounds(65, 210, 80, 40);
		clean.addActionListener(this);

		backspace = new JButton("Backspace");
		backspace.setBounds(150, 210, 170, 40);
		backspace.addActionListener(this);

		plus = new JButton("+");
		plus.setBounds(195, 60, 60, 40);
		plus.addActionListener(this);

		minus = new JButton("-");
		minus.setBounds(260, 60, 60, 40);
		minus.addActionListener(this);

		add = new JButton("Add");
		add.setBounds(195, 110, 125, 40);
		add.addActionListener(this);

		print = new JButton("Print");
		print.setBounds(195, 160, 125, 40);
		print.addActionListener(this);

		code = new JLabel("Podaj kod");
		code.setBounds(0, 0, 100, 30);

		quantity = new JLabel(String.valueOf(quantityValue));
		quantity.setBounds(255, 0, 100, 30);

		add(clean);
		add(backspace);
		add(plus);
		add(minus);
		add(add);
		add(print);
		add(code);
		add(quantity);

		setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == clean) {
			cleanCode();

		} else if (source == backspace) {
			codeValue = buttonService.backspaceCode(codeValue, code);

		} else if (source == plus) {
			quantityValue = buttonService.plusQuantity(quantityValue, quantity);

		} else if (source == minus) {
			quantityValue = buttonService.minusQuantity(quantityValue, quantity);

		} else if (source == add) {
			addCodeToMap();

		} else if (source == print) {
			buttonService.printBill(map);
			
			cleanCode();
			cleanQuantity();
			
		} else {
			/* przycisk musi być jedną z cyfr */
			
		}
	}

	private void cleanCode() {
		code.setText("Podaj kod");
		codeValue = "";
	}

	private void cleanQuantity() {
		quantityValue = 1;
		quantity.setText("1");
	}

	private void addCodeToMap() {
		map.put(codeValue, quantityValue);
		cleanCode();
		cleanQuantity();
	}
}
