public class Calc {
	
	public static void main (String[] arg) {
		//System.out.println("Введите 2 значения: ");
		int x = Integer.valueOf(arg[0]);
		int y = Integer.valueOf(arg[1]);
		//System.out.println("Введите необходимую операцию: ");
		//System.out.println("Сумма: 1, Разность:2, Умножение: 3, Деление: 4, Возведение в степень: 5 ");
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
		System.out.println("Сумма: " + summ);
		System.out.println("Разность: " + razn);
		System.out.println("Умножение: " + umnozh);
		System.out.println("Деление: " + del);
		System.out.println("Возведение в степень: " + stepen);
		//}	
	}
}