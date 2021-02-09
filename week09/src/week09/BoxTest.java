package week09;
class Box {
	public int width;
	public double height;
}

public class BoxTest {
	public static void main(String[] args) {
		Box b=new Box();
		b.width=10;
		b.height=3.14;
		
		System.out.println("width : "+b.width);
		System.out.println("height : "+b.height);
	}

}
