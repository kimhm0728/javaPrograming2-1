package week09;

public class ScopeTest2 {
	static int i,j,k=1;
	public static void main(String[] args) {
		int i=2;
		int j=3;
		{
			int k=4;
			System.out.println("i�� j�� ���� : "+(i+j)); // ������ 5
			System.out.println("i�� k�� ���� : "+(i+k)); // 6
			System.out.println("Ŭ�������� i�� j�� ���� : "+(ScopeTest2.i+ScopeTest2.j)); // 0
		}
		k=i+k;
		System.out.println("k�� : "+k); // 3
		System.out.println("j�� : "+j); // 3
		System.out.println("i�� : "+i); // 2
		System.out.println("Ŭ�������� i : "+ScopeTest2.i); // 0

	}

}