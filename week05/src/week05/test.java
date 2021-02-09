package week05;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수와 학년 차례대로 입력 : ");
		int score = input.nextInt();
		int grade = input.nextInt();
		
		if(score >= 60) {
			if(grade != 4) System.out.println("합격입니다.");
			else if(score>=70) System.out.println("합격입니다.");
			else System.out.println("불합격입니다.");
		}
		else 
			System.out.println("불합격입니다.");
		input.close();
	}

}
