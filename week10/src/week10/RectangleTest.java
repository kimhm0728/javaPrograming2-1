package week10;

public class RectangleTest {
	public static void main(String[] args) {
		Point p1=new Point(10,20);
		Point p2=new Point(21,35);

		Rectangle r=new Rectangle(p1,p2);
		r.show();
		System.out.println();
		
		Point p3=new Point(15,20);
		Point p4=new Point(25,35);
		
		Rectangle s=new Rectangle(p3,p4);
		s.show();
		System.out.println();
		
		if(r.equals(s))
			System.out.println("사각형의 면적이 같다.");
		else
			System.out.println("사각형의 면적이 다르다.");

	}

}
