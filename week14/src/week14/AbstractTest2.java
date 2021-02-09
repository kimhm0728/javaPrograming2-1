package week14;
abstract class Fruit {
	abstract public void print();
} 
class Grape extends Fruit {
	public void print() {
		System.out.println("���� �����̴�");
	}
}
class Apple extends Fruit {
	public void print() {
		System.out.println("���� ����̴�");
	}
}
class Pear extends Fruit {
	public void print() {
		System.out.println("���� ���̴�");
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		Fruit fAry[]= {new Grape(), new Apple(), new Pear()};
		for(Fruit f:fAry)
			f.print();
	}
}
