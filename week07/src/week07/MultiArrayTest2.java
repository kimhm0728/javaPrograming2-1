package week07;

public class MultiArrayTest2 {

	public static void main(String[] args) {
		int twoD[][]=new int[4][];
		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];
		twoD[3]=new int[4];
		System.out.println("2차원 배열에서 행의 길이는 : "+twoD.length);
		System.out.println("첫 번째 행의 요소 수는 : "+twoD[0].length);
		System.out.println("두 번째 행의 요소 수는 : "+twoD[1].length);
		System.out.println("세 번째 행의 요소 수는 : "+twoD[2].length);
		System.out.println("네 번째 행의 요소 수는 : "+twoD[3].length);
		int k=0;
		for(int i=0;i<twoD.length;i++)
			for(int j=0;j<twoD[i].length;j++) {
				twoD[i][j]=k;
				k++;
				}
		for(int i=0;i<twoD.length;i++) {
			for(int a:twoD[i])
				System.out.print(a+" ");
			System.out.println();
			}
		}

}
