package week04;
import java.util.Scanner;

public class TimeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("초를 정수로 입력하세요 : ");
		int time = input.nextInt();
		int second=time%60;
		int minute=(time/60)%60;
		int hour=(time/60)/60;
		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초 입니다.");
		
		int h=time/3600;
		int m=(time-h*3600)/60; // 남아있는 time에 60을 나눈 값
		int s=(time-h*3600)%60;
		
		System.out.print(time+"초는 ");
		System.out.print(h+"시간 ");
		System.out.print(m+"분 ");
		System.out.println(s+"초 입니다.");
		
		input.close();
	}

}
