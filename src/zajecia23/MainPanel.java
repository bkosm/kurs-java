package zajecia23;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private Frame frame;

	private JLabel label;

	public MainPanel(Frame frame) {
		this.frame = frame;

		label = new JLabel("MainPanel");
		label.setBounds(0, 0, 200, 200);
		
		add(label);

		setLayout(null);
	}
}
