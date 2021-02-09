package week13;
class Box {
	public int width;
	public int height;
	public int depth;
	public Box(int w,int h,int d) {
		width=w;
		height=h;
		depth=d;
	}
}
public class EqualsTest1 {
	public static void main(String[] args) {
		Box b1=new Box(10,20,30);
		Box b2=new Box(10,20,30);
		Box b3=b2;
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		
		String s1=new String("처음 시작하는 자바");
		String s2=new String("처음 시작하는 자바");
		String s3="처음 시작하는 자바";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2==s1);
	}

}
