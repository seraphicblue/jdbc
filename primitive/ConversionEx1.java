package day0119.variable.primitive;

public class ConversionEx1 {

	public static void main(String[] args) {
		int num1 =2100000000;
		int num2 =2100000000;
		
		System.out.println(num1+num2);//오버 플러우 처리된 음수값이 출력됨
		System.out.println((long)num1+num2);
		                  //long+ int
		                  //long+ long
		                  //long
 	}

}
