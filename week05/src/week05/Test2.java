package week05;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("�ش� �⵵�� �Է��Ͻÿ� : ");
		int year=stdin.nextInt();
		
		if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.println(year+"���� ���� �Դϴ�.");
		else
			System.out.println(year+"���� ��� �Դϴ�.");
		
		stdin.close();

	}

}
