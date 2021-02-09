package week11;

public class Grade {
	private int grade1;
	private int grade2;
	private int grade3;
	
	Grade(int grade1,int grade2,int grade3){
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
	}
	public int average() {
		return (grade1+grade2+grade3)/3;
	}
}
