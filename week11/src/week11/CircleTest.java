package week11;
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Circle c[]=new Circle[3];
		
		System.out.println("3���� ���� ��ǥ�� �������� �Է��Ͻÿ�.");
		for(int i=0;i<c.length;i++) {
			System.out.print((i+1)+"��° : x��ǥ, y��ǥ, ������ >> ");
			double x=input.nextDouble();
			double y=input.nextDouble();
			int radius=input.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		for(Circle j:c) j.show();
		
		input.close();
	}

}