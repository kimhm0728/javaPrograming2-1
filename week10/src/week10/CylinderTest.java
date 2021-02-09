package week10;

class Cylinder {
	private Circle c1;
	private double height;
	
	public Cylinder(Circle c1, double height) {
		this.c1=c1;
		this.height=height;
	}
	public double getVolume() {
		return c1.getArea()*height;
	}
}
public class CylinderTest {
	public static void main(String[] args) {
		Circle c=new Circle(2.8);
		
		Cylinder t=new Cylinder(c,5.6);
		System.out.println("원통의 체적은 = "+t.getVolume());

	}

}
