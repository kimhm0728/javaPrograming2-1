package week02;

import java.util.Scanner;

public class KeyBoardInput1 {
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("몇 번째 프로그램인지 입력하세요 : ");
		int n = Input.nextInt();
		
		System.out.print(n+" 번째로 작성해 보는 자바 프로그램 입니다");
		
		Input.close();
	}
	
}