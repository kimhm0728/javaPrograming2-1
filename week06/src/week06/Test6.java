package week06;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int money=0;
		
		Loop : while(true) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3. �ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("���� > ");
			int choice=stdin.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("���ݾ� > ");
				int a=stdin.nextInt();
				money+=a;
				break;
			case 2:
				System.out.print("��ݾ� > ");
				int b=stdin.nextInt();
				money-=b;
				break;
			case 3:
				System.out.println("���� �ܰ�� > "+money);
				break;
			case 4:
				System.out.println("�����մϴ�");
				break Loop;
			}
		}
		
		stdin.close();
	}

}
