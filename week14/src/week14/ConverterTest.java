package week14;
import java.util.Scanner;
abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	public void run() {
		Scanner std=new Scanner(System.in);
		System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
		System.out.print(srcString()+"을 입력하세요>> ");
		double val=std.nextDouble();
		double res=convert(val);
		System.out.println("변환 결과: "+res+destString()+"입니다");
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
	protected String srcString() { return "원"; }
	protected String destString() { return "달러"; }
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
	protected String srcString() { return "섭씨온도"; }
	protected String destString() { return "화씨온도"; }
}
public class ConverterTest {
	public static void main(String[] args) {
		/*
		Won2Dollar toDollar=new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
		
		Km2Mile toMile=new Km2Mile(1.6); // 1마일은 1.8Km
		toMile.run(); 
		*/
		
		C2F toF=new C2F();
		toF.run();
	}
}