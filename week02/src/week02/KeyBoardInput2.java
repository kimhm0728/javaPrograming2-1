package week02;

import java.util.Scanner;

public class KeyBoardInput2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("�̸��� ����, �����Ը� ����(space)���� �����Ͽ� �Է� : ");
		String name = Input.next();
		int age = Input.nextInt();
		double height = Input.nextDouble();
		
		System.out.println(name+" ���� ���̴� " +age+"���̰�");
		System.out.println("�����Դ� "+height+"kg �Դϴ�");
		Input.close();
	}

}
