package week09;
class Box1{
	int width;
	int height;
	int depth;
}
// Box1 클래스, BoxTest1 클래스를 다른 프로그램에 만들어도 됨. 그 경우에는 public class Box1 가능.
public class Box1Test1 {

	public static void main(String[] args) {
		Box1 mybox1=new Box1();
		Box1 mybox2=new Box1();
		int vol1, vol2;
		
		mybox1.width=78;
		mybox1.height=145;
		mybox1.depth=87;
		
		mybox2.width=48;
		mybox2.height=45;
		mybox2.depth=137;
		
		vol1=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("첫 번째 박스의 부피는 "+vol1+" 입니다");
		
		vol2=mybox2.width*mybox2.height*mybox2.depth;
		System.out.println("두 번쨰 박스의 부피는 "+vol2+" 입니다");
	}

}
