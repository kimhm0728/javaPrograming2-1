package week06;

public class quiz {

	public static void main(String[] args) {
		int num=10;
		int i=1;
		
		while(i<=num) {
			int k=num;
			while(k>i) {
				System.out.print(" ");
				k--;
			}
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
