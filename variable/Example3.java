package day0120.test.variable;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("제품명을 입력하세요 ");
		String name=sc.nextLine();
		System.out.print("수량을 입력하세요 ");
		int count=sc.nextInt();
		System.out.print("단가를 입력하세요 ");
		int price=sc.nextInt();
		int total = count*price;
		
		System.out.println("제품 : " +name+", 총금액 : "+total);
		
		System.out.printf("제품 : %s, 총금액 : %,d",name,total);
		//%d는 정수의 d이다 디씨멀
		//%,d 자릿수도 표시해줌
		
	}

}
