package week08;

public class MultiDivTest1 {

	public static void main(String[] args) {
		MultiDiv op1=new MultiDiv();
		PlusMinus op2=new PlusMinus();
		
		String plus=op1.plus(50, 30);
		String minus=op1.minus(50, 30);
		String multi=op1.multi(50, 30);
		String div=op1.div(50, 30);
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multi);
		System.out.println(div);

	}

}
