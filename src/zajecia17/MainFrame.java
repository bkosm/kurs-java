package zajecia17;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("Moja ramka");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.setResizable(false);
		this.setSize(720, 480);
		this.setLocation(300, 200);
		
		this.add(new MainPanel());
	}
	
}
