package week06;
import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է�(¦���� ��) : ");
		int num=stdin.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==1) continue;
			sum+=i;
		}
		System.out.println("1���� "+num+"���� ¦���� �� = "+sum);
		stdin.close();

	}

}
