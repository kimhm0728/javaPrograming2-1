package week05;
import java.util.Scanner;

public class IFquiz {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1 - 12) : ");
		int month=stdin.nextInt();
		
		if(month==1||month==2||month==12)
			System.out.println("�ܿ��Դϴ�.");
		else if(month>=3&&month<=5)
			System.out.println("���Դϴ�.");
		else if(month>=6&&month<=8)
			System.out.println("�����Դϴ�.");
		else if(month>=9&&month<=11)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�Է� ����");
		
		stdin.close();
	}

}
