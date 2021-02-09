package week13;
class Food {
	private int cal;
	private int cost;
	private int kg;
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
}
class Melon extends Food {
	private String info;
	public void setInfo(String info) {
		this.info = info;
	}
	public Melon() { }
	public Melon(int cal, int cost, int kg, String info) {
		setCal(cal);
		setCost(cost);
		setKg(kg);
		this.info=info; // == setInfo(info);
	}
	public String toString() {
		return "Melon의 정보\n칼로리 : "+getCal()+"\n가격 : "+getCost()+"\n중량 : "+getKg()+"\n정보 : "+info;
	}
}