package week02;

import java.util.Scanner;

public class KeyBoardInput2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 : ");
		String name = Input.next();
		int age = Input.nextInt();
		double height = Input.nextDouble();
		
		System.out.println(name+" 씨의 나이는 " +age+"세이고");
		System.out.println("몸무게는 "+height+"kg 입니다");
		Input.close();
	}

}
