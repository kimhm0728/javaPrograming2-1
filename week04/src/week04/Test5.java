package week04;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽� ��ġ (x0,y0)�� ������ �Է�(r0) : ");
		int x0=input.nextInt();
		int y0=input.nextInt();
		int r0=input.nextInt();
		
		System.out.print("�ι�° ���� �߽� ��ġ (x1,y1)�� ������ �Է�(r1) : ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		int r1=input.nextInt();
		
		double d=Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2));
		if(d<=(r0+r1)) System.out.println("�� ���� ��ħ (overlap)");
		else System.out.println("�� ���� ��ġ�� ���� (not overlap)");
		
		input.close();
	}
	
}