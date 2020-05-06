package zajecia20;

public class Counter implements Runnable {
	private int num;
	
	public Counter() {
		num = 1;
	}

	@Override
	public void run() {
		
		while (true) {
			System.out.println(num);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			num++;
			if (num > 10) {
				num = 1;
			}
		}
		
	}	
	
}
