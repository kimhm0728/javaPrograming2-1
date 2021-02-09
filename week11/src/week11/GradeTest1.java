package week11;
import java.util.Scanner;

public class GradeTest1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math=input.nextInt();
		int science=input.nextInt();
		int english=input.nextInt();
		
		Grade me=new Grade(math,science,english);
		System.out.println("평균은 "+me.average());
		
		input.close();
	}

}