package week03;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ� (cm): ");
		int h=input.nextInt();
		double inch= h/2.54;
		double p=inch/12;
		inch%=12;
		
		System.out.println(h+"cm�� "+(int)p+"��Ʈ "+Math.round(inch)+"��ġ�Դϴ�.");
		input.close();
		
	}

}
