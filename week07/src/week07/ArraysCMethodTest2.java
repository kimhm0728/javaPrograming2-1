package week07;
import java.util.Arrays;

public class ArraysCMethodTest2 {

	public static void main(String[] args) {
		int[] int1= {9,1,7,3,5,4,6,2,8,0};
		System.out.println("초기 배열 : "+Arrays.toString(int1));
		Arrays.fill(int1, 3,5,33);
		System.out.println("fill() 수행 후 : "+Arrays.toString(int1));
		Arrays.sort(int1);
		System.out.println("sort() 수행 후 : "+Arrays.toString(int1));
		System.out.println("33은 배열의 "+Arrays.binarySearch(int1,33)+"번째 요소");
		int[] int2= {5,4,3,2,1};
		System.out.println("두 번째 배열 : "+Arrays.toString(int2));
		System.out.println("두 개의 배열이 같은가? "+Arrays.equals(int1,int2));
	
	}

}
