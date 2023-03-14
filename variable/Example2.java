package day0120.test.variable;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);//새로운 스캐너 생성
        System.out.print("밑변의 길이를 입력하세요.");
        double w=sc.nextDouble(); 
        System.out.print("높이를 입력하세요.");
        double h=sc.nextDouble(); 
         
		System.out.printf("삼각형의 크기는 " +w*h/2);
		  
		 
	}

}
