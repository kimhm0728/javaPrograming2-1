package week09;

public class CircleTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(2.8);
		System.out.println("반지름 = "+c.getRadius());
		System.out.println("원의 면적 = "+c.getArea());
		System.out.println("원의 둘레 = "+c.getPerimeter());
	}

}
