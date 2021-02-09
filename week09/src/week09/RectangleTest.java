package week09;

public class RectangleTest {
	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point();
		
		p1.set(10, 20);
		p2.set(20, 35);
		
		Rectangle r=new Rectangle();
		r.set_Rectangle(p1,p2);
		r.show();
		System.out.println();
		
		Point p3=new Point();
		Point p4=new Point();
		
		p3.set(15, 20);
		p4.set(24, 35);
		
		Rectangle s=new Rectangle();
		s.set_Rectangle(p3,p4);
		s.show();
		System.out.println();
		
		if(r.equals(s))
			System.out.println("사각형의 면적이 같다.");
		else
			System.out.println("사각형의 면적이 다르다.");

	}

}
