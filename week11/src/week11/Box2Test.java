package week11;
class Box2 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	public Box2(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		volume();
	}
	private void volume() {
		vol=width*height*depth;
	}
	public int getvolume() {
		return vol;
	}
}

public class Box2Test {
	public static void main(String[] args) {
		Box2 mybox=new Box2(10,20,30);
		System.out.println("정수 박수의 부피  : "+mybox.getvolume());
	}

}
