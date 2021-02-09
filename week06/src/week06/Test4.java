package week06;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int a=0, sum=0, avg;
		System.out.println("컴퓨터가 수를 정했습니다. 시작합니다");
		Loop : while (true){
			int k=(int)(Math.random()*100);
			int n=1;
			char choice;
			int answer;
			System.out.println("0 - 99 사이의 값을 입력하세요");
			do {
				System.out.print(n+" >> ");
				answer=stdin.nextInt();
				if(k>answer) {
					System.out.println("더 높은 값을 입력하세요");
					n++;
					}
				else if(k<answer) {
					System.out.println("더 낮은 값을 입력하세요");
					n++;
				}
			}while(k!=answer);
			sum+=n;
			a++;
			System.out.println(n+"번 만에 숫자 "+k+"를 맞추었습니다!!!");
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
		System.out.println("평균 추측 : "+avg);
		stdin.close();
	}

}
