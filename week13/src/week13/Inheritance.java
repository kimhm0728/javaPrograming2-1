package week13;
class Circle {
	int radius;
	double s; //����
	double p=3.1415;
	public Circle() {
		radius=10;
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	public void findRadius() {
		System.out.println("�������� "+radius+"��Ƽ�̴�.");
	}
	public void findArea() {
		s=p*radius*radius;
		System.out.println("������  (��*������*������)�̴�.\ns = "+s);
	}
}
class Ball extends Circle {
	private double v; //����
	private String color;
	public Ball(String color,int radius) {
		this.radius=radius;
		this.color=color;
	}
	public void findColor() {
		System.out.println(color+" ���̴�.");
	}
	public void findArea() {
		s=4*p*radius*radius;
		System.out.println("���̴� 4*(��*������*������)�̴�.\ns = "+s);
	}
	public void findVolume() {
		v=4.0/3*(p*radius*radius*radius);
		System.out.println("���Ǵ� 4.0/3*(��*������*������*������)�̴�.\nv = "+v);
	}
}
class Cylinder extends Ball {
	private double v; //����
	private String color;
	private int h;
	public Cylinder(String color,int radius,int h) {
		super(color, radius);
		this.h=h;
	}
	public void findColor() {
		System.out.println(color+" �����̴�.");
	}
	public void findArea() {
		s=2*p*radius*radius+2*p*radius*h;
		System.out.println("���̴� (2*��*������*������ + 2*��*������*����)�̴�.\ns = "+s);
	}
	public void findVolume() {
		v=p*radius*radius*h;
		System.out.println("���Ǵ� (��*������*������*����)�̴�.\nv = "+v);
	}
}