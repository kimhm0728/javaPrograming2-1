package week02;

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �̸�, ����, Ű�� ����(space)���� �����Ͽ� �Է� : ");
		String s = input.next();
		String name = input.next();
		int age = input.nextInt();
		double h = input.nextDouble();
		
		System.out.println("���� ������ "+s+"�̸� �̸��� "+name+"�Դϴ�");
		System.out.println("���̴� "+age+"���̸� Ű�� "+h+"cm �Դϴ�");
		input.close();
	}

}
