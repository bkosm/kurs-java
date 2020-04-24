package zajecia17;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayerFrame extends JFrame implements ActionListener {
	private final int MAX_INDEX = 9;
	private final int WIDTH = 335;
	private final int HEIGHT = 105;

	private JButton plus;
	private JButton minus;
	private JButton check;

	private JLabel index;
	private JLabel score;

	private PlayerData playerData;
	private int currentIndex;

	public PlayerFrame() {
		super("Check score at index");

		/* ustawienia okna */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setVisible(true);
		setLayout(null);

		/* tworzenie przycisków i pól tekstowych */
		plus = new JButton("Plus");
		plus.setBounds(5, 5, 100, 30);
		plus.addActionListener(this);

		minus = new JButton("Minus");
		minus.setBounds(5, 40, 100, 30);
		minus.addActionListener(this);

		check = new JButton("Check");
		check.setBounds(200, 5, 100, 30);
		check.addActionListener(this);

		index = new JLabel("0");
		index.setBounds(110, 5, 100, 30);

		score = new JLabel("none");
		score.setBounds(305, 5, 100, 30);

		add(plus);
		add(minus);
		add(check);

		add(index);
		add(score);

		/* inicjalizacja potrzebnych zmiennych */
		playerData = new PlayerData();
		currentIndex = 0;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == plus && currentIndex != MAX_INDEX) {
			currentIndex++;

		} else if (arg0.getSource() == minus && currentIndex != 0) {
			currentIndex--;

		} else if (arg0.getSource() == check) {
			int result = playerData.getValue(currentIndex);
			score.setText(String.valueOf(result));
		}

		index.setText(String.valueOf(currentIndex));
	}
}
