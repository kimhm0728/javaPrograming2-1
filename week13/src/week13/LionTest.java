package week13;
class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal : "+name);
	}
	public Animal() {
		name = "No Name";
		System.out.println("Animal : "+name);
	}
}
class Lion extends Animal {
	public Lion() {
		System.out.println("Lion");
	}
	public Lion(String name) {
		super(name);
		System.out.println("Lion");
	}
}
public class LionTest {
	public static void main(String[] args) {
		Lion lion1 = new Lion();
		Lion lion12 = new Lion("Brave");
	}
}