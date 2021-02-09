package week09;

public class CylinderTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(2.8);
		
		Cylinder t=new Cylinder();
		t.set_Cylinder(c, 5.6);
		System.out.println("원통의 체적은 = "+t.getVolume());

	}

}
