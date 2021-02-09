package week05;
import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int month = stdin.nextInt();
		String MtoS;
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			MtoS="봄 입니다";
			break;
		case 6:
		case 7:
		case 8:
			MtoS="여름 입니다";
			break;
		case 9:
			System.out.print("멋진 9월과 ");
		case 10:
			System.out.print("아름다운 10월과 ");
		case 11:
			System.out.print("낙엽의 11월은 ");
			MtoS="가을 입니다";
			break;
		case 1:
		case 2:
		case 12:
			MtoS="겨울 입니다";
			break;
		default:
			MtoS="해당되는 계절이 없습니다";
		}
		System.out.println(MtoS);
		stdin.close();
		
	}

}
