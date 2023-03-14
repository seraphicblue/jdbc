package day0120.test.variable;

public class PrintfEx {

	public static void main(String[] args) {
		/*System.out.print("값");//
		System.out.println("값");
		System.out.printf("포맷형식","값1","값2","값3","값4");//format된 문자열 출력
		//"값1","값2"....을 앞에있는 "포맷형식"에 넣어서 문자열로 출력
        //정수-%d, 실수-%f, 문자열-%s, %x-16진수값, %c - char*/
		
		System.out.printf("정수 : %d , %d \n", 100, 200);
		System.out.printf("pie는 %f 입니다.",3.141592);
		System.out.printf("pie %.2f 입니다.\n",3.141592);//소수점 둘째자리까지 보여달라고 포맷
        
		System.out.printf("%s\n", "hello");
		System.out.printf("%5s\n", "j");//오른쪽으로 5번째 정렬 | | | | |j|
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);//| | |1|2|3|
		System.out.printf("%05d\n", 123);//|0|0|1|2|3|
		
		System.err.println("파강색으로 출력");
	    System.out.printf("%04d\n",34);
	    System.out.printf("%06d\n",12345);
	   
	}

}
