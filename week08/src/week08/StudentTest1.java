package week08;

public class StudentTest1 {

	public static void main(String[] args) {
		Student op1=new Student();
		
		op1.setName("ȫ�浿");
		op1.setAge(25);
		op1.setStudentNumber(20041234);
		op1.setSex(true);
		
		System.out.println("�̸��� "+op1.getName());
		System.out.println("���̴� "+op1.getAge());
		System.out.println("�й��� "+op1.getStudentNumber());
		
		if(op1.isSex())
			System.out.println("����");
		else
			System.out.println("����");
	}

}
