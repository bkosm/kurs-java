package zajecia22;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private static Logger instance;
	private final String SAVE_PATH = "./report.txt";
	
	SimpleDateFormat format;
	
	private Logger() {
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public static synchronized Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		
		return instance;
	}
	
	public void info(String text) {
		writeToFile(text, "INFO");
	}
	
	public void error(String text) {
		writeToFile(text, "ERROR");
	}
	
	private synchronized void writeToFile(String text, String status) {
		
		try (FileWriter fw = new FileWriter(SAVE_PATH, true)) {
			String toWrite = format.format(new Date()) + " " + status + " -> " + text + "\n";
			
			System.out.println(toWrite);
			fw.write(toWrite);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
