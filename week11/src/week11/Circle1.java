package week11;

public class Circle1 {
	private double x;
	private double y;
	private int radius;
	
	public Circle1(double x,double y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+", "+y+") "+radius);
	}
	public int getRadius() {
		return radius;
	}
}
