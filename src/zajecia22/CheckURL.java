package zajecia22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JLabel;

public class CheckURL implements Runnable {

	private Info info;
	private Logger logger = Logger.getInstance();
	
	private Thread thread;
	private JLabel label;
	
	public CheckURL(Info info, JLabel label) {
		this.info = info;
		this.label = label;
		this.thread = new Thread(this);
	}
	
	public void start() {
		this.thread.start();
	}

	@Override
	public void run() {
		
		while (true) {
			
			URL url;
			HttpURLConnection connection;
			int code;
			String urlText = info.getText();
			
			try {
				url = new URL(urlText);
				
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
				connection.connect();
				
				code = connection.getResponseCode();
				
				if (code == 200) {
					String status = "Podana strona " + urlText + " działa prawidłowo";
					logger.info(status);
					label.setText(status);
					
				} else {
					String status = "Podana strona " + urlText + " zwraca błąd: " + code;
					logger.error(status);
					label.setText(status);
				}
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
}
