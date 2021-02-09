package week11;

public class Box3 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;
	private static long boxID=0;
	
	public Box3(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		idNum=++boxID;
		volume();
	}
	private void volume() {
		vol=width*height*depth;
	}
	public String getvolume() {
		return idNum+"번 박스의 부피 : "+vol;
	}
	public static long getCurrentID() {
		//return idNum; (오류)
		return boxID;
	}
}