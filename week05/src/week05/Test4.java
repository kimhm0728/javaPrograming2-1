package week05;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("중간고사 점수(최대 30점) : ");
		int a=stdin.nextInt();
		System.out.print("기말고사 점수(최대 30점) : ");
		int b=stdin.nextInt();
		System.out.print("출석 점수(최대 20점) : ");
		int c=stdin.nextInt();
		System.out.print("평소고사 점수(최대 20점) : ");
		int d=stdin.nextInt();
		
		int s1=a+b+c+d;
		String s2; 
		if(s1>=95)
			s2="A+";
		else if(s1>=90)
			s2="A0";
		else if(s1>=85)
			s2="B+";
		else if(s1>=80)
			s2="B0";
		else if(s1>=75)
			s2="C+";
		else if(s1>=70)
			s2="C0";
		else if(s1>=65)
			s2="D+";
		else if(s1>=60)
			s2="D0";
		else
			s2="F";
		
		System.out.println("총점 = "+s1+" , 평점 = "+s2);
		stdin.close();

	}

}
