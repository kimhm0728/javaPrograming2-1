package week05;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �г� ���ʴ�� �Է� : ");
		int score = input.nextInt();
		int grade = input.nextInt();
		
		if(score >= 60) {
			if(grade != 4) System.out.println("�հ��Դϴ�.");
			else if(score>=70) System.out.println("�հ��Դϴ�.");
			else System.out.println("���հ��Դϴ�.");
		}
		else 
			System.out.println("���հ��Դϴ�.");
		input.close();
	}

}
