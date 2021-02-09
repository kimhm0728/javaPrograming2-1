package week08;

public class MovieTest {

	public static void main(String[] args) {
		Movie op1=new Movie();
		Movie op2=new Movie();
		Movie op3=new Movie();
		
		op1.setTitle("기생충");
		op1.setActor("송강호");
		op1.setDirector("봉준호");
		op1.setYear(2019);
		
		System.out.println("Title = "+op1.getTitle());
		System.out.println("Actor = "+op1.getActor());
		System.out.println("Director = "+op1.getDirector());
		System.out.println("Year = "+op1.getYear()+"\n");
		
		op2.setTitle("라라랜드");
		op2.setActor("라이언");
		op2.setDirector("데이미언");
		op2.setYear(2016);
		
		System.out.println("Title = "+op2.getTitle());
		System.out.println("Actor = "+op2.getActor());
		System.out.println("Director = "+op2.getDirector());
		System.out.println("Year = "+op2.getYear()+"\n");
		
		op3.setTitle("어벤져스");
		op3.setActor("로버트 다우니");
		op3.setDirector("조스 웨던");
		op3.setYear(2012);
		
		System.out.println("Title = "+op3.getTitle());
		System.out.println("Actor = "+op3.getActor());
		System.out.println("Director = "+op3.getDirector());
		System.out.println("Year = "+op3.getYear());
	}

}
