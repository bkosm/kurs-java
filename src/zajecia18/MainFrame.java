package zajecia18;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private final int WIDTH = 326;
	private final int HEIGHT = 285;
	
	public MainFrame() {
		super("Kasa fiskalna");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(WIDTH, HEIGHT);
		
		add(new MainPanel());
	}
}
