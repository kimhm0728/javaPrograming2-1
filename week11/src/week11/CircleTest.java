package week11;
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Circle c[]=new Circle[3];
		
		System.out.println("3개의 원의 좌표와 반지름을 입력하시오.");
		for(int i=0;i<c.length;i++) {
			System.out.print((i+1)+"번째 : x좌표, y좌표, 반지름 >> ");
			double x=input.nextDouble();
			double y=input.nextDouble();
			int radius=input.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		for(Circle j:c) j.show();
		
		input.close();
	}

}