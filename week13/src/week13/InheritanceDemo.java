package week13;

public class InheritanceDemo {
	public static void main(String[] args) {
		Circle c1=new Circle();
		Ball c2=new Ball("������",10);
		Cylinder c3=new Cylinder("�ʷϻ�",20,5);
		
		System.out.println("�� : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n�� : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();

		System.out.println("\n���� : ");
		c3.findRadius();
		c3.findColor();
		c3.findArea();
		c3.findVolume();
	}

}
