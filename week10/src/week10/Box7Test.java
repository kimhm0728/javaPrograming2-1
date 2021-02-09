package week10;
class Box3{
	int width;
	int height;
	int depth;
	public Box3() {
		this(1,1,1);
		System.out.println("�Ű� ���� ���� ������ ����");
	}
	public Box3(int width) {
		this(width,1,1);
		System.out.println("�Ű� ����(1��) ������ ����");
	}
	public Box3(int width, int height) {
		this(width,height,1);
		System.out.println("�Ű� ����(2��) ������ ����");
	}
	public Box3(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		System.out.println("�Ű� ����(3��) ������ ����");
	}
}
public class Box7Test {
	public static void main(String[] args) {
		Box3 mybox1=new Box3();
		int vol=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("�ڽ��� ����(�Ű� ���� ����) : "+vol);

		mybox1=new Box3(10);
		vol=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("�ڽ��� ����(�Ű� ���� 1��) : "+vol);
		
		mybox1=new Box3(10,20);
		vol=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("�ڽ��� ����(�Ű� ���� 2��) : "+vol);
		
		mybox1=new Box3(10,20,30);
		vol=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("�ڽ��� ����(�Ű� ���� 3��) : "+vol);
	}

}
