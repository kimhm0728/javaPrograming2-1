package week04;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 점의 위치 (x1,y1) 입력 : ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		
		System.out.print("두 번째 점의 위치 (x2,y2) 입력 : ");
		int x2=input.nextInt();
		int y2=input.nextInt();
		
		double d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.println("두점간의 거리 : "+Math.round(d*100)/100.0+" 입니다");
		input.close();
	}

}
