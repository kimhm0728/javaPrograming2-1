package week13;

public class InheritanceDemo {
	public static void main(String[] args) {
		Circle c1=new Circle();
		Ball c2=new Ball("빨간색",10);
		Cylinder c3=new Cylinder("초록색",20,5);
		
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();

		System.out.println("\n원통 : ");
		c3.findRadius();
		c3.findColor();
		c3.findArea();
		c3.findVolume();
	}

}
