package zajecia23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel implements ActionListener {

	private Frame frame;

	private JButton loginButton;
	private JTextField username;
	private JPasswordField password;
	private JLabel infoLabel;

	public LoginPanel(Frame frame) {
		this.frame = frame;

		loginButton = new JButton("Login");
		loginButton.setBounds(250, 80, 100, 30);
		loginButton.addActionListener(this);
		
		add(loginButton);

		setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
