package week02;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("2���� ������ ����(space)���� �����Ͽ� �Է� : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println(n1+" + "+n2+"�� ����� "+(n1+n2)+" �Դϴ�.");
		System.out.println(n1+" - "+n2+"�� ����� "+(n1-n2)+" �Դϴ�.");
		System.out.println(n1+" * "+n2+"�� ����� "+(n1*n2)+" �Դϴ�.");
		System.out.println(n1+" / "+n2+"�� ����� "+((double)n1/n2)+" �Դϴ�.");
		
		input.close();
	}

}