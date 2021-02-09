package week11;
import java.util.Scanner;

class Dictionary {
	private static String []kor= {"���","�Ʊ�","��","�̷�","���"};
	private static String []eng= {"love","baby","money","future","hope"};
	public static String convert(String word) {
		String str=null;
		for(int i=0;i<5;i++) 
			if(word.equals(kor[i])) {
				str=eng[i];
				break;
			}
			else if(word.equals(eng[i])) {
				str=kor[i];
				break;
		}
		return str;
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�ѿ�, ���� �ܾ� �˻� ���α׷�(����� stop�Է�)");
		while(true) {
			System.out.print("ã�� �ܾ�?");
			String src=input.next();
			if(src.equals("stop")) {
				System.out.print("���α׷��� �����մϴ�.");
				break;
			}
			String des=Dictionary.convert(src);
			if(des==null)
				System.out.println(src+"��/�� ���� ������ �����ϴ�.");
			else
				System.out.println(src+"��/�� "+des+"�Դϴ�.");
		}
		input.close();
	}
}
