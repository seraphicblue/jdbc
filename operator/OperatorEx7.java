package day0120.operator;
import java.util.Scanner;

public class OperatorEx7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num =sc.nextInt();
		
		
		String str = (num % 2==0) ? "짝수":"홀수";
		
		System.out.printf("%d는 %s입니다", num,str);

	}

}
