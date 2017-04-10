import java.util.Scanner;

/**
класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteructRunner {
	
	public static void main(String[] arg) {
		
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			float buff = 0;
			//Integer Rez = 0;
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next(); // next() - vozvrashaet nam stroku.
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("Enter operation (+,-,*,/) : ");
				String opr = reader.next();
				if (buff!=0) {
					switch(opr) {
						case "+":
							calc.summ_buff(Integer.valueOf(first), Integer.valueOf(second));
						//	Rez = Rez  + calc.getResult();
						//	System.out.println("Summa + sohranenniy rezultat : " + Rez);
						break;
						case "-":
							calc.razn(Integer.valueOf(first), Integer.valueOf(second));
						break;
						case "*":
							calc.proizv(Integer.valueOf(first), Integer.valueOf(second));
						break;
						case "/":
							calc.del(Integer.valueOf(first), Integer.valueOf(second));
						break;
					}
					System.out.println("Save result? y/n");
					String save = reader.next();
					switch (save) {
						case "y":
							buff = 1;
						//	Rez = calc.getResult();
						break;
						case "n":
							buff = 0;
							//calc.cleanResult();
						break;
					}
					System.out.println("Exit : yes/no ");
					exit = reader.next();
				}
				if (buff==0) {
					switch(opr) {
						case "+":
							calc.summ(Integer.valueOf(first), Integer.valueOf(second));
						break;
						case "-":
							calc.razn(Integer.valueOf(first), Integer.valueOf(second));
						break;
						case "*":
							calc.proizv(Integer.valueOf(first), Integer.valueOf(second));
						break;
						case "/":
							calc.del(Integer.valueOf(first), Integer.valueOf(second));
						break;
					}
					System.out.println("Save result? y/n");
					String save = reader.next();
					switch (save) {
						case "y":
							buff = 1;
					//		Rez = calc.getResult();
						break;
						case "n":
							buff = 0;
							//calc.cleanResult();
						break;
					}
					System.out.println("Exit : yes/no ");
					exit = reader.next();
				}
			}
		} finally {
			reader.close();
		}
	}
	
}