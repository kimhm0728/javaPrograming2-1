package week11;

public class TVTest {
	public static void main(String[] args) {
		String s1=args[0];
		int i1=Integer.parseInt(args[1]);
		int i2=Integer.parseInt(args[2]);
		
		TV myTV=new TV(s1,i1,i2);
		myTV.show();
	}

}
