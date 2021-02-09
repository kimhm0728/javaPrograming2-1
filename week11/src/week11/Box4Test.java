package week11;

class Box4{
	private int ivol;
	private double dvol;
	public Box4(int w, int h, int d) {
		volume(w,h,d);
	}
	public Box4(double w, double h, double d) {
		volume(w,h,d);
	}
	private void volume(int w, int h, int d) {
		ivol=w*h*d;
	}
	private void volume(double w, double h, double d) {
		dvol=w*h*d;
	}
	public int get_ivol() {
		return ivol;
	}
	public double get_dvol() {
		return dvol;
	}
}

public class Box4Test {
	public static void main(String[] args) {
		Box4 mybox=new Box4(10,20,30);
		System.out.println("박스의 부피(정수 매개 변수) : "+mybox.get_ivol());

		mybox=new Box4(10.5,20.5,30.5);
		System.out.println("박스의 부피(실수 매개 변수) : "+mybox.get_dvol());

		mybox=new Box4(10,20,30.5);
		System.out.println("박스의 부피(정수 실수 혼합) : "+mybox.get_dvol());

	}

}
