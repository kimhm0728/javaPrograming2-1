package week06;

public class Test3 {

	public static void main(String[] args) {
		System.out.print("2���� 100���� ��� �Ҽ� : ");
		int i,j;
		for(i=2;i<=100;i++) {
			for(j=2;j<i;j++)
				if(i%j==0)
					break;
			if(i==j)
				System.out.print(i+" ");
		}

	}

}
