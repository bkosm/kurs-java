package zajecia23;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {

	final private int WIDTH = 600;
	final private int HEIGHT = 400;
	
	private JPanel loginPanel;
	private JPanel mainPanel;

	public Frame() {
		super("Login Screen");
		
		loginPanel = new LoginPanel(this);
		mainPanel = new MainPanel(this);
		
		loginPanel.setVisible(true);
		mainPanel.setVisible(true);
		
		add(loginPanel);
		add(mainPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(WIDTH, HEIGHT);
	}
	
	public void switchToMainPanel() {
		loginPanel.setVisible(false);
		mainPanel.setVisible(true);
	}

}
