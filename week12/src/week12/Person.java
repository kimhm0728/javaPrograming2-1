package week12;
class Person {
	String name;
	String address;
	String phone;
	public Person(String name,String address,String phone) {
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	public Person(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return "�̸� : "+name+"\n�ּ� : "+address+"\n��ȭ��ȣ : "+phone;
	}
}
class Customer extends Person {
	int customerNumber;
	int mileage;
	public Customer(String name,String address,String phone) {
		super(name,address,phone);
	}
	public Customer(String name,String address,int customerNumber,int mileage) {
		super(name,address);
		this.customerNumber=customerNumber;
		this.mileage=mileage;
	}
	public Customer(String name) {super(name);}
	public String toString() {
		return super.toString()+"\n����ȣ : "+customerNumber+"\n���ϸ��� : "+mileage+"\n";
	}
}