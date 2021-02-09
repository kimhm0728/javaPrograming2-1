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
		System.out.println("r�� Rectangle�� ��ü ? : "+(r instanceof Rectangle2));
		System.out.println("r�� Cube�� ��ü ? : "+(r instanceof Cube2));
		System.out.println("c�� Rectangle�� ��ü ? : "+(c instanceof Rectangle2));
		System.out.println("c�� Cube�� ��ü ? : "+(c instanceof Cube2));
		System.out.println("=========�� ��ȯ ����===========");
		r=new Cube2(20,30,40);
		System.out.println("�� ��ȯ r�� Rectangle�� ��ü ? : "+(r instanceof Rectangle2));
		System.out.println("�� ��ȯ r�� Cube�� ��ü ? : "+(r instanceof Cube2));
		System.out.println("c�� Rectangle�� ��ü ? : "+(r instanceof Rectangle2));
		System.out.println("c�� Cube�� ��ü ? : "+(r instanceof Cube2));
		System.out.println("============================");
		System.out.println("r�� Object�� ��ü ? : "+(r instanceof Object));
	}

}
