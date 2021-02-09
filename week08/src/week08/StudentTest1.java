package week08;

public class StudentTest1 {

	public static void main(String[] args) {
		Student op1=new Student();
		
		op1.setName("홍길동");
		op1.setAge(25);
		op1.setStudentNumber(20041234);
		op1.setSex(true);
		
		System.out.println("이름은 "+op1.getName());
		System.out.println("나이는 "+op1.getAge());
		System.out.println("학번은 "+op1.getStudentNumber());
		
		if(op1.isSex())
			System.out.println("남자");
		else
			System.out.println("여자");
	}

}
