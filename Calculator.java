/**
 класс реализует калькулятор.
 */
 public class Calculator {
	 /**
	 результат вычисления.
	 */
	 private int result;
	 /**
	 суммируем аргументы.
	 @param params Аргументы суммирования.
	 */
	 public void summ (int x, int y) {
		 this.result = x+y;
		 System.out.println("Summa : " + this.result);
	 }
	 public void summ_buff(int ... params) {
		 for (Integer param : params) {
            this.result += param;
        }
		 System.out.println("Summa : " + this.result);
	 }
	 /**
	 вычитаем аргументы.
	 @param params Аргументы вычитания.
	 */
	 public void razn (int x, int y) {
		 this.result = x-y;
		 System.out.println("Raznost : " + this.result);
	 }
	 /**
	 вычитаем аргументы.
	 @param params Аргументы умножения.
	 */
	 public void proizv (int x, int y) {
		 this.result = x*y;
		 System.out.println("Proizvedenie : " + this.result);
	 }
	 /**
	 вычитаем аргументы.
	 @param params Аргументы деления.
	 */
	 public void del (int x, int y) {
		 this.result = x/y;
		 System.out.println("Chastnoe : " + this.result);
	 }
	 /**
	 вычитаем аргументы.
	 @param params Аргументы степени.
	 
	 public void summ (int x, int y) {
		 this.result = x+y;
		 System.out.println("Summa : " + this.result);
	 }*/
	 /**
	 получить результат.
	 @return результат вычисления.
	 */
	 public int getResult () {
		 return this.result;
	 }
	 /**
	 очистить результат вычисления.
	 */
	 public void cleanResult() {
		 this.result = 0;
	 }
 }