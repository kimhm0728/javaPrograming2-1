package week06;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int money=0;
		
		Loop : while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			int choice=stdin.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("예금액 > ");
				int a=stdin.nextInt();
				money+=a;
				break;
			case 2:
				System.out.print("출금액 > ");
				int b=stdin.nextInt();
				money-=b;
				break;
			case 3:
				System.out.println("현재 잔고는 > "+money);
				break;
			case 4:
				System.out.println("종료합니다");
				break Loop;
			}
		}
		
		stdin.close();
	}

}
