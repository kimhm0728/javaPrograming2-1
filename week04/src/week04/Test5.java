package week04;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심 위치 (x0,y0)와 반지름 입력(r0) : ");
		int x0=input.nextInt();
		int y0=input.nextInt();
		int r0=input.nextInt();
		
		System.out.print("두번째 원의 중심 위치 (x1,y1)와 반지름 입력(r1) : ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		int r1=input.nextInt();
		
		double d=Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2));
		if(d<=(r0+r1)) System.out.println("두 원이 겹침 (overlap)");
		else System.out.println("두 원이 겹치지 않음 (not overlap)");
		
		input.close();
	}
	
}