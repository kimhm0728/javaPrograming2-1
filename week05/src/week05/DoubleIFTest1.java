package week05;
import java.util.Scanner;

public class DoubleIFTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int score = input.nextInt();
		if(score>=70) {
			System.out.println("�����մϴ�!");
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�.");
			System.out.println("������ȸ�� �̿��ϼ���.");
		}
		System.out.println("�����ϼ̽��ϴ�.");
		
		input.close();
	}

}
