package zajecia19;

import javax.swing.JFrame;

public class PaintApp extends JFrame {
	private final int WIDTH = 720;
	private final int HEIGHT = 480;

	public PaintApp() {
		super("Easy Paint");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(WIDTH, HEIGHT);

		add(new PaintPanel());
	}
}
