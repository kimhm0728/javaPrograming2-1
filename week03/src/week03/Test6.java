package week03;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("��ǰ ���� : ");
		int p = input.nextInt();
		
		System.out.print("���� �ݾ� : ");
		int m = input.nextInt();
		int c = m-p;
		double b=p*((double)10/100);
		
		System.out.println("\n���� �ݾ� : "+m+"��");
		System.out.println("��ǰ �Ѿ� : "+p+"��");
		System.out.println("�ΰ��� : "+(int)b+"��");
		System.out.println("��   �� : "+c+"��");
		
		input.close();
		
	}

}
