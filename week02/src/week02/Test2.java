package week02;

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("국적과 이름, 나이, 키를 공간(space)으로 구분하여 입력 : ");
		String s = input.next();
		String name = input.next();
		int age = input.nextInt();
		double h = input.nextDouble();
		
		System.out.println("나의 국적은 "+s+"이며 이름은 "+name+"입니다");
		System.out.println("나이는 "+age+"살이며 키는 "+h+"cm 입니다");
		input.close();
	}

}
