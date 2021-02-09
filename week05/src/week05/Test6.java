package week05;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String s=stdin.next();
		char c=s.charAt(0);
		
		if(c>='A'&&c<='Z')
			c=(char)(c+('a'-'A'));
		else if(c>='a'&&c<='z')
			c=(char)(c-('a'-'A'));
		else 
			System.out.println("영문자가 아닙니다.");
		System.out.println("변환문자 = "+c);
		
		stdin.close();

	}

}
