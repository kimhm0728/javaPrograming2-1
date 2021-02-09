package week14;
import java.util.Scanner;
abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	public void run() {
		Scanner std=new Scanner(System.in);
		System.out.println(srcString()+"�� "+destString()+"�� �ٲߴϴ�.");
		System.out.print(srcString()+"�� �Է��ϼ���>> ");
		double val=std.nextDouble();
		double res=convert(val);
		System.out.println("��ȯ ���: "+res+destString()+"�Դϴ�");
		std.close();
	}
}
class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio=ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String srcString() { return "��"; }
	protected String destString() { return "�޷�"; }
}
class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio=ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String srcString() { return "Km"; }
	protected String destString() { return "mile"; }
}
class C2F extends Converter {
	protected double convert(double src) {
		return src*9/5+32;
	}
	protected String srcString() { return "�����µ�"; }
	protected String destString() { return "ȭ���µ�"; }
}
public class ConverterTest {
	public static void main(String[] args) {
		/*
		Won2Dollar toDollar=new Won2Dollar(1200); // 1�޷��� 1200��
		toDollar.run();
		
		Km2Mile toMile=new Km2Mile(1.6); // 1������ 1.8Km
		toMile.run(); 
		*/
		
		C2F toF=new C2F();
		toF.run();
	}
}