package week04;

public class ArithmeticOPTest1 {

	public static void main(String[] args) {
		int a=5, b=3;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mod);
		
		int c=++a;
		System.out.println("c�� ���� ���� ���� = "+c);
		System.out.println("a ������ �� : "+a);
		
		int d=b++; // d�� b ���� ������ �� ������Ŵ
		System.out.println("d�� ���� ���� ���� = "+d);
		System.out.println("b ������ �� : "+b);
	}

}