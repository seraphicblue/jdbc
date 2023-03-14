package day0120.operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
        
		boolean result =( a < b) && (a+=5)==b;
		//대입연산자 보다 비교연산자를 먼저실행해야한다
		
		System.out.println(a);
		System.out.println(result);
	}

}
