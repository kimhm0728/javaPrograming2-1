package week04;
abstract class Shape{
	public void draw() {
		paint();
	}
	abstract void paint();
	abstract double getArea();
}
class Circle extends Shape{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	void paint() {
		System.out.println("반지름="+this.radius);
	}
	public double getArea() {
		return this.radius*this.radius*3.14;
	}
}
class Rect extends Shape{
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	void paint() {
		System.out.println("가로="+width+" , 세로="+height);
	}
	public double getArea() {
		return this.height*this.width;
	}
}
public class Test11 {
	public static void main(String[] args) {
		Shape p=new Circle(10);
		p.draw();
		System.out.println("면적 = "+p.getArea());
		
		p=new Rect(10,20);
		p.draw();
		System.out.println("면적 = "+p.getArea());

	}

}
