package week09;

public class Cylinder {
	private Circle c1=new Circle();
	private double height;
	public void set_Cylinder(Circle c, double h) {
		c1=c;
		height=h;
	}
	public double getVolume() {
		return c1.getArea()*height;
	}
}
