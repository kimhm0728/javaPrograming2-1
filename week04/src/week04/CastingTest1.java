package week04;

public class CastingTest1 {

	public static void main(String[] args) {
		byte b=20;
		int i=b;
		System.out.println("Ȯ�� ��ȯ ��� : "+i);
		
		int j=300;
		double d=3.1415;
		
		System.out.println("\n��� ��ȯ ���");
		b=(byte)j;
		System.out.println("int 300�� byte�� : "+b);
		
		i = (int)d; 
		System.out.println("double 3.1415�� int�� : "+i);
		
		b=(byte)(d*100);
		System.out.println("double 314.15�� byte�� : "+b);
	}

}