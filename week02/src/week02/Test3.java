package week02;

import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("2���� ������ �����ڸ� ����(space)���� �����Ͽ� �Է� : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		char a = input.next().charAt(0);
		
		System.out.print(n1);
		System.out.print(a);
		System.out.print(n2);
		input.close();

	}

}