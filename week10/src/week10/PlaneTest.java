package week10;

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1=new Plane(1,"aa",200);
		Plane plane2=new Plane(2,"bb");
		Plane plane3=new Plane();
		
		plane1.setPlanes(0);
		plane1.getPlanes();
		plane3.setNum(3);
		plane3.setModel("cc");
		plane3.setPnum(150);
		
		System.out.println(plane1);
		System.out.println(plane2);
		System.out.println(plane3);
	}

}
