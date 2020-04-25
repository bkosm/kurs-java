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
		buttonService = new ButtonLogicService();

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
		
		setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
