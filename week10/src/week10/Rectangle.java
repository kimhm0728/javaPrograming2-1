package week10;

public class Rectangle  {
	private Point p1;
	private Point p2;
	
	public Rectangle(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	private int square() {
		return (p2.x-p1.x)*(p2.y-p1.y);
	}
	public void show() {
		p1.showPoint();
		p2.showPoint();
		System.out.println("³ÐÀÌ´Â "+square());
	}
	public boolean equals(Rectangle r) {
		if(square()==r.square())
			return true;
		else
			return false;
	}
}