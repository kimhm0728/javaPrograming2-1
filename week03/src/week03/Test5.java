package week03;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오 (cm): ");
		int h=input.nextInt();
		double inch= h/2.54;
		double p=inch/12;
		inch%=12;
		
		System.out.println(h+"cm는 "+(int)p+"피트 "+Math.round(inch)+"인치입니다.");
		input.close();
		
	}

}
