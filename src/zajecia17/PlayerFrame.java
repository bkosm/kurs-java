package zajecia17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayerFrame extends JFrame implements ActionListener {
	
	private JButton plus;
	private JButton minus;
	private JButton check;
	
	private JLabel index;
	private JLabel score;
	
	private PlayerData playerData;
	
	public PlayerFrame() {
		super("Sprawdź wynik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setSize(720, 480);
		
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
		
		playerData = new PlayerData();
		
		add(plus);
		add(minus);
		add(check);
		
		add(index);
		add(score);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//playerData.getValue(0);
	}
}
