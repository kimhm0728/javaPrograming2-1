package week08;

public class MovieTest {

	public static void main(String[] args) {
		Movie op1=new Movie();
		Movie op2=new Movie();
		Movie op3=new Movie();
		
		op1.setTitle("�����");
		op1.setActor("�۰�ȣ");
		op1.setDirector("����ȣ");
		op1.setYear(2019);
		
		System.out.println("Title = "+op1.getTitle());
		System.out.println("Actor = "+op1.getActor());
		System.out.println("Director = "+op1.getDirector());
		System.out.println("Year = "+op1.getYear()+"\n");
		
		op2.setTitle("��󷣵�");
		op2.setActor("���̾�");
		op2.setDirector("���̹̾�");
		op2.setYear(2016);
		
		System.out.println("Title = "+op2.getTitle());
		System.out.println("Actor = "+op2.getActor());
		System.out.println("Director = "+op2.getDirector());
		System.out.println("Year = "+op2.getYear()+"\n");
		
		op3.setTitle("�����");
		op3.setActor("�ι�Ʈ �ٿ��");
		op3.setDirector("���� ����");
		op3.setYear(2012);
		
		System.out.println("Title = "+op3.getTitle());
		System.out.println("Actor = "+op3.getActor());
		System.out.println("Director = "+op3.getDirector());
		System.out.println("Year = "+op3.getYear());
	}

}
