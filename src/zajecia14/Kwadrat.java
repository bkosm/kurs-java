package zajecia14;

public class Kwadrat implements FiguryI {
	private double a;

	public Kwadrat(double a) {
		this.a = a;
	}

	@Override
	public double pole() {
		return a * a;
	}

	@Override
	public double obwod() {
		return 4 * a;
	}
}
