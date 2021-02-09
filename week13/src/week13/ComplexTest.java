package week13;
class Complex {
	int num1;
	int num2;
	public Complex(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public String toString() {
		return "("+num1+" + "+num2+"i)";
	}
}

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1=new Complex(10,20);
		System.out.println("º¹¼Ò¼ö = "+c1);
	}
}
