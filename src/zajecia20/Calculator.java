package zajecia20;

public class Calculator {

	public Calculator() {
	}

	public synchronized void calculate(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println("Watek " + n + " " + i * n);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
