package week04;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° ���� ��ġ (x1,y1) �Է� : ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		
		System.out.print("�� ��° ���� ��ġ (x2,y2) �Է� : ");
		int x2=input.nextInt();
		int y2=input.nextInt();
		
		double d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.println("�������� �Ÿ� : "+Math.round(d*100)/100.0+" �Դϴ�");
		input.close();
	}

}
