package week02;

import java.util.Scanner;

public class KeyInput2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("�̸��� �Է�: ");
		String name = Input.next();
		
		System.out.println("�̸�: "+ name);
		
		Input.close();
	}

}
