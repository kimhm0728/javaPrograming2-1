package week03;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=300000; // ���� �ӵ�
		double time_m=8; // ���� ������ �����ϴ� �ð� (��)
		double time_s=time_m*60; // ���� ������ �����ϴ� �ð� (��)
		
		double h=s*time_s; // �Ÿ�
		
		System.out.println("�������� �¾���� �Ÿ��� "+ (int)h +"km�̴�.");
		double ktx_s=300;
		double time= h/ktx_s/24/365;
		
		System.out.println("KTX("+(int)ktx_s+"km/h)�� Ÿ�� �¾���� ���µ� �ɸ��� �ð��� "+(int)time+"�� �ɸ���.");
		
	}

}
