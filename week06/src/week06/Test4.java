package week06;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int a=0, sum=0, avg;
		System.out.println("��ǻ�Ͱ� ���� ���߽��ϴ�. �����մϴ�");
		Loop : while (true){
			int k=(int)(Math.random()*100);
			int n=1;
			char choice;
			int answer;
			System.out.println("0 - 99 ������ ���� �Է��ϼ���");
			do {
				System.out.print(n+" >> ");
				answer=stdin.nextInt();
				if(k>answer) {
					System.out.println("�� ���� ���� �Է��ϼ���");
					n++;
					}
				else if(k<answer) {
					System.out.println("�� ���� ���� �Է��ϼ���");
					n++;
				}
			}while(k!=answer);
			sum+=n;
			a++;
			System.out.println(n+"�� ���� ���� "+k+"�� ���߾����ϴ�!!!");
			System.out.print(" Try again(y/n) ");
			choice=stdin.next().charAt(0);
			switch(choice) {
			case 'y':
				continue;
			case 'n':
				break Loop;
			}
			
		}
		avg=sum/a;
		System.out.println("��� ���� : "+avg);
		stdin.close();
	}

}
