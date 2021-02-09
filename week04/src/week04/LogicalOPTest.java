package week04;

public class LogicalOPTest {

	public static void main(String[] args) {
		boolean a = (20<10)||(30<40);
		System.out.println("20이 10보다 크거나 또는 30이 40보다 큰가? "+a);
		
		boolean b=(20>10)&&(30>40);
		System.out.println("20이 10보다 크고 그리고 30이 40보다 큰가? "+b);
		
		System.out.println("a && b의 결과는? "+(a&&b));
		System.out.println("a || b의 결과는? "+(a||b));
	}

}
