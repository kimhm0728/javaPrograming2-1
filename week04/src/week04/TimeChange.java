package week04;
import java.util.Scanner;

public class TimeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ʸ� ������ �Է��ϼ��� : ");
		int time = input.nextInt();
		int second=time%60;
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		
		System.out.print(time+"�ʴ� ");
		System.out.print(hour+"�ð� ");
		System.out.print(minute+"�� ");
		System.out.println(second+"�� �Դϴ�.");
		
		int h=time/3600;
		int m=(time-h*3600)/60; // �����ִ� time�� 60�� ���� ��
		int s=(time-h*3600)%60;
		
		System.out.print(time+"�ʴ� ");
		System.out.print(h+"�ð� ");
		System.out.print(m+"�� ");
		System.out.println(s+"�� �Դϴ�.");
		
		input.close();
	}

}
