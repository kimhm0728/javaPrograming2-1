package week11;

public class Box3Test {
	public static void main(String[] args) {
		Box3 mybox;
		for(int i=1;i<=5;i++) {
			mybox=new Box3(i,i+1,i+2);
			System.out.println(mybox.getvolume());
		}
		System.out.println("마지막 생성된 박스 번호는 "+Box3.getCurrentID()+"번 입니다");
		//System.out.println(Box3.boxID); (오류)
	}

}
