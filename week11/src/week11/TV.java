package week11;

class TV {
	private String name;
	private int year;
	private int inch;
	public TV(String name, int year, int inch) {
		super();
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(name+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
}
