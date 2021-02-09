package week06;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n;
		int f0=0,f1=1,f2;
		System.out.print("출력할 숫자 개수 : ");
		n=stdin.nextInt();
		System.out.print("0 1");
		
		for(int i=0;i<n-2;i++) {
			f2=f0+f1;
			System.out.print(" "+f2);
			f0=f1;
			f1=f2;
		}
		
		stdin.close();
	}

}
