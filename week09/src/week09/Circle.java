package week09;

public class Circle {
	private double radius;
	static double PI=3.14192;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	private double square(double r) {
		return r*r;
	}
	private double getPI() {
		return PI;
	}
	public double getArea() {
		return getPI()*square(radius);
	}
	public double getPerimeter() {
		return 2*getPI()*radius;
	}
}
