package zajecia20;

public class Main {

	public static void main(String[] args) {
		zaddom();
	}
	
	public static void przyklad() throws InterruptedException {
		Calculator calc = new Calculator();
		
		Thread t1 = new Thread(new Robot(1, calc));
		Thread t2 = new Thread(new Robot(2, calc));
		Thread t3 = new Thread(new Robot(3, calc));
		Thread t4 = new Thread(new Robot(4, calc));
		
		t1.start();
		t1.join();
		
		t2.start();	
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		t4.join();
	}
	
	public static void zaddom() {
		Thread t1 = new Thread(new Counter());
		//t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 1;
				
				while (true) {
					System.out.println(i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
					i = (i >= 10) ? 1 : i + 1;
				}
			}
			
		});
		
		t2.start();
	}

}
