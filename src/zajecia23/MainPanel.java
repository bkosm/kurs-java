package zajecia23;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private Frame frame;

	private JLabel label;

	public MainPanel(Frame frame) {
		this.frame = frame;

		label = new JLabel("Welcome");
		label.setBounds(0, 0, 600, 400);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		label.setFont(new Font("Arial", Font.PLAIN, 40));
		
		add(label);

		setLayout(null);
	}
}
