package week04;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = "��! ���ѹα� ";
		String str2 = "Korea";
		System.out.println(str1+str2);
		System.out.println("��! ���ѹα� \nKorea");
		
		int a=1000;
		int b=2000;
		
		System.out.println(str1+a+b+"�� �ݼ�����");
		System.out.println(str1+(a+b)+"�� �ݼ�����");
		System.out.println(a+b+"�� �ݼ�����");
		System.out.println('3'+"õ�� �ݼ�����");
		System.out.println('3'+2997+"�� �ݼ�����");
		System.out.println("3�� �����ڵ� ���� ? "+(int)'3');
		System.out.println((3>5)^(2<7));
		System.out.println(8>>2);
		System.out.println(-16>>2);
		int i=4;
		System.out.println(i++);
	}

}
