package week03;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		double a=input.nextDouble();
		
		System.out.print("�� ��° ���� �Է� : ");
		double b=input.nextDouble();
		
		System.out.println("���� : "+a+"+"+b+" = "+(a+b)+" �Դϴ�.");
		System.out.println("���� : "+a+"-"+b+" = "+(a-b)+" �Դϴ�.");
		System.out.println("���� : "+a+"*"+b+" = "+(a*b)+" �Դϴ�.");
		System.out.println("������ : "+a+"/"+b+" = "+(a/b)+" �Դϴ�.");
		
		double average=(a+b)/2;
		System.out.println("��հ� : " +average+" �Դϴ�.");
		
		input.close();

	}

}
