package week04;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int a = input.nextInt();
		System.out.print("�Ʒ��� ���� : ");
		int b = input.nextInt();
		System.out.print("���� : ");
		int h = input.nextInt();
		double s=h/2.0*(a+b);
		System.out.println("��ٸ��� ���� : "+s+" �Դϴ�");
		
		input.close();
	}

}
