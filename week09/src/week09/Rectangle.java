package week09;

public class Rectangle {
	private Point p1=new Point();
	private Point p2=new Point();
	public void set_Rectangle(Point pA,Point pB) {
		p1=pA;
		p2=pB;
	}
	private int square() {
		return (p2.x-p1.x)*(p2.y-p1.y);
	}
	public void show() {
		p1.print();
		p2.print();
		System.out.println("³ÐÀÌ´Â "+square());
	}
	public boolean equals(Rectangle r) {
		if(square()==r.square())
			return true;
		else
			return false;
	}
}