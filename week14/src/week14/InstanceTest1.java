package week14;
class Rectangle2 {
	public int width;
	public int height;
	public Rectangle2(int w,int h) {
		width=w;
		height=h;
	}
	public int computeRectangleArea() {
		return width*height;
	}
}
class Cube2 extends Rectangle2 {
	public int depth;
	public Cube2(int w,int h,int d) {
		super(w,h);
		depth=d;
	}
	public int computeCubeArea() {
		return super.computeRectangleArea() * depth;
	}
}
public class InstanceTest1 {
	public static void main(String[] args) {
		Rectangle2 r=new Rectangle2(10,20);
		Cube2 c=new Cube2(10,20,30);
		System.out.println("r이 Rectangle의 객체 ? : "+(r instanceof Rectangle2));
		System.out.println("r이 Cube의 객체 ? : "+(r instanceof Cube2));
		System.out.println("c가 Rectangle의 객체 ? : "+(c instanceof Rectangle2));
		System.out.println("c가 Cube의 객체 ? : "+(c instanceof Cube2));
		System.out.println("=========형 변환 이후===========");
		r=new Cube2(20,30,40);
		System.out.println("형 변환 r이 Rectangle의 객체 ? : "+(r instanceof Rectangle2));
		System.out.println("형 변환 r이 Cube의 객체 ? : "+(r instanceof Cube2));
		System.out.println("c가 Rectangle의 객체 ? : "+(r instanceof Rectangle2));
		System.out.println("c가 Cube의 객체 ? : "+(r instanceof Cube2));
		System.out.println("============================");
		System.out.println("r이 Object의 객체 ? : "+(r instanceof Object));
	}

}
