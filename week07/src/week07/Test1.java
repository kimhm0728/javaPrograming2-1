package week07;

public class Test1 {

	public static void main(String[] args) {
		int[][] inum={{78,48,78,98},{99,92},{29,64,84},{34,78,92,56}};
		for(int i=0;i<inum.length;i++) {
			int sum=0;
			for(int j:inum[i]) {
				System.out.print(j+"\t");
				sum+=j;
			}
			double avg=(double)sum/inum[i].length;
			System.out.println(sum+"\t"+avg);
		}
	}

}
