package week05;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String s=stdin.next();
		char c=s.charAt(0);
		
		if(c>='A'&&c<='Z')
			c=(char)(c+('a'-'A'));
		else if(c>='a'&&c<='z')
			c=(char)(c-('a'-'A'));
		else 
			System.out.println("�����ڰ� �ƴմϴ�.");
		System.out.println("��ȯ���� = "+c);
		
		stdin.close();

	}

}
