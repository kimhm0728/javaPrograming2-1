package week02;

import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("2개의 정수와 연산자를 공간(space)으로 구분하여 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		char a = input.next().charAt(0);
		
		System.out.print(n1);
		System.out.print(a);
		System.out.print(n2+"의 결과는 ");
		
		if(a=='+') System.out.println(n1+n2+" 입니다.");
		else if(a=='-') System.out.println(n1-n2+" 입니다.");
		else if(a=='*') System.out.println(n1*n2+" 입니다.");
		else if(a=='/') System.out.println(((double)n1/n2)+" 입니다.");
		
		input.close();

	}

}