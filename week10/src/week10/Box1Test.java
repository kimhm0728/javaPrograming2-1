package week10;

public class Box1Test {

	public static void main(String[] args) {
		Box1 mybox1=new Box1(10,20,30);
		Box1 mybox2=new Box1();
		int vol=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("1st 박스의 부피 : "+vol);
		
		vol=mybox2.width*mybox2.height*mybox2.depth;
		System.out.println("2nd 박스의 부피 : "+vol);
	}

}
