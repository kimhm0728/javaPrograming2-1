package week05;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("해당 년도를 입력하시오 : ");
		int year=stdin.nextInt();
		
		if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.println(year+"년은 윤년 입니다.");
		else
			System.out.println(year+"년은 평년 입니다.");
		
		stdin.close();

	}

}
