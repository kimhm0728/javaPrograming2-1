package week05;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
		int money = stdin.nextInt();
		int t=money;
		
		int s50000=money/50000;
		t%=50000;
		int s10000=t/10000;
		t%=10000;
		int s5000=t/5000;
		t%=5000;
		int s1000=t/1000;
		t%=1000;
		int s500=t/500;
		t%=500;
		int s100=t/100;
		t%=100;
		int s50=t/50;
		t%=50;
		int s10=t/10;
		t%=10;
		int s5=t/5;
		t%=5;
		int s1=t;
		
		System.out.println("������ �� : \t"+s50000+"��");
		System.out.println("�ϸ��� �� : \t"+s10000+"��");
		System.out.println("��õ�� �� : \t"+s5000+"��");
		System.out.println("õ�� �� :  \t"+s1000+"��");
		System.out.println("����� ���� : \t"+s500+"��");
		System.out.println("��� ����:  \t"+s100+"��");
		System.out.println("���ʿ� ���� : \t"+s50+"��");
		System.out.println("�ʿ� ���� : \t"+s10+"��");
		System.out.println("���� ���� : \t"+s5+"��");
		System.out.println("�Ͽ� ���� : \t"+s1+"��");
		
		stdin.close();
	}

}
