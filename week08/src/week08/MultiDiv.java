package week08;

class MultiDiv extends PlusMinus {
	int multi;
	double div;
	public String multi(int x, int y) {
		multi=x*y;
		return "두 수의 곱은 "+multi;
	}
	public String div(int x, int y) {
		div=(double)x/y;
		return "두 수의 나눈 값은 "+div;
	}
}
