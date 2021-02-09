package week03;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=300000; // 빛의 속도
		double time_m=8; // 빛이 지구에 도달하는 시간 (분)
		double time_s=time_m*60; // 빛이 지구에 도달하는 시간 (초)
		
		double h=s*time_s; // 거리
		
		System.out.println("지구에서 태양까지 거리는 "+ (int)h +"km이다.");
		double ktx_s=300;
		double time= h/ktx_s/24/365;
		
		System.out.println("KTX("+(int)ktx_s+"km/h)를 타고 태양까지 가는데 걸리는 시간은 "+(int)time+"년 걸린다.");
		
	}

}
