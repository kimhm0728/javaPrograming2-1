package week12;
class A {
	private int a;
	protected A() {} /*   상위 클래스는 (하위 클래스의 생성자에서)super 키워드를 사용하는 경우를 제외하곤 무조건 묵시적 생성자를 호출하는데, 
	                                                상위 클래스 A의 묵시적 생성자 없이 명시적 생성자만을 작성했기 때문에 오류가 발생한다. 
	                                                따라서 A의 묵시적 생성자를 작성해주면 오류가 발생하지 않는다.
	                                                또는 B의 묵시적 생성자 가장 첫줄에, super(10)을 작성하면
	                      A의 명시적 생성자가 호출되기 때문에 오류가 발생하지 않는다.	*/
	
	protected A(int i) {
		a=i;
	}
}
class B extends A {
	private int b;
	protected B() {
		b=10;
	}
}
