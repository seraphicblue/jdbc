package day0120.operator;

public class OperatorEx3 {

	public static void main(String[] args) {
	   int num = 5;
	    System.out.println(num+1);//num에서 5를 꺼내와서 +1
	    System.out.println(num);//원본데이터 유지
	    
	    System.out.println(num +=1);//변수에 저장된 원본데이터에 연산
	    System.out.println(num);
	    
	    int a=10;
	    int b=15;
	    a= a+b;//a데이터와 b데이터를 꺼내와서 a에 넣어준다
	    a+=b;//a데이터 자체에 b를 더해준다 그래서 조금더 빠르다고 말은하는데 의미없다.....
	}

}
