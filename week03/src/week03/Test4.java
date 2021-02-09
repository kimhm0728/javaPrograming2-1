package week03;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력 : ");
		double a=input.nextDouble();
		
		System.out.print("두 번째 수를 입력 : ");
		double b=input.nextDouble();
		
		System.out.println("덧셈 : "+a+"+"+b+" = "+(a+b)+" 입니다.");
		System.out.println("뺄셈 : "+a+"-"+b+" = "+(a-b)+" 입니다.");
		System.out.println("곱셈 : "+a+"*"+b+" = "+(a*b)+" 입니다.");
		System.out.println("나눗셈 : "+a+"/"+b+" = "+(a/b)+" 입니다.");
		
		double average=(a+b)/2;
		System.out.println("평균값 : " +average+" 입니다.");
		
		input.close();

	}

}
