package week07;

public class ArrayTest2 {

	public static void main(String[] args) {
		int score[]= {88,97,53,62,92,68,82};
		int max=score[0];
		for(int x:score) {
			if(x>max)
				max=x;
		}
		System.out.println("�迭 ����� �ִ밪�� "+max+"�Դϴ�");
	}

}
