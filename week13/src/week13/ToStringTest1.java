 package week13;
class AAA {
	public int a=10,b=20;
	public String toString() {
		return "AAA 클래스 객체를 출력, a의 값은 : "+a;
	}
}

public class ToStringTest1 {
	public static void main(String[] args) {
		AAA aa=new AAA();
		System.out.println(aa);
	}

}
