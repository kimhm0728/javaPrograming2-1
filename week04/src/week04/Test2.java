package week04;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �Է� : ");
		int r = input.nextInt();
		
		double v=4.0/3.0*Math.pow(r, 3);
		System.out.println("���Ǵ� : "+Math.round(v*100)/100.0+" �Դϴ�");
		
		input.close();
	}

}
