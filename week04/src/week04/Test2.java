package week04;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("구의 반지름 입력 : ");
		int r = input.nextInt();
		
		double v=4.0/3.0*Math.pow(r, 3);
		System.out.println("부피는 : "+Math.round(v*100)/100.0+" 입니다");
		
		input.close();
	}

}
