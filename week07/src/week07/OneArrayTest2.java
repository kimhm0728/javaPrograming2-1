package week07;

public class OneArrayTest2 {

	public static void main(String[] args) {
		String slist[]= {"seoul","daejeon","daegu","kwangju","incheon","jeju","busan"};
		System.out.print("원래의 배열 : ");
		for(String s:slist)
			System.out.print(s+" ");
		System.out.println();
		for(int i=0;i<slist.length/2;i++) {
			String temp=slist[i];
			slist[i]=slist[slist.length-1-i];
			slist[slist.length-1-i]=temp;
		}
		System.out.print("역순으로 재배치된 배열 : ");
		for(String s:slist)
			System.out.print(s+" ");
	}

}
