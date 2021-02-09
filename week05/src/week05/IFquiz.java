package week05;
import java.util.Scanner;

public class IFquiz {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("월을 입력하세요(1 - 12) : ");
		int month=stdin.nextInt();
		
		if(month==1||month==2||month==12)
			System.out.println("겨울입니다.");
		else if(month>=3&&month<=5)
			System.out.println("봄입니다.");
		else if(month>=6&&month<=8)
			System.out.println("여름입니다.");
		else if(month>=9&&month<=11)
			System.out.println("가을입니다.");
		else
			System.out.println("입력 오류");
		
		stdin.close();
	}

}
