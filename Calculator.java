/**
 ����� ��������� �����������.
 */
 public class Calculator {
	 /**
	 ��������� ����������.
	 */
	 private int result;
	 /**
	 ��������� ���������.
	 @param params ��������� ������������.
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
	 �������� ���������.
	 @param params ��������� ���������.
	 */
	 public void razn (int x, int y) {
		 this.result = x-y;
		 System.out.println("Raznost : " + this.result);
	 }
	 /**
	 �������� ���������.
	 @param params ��������� ���������.
	 */
	 public void proizv (int x, int y) {
		 this.result = x*y;
		 System.out.println("Proizvedenie : " + this.result);
	 }
	 /**
	 �������� ���������.
	 @param params ��������� �������.
	 */
	 public void del (int x, int y) {
		 this.result = x/y;
		 System.out.println("Chastnoe : " + this.result);
	 }
	 /**
	 �������� ���������.
	 @param params ��������� �������.
	 
	 public void summ (int x, int y) {
		 this.result = x+y;
		 System.out.println("Summa : " + this.result);
	 }*/
	 /**
	 �������� ���������.
	 @return ��������� ����������.
	 */
	 public int getResult () {
		 return this.result;
	 }
	 /**
	 �������� ��������� ����������.
	 */
	 public void cleanResult() {
		 this.result = 0;
	 }
 }