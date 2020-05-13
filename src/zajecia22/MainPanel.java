package zajecia22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener {

	private JLabel label;
	private Info info;
	private CheckURL checkUrl;

	private JTextField textField;

	public MainPanel() {

		textField = new JTextField();
		textField.setBounds(0, 80, 250, 30);

		checkUrl = new CheckURL(info, label);
		checkUrl.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
