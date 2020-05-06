package zajecia20;

public class Robot implements Runnable {
	private Calculator calc;
	private int num;
	
	public Robot(int num, Calculator calc) {
		this.num = num;
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.calculate(num);		
	}

}
