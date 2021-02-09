package week03;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("상품 가격 : ");
		int p = input.nextInt();
		
		System.out.print("받은 금액 : ");
		int m = input.nextInt();
		int c = m-p;
		double b=p*((double)10/100);
		
		System.out.println("\n받은 금액 : "+m+"원");
		System.out.println("상품 총액 : "+p+"원");
		System.out.println("부가세 : "+(int)b+"원");
		System.out.println("잔   돈 : "+c+"원");
		
		input.close();
		
	}

}
