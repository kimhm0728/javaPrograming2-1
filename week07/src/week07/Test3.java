package week07;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.println("�ܾ� ���� ���α׷�");
		String str[][]= {{"����","�б�","���","�ູ","�ڹ�"},{"pencil","school","love","happy","java"}};

		Loop:while (true) {
			System.out.print("�ܾ �Է��ϼ��� >> ");
			String user=stdin.next();
			
			if(user.equals("�׸�")||user.equals("exit"))
				break;
			
			for(int j=0;j<5;j++)
				if(user.equals(str[0][j])) {
					System.out.println(str[1][j]);
					continue Loop;
					}
				else if(user.equals(str[1][j])) {
					System.out.println(str[0][j]);
					continue Loop;
					}
			System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ��� !!!"); 
			}
		stdin.close();
	}

}
