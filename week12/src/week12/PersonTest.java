package week12;

public class PersonTest {
	public static void main(String[] args) {
		Customer c1=new Customer("ȫ�浿","�ƻ�� ȣ�����б�","041 540 5114");
		Customer c2=new Customer("�̼���","õ�Ƚ� ȣ�����б�",1234,540);
		System.out.println("��ü 1 : \n"+c1);
		System.out.println("��ü 2 : \n"+c2);
		Customer c3=new Customer("�念��");
		System.out.println("��ü 3 : \n"+c3.name);
	}
}
