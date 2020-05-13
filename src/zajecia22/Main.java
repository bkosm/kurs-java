package zajecia22;

public class Main {
	public static void main(String[] args) {
		System.out.println("ok22");
		
		Info info = new Info("https://google.com/");
		
		CheckURL app = new CheckURL(info, null);
		app.start();
	}
}
