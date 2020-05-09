package zajecia21;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	final private int WIDTH = 250;
	final private int HEIGHT = 150;

	public MainFrame() {
		super("Stoper");
		
		add(new MainPanel());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(WIDTH, HEIGHT);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width / 2 - WIDTH /2, screenSize.height / 2 - HEIGHT / 2);
	}
	
}
