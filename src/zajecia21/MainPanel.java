package zajecia21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener {

	private JButton startButton;
	private JButton stopButton;
	private JButton clearButton;

	private JLabel resultLabel;
	private JLabel timeLabel;
	
	private Stoper stoper;
	private Info info;

	public MainPanel() {
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		clearButton = new JButton("Clear");

		startButton.setBounds(0, 0, 100, 30);
		stopButton.setBounds(0, 40, 100, 30);
		clearButton.setBounds(0, 80, 100, 30);
		
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		clearButton.addActionListener(this);
		
		resultLabel = new JLabel("0");
		timeLabel = new JLabel("x");
		
		resultLabel.setBounds(150, 0, 100, 30);
		timeLabel.setBounds(150, 40, 100, 30);
		
		setLayout(null);
		
		add(startButton);
		add(stopButton);
		add(clearButton);
		add(resultLabel);
		add(timeLabel);
		
		info = new Info(Status.STOP);
		
		stoper = new Stoper(resultLabel, timeLabel, info);
		stoper.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == startButton) {
			info.setStatus(Status.START);
			
		} else if (e.getSource() == stopButton) {
			info.setStatus(Status.STOP);
			
		} else {
			info.setStatus(Status.CLEAR);
		}
		
	}

}
