package week06;
class Circle {
	int width;
	int height;
	int depth;
	public Circle(int width) {
		this(width, 0,0);
	}
	public Circle(int width,int height) {
		this(width,height,0);
	}
	public Circle(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double getArea(int w) {
		return w*height;
	}
	protected double getArea(int w,int h) {
		return w*h;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
