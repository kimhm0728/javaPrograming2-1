package week07;
import java.util.Random;

public class MultiArrayTest1 {

	public static void main(String[] args) {
		Random ran=new Random();
		int[][] score=new int[4][4];
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				score[i][j]=ran.nextInt(10);
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int k:score[i]) {
				System.out.print(k+" ");
				sum+=k;
				}
			System.out.println("의 합계는 "+sum);
		}
	}

}
