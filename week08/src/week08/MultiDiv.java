package week08;

class MultiDiv extends PlusMinus {
	int multi;
	double div;
	public String multi(int x, int y) {
		multi=x*y;
		return "�� ���� ���� "+multi;
	}
	public String div(int x, int y) {
		div=(double)x/y;
		return "�� ���� ���� ���� "+div;
	}
}
