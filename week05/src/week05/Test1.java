package week05;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int money = stdin.nextInt();
		int t=money;
		
		int s50000=money/50000;
		t%=50000;
		int s10000=t/10000;
		t%=10000;
		int s5000=t/5000;
		t%=5000;
		int s1000=t/1000;
		t%=1000;
		int s500=t/500;
		t%=500;
		int s100=t/100;
		t%=100;
		int s50=t/50;
		t%=50;
		int s10=t/10;
		t%=10;
		int s5=t/5;
		t%=5;
		int s1=t;
		
		System.out.println("오만원 권 : \t"+s50000+"장");
		System.out.println("일만원 권 : \t"+s10000+"장");
		System.out.println("오천원 권 : \t"+s5000+"장");
		System.out.println("천원 권 :  \t"+s1000+"장");
		System.out.println("오백원 동전 : \t"+s500+"개");
		System.out.println("백원 동전:  \t"+s100+"개");
		System.out.println("오십원 동전 : \t"+s50+"개");
		System.out.println("십원 동전 : \t"+s10+"개");
		System.out.println("오원 동전 : \t"+s5+"개");
		System.out.println("일원 동전 : \t"+s1+"개");
		
		stdin.close();
	}

}
