package week10;

class Circle {
	private double radius;
	static double PI=3.14192;

	public Circle(double radius) {
		this.radius=radius;
	}
	private double square(double r) {
		return r*r;
	}
	public double getRadius() {
		return radius;
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
public class CircleTest {
	public static void main(String[] args) {
		Circle c=new Circle(2.8);
		System.out.println("������ = "+c.getRadius());
		System.out.println("���� ���� = "+Math.round(c.getArea()*100000000)/100000000.0);
		System.out.println("���� �ѷ� = "+Math.round(c.getPerimeter()*10000000)/10000000.0);
	}

}
