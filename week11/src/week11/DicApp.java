package week11;
import java.util.Scanner;

class Dictionary {
	private static String []kor= {"사랑","아기","돈","미래","희망"};
	private static String []eng= {"love","baby","money","future","hope"};
	public static String convert(String word) {
		String str=null;
		for(int i=0;i<5;i++) 
			if(word.equals(kor[i])) {
				str=eng[i];
				break;
			}
			else if(word.equals(eng[i])) {
				str=kor[i];
				break;
		}
		return str;
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("한영, 영한 단어 검색 프로그램(종료시 stop입력)");
		while(true) {
			System.out.print("찾을 단어?");
			String src=input.next();
			if(src.equals("stop")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			String des=Dictionary.convert(src);
			if(des==null)
				System.out.println(src+"은/는 저의 사전에 없습니다.");
			else
				System.out.println(src+"은/는 "+des+"입니다.");
		}
		input.close();
	}
}
