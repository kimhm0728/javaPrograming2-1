package week07;
import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		double dnum[]=new double[5];
		double sum=0.0,avg;
		System.out.println("dum 배열의 길이 : "+dnum.length);
		System.out.print("초기화 하지 않은 dnum[]의 값 : ");
		for(double d:dnum)
			System.out.print(d+" ");
		System.out.println();
		for(int i=0;i<dnum.length;i++) {
			System.out.print("dnum["+i+"]번째 데이터 입력 : ");
			dnum[i]=stdin.nextDouble();
		}
		System.out.print("초기화를 한 dnum[]의 값 : ");
		for(double d:dnum) {
			System.out.print(d+" ");
			sum+=d;
		}
		System.out.println();
		double max=dnum[0];
		for(int i=1;i<dnum.length;i++)
			if(dnum[i]>max)
				max=dnum[i];
		System.out.println("가장 큰 수는 "+max+"입니다");
		avg=sum/dnum.length;
		System.out.println("배열의 합은 "+sum+"입니다");
		System.out.println("배열의 평균은 "+avg+"입니다");
		stdin.close();
	}

}
