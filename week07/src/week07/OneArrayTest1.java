package week07;
import java.util.Scanner;

public class OneArrayTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int inum[]= {8,7,3,6,9,6,8,7,0,4,1,2};
		System.out.print("ã�� ���� ���� �Է� : ");
		int key=stdin.nextInt();
		int count=0;
		for(int i=0;i<inum.length;i++) {
			if(key==inum[i]) {
				System.out.println(i+1+"��° �����Ϳ� ��ġ");
				count++;
				}
			} // Ȯ�� for��->���° ���������� ��¾��ϸ� ����
		if(count==0)
			System.out.println(key+"���� �迭�� �����ϴ�");
		else
			System.out.println(key+"���� �迭�� "+count+"�� �ֽ��ϴ�");
		stdin.close();
	}

}
