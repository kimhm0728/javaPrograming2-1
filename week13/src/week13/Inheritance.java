package week13;
class Circle {
	int radius;
	double s; //넓이
	double p=3.1415;
	public Circle() {
		radius=10;
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	public void findRadius() {
		System.out.println("반지름이 "+radius+"센티이다.");
	}
	public void findArea() {
		s=p*radius*radius;
		System.out.println("면적은  (π*반지름*반지름)이다.\ns = "+s);
	}
}
class Ball extends Circle {
	private double v; //부피
	private String color;
	public Ball(String color,int radius) {
		this.radius=radius;
		this.color=color;
	}
	public void findColor() {
		System.out.println(color+" 공이다.");
	}
	public void findArea() {
		s=4*p*radius*radius;
		System.out.println("넓이는 4*(π*반지름*반지름)이다.\ns = "+s);
	}
	public void findVolume() {
		v=4.0/3*(p*radius*radius*radius);
		System.out.println("부피는 4.0/3*(π*반지름*반지름*반지름)이다.\nv = "+v);
	}
}
class Cylinder extends Ball {
	private double v; //부피
	private String color;
	private int h;
	public Cylinder(String color,int radius,int h) {
		super(color, radius);
		this.h=h;
	}
	public void findColor() {
		System.out.println(color+" 원통이다.");
	}
	public void findArea() {
		s=2*p*radius*radius+2*p*radius*h;
		System.out.println("넓이는 (2*π*반지름*반지름 + 2*π*반지름*높이)이다.\ns = "+s);
	}
	public void findVolume() {
		v=p*radius*radius*h;
		System.out.println("부피는 (π*반지름*반지름*높이)이다.\nv = "+v);
	}
}