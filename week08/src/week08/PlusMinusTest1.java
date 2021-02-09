package week08;

public class PlusMinusTest1 {

	public static void main(String[] args) {
		PlusMinus op1=new PlusMinus();
		String sum=op1.plus(50, 30);
		String minus=op1.minus(50, 30);
		
		System.out.println(sum);
		System.out.println(minus);

	}

}
