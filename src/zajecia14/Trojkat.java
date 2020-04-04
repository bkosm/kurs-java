package zajecia14;

public class Trojkat implements FiguryI {
	private double a;
	private double b;
	private double c;

	public Trojkat(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double pole() {
		double p = 0.5 * (a + b + c);

		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public double obwod() {
		return a + b + c;
	}
}
