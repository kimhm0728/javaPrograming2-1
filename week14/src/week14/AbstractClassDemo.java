package week14;
abstract class Shape {
	abstract public void draw();
	abstract public double findArea();
}
class Circle extends Shape {
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public void draw() {
		System.out.println("���� �׸���.");
	}
	public double findArea() {
		return 3.14*radius*radius;
	}
}
class Rectangle extends Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
	public double findArea() {
		return width*height;
	}
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Shape s=new Circle(3);
		s.draw();
		System.out.println("���� ���̴� "+s.findArea());
		s=new Rectangle(3,4);
		s.draw();
		System.out.println("�簢���� ���̴� "+s.findArea());
	}
}
