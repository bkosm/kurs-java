package zajecia21;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;

public class Stoper implements Runnable {

	private int value;
	private JLabel valueLabel;
	private JLabel timeLabel;

	private Thread thread;
	private Info info;

	public Stoper(JLabel valueLabel, JLabel timeLabel, Info info) {
		value = 0;

		this.valueLabel = valueLabel;
		this.timeLabel = timeLabel;
		this.info = info;

		thread = new Thread(this);
	}

	@Override
	public void run() {
		while (true) {
			refreshTime();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			switch (info.getStatus()) {
			case START:
				value++;
				refreshLabel();
				break;

			case STOP:
				/* na razie nic */
				break;

			case CLEAR:
				value = 0;
				refreshLabel();
				break;
			}

		}
	}

	private void refreshLabel() {
		String text = String.valueOf(value);

		valueLabel.setText(text);
	}

	public void start() {
		thread.start();
	}

	private void refreshTime() {
		Date date = new Date();

		/*
		 * String string = String.format("%02d", date.getSeconds());
		 * System.out.println(string);
		 */

		StringBuilder sb = new StringBuilder();

		sb.append(date.getHours());
		sb.append(":");
		sb.append(date.getMinutes());
		sb.append(":");
		sb.append(date.getSeconds());

		timeLabel.setText(sb.toString());
	}
}
