package week11;
import java.util.Scanner;

public class Circle1Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Circle1 c[]=new Circle1[3];
		
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x=input.nextDouble();
			double y=input.nextDouble();
			int radius=input.nextInt();
			c[i]=new Circle1(x,y,radius);
		}
		
		Circle1 max=c[0];
		for(int i=1;i<c.length;i++) {
			if(max.getRadius()<c[i].getRadius())
				max=c[i];
		}
		System.out.print("가장 면적이 큰 원은 ");
		max.show();
		input.close();

	}

}