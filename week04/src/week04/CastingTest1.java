package week04;

public class CastingTest1 {

	public static void main(String[] args) {
		byte b=20;
		int i=b;
		System.out.println("확대 변환 결과 : "+i);
		
		int j=300;
		double d=3.1415;
		
		System.out.println("\n축소 변환 결과");
		b=(byte)j;
		System.out.println("int 300을 byte로 : "+b);
		
		i = (int)d; 
		System.out.println("double 3.1415를 int로 : "+i);
		
		b=(byte)(d*100);
		System.out.println("double 314.15를 byte로 : "+b);
	}

}