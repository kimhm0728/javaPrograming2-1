package week07;
import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		double dnum[]=new double[5];
		double sum=0.0,avg;
		System.out.println("dum �迭�� ���� : "+dnum.length);
		System.out.print("�ʱ�ȭ ���� ���� dnum[]�� �� : ");
		for(double d:dnum)
			System.out.print(d+" ");
		System.out.println();
		for(int i=0;i<dnum.length;i++) {
			System.out.print("dnum["+i+"]��° ������ �Է� : ");
			dnum[i]=stdin.nextDouble();
		}
		System.out.print("�ʱ�ȭ�� �� dnum[]�� �� : ");
		for(double d:dnum) {
			System.out.print(d+" ");
			sum+=d;
		}
		System.out.println();
		double max=dnum[0];
		for(int i=1;i<dnum.length;i++)
			if(dnum[i]>max)
				max=dnum[i];
		System.out.println("���� ū ���� "+max+"�Դϴ�");
		avg=sum/dnum.length;
		System.out.println("�迭�� ���� "+sum+"�Դϴ�");
		System.out.println("�迭�� ����� "+avg+"�Դϴ�");
		stdin.close();
	}

}
