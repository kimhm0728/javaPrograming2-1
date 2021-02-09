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
		System.out.println("c의 전위 증가 연산 = "+c);
		System.out.println("a 변수의 값 : "+a);
		
		int d=b++; // d에 b 값을 대입한 후 증가시킴
		System.out.println("d의 후위 증가 연산 = "+d);
		System.out.println("b 변수의 값 : "+b);
	}

}