package week04;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("위변 길이 : ");
		int a = input.nextInt();
		System.out.print("아래변 길이 : ");
		int b = input.nextInt();
		System.out.print("높이 : ");
		int h = input.nextInt();
		double s=h/2.0*(a+b);
		System.out.println("사다리꼴 넓이 : "+s+" 입니다");
		
		input.close();
	}

}
