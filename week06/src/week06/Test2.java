package week06;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("�ϳ��� ���ڸ� �Է��Ͻÿ� : ");
		String s=stdin.next();
		char c=s.charAt(0);
		for(int i=0;i<(int)(c-'a')+1;i++) {
			for(int j=(int)'a';j<='a'+i;j++)
				System.out.print((char)j+" ");
			System.out.println();
		}

		stdin.close();
	}

}
