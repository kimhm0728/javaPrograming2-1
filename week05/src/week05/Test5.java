package week05;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
		String s = stdin.next();
		char a= s.charAt(0);
		
		System.out.println("�Է��� ���ڴ� : "+a+" ("+(int)a+")");
		
		stdin.close();
		
	}

}
