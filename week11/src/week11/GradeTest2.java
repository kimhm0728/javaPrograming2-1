package week11;

public class GradeTest2 {

	public static void main(String[] args) {
		int math=Integer.parseInt(args[0]);
		int science=Integer.parseInt(args[1]);
		int english=Integer.parseInt(args[2]);
		
		Grade me=new Grade(math,science,english);
		System.out.println("∆Ú±’¿∫ "+me.average());
	}

}
