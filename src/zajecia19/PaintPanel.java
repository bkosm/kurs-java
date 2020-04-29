package zajecia19;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class PaintPanel extends JPanel implements MouseListener, KeyListener {
	private Color color;
	private List<Point> points;

	private int dotSize;

	public PaintPanel() {
		color = Color.BLACK;
		dotSize = 10;
		points = new ArrayList<>();

		setBackground(Color.WHITE);
		setFocusable(true);
		addMouseListener(this);
		addKeyListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		points.add(e.getPoint());
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		/* w programie najpierw nacisnij TAB */
		
		switch (e.getKeyChar()) {
		case 'r':
			color = Color.RED;
			break;

		case 'b':
			color = Color.BLACK;
			break;

		case 'y':
			color = Color.YELLOW;
			break;

		case 'p':
			color = Color.PINK;
			break;

		case 'c':
			points.clear();
			dotSize = 10;
			break;

		case '+':
			dotSize++;
			break;

		case '-':
			if (dotSize > 2)
				dotSize--;
			break;
		}
		
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(color);

		for (Point p : points) {
			g2d.fillOval(p.x, p.y, dotSize, dotSize);
		}
	}

	/* nieuzywane metody interfejsow */

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
