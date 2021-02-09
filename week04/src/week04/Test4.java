package week04;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("원의 중심 위치 (x0,y0)와 반지름 입력 : ");
		int x0=input.nextInt();
		int y0=input.nextInt();
		int r=input.nextInt();
		
		System.out.print("임의 점 위치 (x1,y1) 입력 : ");
		int x1=input.nextInt();
		int y1=input.nextInt();
		
		double d=Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2));
		if(d>r) System.out.println("원밖에 있음 (outside)");
		else System.out.println("원안에 있음 (inside point)");
		
		input.close();
	}

}
