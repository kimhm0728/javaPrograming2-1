package week05;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("하나의 문자를 입력하시오 : ");
		String s = stdin.next();
		char a= s.charAt(0);
		
		System.out.println("입력한 문자는 : "+a+" ("+(int)a+")");
		
		stdin.close();
		
	}

}
