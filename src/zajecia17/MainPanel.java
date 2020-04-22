package zajecia17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener {
	JButton button;
	
	public MainPanel() {
		this.setBackground(Color.DARK_GRAY);
		
		this.button = new JButton("Wynik");
		this.button.setBounds(5, 5, 100, 30);
		this.button.addActionListener(this);
		
		
		this.setLayout(null);
		
		this.add(this.button);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("nacisnieto przycisk");
	}
	
}
