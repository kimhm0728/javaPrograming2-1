package week11;

public class Argument {
	public static void main(String[] args) {
		System.out.println("�Ű� ������ ���� �� ���� : "+args[0]+" , "+args[1]);
		// System.out.println("�Ű� ������ ���� �� ���� ���� : "+(args[0]+args[1])); (���:1020)
		int a=Integer.parseInt(args[0]); 
		int b=Integer.parseInt(args[1]);
		System.out.println("�Ű� ������ ���� �� ���� ���� : "+(a+b));
	}

}