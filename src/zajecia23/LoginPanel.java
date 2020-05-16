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

	private Auth auth;
	
	public LoginPanel(Frame frame) {
		this.frame = frame;

		loginButton = new JButton("Login");
		loginButton.setBounds(250, 100, 100, 30);
		loginButton.addActionListener(this);

		username = new JTextField();
		username.setBounds(175, 20, 250, 30);

		password = new JPasswordField();
		password.setBounds(175, 60, 250, 30);

		infoLabel = new JLabel("");
		infoLabel.setBounds(100, 140, 400, 30);
		infoLabel.setHorizontalAlignment(JLabel.CENTER);

		add(loginButton);
		add(username);
		add(password);
		add(infoLabel);

		setLayout(null);
		
		auth = new Auth();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == loginButton) {
			char[] pass = password.getPassword();
			
			String userField = username.getText();
			String passField = String.valueOf(pass);
			
			AuthStatus status = auth.verify(userField, passField);
			
			if (status == AuthStatus.SUCCESS) {
				frame.switchToMainPanel();
			} else {
				infoLabel.setText(status.getMessage());
			}
		}
	}
}
