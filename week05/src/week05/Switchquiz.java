package week05;
import java.util.Scanner;

public class Switchquiz {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1 - 12) : ");
		int month=stdin.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�Է� ����");		
		}
		
		stdin.close();
	}

}