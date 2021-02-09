package week05;
import java.util.Scanner;

public class DoubleIFTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int score = input.nextInt();
		if(score>=70) {
			System.out.println("축하합니다!");
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
			System.out.println("다음기회를 이용하세요.");
		}
		System.out.println("수고하셨습니다.");
		
		input.close();
	}

}
