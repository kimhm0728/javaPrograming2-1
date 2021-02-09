package week13;

public class MelonTest {
	public static void main(String[] args) {
		Melon m1=new Melon(124,25,2,"A 등급");
		Melon m2=new Melon();
		
		m2.setCal(100);
		m2.setCost(20);
		m2.setKg(5);
		m2.setInfo("B 등급");
		
		System.out.println(m1+"\n");
		System.out.println(m2);
	}
}
