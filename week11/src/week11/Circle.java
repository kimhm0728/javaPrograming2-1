package week11;

public class Circle {
	private double x;
	private double y;
	private int radius;
	private long idNum;
	private static long circleID=0;
	
	public Circle(double x,double y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
		idNum=++circleID;
	}
	public void show() {
		System.out.println(idNum+"번째 좌표 및 반지름 = (x = "+x+" , y = "+y+") 반지름 = "+radius);
	}
}
