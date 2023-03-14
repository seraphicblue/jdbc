package day0120.operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		int num1 = 12;//00001100
		int num2 = 7; //00000111
		
		System.out.println(num1& num2);
		System.out.println(num1| num2);
		System.out.println(num1^ num2);
		
		System.out.println(num2 << 3); //00000111->00111000
		
	}

}
