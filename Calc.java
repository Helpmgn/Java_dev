public class Calc {
	
	public static void main (String[] arg) {
		//System.out.println("������� 2 ��������: ");
		int x = Integer.valueOf(arg[0]);
		int y = Integer.valueOf(arg[1]);
		//System.out.println("������� ����������� ��������: ");
		//System.out.println("�����: 1, ��������:2, ���������: 3, �������: 4, ���������� � �������: 5 ");
		//byte a = 0;
		//System.in.read(a);
		int summ = x+y;
		int razn = x-y;
		int umnozh = x*y;
		float del = x/y;
		int stepen = x;
		for (int i = 1; i < y; i++) {
			stepen = stepen*x;
		}
		//if (a == 1); 
		//{
		//	int rez = x+y;
		System.out.println("�����: " + summ);
		System.out.println("��������: " + razn);
		System.out.println("���������: " + umnozh);
		System.out.println("�������: " + del);
		System.out.println("���������� � �������: " + stepen);
		//}	
	}
}