package week02;

import java.util.Scanner;

public class KeyInput2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("이름을 입력: ");
		String name = Input.next();
		
		System.out.println("이름: "+ name);
		
		Input.close();
	}

}
