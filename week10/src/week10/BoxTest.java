package week10;

class Box {
	public int width;
	public double height;
	public Box() {
		width=10;
		height=3.14;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box mybox=new Box();
		System.out.println("width : "+mybox.width);
		System.out.println("height : "+mybox.height);
	
	}

}
