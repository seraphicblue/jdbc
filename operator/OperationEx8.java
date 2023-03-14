package day0120.operator;
import java.util.Scanner;

public class OperationEx8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
      
		int num =sc.nextInt();
		/*if (num>0) {
			 System.out.println("양수입니다");
		 }
		 else if(num==0) {
			 System.out.println("0입니다");
		 }
		 else {
			 System.out.println("음수입니다");
		 }*/
		
	    String str = num >=0?
	    		         num==0? "0":"양수"
	    		        	 :"음수";
	    System.out.printf("%d는 %s입니다",num,str);
	    // String str = num >=0? num==0? "0":"양수":"음수";
	    //                                      t :f
	    //
	    }

}
