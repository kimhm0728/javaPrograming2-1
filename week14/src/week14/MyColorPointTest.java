package week14;
abstract class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show() {
		System.out.print(x+","+y);
	}
}
class MyColorPoint extends MyPoint {
	String color;
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	protected void reverse() {
		int temp;
		temp=this.x;
		this.x=this.y;
		this.y=temp;
	}
	protected void show() {
		super.show();
		System.out.println(","+color);
	}
}

public class MyColorPointTest {
	public static void main(String[] args) {
		MyPoint p=new MyColorPoint(2,3,"blue");
		p.move(3,4);
		p.reverse();
		p.show();
	}
}
