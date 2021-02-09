package week07;
import java.util.Scanner;

public class OneArrayTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int inum[]= {8,7,3,6,9,6,8,7,0,4,1,2};
		System.out.print("찾고 싶은 숫자 입력 : ");
		int key=stdin.nextInt();
		int count=0;
		for(int i=0;i<inum.length;i++) {
			if(key==inum[i]) {
				System.out.println(i+1+"번째 데이터와 일치");
				count++;
				}
			} // 확장 for문->몇번째 데이터인지 출력안하면 가능
		if(count==0)
			System.out.println(key+"값은 배열에 없습니다");
		else
			System.out.println(key+"값은 배열에 "+count+"개 있습니다");
		stdin.close();
	}

}
