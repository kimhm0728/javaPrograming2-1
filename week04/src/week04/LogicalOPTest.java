package week04;

public class LogicalOPTest {

	public static void main(String[] args) {
		boolean a = (20<10)||(30<40);
		System.out.println("20�� 10���� ũ�ų� �Ǵ� 30�� 40���� ū��? "+a);
		
		boolean b=(20>10)&&(30>40);
		System.out.println("20�� 10���� ũ�� �׸��� 30�� 40���� ū��? "+b);
		
		System.out.println("a && b�� �����? "+(a&&b));
		System.out.println("a || b�� �����? "+(a||b));
	}

}
