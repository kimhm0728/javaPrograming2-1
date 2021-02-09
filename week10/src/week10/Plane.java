package week10;

class Plane {
	private int num;
	private String model;
	private int pnum;
	static int planes;
	public Plane() {
		this(0,"",0);
	}
	public Plane(int num, String model) {
		this(num,model,0);
	}
	public Plane(int num, String model, int pnum) {
		this.num=num;
		this.model=model;
		this.pnum=pnum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public static int getPlanes() {
		return planes;
	}
	public static void setPlanes(int planes) {
		Plane.planes = planes;
	}
	public String toString() {
		return "½Äº°¹øÈ£ : "+num+" ¸ðµ¨ : "+model+"\t½Â°´¼ö : "+pnum;
	}
}
