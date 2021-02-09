package week11;

public class Cal {
	private Cal() {}
	public static double max(double a, double b) {
		if (a>b) 
			return a;
		else
			return b;
	}
	public static double min(double a, double b) {
		if (a<b) 
			return a;
		else
			return b;
	}
}
