package week07;
import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		Random ran=new Random();
		int[][] inum=new int[3][4];
		for(int i=0;i<inum.length;i++)
			for(int j=0;j<inum[i].length;j++)
				inum[i][j]=ran.nextInt(10);
		int sum1=0;
		for(int i=0;i<inum.length;i++) {
			int sum=0;
			for(int j:inum[i]) {
				System.out.print("\t"+j);
				sum+=j;
				sum1+=j;
			}
			System.out.println("\t"+sum);
		}
		
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int j=0;j<inum.length;j++)
				sum+=inum[j][i];
			System.out.print("\t"+sum);
		}
		System.out.println("\t"+sum1);
	}

}
