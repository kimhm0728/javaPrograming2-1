package week04;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �߽� ��ġ (x0,y0)�� ������ �Է� : ");
		int x0=input.nextInt();
		int y0=input.nextInt();
		int r=input.nextInt();
		
		System.out.print("���� �� ��ġ (x1,y1) �Է� : ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		
		double d=Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2));
		if(d>r) System.out.println("���ۿ� ���� (outside)");
		else System.out.println("���ȿ� ���� (inside point)");
		
		input.close();
	}

}
