package week07;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("단어 사전 프로그램");
		String str[][]= {{"연필","학교","사랑","행복","자바"},{"pencil","school","love","happy","java"}};

		Loop:while (true) {
			System.out.print("단어를 입력하세요 >> ");
			String user=stdin.next();
			
			if(user.equals("그만")||user.equals("exit"))
				break;
			
			for(int j=0;j<5;j++)
				if(user.equals(str[0][j])) {
					System.out.println(str[1][j]);
					continue Loop;
					}
				else if(user.equals(str[1][j])) {
					System.out.println(str[0][j]);
					continue Loop;
					}
			System.out.println("잘못 입력했습니다. 다시 입력해주세요 !!!"); 
			}
		stdin.close();
	}

}
