package week05;
import java.util.Scanner;

public class MultiIFTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = stdin.nextInt();
		char grade;
		
		if(score>=90) 
			grade = 'A';
		else if (score>=80) 
			grade = 'B';
		else if (score>=70) 
			grade = 'C';
		else if (score>=60) 
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("������ "+grade+" �Դϴ�.");
		
		stdin.close();
	}

}
