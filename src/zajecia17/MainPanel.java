package zajecia17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener {
	private JButton button;
	private JLabel label;
	private boolean status;
	
	public MainPanel() {
		this.setBackground(Color.DARK_GRAY);
		
		this.button = new JButton("Wynik");
		this.button.setBounds(5, 5, 100, 30);
		this.button.addActionListener(this);
		
		this.label = new JLabel("Domyslny tekst");
		this.label.setBounds(150, 5, 200, 30);
		this.label.setForeground(Color.WHITE);
		
		this.status = false;
		
		this.setLayout(null);
		
		this.add(this.button);
		this.add(this.label);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		
		if (this.button == obj) {
			if (this.status) {
				this.label.setText("Klik");
				this.status = false;
			} else {
				this.label.setText("Klik2");
				this.status = true;
			}	
		}
	
	}
	
}
