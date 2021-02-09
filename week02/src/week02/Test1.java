package week02;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("2개의 정수를 공간(space)으로 구분하여 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println(n1+" + "+n2+"의 결과는 "+(n1+n2)+" 입니다.");
		System.out.println(n1+" - "+n2+"의 결과는 "+(n1-n2)+" 입니다.");
		System.out.println(n1+" * "+n2+"의 결과는 "+(n1*n2)+" 입니다.");
		System.out.println(n1+" / "+n2+"의 결과는 "+((double)n1/n2)+" 입니다.");
		
		input.close();
	}

}