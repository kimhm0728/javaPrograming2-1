package week12;
class A {
	private int a;
	protected A() {} /*   ���� Ŭ������ (���� Ŭ������ �����ڿ���)super Ű���带 ����ϴ� ��츦 �����ϰ� ������ ������ �����ڸ� ȣ���ϴµ�, 
	                                                ���� Ŭ���� A�� ������ ������ ���� ������ �����ڸ��� �ۼ��߱� ������ ������ �߻��Ѵ�. 
	                                                ���� A�� ������ �����ڸ� �ۼ����ָ� ������ �߻����� �ʴ´�.
	                                                �Ǵ� B�� ������ ������ ���� ù�ٿ�, super(10)�� �ۼ��ϸ�
	                      A�� ������ �����ڰ� ȣ��Ǳ� ������ ������ �߻����� �ʴ´�.	*/
	
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