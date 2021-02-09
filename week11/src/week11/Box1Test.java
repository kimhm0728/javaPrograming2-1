package week11;
class Box1 {
	int width;
	int height;
	int depth;
	public Box1(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int volume() {
		int vol=width*height*depth;
		return vol;
	}
}

public class Box1Test {
	public static void main(String[] args) {
		Box1 mybox=new Box1(10,20,30);
		//mybox.width=20;
		int vol=mybox.volume();
		System.out.println("정수 박수의 부피  : "+vol);

	}

}
