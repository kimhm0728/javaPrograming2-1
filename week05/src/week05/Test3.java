package week05;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		int h=stdin.nextInt();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		int w=stdin.nextInt();
		int w1=(int)((h-100)*0.9);
		
		if(w>w1)
			System.out.println("��ü���Դϴ�.");
		else if(w<w1)
			System.out.println("��ü���Դϴ�.");
		else {
			System.out.println("ǥ��ü���Դϴ�.");
		}
		
		stdin.close();

	}

}
